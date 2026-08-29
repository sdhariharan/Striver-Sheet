public class sqrt {
    public static void main(String[] args) {
        int n=100;
        int low=0,high=n/2;
        int ans=-1;
        if(n<2) 
        {
            System.out.println("Square Root :"+n);
            return ;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mid*mid<=n)
            {
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Square Root :"+ans);
    }
}
