public class OopsBannerAppUC5 {
    public static void main(String[] args) {
        String[] lines = {
            String.join("", "  ***  ", "  ***  ", " ***** ", " ***** "),
            String.join("", " *   * ", " *   * ", " *   * ", "*      "),
            String.join("", " *   * ", " *   * ", " *   * ", "*      "),
            String.join("", " *   * ", " *   * ", " ***** ", " ***** "),
            String.join("", " *   * ", " *   * ", " *     ", "      *"),
            String.join("", " *   * ", " *   * ", " *     ", "      *"),
            String.join("", "  ***  ", "  ***  ", " *     ", " ***** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
        
        System.out.println("\nOOPS Banner App - UC5: Concept GenAI Video");
    }
}