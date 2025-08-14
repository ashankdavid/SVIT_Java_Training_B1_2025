package Graphs.Traversal.DFS;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSTraversal {
    private void dfsTraversalHelper(int n, List<List<Integer>> adjList, boolean[] visited, List<Integer> ans){
        visited[n] = true;
        ans.add(n);
        for(int neighbour : adjList.get(n)){
            if(!visited[neighbour]){
                dfsTraversalHelper(neighbour, adjList, visited, ans);
            }
        }
    }

    public List<Integer> dfsTraversal(int node, List<List<Integer>> adjList){
        boolean[] visited = new boolean[node];
        List<Integer> ans = new ArrayList<>();
        dfsTraversalHelper(0, adjList, visited, ans);
        return ans;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<e; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
        }

        DFSTraversal g = new DFSTraversal();
        List<Integer> result = g.dfsTraversal(n, adjList);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
