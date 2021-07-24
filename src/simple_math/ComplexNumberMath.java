package simple_math;

public class ComplexNumberMath {
    public static void main(String... args) {

        ComplexNumber num1 = new ComplexNumber(1, 2);
        ComplexNumber num2 = new ComplexNumber(4, 6);

        System.out.println(num1);
        System.out.println(num2);

        System.out.println(
                num1.add(num2)
                        .add(new ComplexNumber(6, 7))
                        .add(new ComplexNumber(66, -35)));

//        System.out.println(addComplexNumbers(num1, num2));
//        var num3 = addComplexNumbers(num1, num2);
//        System.out.println(addComplexNumbers(num1, num3));


//        // (1 + 2i) + (4 + 6i)
//        int a = 1;
//        int b = 2;
//        int c = 4;
//        int d = 6;
//
//        int realSum = a + c;
//        int imaginarySum = b + d;
//
//        System.out.println(String.format("%d + %di", realSum, imaginarySum));
//        //TODO: Explain static vs non static invocations
//
//        addComplexNumbers(a,b,c,d);
    }

    public static void addComplexNumbers(int real1, int imag1, int real2, int imag2) {
        int realSum = real1 + real2;
        int imaginarySum = imag1 + imag2;
        System.out.println(realSum + " + " + imaginarySum + "i");
    }

    public static ComplexNumber addComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
        // do something related to complex numbers
        // num1.imagPart = 0;
        return new ComplexNumber(num1.realPart + num2.realPart, num1.imagPart + num2.imagPart);
    }
}
