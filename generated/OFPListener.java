// Generated from c:\Users\Anas_\OneDrive\school\ST\CT\A2\OFP.g4 by ANTLR 4.9.2
 
    package generated; 
    
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OFPParser}.
 */
public interface OFPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OFPParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(OFPParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(OFPParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(OFPParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(OFPParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(OFPParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(OFPParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OFPParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OFPParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(OFPParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(OFPParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(OFPParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(OFPParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(OFPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(OFPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#arrType}.
	 * @param ctx the parse tree
	 */
	void enterArrType(OFPParser.ArrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#arrType}.
	 * @param ctx the parse tree
	 */
	void exitArrType(OFPParser.ArrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(OFPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(OFPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#methodAccess}.
	 * @param ctx the parse tree
	 */
	void enterMethodAccess(OFPParser.MethodAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#methodAccess}.
	 * @param ctx the parse tree
	 */
	void exitMethodAccess(OFPParser.MethodAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void enterArrayList(OFPParser.ArrayListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void exitArrayList(OFPParser.ArrayListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(OFPParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(OFPParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(OFPParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(OFPParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#asgnStmt}.
	 * @param ctx the parse tree
	 */
	void enterAsgnStmt(OFPParser.AsgnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#asgnStmt}.
	 * @param ctx the parse tree
	 */
	void exitAsgnStmt(OFPParser.AsgnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(OFPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(OFPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(OFPParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(OFPParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(OFPParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(OFPParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(OFPParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(OFPParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(OFPParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(OFPParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(OFPParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(OFPParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(OFPParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(OFPParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(OFPParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(OFPParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(OFPParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(OFPParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecl(OFPParser.LocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecl(OFPParser.LocalDeclContext ctx);
}