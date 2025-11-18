package nvf.coffeecart;

public class App {

    public static void main(String[] args) {
        System.out.println(brew());
    }

    public static String brew() {
        return "Coffee is brewing";
    }

    // Returns mg per cup
    public static int calculateCaffeineBoost(int cups) {
        if (cups < 0) {
            throw new IllegalArgumentException("Cups cannot be negative");
        }
        return cups * 20;
    }

    public static boolean isValidRoast(String roast) {
        return roast != null && (roast.equalsIgnoreCase("light") ||
                roast.equalsIgnoreCase("medium") ||
                roast.equalsIgnoreCase("dark"));
    }
}
