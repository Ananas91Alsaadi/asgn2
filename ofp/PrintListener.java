package ofp;

import org.antlr.v4.runtime.ParserRuleContext;

import generated.OFPBaseListener;
import generated.OFPParser;
import generated.OFPParser.ExprContext;

public class PrintListener extends OFPBaseListener {
    int ind = 0;
	@Override 
    public void enterEveryRule(ParserRuleContext ctx) {
        ind++;
        System.out.println(" ".repeat(ind)  + ctx.getClass().getSimpleName());
     }

     @Override
     public void exitEveryRule(ParserRuleContext ctx) {
        ind--;
        System.out.println(" ".repeat(ind)  + ctx.getClass().getSimpleName());
     }



}