{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 #include <iostream>\
#include <vector>\
#include <unordered_map>\
#include <unordered_set>\
#include <queue>\
using namespace std;\
\
// \uc0\u1057 \u1090 \u1088 \u1091 \u1082 \u1090 \u1091 \u1088 \u1072  \u1076 \u1083 \u1103  \u1087 \u1088 \u1077 \u1076 \u1089 \u1090 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1103  \u1074 \u1079 \u1074 \u1077 \u1096 \u1077 \u1085 \u1085 \u1086 \u1075 \u1086  \u1088 \u1077 \u1073 \u1088 \u1072 \
struct Edge \{\
    int destination;\
    int weight;\
    \
    Edge(int dest, int w = 1) : destination(dest), weight(w) \{\}\
\};\
\
// \uc0\u1043 \u1088 \u1072 \u1092  \u1095 \u1077 \u1088 \u1077 \u1079  \u1089 \u1087 \u1080 \u1089 \u1086 \u1082  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
class Graph \{\
private:\
    unordered_map<int, vector<Edge>> adjacencyList;  // \uc0\u1057 \u1087 \u1080 \u1089 \u1086 \u1082  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
    bool isDirected;                                 // \uc0\u1060 \u1083 \u1072 \u1075  \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1086 \u1089 \u1090 \u1080 \
    unordered_set<int> vertices;                     // \uc0\u1052 \u1085 \u1086 \u1078 \u1077 \u1089 \u1090 \u1074 \u1086  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
\
public:\
    // \uc0\u1050 \u1086 \u1085 \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1086 \u1088 \
    Graph(bool directed = false) : isDirected(directed) \{\}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1099 \
    void addVertex(int vertex) \{\
        vertices.insert(vertex);\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    void addEdge(int u, int v, int weight = 1) \{\
        adjacencyList[u].push_back(Edge(v, weight));\
        vertices.insert(u);\
        vertices.insert(v);\
        \
        // \uc0\u1045 \u1089 \u1083 \u1080  \u1075 \u1088 \u1072 \u1092  \u1085 \u1077 \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1099 \u1081 , \u1076 \u1086 \u1073 \u1072 \u1074 \u1083 \u1103 \u1077 \u1084  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1077  \u1088 \u1077 \u1073 \u1088 \u1086 \
        if (!isDirected) \{\
            adjacencyList[v].push_back(Edge(u, weight));\
        \}\
    \}\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    void removeEdge(int u, int v) \{\
        // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072  u -> v\
        auto& neighbors = adjacencyList[u];\
        for (auto it = neighbors.begin(); it != neighbors.end(); ) \{\
            if (it->destination == v) \{\
                it = neighbors.erase(it);\
            \} else \{\
                ++it;\
            \}\
        \}\
        \
        // \uc0\u1045 \u1089 \u1083 \u1080  \u1075 \u1088 \u1072 \u1092  \u1085 \u1077 \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1099 \u1081 , \u1091 \u1076 \u1072 \u1083 \u1103 \u1077 \u1084  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1077  \u1088 \u1077 \u1073 \u1088 \u1086 \
        if (!isDirected) \{\
            auto& reverseNeighbors = adjacencyList[v];\
            for (auto it = reverseNeighbors.begin(); it != reverseNeighbors.end(); ) \{\
                if (it->destination == u) \{\
                    it = reverseNeighbors.erase(it);\
                \} else \{\
                    ++it;\
                \}\
            \}\
        \}\
    \}\
    \
    // \uc0\u1055 \u1086 \u1083 \u1091 \u1095 \u1077 \u1085 \u1080 \u1077  \u1089 \u1086 \u1089 \u1077 \u1076 \u1077 \u1081  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1099 \
    vector<Edge> getNeighbors(int vertex) \{\
        return adjacencyList[vertex];\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1075 \u1088 \u1072 \u1092 \u1072 \
    void display() \{\
        for (const auto& pair : adjacencyList) \{\
            cout << pair.first << ": ";\
            for (const Edge& edge : pair.second) \{\
                cout << "(" << edge.destination << ", " << edge.weight << ") ";\
            \}\
            cout << endl;\
        \}\
    \}\
\};\
\
// \uc0\u1043 \u1088 \u1072 \u1092  \u1095 \u1077 \u1088 \u1077 \u1079  \u1084 \u1072 \u1090 \u1088 \u1080 \u1094 \u1091  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
class GraphMatrix \{\
private:\
    vector<vector<int>> adjacencyMatrix;  // \uc0\u1052 \u1072 \u1090 \u1088 \u1080 \u1094 \u1072  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
    unordered_map<int, int> vertexIndex;  // \uc0\u1057 \u1086 \u1086 \u1090 \u1074 \u1077 \u1090 \u1089 \u1090 \u1074 \u1080 \u1077  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1072  -> \u1080 \u1085 \u1076 \u1077 \u1082 \u1089 \
    vector<int> indexVertex;              // \uc0\u1057 \u1086 \u1086 \u1090 \u1074 \u1077 \u1090 \u1089 \u1090 \u1074 \u1080 \u1077  \u1080 \u1085 \u1076 \u1077 \u1082 \u1089  -> \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1072 \
\
public:\
    // \uc0\u1050 \u1086 \u1085 \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1086 \u1088 \
    GraphMatrix(const vector<int>& vertices) \{\
        int size = vertices.size();\
        adjacencyMatrix.resize(size, vector<int>(size, 0));\
        indexVertex = vertices;\
        \
        for (int i = 0; i < size; i++) \{\
            vertexIndex[vertices[i]] = i;\
        \}\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    void addEdge(int u, int v, int weight = 1) \{\
        int i = vertexIndex[u];\
        int j = vertexIndex[v];\
        adjacencyMatrix[i][j] = weight;\
    \}\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072 \
    void removeEdge(int u, int v) \{\
        int i = vertexIndex[u];\
        int j = vertexIndex[v];\
        adjacencyMatrix[i][j] = 0;\
    \}\
    \
    // \uc0\u1055 \u1088 \u1086 \u1074 \u1077 \u1088 \u1082 \u1072  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
    bool isAdjacent(int u, int v) \{\
        int i = vertexIndex[u];\
        int j = vertexIndex[v];\
        return adjacencyMatrix[i][j] != 0;\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1084 \u1072 \u1090 \u1088 \u1080 \u1094 \u1099  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
    void display() \{\
        cout << "  ";\
        for (int v : indexVertex) \{\
            cout << v << " ";\
        \}\
        cout << endl;\
        \
        for (int i = 0; i < adjacencyMatrix.size(); i++) \{\
            cout << indexVertex[i] << " ";\
            for (int j = 0; j < adjacencyMatrix[i].size(); j++) \{\
                cout << adjacencyMatrix[i][j] << " ";\
            \}\
            cout << endl;\
        \}\
    \}\
\}}