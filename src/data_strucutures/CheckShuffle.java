package data_strucutures;

public class CheckShuffle {
    public static void main(String[] args) {
        String a = "ABCQY";
        String b = "DEFZL";
        String r = "ADBCEFQYZL";

        if (r.length() != a.length() + b.length()) {
            System.out.println("No");
        }
        int i = 0, j = 0, k = 0;
        while (k < r.length()) {
            if (i < a.length() && a.charAt(i) == r.charAt(k)) i++;
            else if (j < b.length() && b.charAt(j) == r.charAt(k)) j++;
            else System.out.println("No");
            k++;
        }
        if (i + j == r.length()) System.out.println("Yes");
        else System.out.println("No");
    }
}
