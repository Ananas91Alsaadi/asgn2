package ofp;
import java.util.ArrayList;

public class CheckProcess {
    
	private int totalErrors = 0;

	ArrayList<Error> errorArr = new ArrayList<Error>();

	public void reportError(ErrorType type, int codeLine, String message) {
		totalErrors++;
		
		if(!errorArr.contains(new Error(type, codeLine, message)))
		errorArr.add(new Error(type, codeLine, message));
		else
		totalErrors--;
	}

	public void printErrors() {
		System.out.println("Total Errors: " +  totalErrors);
		for(Error i : errorArr) {
			System.err.println(i.alertMSG());
		}
	}


}


 class Error{
	
	public ErrorType type; 
	public  int codeLine; 
	public  String message; 
	 
	 public Error(ErrorType type, int line, String message) {
		 this.type = type; this.codeLine = line; this.message = message; 
	 }
	 
	 public String alertMSG() {
		return "[" + type + "] " + "in line: " + codeLine + " " +  message ;
		 
	 }
	 
	 /*
	 @Override
	 public boolean equals(Object object) {
		if(object instanceof Error) {
			if(this.type.equals(((Error) object).type) && this.codeLine == ((Error) object).codeLine 
					&& this.message.equals(((Error) object).message)) {
				return true; 
			}else {
				return false; 
			}
		}
		return false;
		 
		 
	 }
	 
	 
	 @Override
	 public int hashCode() {
	     return this.codeLine+this.message.hashCode();
	 }
	  */
	 
	 
}
 
 
 enum ErrorType {
	 SemanticError, TypeMismatch , ParsingError, MultipleDeclerationError,
 }