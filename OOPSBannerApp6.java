public class OOPSBannerApp6 {
    public static void main(String[] args) {
       
        String[] bannerLines = {
            getRow(0), getRow(1), getRow(2), getRow(3), getRow(4), getRow(5), getRow(6)
        };

        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

   
    public static String getRow(int index) {
        return String.join("  ", getO(index), getO(index), getP(index), getS(index));
    }

   
    public static String getO(int i) {
        String[] o = {"  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "};
        return o[i];
    }

    public static String getP(int i) {
        String[] p = {" ***** ", " * *", " * *", " ***** ", " * ", " * ", " * "};
        return p[i];
    }

    public static String getS(int i) {
        String[] s = {"  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "};
        return s[i];
    }
}