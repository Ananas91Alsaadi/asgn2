package ofp;

public class OFPType {
    public static final OFPType intType = new OFPType("int");
    public static final OFPType intArrType = new OFPType("int[]");
    public static final OFPType argsType = new OFPType("String[]");


    public static OFPType getTypeFor(String typeName) {
        
    }
    private final String name;
    private OFPType(String name) {this.name = name;} 
    public String getName() {return name; } 
    @Override 
    public String toString() {return name; }

}
