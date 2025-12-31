package corejava.sameer.lambdaexp;

public class Main {
    public static void main(String[] args) {
        Bird b  = (String val) -> {
            System.out.println("Bird fiy on the air");
        };
        b.canFly("Eagle fly on the sly");
    }
}
