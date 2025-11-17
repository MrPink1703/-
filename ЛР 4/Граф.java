{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
// \uc0\u1050 \u1083 \u1072 \u1089 \u1089  \u1076 \u1083 \u1103  \u1087 \u1088 \u1077 \u1076 \u1089 \u1090 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1103  \u1074 \u1079 \u1074 \u1077 \u1096 \u1077 \u1085 \u1085 \u1086 \u1075 \u1086  \u1088 \u1077 \u1073 \u1088 \u1072 \
class Edge \{\
    public int destination;\
    public int weight;\
    \
    public Edge(int destination, int weight) \{\
        this.destination = destination;\
        this.weight = weight;\
    \}\
    \
    @Override\
    public String toString() \{\
        return "(" + destination + ", " + weight + ")";\
    \}\
\}\
\
// \uc0\u1043 \u1088 \u1072 \u1092  \u1095 \u1077 \u1088 \u1077 \u1079  \u1089 \u1087 \u1080 \u1089 \u1086 \u1082  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
class Graph \{\
    private Map<Integer, List<Edge>> adjacencyList;  // \uc0\u1057 \u1087 \u1080 \u1089 \u1086 \u1082  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
    private boolean isDirected;                      // \uc0\u1060 \u1083 \u1072 \u1075  \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1086 \u1089 \u1090 \u1080 \
    private Set<Integer> vertices;                   // \uc0\u1052 \u1085 \u1086 \u1078 \u1077 \u1089 \u1090 \u1074 \u1086  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
    \
    // \uc0\u1050 \u1086 \u1085 \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1086 \u1088 \
    public Graph(boolean directed) \{\
        this.adjacencyList = new HashMap<>();\
        this.isDirected = directed;\
        this.vertices = new HashSet<>();\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1099 \
    public void addVertex(int vertex) \{\
        vertices.add(vertex);\
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    public void addEdge(int u, int v, int weight) \{\
        addVertex(u);\
        addVertex(v);\
        \
        adjacencyList.get(u).add(new Edge(v, weight));\
        \
        // \uc0\u1045 \u1089 \u1083 \u1080  \u1075 \u1088 \u1072 \u1092  \u1085 \u1077 \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1099 \u1081 , \u1076 \u1086 \u1073 \u1072 \u1074 \u1083 \u1103 \u1077 \u1084  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1077  \u1088 \u1077 \u1073 \u1088 \u1086 \
        if (!isDirected) \{\
            adjacencyList.get(v).add(new Edge(u, weight));\
        \}\
    \}\
    \
    // \uc0\u1055 \u1077 \u1088 \u1077 \u1075 \u1088 \u1091 \u1078 \u1077 \u1085 \u1085 \u1099 \u1081  \u1084 \u1077 \u1090 \u1086 \u1076  \u1076 \u1083 \u1103  \u1088 \u1077 \u1073 \u1088 \u1072  \u1074 \u1077 \u1089 \u1072  1\
    public void addEdge(int u, int v) \{\
        addEdge(u, v, 1);\
    \}\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    public void removeEdge(int u, int v) \{\
        List<Edge> edgesU = adjacencyList.get(u);\
        if (edgesU != null) \{\
            edgesU.removeIf(edge -> edge.destination == v);\
        \}\
        \
        // \uc0\u1045 \u1089 \u1083 \u1080  \u1075 \u1088 \u1072 \u1092  \u1085 \u1077 \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1099 \u1081 , \u1091 \u1076 \u1072 \u1083 \u1103 \u1077 \u1084  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1077  \u1088 \u1077 \u1073 \u1088 \u1086 \
        if (!isDirected) \{\
            List<Edge> edgesV = adjacencyList.get(v);\
            if (edgesV != null) \{\
                edgesV.removeIf(edge -> edge.destination == u);\
            \}\
        \}\
    \}\
    \
    // \uc0\u1055 \u1086 \u1083 \u1091 \u1095 \u1077 \u1085 \u1080 \u1077  \u1089 \u1086 \u1089 \u1077 \u1076 \u1077 \u1081  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1099 \
    public List<Edge> getNeighbors(int vertex) \{\
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());\
    \}\
    \
    // \uc0\u1055 \u1086 \u1083 \u1091 \u1095 \u1077 \u1085 \u1080 \u1077  \u1074 \u1089 \u1077 \u1093  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
    public Set<Integer> getVertices() \{\
        return vertices;\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1075 \u1088 \u1072 \u1092 \u1072 \
    public void display() \{\
        for (Map.Entry<Integer, List<Edge>> entry : adjacencyList.entrySet()) \{\
            System.out.print(entry.getKey() + ": ");\
            for (Edge edge : entry.getValue()) \{\
                System.out.print(edge + " ");\
            \}\
            System.out.println();\
        \}\
    \}\
\}\
\
// \uc0\u1043 \u1088 \u1072 \u1092  \u1095 \u1077 \u1088 \u1077 \u1079  \u1084 \u1072 \u1090 \u1088 \u1080 \u1094 \u1091  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
class GraphMatrix \{\
    private int[][] adjacencyMatrix;  // \uc0\u1052 \u1072 \u1090 \u1088 \u1080 \u1094 \u1072  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
    private Map<Integer, Integer> vertexIndex;  // \uc0\u1057 \u1086 \u1086 \u1090 \u1074 \u1077 \u1090 \u1089 \u1090 \u1074 \u1080 \u1077  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1072  -> \u1080 \u1085 \u1076 \u1077 \u1082 \u1089 \
    private List<Integer> indexVertex;          // \uc0\u1057 \u1086 \u1086 \u1090 \u1074 \u1077 \u1090 \u1089 \u1090 \u1074 \u1080 \u1077  \u1080 \u1085 \u1076 \u1077 \u1082 \u1089  -> \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1072 \
    \
    // \uc0\u1050 \u1086 \u1085 \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1086 \u1088 \
    public GraphMatrix(List<Integer> vertices) \{\
        int size = vertices.size();\
        this.adjacencyMatrix = new int[size][size];\
        this.vertexIndex = new HashMap<>();\
        this.indexVertex = new ArrayList<>(vertices);\
        \
        for (int i = 0; i < size; i++) \{\
            vertexIndex.put(vertices.get(i), i);\
        \}\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    public void addEdge(int u, int v, int weight) \{\
        int i = vertexIndex.get(u);\
        int j = vertexIndex.get(v);\
        adjacencyMatrix[i][j] = weight;\
    \}\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    public void removeEdge(int u, int v) \{\
        int i = vertexIndex.get(u);\
        int j = vertexIndex.get(v);\
        adjacencyMatrix[i][j] = 0;\
    \}\
    \
    // \uc0\u1055 \u1088 \u1086 \u1074 \u1077 \u1088 \u1082 \u1072  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
    public boolean isAdjacent(int u, int v) \{\
        int i = vertexIndex.get(u);\
        int j = vertexIndex.get(v);\
        return adjacencyMatrix[i][j] != 0;\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1084 \u1072 \u1090 \u1088 \u1080 \u1094 \u1099  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
    public void display() \{\
        System.out.print("  ");\
        for (int vertex : indexVertex) \{\
            System.out.print(vertex + " ");\
        \}\
        System.out.println();\
        \
        for (int i = 0; i < adjacencyMatrix.length; i++) \{\
            System.out.print(indexVertex.get(i) + " ");\
            for (int j = 0; j < adjacencyMatrix[i].length; j++) \{\
                System.out.print(adjacencyMatrix[i][j] + " ");\
            \}\
            System.out.println();\
        \}\
    \}\
\}}