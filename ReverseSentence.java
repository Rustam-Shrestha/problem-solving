public class ReverseSentence {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverse(arr, 0, arr.length - 1);

        int l = 0, r = 0;
        while (r < arr.length) {
            while (r < arr.length && arr[r] == ' ') r++;
            l = r;
            while (r < arr.length && arr[r] != ' ') r++;
            reverse(arr, l, r - 1);
        }

        return cleanSpaces(arr);
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    private String cleanSpaces(char[] arr) {
        int l = 0, r = 0;
        while (r < arr.length) {
            while (r < arr.length && arr[r] == ' ') r++;
            while (r < arr.length && arr[r] != ' ') arr[l++] = arr[r++];
            while (r < arr.length && arr[r] == ' ') r++;
            if (r < arr.length) arr[l++] = ' ';
        }
        return new String(arr, 0, l);
    }
