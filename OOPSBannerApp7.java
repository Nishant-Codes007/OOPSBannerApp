public class OOPSBannerApp7 {
    // UC7: Implementing a static inner class to encapsulate characters and their patterns
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // UC7: Utilizing a constructor for efficient data management
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // UC7: Utilizing getters to retrieve the encapsulated data
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Define the raw ASCII patterns for the letters
        String[] patternO = {"  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "};
        String[] patternP = {" ***** ", " * *", " * *", " ***** ", " * ", " * ", " * "};
        String[] patternS = {"  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "};

        // Create a modular system mapping each character to its pattern
        CharacterPatternMap[] dictionary = {
            new CharacterPatternMap('O', patternO),
            new CharacterPatternMap('P', patternP),
            new CharacterPatternMap('S', patternS)
        };

        String targetWord = "OOPS";
        int bannerHeight = 7;

        // Loop through each line of the banner height
        for (int i = 0; i < bannerHeight; i++) {
            
            // UC7: Utilizing StringBuilder for efficient data management while constructing the line
            StringBuilder lineBuilder = new StringBuilder();

            // Loop through each letter in our target word ("OOPS")
            for (int j = 0; j < targetWord.length(); j++) {
                char currentChar = targetWord.charAt(j);

                // Find the matching pattern in our dictionary
                for (CharacterPatternMap map : dictionary) {
                    if (map.getCharacter() == currentChar) {
                        lineBuilder.append(map.getPattern()[i]);
                        
                        // Add spacing between letters, but not after the last letter
                        if (j < targetWord.length() - 1) {
                            lineBuilder.append("  ");
                        }
                        break; // Stop searching once we found the match
                    }
                }
            }
            // Print the completed line
            System.out.println(lineBuilder.toString());
        }
    }
}
