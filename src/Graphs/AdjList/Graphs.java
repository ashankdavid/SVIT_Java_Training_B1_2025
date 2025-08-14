package Graphs.AdjList;

import java.util.ArrayList;

public class Graphs {
    ArrayList<ArrayList<Integer>> AdjList;

    Graphs(int n){
        AdjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            AdjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v, boolean direction){
//        direction = false -> undirected
//        direction = true -> directed
        AdjList.get(u).add(v);

        if(!direction){
            AdjList.get(v).add(u);
        }
    }

    void printAdjList(){
        for(int i=0; i<AdjList.size(); i++){
            System.out.print(i+"->");
            for(int j : AdjList.get(i)){
                System.out.print(j + ", ");
            }
            System.out.println();
        }
    }
}

class DriverCode{
    public static void main(String[] args) {
        Graphs g = new Graphs(6);
        g.addEdge(0,5, false);
        g.addEdge(0,1, false);
        g.addEdge(5,4, false);
        g.addEdge(0,4, false);
        g.addEdge(4,1, false);
        g.addEdge(1,3, false);
        g.addEdge(4,3, false);
        g.addEdge(3,2, false);
        g.addEdge(3,1, false);
        g.printAdjList();
    }
}
