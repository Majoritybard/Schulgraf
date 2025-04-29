import utils.*;

import java.rmi.dgc.Lease;

public class Schulgraph {
    public static void main(String[] args){

    }
    public Schulgraph(){
        Graph Schulgraph = new Graph();
        Vertex Inforaum = new Vertex("Inforaum");
        Schulgraph.addVertex(Inforaum);
        Vertex PZ= new Vertex("PZ");
        Schulgraph.addVertex(PZ);
        Schulgraph.addEdge(new Edge(Inforaum,PZ,96));
        Vertex WC= new Vertex("WC");
        Schulgraph.addVertex(WC);
        Schulgraph.addEdge(new Edge(WC,Inforaum,80));
        Vertex Aula = new Vertex("Aula");
        Schulgraph.addVertex(Aula);
        Schulgraph.addEdge(new Edge(Aula,Inforaum,95));
        Schulgraph.addEdge(new Edge(Aula,WC,15));
        Vertex Kunstraum = new Vertex("Kunstraum");
        Schulgraph.addEdge(new Edge(Kunstraum,Inforaum,64));
        Schulgraph.addEdge(new Edge(Kunstraum,Aula,71));
        Vertex Musikraum = new Vertex("Musikraum");
        Schulgraph.addVertex(Musikraum);
        Schulgraph.addEdge(new Edge(Musikraum,Inforaum,50));
        Schulgraph.addEdge(new Edge(Kunstraum,Musikraum,9));
        Vertex Inforaum2= new Vertex("Inforaum2");
        Schulgraph.addVertex(Inforaum2);
        Schulgraph.addEdge(new Edge(Inforaum2,Inforaum,5));
        Schulgraph.addEdge(new Edge(Inforaum2,Musikraum,55));
        Schulgraph.addEdge(new Edge(Inforaum2,Kunstraum,50));
        Vertex Schulzoo= new Vertex("Schulzoo");
        Schulgraph.addEdge(new Edge(Schulzoo,Inforaum,5));
        Vertex Chemieraum= new Vertex("Chemieraum");
        Schulgraph.addVertex(Chemieraum);
        Schulgraph.addEdge(new Edge(Chemieraum,Schulzoo,7));
        Vertex Treppenhaus= new Vertex("Treppenhaus");
        Schulgraph.addVertex(Treppenhaus);
        Schulgraph.addEdge(new Edge(Treppenhaus,Inforaum,13));
        Schulgraph.addEdge(new Edge(Treppenhaus,Chemieraum,22));
        Vertex Bioraum= new Vertex("Bioraum");
        Schulgraph.addVertex(Bioraum);
        Schulgraph.addEdge(new Edge(Bioraum,Treppenhaus,21));
        Schulgraph.addEdge(new Edge(Bioraum,Schulzoo,7));
        Schulgraph.addEdge(new Edge(Bioraum,Chemieraum,4));
    }
}

