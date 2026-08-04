import java.util.*;

public class bfs {
    public static void addlist(List<List<Integer>> adjlist, int v, int u) {
        adjlist.get(v).add(u);
        adjlist.get(u).add(v);
    }

    public static int [] breathfirst(int start, List<List<Integer>> adjlist) {
        boolean[] visted = new boolean[adjlist.size()];
        visted[start] = true;
        int result[] = new int[adjlist.size()];
        int i = 0;
        result[i] = start;
        i++;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (queue.isEmpty() != true) {
            int x = queue.poll();

            for (int neighbour : adjlist.get(x)) {
                if (visted[neighbour] != true) {
                    queue.add(neighbour);
                    visted[neighbour] = true;
                    result[i] = neighbour;
                    i++;
                }
            }
        }
return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
List<List<Integer>> adjlist = new ArrayList<>();
System.out.println("enter the total no of nodes in your graph");
int v = sc.nextInt();
for(int i=0; i<v ; i++){
    adjlist.add(new ArrayList<>());
    }
addlist(adjlist, 0, 1);
addlist(adjlist, 0, 2);
addlist(adjlist,1,3);
addlist(adjlist,1,5);
addlist(adjlist,2,4);
addlist(adjlist,2,6);
int[] arr = breathfirst(0, adjlist);
System.out.println(Arrays.toString(arr));

}}
