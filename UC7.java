/**
 * OOPSBannerApp - UC7
 * Goal: Display "OOPS" in a banner format using a CharacterPattern class.
 * 
 * @author YourName
 * @version 7.0
 */
public class UC7 {

    /**
     * Inner static class to encapsulate a character and its banner pattern.
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         * @param character The character being represented
         * @param pattern The 7-line banner pattern for the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character.
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern.
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility methods to build patterns for O, P, and S.
     */
    private static CharacterPatternMap getOPattern() {
        return new CharacterPatternMap('O', new String[]{
            " * ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " * "
        });
    }

    private static CharacterPatternMap getPPattern() {
        return new CharacterPatternMap('P', new String[]{
            "*** ",
            "*    *",
            "*    *",
            "*** ",
            "*     ",
            "*     ",
            "*     "
        });
    }

    private static CharacterPatternMap getSPattern() {
        return new CharacterPatternMap('S', new String[]{
            "*** ",
            "*     ",
            "*     ",
            "*** ",
            "     *",
            "     *",
            "*** "
        });
    }

    /**
     * Main method to assemble and display the OOPS banner.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap objects for O, P, S
        CharacterPatternMap O = getOPattern();
        CharacterPatternMap P = getPPattern();
        CharacterPatternMap S = getSPattern();

        // Build banner lines using patterns from CharacterPatternMap
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ",
                O.getPattern()[i],
                O.getPattern()[i],
                P.getPattern()[i],
                S.getPattern()[i]
            );
        }

        // Print each line using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}