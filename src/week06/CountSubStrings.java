package week06;

public class CountSubStrings {

    public static void main(String[] args) {

    }


    public static int countSubstrings(String s){
        //动态规划发
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int j = 0; j < s.length(); j++){
            for (int i = 0; i <= j; i++){
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])){
                    dp[i][j] = true;
                    ans++;
                }
            }
        }

        return ans;
    }
}
