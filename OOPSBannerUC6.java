public class OOPSBannerUC6 {

    // Method to generate O pattern
    public static String[] getOPattern() {
        return new String[] {
            String.join(" ", " ***** "),
            String.join(" ", " *   * "),
            String.join(" ", " *   * "),
            String.join(" ", " *   * "),
            String.join(" ", " *   * "),
            String.join(" ", " *   * "),
            String.join(" ", " ***** ")
        };
    }

    // Method to generate P pattern
    public static String[] getPPattern() {
        return new String[] {
            String.join(" ", " ***** "),
            String.join(" ", " *   * "),
            String.join(" ", " *   * "),
            String.join(" ", " ***** "),
            String.join(" ", " *     "),
            String.join(" ", " *     "),
            String.join(" ", " *     ")
        };
    }

    // Method to generate S pattern
    public static String[] getSPattern() {
        return new String[] {
            String.join(" ", " ***** "),
            String.join(" ", " *     "),
            String.join(" ", " *     "),
            String.join(" ", " ***** "),
            String.join(" ", "     * "),
            String.join(" ", "     * "),
            String.join(" ", " ***** ")
        };
    }

    public static void main(String[] args) {

        // Get patterns using methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print banner using loop
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +
                pPattern[i] + " " +
                sPattern[i]
            );
        }
    }
}