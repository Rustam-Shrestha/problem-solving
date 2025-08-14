public class DecodeWays {
public int numDecodings(String s) {
    if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;
    int pp = 1, p = 1, curr = 0;

    for (int i = 1; i < s.length(); i++) {
        curr = 0;
        if (s.charAt(i) != '0') curr += p;
        int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
        if (twoDigit >= 10 && twoDigit <= 26) curr += pp;
        pp = p;
        p = curr;
    }

    return p;
}
}
