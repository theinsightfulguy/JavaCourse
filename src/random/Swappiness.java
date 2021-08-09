package random;

public class Swappiness {

    public static void main(String... args) {
        nonWorkingSwap1();
        System.out.println("********************************");
        nonWorkingSwap2();
        System.out.println("********************************");
        workingSwap3();
    }

    public static void nonWorkingSwap1() {
        int a = 2; //TODO: What are primitives
        int b = 3;
        System.out.println(a + ", " + b);
        swap(a, b);
        System.out.println(a + ", " + b);
    }

    public static void nonWorkingSwap2() {
        Integer a = 2;
        Integer b = 3;
        System.out.println(a + ", " + b);
        swap2(a, b);
        System.out.println(a + ", " + b);
    }

    public static void workingSwap3() {
        Pair p = new Pair(2, 3);
        System.out.println(p);
        p = p.swap();
        System.out.println(p);
    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a + ", " + b);
    }

    public static void swap2(Integer a, Integer b) {
        Integer c = a;
        a = b;
        b = c;
        System.out.println(a + ", " + b);
    }

    public static Pair swap(Pair p) {
        return p.swap();
    }
}

class Pair {
    final int a;
    final int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Pair swap() {
        return new Pair(b, a);
    }

    @Override
    public String toString() {
        return a + ", " + b;
    }
}
