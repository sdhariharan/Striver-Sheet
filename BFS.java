import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {

static void bfs(int start,ArrayList<ArrayList<Integer>> graph)
{
    Queue<Integer> queue=new LinkedList<>();
    int n=graph.size();
    boolean[] visited = new boolean[n];
    visited[start] = true;
    queue.add(start);
    while(!queue.isEmpty())
    {
        int node=queue.poll();
        System.out.println(node+" ");
        for(int neighbour:graph.get(node))
        {
            if(!visited[neighbour])
            {
                visited[neighbour]=true;
                queue.add(neighbour);
            }
        }
    }

}
    public static void main(String[] args) {
        int n=6;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
         graph.get(0).add(2);
          graph.get(1).add(0);
          graph.get(1).add(3);
         graph.get(1).add(4);
          graph.get(2).add(0);
          graph.get(2).add(5);
          graph.get(3).add(1);
          graph.get(4).add(1);
          graph.get(5).add(1);

          bfs(0,graph);
    }
}
