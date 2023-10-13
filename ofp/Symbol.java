


package ofp;

public class Symbol {

	private OFPType type;
	private String name;



public Symbol(String name, OFPType type) { 
    super();
    this.name = name;
    this.type = type;

 }
public String getName() { 
    return name;
}
public OFPType getType() { 
    return type;

 }
    
}
