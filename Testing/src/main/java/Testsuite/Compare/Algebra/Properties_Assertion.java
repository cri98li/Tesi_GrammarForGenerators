package Testsuite.Compare.Algebra;


import java.util.HashMap;


public class Properties_Assertion implements Assertion{
	private final HashMap<String, Assertion> properties;
	private final HashMap<String, Assertion> patternProperties;
	private Assertion additionalProperties;
	
	public Properties_Assertion() {
		properties = new HashMap<>();
		patternProperties = new HashMap<>();
	}
	
	public void addProperties(String key, Assertion value) {
		properties.put(key, value);
	}
	
	public void addPatternProperties(String key, Assertion value) {
		patternProperties.put(key, value);
	}
	
	public void setAdditionalProperties(Assertion additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@Override
	public String toString() {
		return "Properties_Assertion [properties=" + properties + ", patternProperties=" + patternProperties
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Properties_Assertion that = (Properties_Assertion) o;

		if (properties != null ? !properties.equals(that.properties) : that.properties != null) return false;
		if (patternProperties != null ? !patternProperties.equals(that.patternProperties) : that.patternProperties != null)
			return false;
		return additionalProperties != null ? additionalProperties.equals(that.additionalProperties) : that.additionalProperties == null;
	}

	@Override
	public int hashCode() {
		int result = properties != null ? properties.hashCode() : 0;
		result = 31 * result + (patternProperties != null ? patternProperties.hashCode() : 0);
		result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
		return result;
	}
}
