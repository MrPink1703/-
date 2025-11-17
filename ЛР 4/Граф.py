{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 from collections import defaultdict, deque\
\
# \uc0\u1055 \u1088 \u1077 \u1076 \u1089 \u1090 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1075 \u1088 \u1072 \u1092 \u1072  \u1095 \u1077 \u1088 \u1077 \u1079  \u1089 \u1087 \u1080 \u1089 \u1086 \u1082  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
class Graph:\
    def __init__(self, directed=False):\
        self.graph = defaultdict(list)  # \uc0\u1057 \u1083 \u1086 \u1074 \u1072 \u1088 \u1100  \u1076 \u1083 \u1103  \u1093 \u1088 \u1072 \u1085 \u1077 \u1085 \u1080 \u1103  \u1089 \u1087 \u1080 \u1089 \u1082 \u1072  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
        self.directed = directed        # \uc0\u1060 \u1083 \u1072 \u1075  \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1086 \u1089 \u1090 \u1080  \u1075 \u1088 \u1072 \u1092 \u1072 \
        self.vertices = set()           # \uc0\u1052 \u1085 \u1086 \u1078 \u1077 \u1089 \u1090 \u1074 \u1086  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
    \
    def add_vertex(self, vertex):\
        # \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1099  \u1074  \u1075 \u1088 \u1072 \u1092 \
        self.vertices.add(vertex)\
    \
    def add_edge(self, u, v, weight=1):\
        # \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072  \u1084 \u1077 \u1078 \u1076 \u1091  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1072 \u1084 \u1080  u \u1080  v\
        self.graph[u].append((v, weight))\
        self.vertices.add(u)\
        self.vertices.add(v)\
        \
        # \uc0\u1045 \u1089 \u1083 \u1080  \u1075 \u1088 \u1072 \u1092  \u1085 \u1077 \u1086 \u1088 \u1080 \u1077 \u1085 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1099 \u1081 , \u1076 \u1086 \u1073 \u1072 \u1074 \u1083 \u1103 \u1077 \u1084  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1077  \u1088 \u1077 \u1073 \u1088 \u1086 \
        if not self.directed:\
            self.graph[v].append((u, weight))\
    \
    def remove_edge(self, u, v):\
        # \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072  \u1084 \u1077 \u1078 \u1076 \u1091  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1072 \u1084 \u1080  u \u1080  v\
        self.graph[u] = [node for node in self.graph[u] if node[0] != v]\
        if not self.directed:\
            self.graph[v] = [node for node in self.graph[v] if node[0] != u]\
    \
    def get_neighbors(self, vertex):\
        # \uc0\u1055 \u1086 \u1083 \u1091 \u1095 \u1077 \u1085 \u1080 \u1077  \u1089 \u1087 \u1080 \u1089 \u1082 \u1072  \u1089 \u1086 \u1089 \u1077 \u1076 \u1077 \u1081  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \u1099 \
        return self.graph[vertex]\
    \
    def display(self):\
        # \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1091 \u1088 \u1099  \u1075 \u1088 \u1072 \u1092 \u1072 \
        for vertex in self.graph:\
            print(f"\{vertex\}: \{self.graph[vertex]\}")\
\
# \uc0\u1055 \u1088 \u1077 \u1076 \u1089 \u1090 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1075 \u1088 \u1072 \u1092 \u1072  \u1095 \u1077 \u1088 \u1077 \u1079  \u1084 \u1072 \u1090 \u1088 \u1080 \u1094 \u1091  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
class GraphMatrix:\
    def __init__(self, vertices):\
        self.vertices = vertices        # \uc0\u1057 \u1087 \u1080 \u1089 \u1086 \u1082  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
        self.size = len(vertices)       # \uc0\u1050 \u1086 \u1083 \u1080 \u1095 \u1077 \u1089 \u1090 \u1074 \u1086  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
        self.vertex_index = \{v: i for i, v in enumerate(vertices)\}  # \uc0\u1057 \u1083 \u1086 \u1074 \u1072 \u1088 \u1100  \u1080 \u1085 \u1076 \u1077 \u1082 \u1089 \u1086 \u1074 \
        self.matrix = [[0] * self.size for _ in range(self.size)]  # \uc0\u1052 \u1072 \u1090 \u1088 \u1080 \u1094 \u1072  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
    \
    def add_edge(self, u, v, weight=1):\
        # \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072  \u1084 \u1077 \u1078 \u1076 \u1091  u \u1080  v\
        i = self.vertex_index[u]\
        j = self.vertex_index[v]\
        self.matrix[i][j] = weight\
    \
    def remove_edge(self, u, v):\
        # \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1088 \u1077 \u1073 \u1088 \u1072  \u1084 \u1077 \u1078 \u1076 \u1091  u \u1080  v\
        i = self.vertex_index[u]\
        j = self.vertex_index[v]\
        self.matrix[i][j] = 0\
    \
    def is_adjacent(self, u, v):\
        # \uc0\u1055 \u1088 \u1086 \u1074 \u1077 \u1088 \u1082 \u1072  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080  \u1074 \u1077 \u1088 \u1096 \u1080 \u1085 \
        i = self.vertex_index[u]\
        j = self.vertex_index[v]\
        return self.matrix[i][j] != 0\
    \
    def display(self):\
        # \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1084 \u1072 \u1090 \u1088 \u1080 \u1094 \u1099  \u1089 \u1084 \u1077 \u1078 \u1085 \u1086 \u1089 \u1090 \u1080 \
        print("  " + " ".join(self.vertices))\
        for i, row in enumerate(self.matrix):\
            print(f"\{self.vertices[i]\} \{' '.join(map(str, row))\}")}