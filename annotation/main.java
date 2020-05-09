package annotation;

public class main {
    @Test(value="str", types={"A", "B"})
    public static void main(String... args) {
        System.out.println("Hello World!");
    }
}