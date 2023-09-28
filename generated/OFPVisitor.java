// Generated from c:\Users\Anas_\OneDrive\school\ST\CT\A2\OFP.g4 by ANTLR 4.9.2
 
    package generated; 
    
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OFPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OFPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OFPParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(OFPParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(OFPParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(OFPParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OFPParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(OFPParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(OFPParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(OFPParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#arrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrType(OFPParser.ArrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(OFPParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#methodAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAccess(OFPParser.MethodAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#arrayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayList(OFPParser.ArrayListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(OFPParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(OFPParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#asgnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgnStmt(OFPParser.AsgnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(OFPParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(OFPParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(OFPParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(OFPParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(OFPParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(OFPParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(OFPParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(OFPParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(OFPParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OFPParser#localDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecl(OFPParser.LocalDeclContext ctx);
}