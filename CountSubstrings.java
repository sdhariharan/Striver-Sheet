import  java.util.*;
public class CountSubstrings {
    public  static int count(String s,int n,int k)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int total=0;
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.size()>k)
            {
                char leftchar=s.charAt(start);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0)
                    map.remove(leftchar);
                start++;

            }   
            total+=i-start+1;
        }

        return total;
    }
    public static void main(String[] args) {
        String s="pqpqs";
        int n=s.length();
        int k=2;
        System.out.println("No of Substring of " + k + " distinct element "
            + (CountSubstrings.count(s, n, k) - CountSubstrings.count(s, n, k - 1)));

    }
}
