public class LowerBound {
    public static void main(String[] args) {
        int nums[]={1,2,4,4,5};
        int n=5;
        int low=0;
        int high=n-1;
        int target=3;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    System.out.println("Lower Bound Index:"+ans);
    }
}
