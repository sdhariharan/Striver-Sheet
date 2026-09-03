public class Row_with_max_1 {

    public static void main(String[] args) {
        int[][] nums={{0,0,1},{0,1,1},{1,1,1}};
        int n=nums.length;
        int row=0;
        int col=n-1;
        int ans=0;
        while(row<n && col>=0)
        {
            
            if(nums[row][col]==1)
            {
                ans=row;
                col--;
            }
            else
                row++;
        }
        System.out.println("Row With Maximum one is "+ans);
    }
}
