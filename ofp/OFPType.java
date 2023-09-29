package ofp;

public class OFPType {
    public static final OFPType intType = new OFPType("int");
    public static final OFPType intArrType = new OFPType("int[]");
    public static final OFPType argsType = new OFPType("String[]");
    public static final OFPType stringType = new OFPType("String");
    public static final OFPType charType = new OFPType("char");
    public static final OFPType floatType = new OFPType("float");
    public static final OFPType boolType = new OFPType("bool");
    public static final OFPType floatArrType = new OFPType("float[]");
    public static final OFPType charArrType = new OFPType("char[]");
    /* not necessary */ public static final OFPType undefType = new OFPType("undef"); //////



    public static OFPType getTypeFor(String typeName) {
        switch (typeName) {
            case "int":
                return OFPType.intType;
            case "int[]":
                return OFPType.intArrType;
            case "String[]":
                return OFPType.argsType;
            case "String":
                return OFPType.stringType;
            case "char":
                return OFPType.charType;
            case "float":
                return OFPType.floatType;
            case "bool":
                return OFPType.boolType;
            case "float[]":
                return OFPType.floatArrType;
            case "char[]":
                return OFPType.charArrType;
            default:
                return null;
            }
    }

    private final String name;

    private OFPType(String name) {this.name = name;} 

    public String getName() {return name; } 

    @Override 
    public String toString() {return name; }

}
