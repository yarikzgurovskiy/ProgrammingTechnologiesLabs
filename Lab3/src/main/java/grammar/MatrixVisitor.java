// Generated from /home/yaroslav/IdeaProjects/ProgrammingTechnologies/Lab3/src/main/resources/Matrix.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MatrixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MatrixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code RootRule}
	 * labeled alternative in {@link MatrixParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootRule(MatrixParser.RootRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVariable(MatrixParser.ToSetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteExpression(MatrixParser.ExecuteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeAssignment}
	 * labeled alternative in {@link MatrixParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeAssignment(MatrixParser.MakeAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToDet}
	 * labeled alternative in {@link MatrixParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToDet(MatrixParser.ToDetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeDivision}
	 * labeled alternative in {@link MatrixParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeDivision(MatrixParser.MakeDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcDet}
	 * labeled alternative in {@link MatrixParser#det}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcDet(MatrixParser.CalcDetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToRank}
	 * labeled alternative in {@link MatrixParser#det}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToRank(MatrixParser.ToRankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcRank}
	 * labeled alternative in {@link MatrixParser#rank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcRank(MatrixParser.CalcRankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToTranspose}
	 * labeled alternative in {@link MatrixParser#rank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTranspose(MatrixParser.ToTransposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeTranspose}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeTranspose(MatrixParser.MakeTransposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(MatrixParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeNumber}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeNumber(MatrixParser.MakeNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeMatrix}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeMatrix(MatrixParser.MakeMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeVariable}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeVariable(MatrixParser.MakeVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeBraces}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeBraces(MatrixParser.MakeBracesContext ctx);
}