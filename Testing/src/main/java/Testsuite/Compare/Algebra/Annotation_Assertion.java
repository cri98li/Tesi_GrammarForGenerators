package Testsuite.Compare.Algebra;

import java.util.HashMap;

public class Annotation_Assertion implements Assertion{
	private final HashMap<String, String> annotations;
	
	public Annotation_Assertion() {
		annotations = new HashMap<>();
	}
	
	public void add(String key, String value) {
		annotations.put(key, value);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Annotation_Assertion that = (Annotation_Assertion) o;

		return annotations != null ? annotations.equals(that.annotations) : that.annotations == null;
	}

	@Override
	public int hashCode() {
		return annotations != null ? annotations.hashCode() : 0;
	}
}
