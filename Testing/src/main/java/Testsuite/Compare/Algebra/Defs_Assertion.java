package Testsuite.Compare.Algebra;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;


//TODO: AGGIORNARE I METODI PER ROOTDEF
public class Defs_Assertion implements Assertion{
	private final HashMap<String, Assertion> defs;
	private Map.Entry<String, Assertion> rootDef;
	
	public Defs_Assertion() {
		defs = new HashMap<String, Assertion>();
	}
	
	public void add(String key, Assertion value) {
		defs.put(key, value);
	}

	public void setRootDef(String rootDefName, Assertion rootDef) {

		if(rootDef.getClass() == Boolean_Assertion.class && ((Boolean_Assertion) rootDef).getValue() == false)
		{
			And_Assertion a = new And_Assertion();
			a.add(rootDef);
			this.rootDef = new AbstractMap.SimpleEntry<>(rootDefName, a);
		}

		this.rootDef = new AbstractMap.SimpleEntry<>(rootDefName, rootDef);
	}

	public void addAll(Defs_Assertion defs){
		this.defs.putAll(defs.defs);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Defs_Assertion that = (Defs_Assertion) o;

		if (defs != null ? !defs.equals(that.defs) : that.defs != null) return false;
		return rootDef != null ? rootDef.equals(that.rootDef) : that.rootDef == null;
	}

	@Override
	public int hashCode() {
		int result = defs != null ? defs.hashCode() : 0;
		result = 31 * result + (rootDef != null ? rootDef.hashCode() : 0);
		return result;
	}
}
