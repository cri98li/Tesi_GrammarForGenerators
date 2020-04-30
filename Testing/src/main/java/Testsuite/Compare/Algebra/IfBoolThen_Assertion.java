package Testsuite.Compare.Algebra;

public class IfBoolThen_Assertion implements Assertion {
    private boolean value;

    public  IfBoolThen_Assertion(boolean value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IfBoolThen_Assertion that = (IfBoolThen_Assertion) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return (value ? 1 : 0);
    }
}
