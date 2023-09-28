package ofp;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
private Scope enclosingScope; // null if global (outermost) scope
private Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();
public Scope(Scope enclosingScope) { ... }
public Scope getEnclosingScope() { ...}
public void define(Symbol sym) { symbols.put(sym.getName(), sym); }
// If a name cannot be resolved in this scope,
// try enclosing/parent scope recursively.
// If null is returned, name/identifier not found in the symbol table!
public Symbol resolve(String name) { ... }
// Print the contents of this scope
@Override
public String toString() { ... }






}
