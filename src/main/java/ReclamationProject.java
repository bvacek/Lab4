/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 *
 */
public class ReclamationProject {
    /**
     * Finds the longest shared substring between two strings.
     * @param a one of the strings to be compared;
     * @param b another of the strings to be compared;
     * @return the longest shared substring between the two. If none exists, prints a blank string;
     */
    static String findLongestSubstring(final String a, final String b) {
        if (a.length() > b.length()) {
            String c = a;
            a = b; b = c;
        }
        String longestSubString;
        if (a.equals(b)) {
            longestSubString = "";
        } else {
            longestSubString = "";
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > longestSubString.length()) {
                        longestSubString = a.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
