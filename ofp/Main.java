/**
 * Main.java
 * 10 sep. 2023
 * jlnmsi
 * 
 * Starting point for the ofp compiler
 */
package ofp;

import java.io.IOException;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.gui.Trees;

import generated.OFPBaseListener;
import generated.OFPLexer;
import generated.OFPParser;



public class Main  {

    public static void main(String[] args)  {
			System.out.println("Hello world");

            PrintListener listner = new PrintListener();
           listner.enter();

           OFPBaseListener listnerOFP = new OFPBaseListener();
           listnerOFP.enterProg(null);

         

        // Select test program
        String testDir = "C:/Users/Anas_/OneDrive/school/ST/CT/A2/ofp_examples/";
        String testProgram = testDir + "arithmetics.ofp";
        
        // Check if input ends with ".ofp"
        if ( !testProgram.endsWith(".ofp") ) {
            System.out.println("\nPrograms most end with suffix .ofp! Found "+testProgram);
            System.exit(-1);
        }
        System.out.println("Reading test program from: "+testProgram);
        
        // Parse input program
        System.out.println("\nParsing started");
        OFPParser parser = null;
        OFPParser.ProgContext root = null;
        try {
            CharStream inputStream = CharStreams.fromFileName(testProgram);
            OFPLexer lexer = new OFPLexer( inputStream );		
            parser = new OFPParser(new BufferedTokenStream(lexer));	
            root = parser.prog();
        } catch (IOException e) {				
            e.printStackTrace();
        } 
        System.out.println("\nParsing completed");

        // Display tree
        Trees.inspect(root, parser);
        
    }


}


 class PrintListener extends OFPBaseListener {

    public void enter(){
			System.out.println("Hellooooooooooooooooo world");
    };
 
}

