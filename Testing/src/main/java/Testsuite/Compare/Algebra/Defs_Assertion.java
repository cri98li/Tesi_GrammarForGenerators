package Testsuite.Compare.Algebra;

import java.util.HashMap;


//TODO: AGGIORNARE I METODI PER ROOTDEF
public class Defs_Assertion implements Assertion{
	private final HashMap<String, Assertion> defs;
	private Assertion rootDef;
	
	public Defs_Assertion() {
		defs = new HashMap<String, Assertion>();
	}
	
	public void add(String key, Assertion value) {
		defs.put(key, value);
	}
	
	public void setRootDef(Assertion rootDef) {
		this.rootDef = rootDef;
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
