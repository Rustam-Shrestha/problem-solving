import java.util.List;

public class GenerateParenthesis {


        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            dfs(result, "", 0, 0, n);
            return result;
        }

        private void dfs(List<String> result, String current, int open, int close, int max) {
            if (current.length() == max * 2) {
                result.add(current);
                return;
            }

            if (open < max) {
                dfs(result, current + "(", open + 1, close, max);
            }

            if (close < open) {
                dfs(result, current + ")", open, close + 1, max);
            }
        }


}
