import java.util.*;

public class parenthesis {

    public static List<String> generatePrathesis(int m) {
        List<String> res = new ArrayList<>();
        recurance(res, 0, 0, "", m);
        return res;
    }

    public static void recurance(List<String> res, int l, int r, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (l < n) {
            recurance(res, l + 1, r, s + "(", n);
        }
        if (r < l) {
            recurance(res, l, r + 1, s + ")", n);
        }

    }

    public static void main(String[] args) {
        System.out.println(generatePrathesis(2));
    }
}