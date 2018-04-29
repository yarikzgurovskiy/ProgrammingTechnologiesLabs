import grammar.*;
import grammar.MatrixParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.HashMap;

public class MatrixVisitor extends MatrixBaseVisitor<MatrixVisitor.Variable> {
    private HashMap<String, Variable> variables = new HashMap<>();

    public class Variable<T> {
        private T value;

        Variable(T value) {
            this.value = value;
        }

        public T getValue() {
            return this.value;
        }

        public Class getType() {
            return this.value.getClass();
        }

        public T setValue(T value) {
            T oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }

    @Override
    public Variable visitRootRule(MatrixParser.RootRuleContext ctx) {
        return visit(ctx.input());
    }

    @Override
    public Variable visitToSetVariable(MatrixParser.ToSetVariableContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public Variable visitExecuteExpression(MatrixParser.ExecuteExpressionContext ctx) {
        return visit(ctx.divide());
    }

    @Override
    public Variable visitMakeAssignment(MatrixParser.MakeAssignmentContext ctx) {
        String variableName = ctx.VAR().getText();
        variables.put(variableName, visit(ctx.input()));
        return variables.get(variableName);
    }


    @Override
    public Variable visitMakeDivision(MatrixParser.MakeDivisionContext ctx) {
        Variable variable0 = visit(ctx.divide());
        Variable variable1 = visit(ctx.det());
        Matrix matrix;
        Double number;
        if (variable0.getType() == Matrix.class && (variable1.getType() == Double.class)) {
            matrix = (Matrix) variable0.getValue();
            number = (Double) variable1.getValue();
        } else {
            throw new ParseCancellationException("One operand should be matrix, another should be a number");
        }
        return new Variable<>(matrix.divideByScalar(number));
    }

    @Override
    public Variable visitToRank(MatrixParser.ToRankContext ctx) {
        return visit(ctx.rank());
    }

    @Override
    public Variable visitToDet(MatrixParser.ToDetContext ctx) {
        return visit(ctx.det());
    }

    @Override
    public Variable visitCalcDet(MatrixParser.CalcDetContext ctx) {
        Variable variable = visit(ctx.det());
        if(variable.getType() == Matrix.class){
            Matrix m = (Matrix)variable.getValue();
            return new Variable<>(m.determinant());
        }
        throw new IllegalArgumentException("DET OF NON MATRIX");
    }

    @Override
    public Variable visitCalcRank(MatrixParser.CalcRankContext ctx) {
        Variable variable = visit(ctx.rank());
        if(variable.getType() == Matrix.class){
            Matrix m = (Matrix)variable.getValue();
            return new Variable<>(m.rank());
        }
        throw new IllegalArgumentException("RANK OF NON MATRIX");
    }

    @Override
    public Variable visitToTranspose(MatrixParser.ToTransposeContext ctx) {
        return visit(ctx.transpose());
    }

    @Override
    public Variable visitMakeTranspose(MatrixParser.MakeTransposeContext ctx) {
        Variable variable = visit(ctx.transpose());
        if(variable.getType() == Matrix.class){
            Matrix m = (Matrix)variable.getValue();
            return new Variable<>(m.transpose());
        }
        throw new IllegalArgumentException("TRANSPOSE OF NON MATRIX");
    }

    @Override
    public Variable visitToAtom(MatrixParser.ToAtomContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public Variable visitMakeNumber(MatrixParser.MakeNumberContext ctx) {
        return new Variable<>(Double.parseDouble(ctx.NUMBER().toString()));
    }

    @Override
    public Variable visitMakeMatrix(MatrixParser.MakeMatrixContext ctx) {
        return new Variable<>(MatrixParsing.parse(ctx.MATRIX().toString()));
    }

    @Override
    public Variable visitMakeVariable(MatrixParser.MakeVariableContext ctx) {
        String variableName = ctx.VAR().getText();
        Variable variable = variables.get(variableName);
        if(variable == null){
            throw new ParseCancellationException("Variable is not defined");
        }
        return variable;
    }

    @Override
    public Variable visitMakeBraces(MatrixParser.MakeBracesContext ctx) {
        return visit(ctx.divide());
    }
}
