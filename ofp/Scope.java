package ofp;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private String name;
	private String type;
	private int next = 0; // visit next child


    
private Scope enclosingScope; // null if global (outermost) scope

private Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

public Scope(Scope enclosingScope) { 		
    this.enclosingScope = enclosingScope;
}

public Scope getEnclosingScope() { 		
    return enclosingScope;
}


public void define(Symbol sym) { symbols.put(sym.getName(), sym); }
// If a name cannot be resolved in this scope,
// try enclosing/parent scope recursively.
// If null is returned, name/identifier not found in the symbol table!
public Symbol resolve(String name) { 
    if(symbols.containsKey(name)) {
        return symbols.get(name);
    }else{
        return null;
    }
 }
// Print the contents of this scope
@Override
public String toString() { 
    
    if (enclosingScope != null) {
    return "Scope name : " + name + " Enclosing Scope id : " + enclosingScope.name;
} else {
    return "Scope name : " + name;
}

 }


}
