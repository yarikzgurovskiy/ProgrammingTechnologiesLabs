// Generated from /home/yaroslav/IdeaProjects/ProgrammingTechnologies/Lab3/src/main/resources/Matrix.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatrixParser}.
 */
public interface MatrixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code RootRule}
	 * labeled alternative in {@link MatrixParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRootRule(MatrixParser.RootRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootRule}
	 * labeled alternative in {@link MatrixParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRootRule(MatrixParser.RootRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void enterToSetVariable(MatrixParser.ToSetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void exitToSetVariable(MatrixParser.ToSetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void enterExecuteExpression(MatrixParser.ExecuteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void exitExecuteExpression(MatrixParser.ExecuteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeAssignment}
	 * labeled alternative in {@link MatrixParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterMakeAssignment(MatrixParser.MakeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeAssignment}
	 * labeled alternative in {@link MatrixParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitMakeAssignment(MatrixParser.MakeAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToDet}
	 * labeled alternative in {@link MatrixParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterToDet(MatrixParser.ToDetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToDet}
	 * labeled alternative in {@link MatrixParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitToDet(MatrixParser.ToDetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeDivision}
	 * labeled alternative in {@link MatrixParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterMakeDivision(MatrixParser.MakeDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeDivision}
	 * labeled alternative in {@link MatrixParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitMakeDivision(MatrixParser.MakeDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcDet}
	 * labeled alternative in {@link MatrixParser#det}.
	 * @param ctx the parse tree
	 */
	void enterCalcDet(MatrixParser.CalcDetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcDet}
	 * labeled alternative in {@link MatrixParser#det}.
	 * @param ctx the parse tree
	 */
	void exitCalcDet(MatrixParser.CalcDetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToRank}
	 * labeled alternative in {@link MatrixParser#det}.
	 * @param ctx the parse tree
	 */
	void enterToRank(MatrixParser.ToRankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToRank}
	 * labeled alternative in {@link MatrixParser#det}.
	 * @param ctx the parse tree
	 */
	void exitToRank(MatrixParser.ToRankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcRank}
	 * labeled alternative in {@link MatrixParser#rank}.
	 * @param ctx the parse tree
	 */
	void enterCalcRank(MatrixParser.CalcRankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcRank}
	 * labeled alternative in {@link MatrixParser#rank}.
	 * @param ctx the parse tree
	 */
	void exitCalcRank(MatrixParser.CalcRankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToTranspose}
	 * labeled alternative in {@link MatrixParser#rank}.
	 * @param ctx the parse tree
	 */
	void enterToTranspose(MatrixParser.ToTransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToTranspose}
	 * labeled alternative in {@link MatrixParser#rank}.
	 * @param ctx the parse tree
	 */
	void exitToTranspose(MatrixParser.ToTransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeTranspose}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void enterMakeTranspose(MatrixParser.MakeTransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeTranspose}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void exitMakeTranspose(MatrixParser.MakeTransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(MatrixParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(MatrixParser.ToAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeNumber}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMakeNumber(MatrixParser.MakeNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeNumber}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMakeNumber(MatrixParser.MakeNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeMatrix}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMakeMatrix(MatrixParser.MakeMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeMatrix}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMakeMatrix(MatrixParser.MakeMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeVariable}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMakeVariable(MatrixParser.MakeVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeVariable}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMakeVariable(MatrixParser.MakeVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeBraces}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMakeBraces(MatrixParser.MakeBracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeBraces}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMakeBraces(MatrixParser.MakeBracesContext ctx);
}