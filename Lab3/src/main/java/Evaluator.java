import grammar.MatrixLexer;
import grammar.MatrixParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Evaluator {
    private MatrixVisitor visitor = new MatrixVisitor();

    public String eval(String expression){
        try {
            CharStream input = CharStreams.fromString(expression);
            MatrixLexer lexer = new MatrixLexer(input);

            ErrorListener listener = new ErrorListener();
            lexer.removeErrorListeners();
            lexer.addErrorListener(listener);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MatrixParser parser = new MatrixParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(listener);

            ParseTree tree = parser.input();
            MatrixVisitor.Variable variable = visitor.visit(tree);
            if (variable.getValue() == null) {
                throw new IllegalArgumentException("Incorrect input");
            }
            return variable.getValue().toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
