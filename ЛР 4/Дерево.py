{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class TreeNode:\
    def __init__(self, value):\
        self.value = value      # \uc0\u1047 \u1085 \u1072 \u1095 \u1077 \u1085 \u1080 \u1077  \u1091 \u1079 \u1083 \u1072 \
        self.children = []      # \uc0\u1057 \u1087 \u1080 \u1089 \u1086 \u1082  \u1076 \u1086 \u1095 \u1077 \u1088 \u1085 \u1080 \u1093  \u1091 \u1079 \u1083 \u1086 \u1074 \
    \
    def add_child(self, child_node):\
        # \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1076 \u1086 \u1095 \u1077 \u1088 \u1085 \u1077 \u1075 \u1086  \u1091 \u1079 \u1083 \u1072 \
        self.children.append(child_node)\
    \
    def remove_child(self, child_node):\
        # \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1076 \u1086 \u1095 \u1077 \u1088 \u1085 \u1077 \u1075 \u1086  \u1091 \u1079 \u1083 \u1072 \
        self.children = [child for child in self.children if child != child_node]\
    \
    def traverse(self):\
        # \uc0\u1054 \u1073 \u1093 \u1086 \u1076  \u1076 \u1077 \u1088 \u1077 \u1074 \u1072  \u1074  \u1075 \u1083 \u1091 \u1073 \u1080 \u1085 \u1091 \
        nodes = [self]\
        while nodes:\
            current_node = nodes.pop()\
            print(current_node.value)\
            nodes.extend(current_node.children[::-1])\
\
# \uc0\u1041 \u1080 \u1085 \u1072 \u1088 \u1085 \u1086 \u1077  \u1076 \u1077 \u1088 \u1077 \u1074 \u1086 \
class BinaryTreeNode:\
    def __init__(self, value):\
        self.value = value      # \uc0\u1047 \u1085 \u1072 \u1095 \u1077 \u1085 \u1080 \u1077  \u1091 \u1079 \u1083 \u1072 \
        self.left = None        # \uc0\u1051 \u1077 \u1074 \u1099 \u1081  \u1087 \u1086 \u1090 \u1086 \u1084 \u1086 \u1082 \
        self.right = None       # \uc0\u1055 \u1088 \u1072 \u1074 \u1099 \u1081  \u1087 \u1086 \u1090 \u1086 \u1084 \u1086 \u1082 \
        self.parent = None      # \uc0\u1056 \u1086 \u1076 \u1080 \u1090 \u1077 \u1083 \u1100 \u1089 \u1082 \u1080 \u1081  \u1091 \u1079 \u1077 \u1083  (\u1086 \u1087 \u1094 \u1080 \u1086 \u1085 \u1072 \u1083 \u1100 \u1085 \u1086 )\
    \
    def insert_left(self, value):\
        # \uc0\u1042 \u1089 \u1090 \u1072 \u1074 \u1082 \u1072  \u1083 \u1077 \u1074 \u1086 \u1075 \u1086  \u1087 \u1086 \u1090 \u1086 \u1084 \u1082 \u1072 \
        self.left = BinaryTreeNode(value)\
        self.left.parent = self\
        return self.left\
    \
    def insert_right(self, value):\
        # \uc0\u1042 \u1089 \u1090 \u1072 \u1074 \u1082 \u1072  \u1087 \u1088 \u1072 \u1074 \u1086 \u1075 \u1086  \u1087 \u1086 \u1090 \u1086 \u1084 \u1082 \u1072 \
        self.right = BinaryTreeNode(value)\
        self.right.parent = self\
        return self.right}