package ofp;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import generated.OFPBaseListener;
import generated.OFPParser;

public class SymbolTableListener extends OFPBaseListener {

    private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    private Scope currentScope = null;

    private Symbol currentFunctionSymbol = null; // Useful for later stages



    @Override public void enterProg(OFPParser.ProgContext ctx) { 
        currentScope =new Scope(null); 
        scopes.put(ctx,currentScope);
        System.out.println("Wooooorks");
    }

}
