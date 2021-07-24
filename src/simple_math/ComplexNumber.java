package simple_math;

public class ComplexNumber {

    // State
    public final int realPart;
    public final int imagPart;

    public ComplexNumber(int rp, int ip) {
        realPart = rp;
        imagPart = ip;
    }

    // Functions
    public ComplexNumber add(ComplexNumber that) {
        return new ComplexNumber(this.realPart + that.realPart, this.imagPart + that.imagPart);
    }

    @Override //TODO: Cover annotations
    public String toString() {
        return String.format("%d + %di", realPart, imagPart);
    }
}
