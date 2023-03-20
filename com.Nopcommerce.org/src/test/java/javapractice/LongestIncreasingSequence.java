package javapractice;


		import java.util.*;

		public class LongestIncreasingSequence {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();
		        int[] a = new int[n];
		        for (int i = 0; i < n; i++) {
		            a[i] = scanner.nextInt();
		        }
		        int count = longestIncreasingSequenceCount(a);
		        System.out.println(count);
		    }

		    public static int longestIncreasingSequenceCount(int[] a) {
		        int n = a.length;
		        if (n == 0) {
		            return 0;
		        }
		        int[] dp = new int[n];
		        Arrays.fill(dp, 1);
		        for (int i = 1; i < n; i++) {
		            for (int j = 0; j < i; j++) {
		                if (a[i] > a[j]) {
		                    dp[i] = Math.max(dp[i], dp[j] + 1);
		                }
		            }
		        }
		        int maxCount = 1;
		        for (int i = 0; i < n; i++) {
		            maxCount = Math.max(maxCount, dp[i]);
		        }
		        return maxCount;
		    }
		

		
		
		
		
		
		
		
	}



