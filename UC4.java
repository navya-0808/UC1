public class UC4 {

    // Class to store character pattern
    static class CharacterPattern {

        String[] pattern;

        CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        String getLine(int index) {
            return pattern[index];
        }
    }

    public static void main(String[] args) {

        // Define patterns for O, P, S (7 lines each)

        CharacterPattern O = new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern(new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern(new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Print OOPS banner
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O.getLine(i) + "  " +
                    O.getLine(i) + "  " +
                    P.getLine(i) + "  " +
                    S.getLine(i)
            );
        }
    }
}