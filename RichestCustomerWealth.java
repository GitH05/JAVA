// Leetcode problem:
// https://leetcode.com/problems/richest-customer-wealth/submissions/1427615410/
public class RichestCustomerWealth {
    
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{4,5,6}};
        System.out.println("maximum wealth:"+maximumWealth(accounts));
    }
        public static int maximumWealth(int[][] accounts) {
            int ans = Integer.MIN_VALUE;
            // person = row
            for(int person=0;person<accounts.length;person++)
            {
                int sum = 0;
                // account = column
                for(int account=0;account<=accounts.length;account++) {
                    // for the first: row=0 and column<=length of array:/and so on
                    sum += accounts[person][account];
                }
                if (sum>ans)
                {
                    ans = sum;
                }
            }
            return ans;
        }
    }