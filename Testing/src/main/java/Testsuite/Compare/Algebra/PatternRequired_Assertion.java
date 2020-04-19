package Testsuite.Compare.Algebra;

import java.util.HashMap;


public class PatternRequired_Assertion implements Assertion{
	private final HashMap<String, Assertion> pattReq;

	public PatternRequired_Assertion() {
		pattReq = new HashMap<>();
	}
	
	public PatternRequired_Assertion(HashMap<String, Assertion> pattReq) {
		this.pattReq = pattReq;
	}
	
	public PatternRequired_Assertion(String name, Assertion assertion) {
		pattReq = new HashMap<>();
		pattReq.put(name, assertion);
	}

	public void add(String key, Assertion value) {
		pattReq.put(key, value);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PatternRequired_Assertion that = (PatternRequired_Assertion) o;

		return pattReq != null ? pattReq.equals(that.pattReq) : that.pattReq == null;
	}

	@Override
	public int hashCode() {
		return pattReq != null ? pattReq.hashCode() : 0;
	}
}
