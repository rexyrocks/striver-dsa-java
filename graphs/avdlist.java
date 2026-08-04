import java.util.*;
public class avdlist {
    public static void addEdge(List<List<Integer>> adjlist,int v ,int u){
        adjlist.get(v).add(u);
        adjlist.get(u).add(v);
    }
    public static void main(String[] args) {
       List<List<Integer>> adjlist = new ArrayList<>(); 
       for(int i = 0; i<7 ; i++){
        adjlist.add(new ArrayList<>());
    }
    addEdge(adjlist,0,1);
    addEdge(adjlist, 0, 2);
    addEdge(adjlist, 1, 3);
    addEdge(adjlist, 1, 5);
    addEdge(adjlist, 2, 4);
    addEdge(adjlist, 2, 6);
   

   
      
       System.out.println(adjlist);
    }

}
