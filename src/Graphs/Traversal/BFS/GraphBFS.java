package Graphs.Traversal.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphBFS {
    int V;
    GraphBFS(int V){
        this.V = V;
    }

    ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);

            for(int neighbor : adjList.get(front)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }

        return ans;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        GraphBFS g = new GraphBFS(n);
        for(int i=1; i<=e; i++){
            System.out.println("Enter Edges: ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
        }

        ArrayList<Integer> result = g.bfsTraversal(adjList);
        System.out.println("BFS: ");
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
