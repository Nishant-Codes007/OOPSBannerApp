import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8{
    public static void main(String[] args) {
        
        Map<Character, String[]> patternMap = new HashMap<>();

      
        String[] patternO = {"  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "};
        String[] patternP = {" ***** ", " * *", " * *", " ***** ", " * ", " * ", " * "};
        String[] patternS = {"  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "};

       
        patternMap.put('O', patternO);
        patternMap.put('P', patternP);
        patternMap.put('S', patternS);

        
        renderBanner("OOPS", patternMap, 7);
    }


    public static void renderBanner(String word, Map<Character, String[]> map, int bannerHeight) {
        
       
        for (int i = 0; i < bannerHeight; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                
                
                if (map.containsKey(currentChar)) {
                    lineBuilder.append(map.get(currentChar)[i]);
                }

                
                if (j < word.length() - 1) {
                    lineBuilder.append("  ");
                }
            }
            
            System.out.println(lineBuilder.toString());
        }
    }
}
