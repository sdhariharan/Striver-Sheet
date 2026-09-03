public class Painter_partition {
    public static int possible(int mid,int[] boards,int n,int k)
    {
        int painters=1;
        int units=0;
        for(int num:boards)
        {
         if(units+num<=mid)
         {
            units+=num;
         }
         else{
            painters++;
            units=num;
         }
        }
        return painters;
    }
    public static int min_painter_partition(int[] boards,int n,int k)
    {
        int low=0,high=0;
        for(int num:boards)
        {
            low=Math.max(low, num);
            high+=num;
        }
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(mid,boards,n,k)>k)
                low=mid+1;
            else
            {
                ans=mid;
                high=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] boards={5,5,5,5};
        int n=boards.length;
        int k=2;
        int ans=min_painter_partition(boards,n,k);
        System.out.println("Minmum time :"+ans);
    }
}
