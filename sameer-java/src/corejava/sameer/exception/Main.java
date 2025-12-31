package corejava.sameer.exception;

public class Main {
    public static void main(String[] args) {
        Main claardTheMethod = new Main();
        claardTheMethod.method1();

    }
    private void method1() {
        System.out.println("Hello method 1");
        method2();
    }

    private void method2() {
        System.out.println("Hello method 2");
        method3();
    }

    private void method3() {
        System.out.println("Hello method 3");
        int b = 5/0;
    }

}
