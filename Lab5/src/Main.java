public class Main {
    public static void main(String[] args) {

        Duck donald = new Duck();
        Duck daisy = new PekingDuck();
        Cow wagyu = new Cow();
        donald.clean(daisy);
        daisy.clean(daisy);
    }
}