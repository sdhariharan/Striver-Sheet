public class Longest_SubArray {
    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        int k=15;
        int start=0;
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)max=Math.max(max,i-start+1);
            while(sum>k)sum-=arr[start++];
        }
        System.out.println("Longest SubAarray :"+max);
    }
}
