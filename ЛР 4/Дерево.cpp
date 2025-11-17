{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 #include <vector>\
#include <iostream>\
using namespace std;\
\
// \uc0\u1059 \u1079 \u1077 \u1083  \u1086 \u1073 \u1097 \u1077 \u1075 \u1086  \u1076 \u1077 \u1088 \u1077 \u1074 \u1072 \
class TreeNode \{\
public:\
    int value;                      // \uc0\u1047 \u1085 \u1072 \u1095 \u1077 \u1085 \u1080 \u1077  \u1091 \u1079 \u1083 \u1072 \
    vector<TreeNode*> children;     // \uc0\u1042 \u1077 \u1082 \u1090 \u1086 \u1088  \u1076 \u1086 \u1095 \u1077 \u1088 \u1085 \u1080 \u1093  \u1091 \u1079 \u1083 \u1086 \u1074 \
    \
    // \uc0\u1050 \u1086 \u1085 \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1086 \u1088 \
    TreeNode(int val) : value(val) \{\}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1076 \u1086 \u1095 \u1077 \u1088 \u1085 \u1077 \u1075 \u1086  \u1091 \u1079 \u1083 \u1072 \
    void addChild(TreeNode* child) \{\
        children.push_back(child);\
    \}\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1076 \u1086 \u1095 \u1077 \u1088 \u1085 \u1077 \u1075 \u1086  \u1091 \u1079 \u1083 \u1072 \
    void removeChild(TreeNode* child) \{\
        for (auto it = children.begin(); it != children.end(); ++it) \{\
            if (*it == child) \{\
                children.erase(it);\
                break;\
            \}\
        \}\
    \}\
    \
    // \uc0\u1054 \u1073 \u1093 \u1086 \u1076  \u1076 \u1077 \u1088 \u1077 \u1074 \u1072  \u1074  \u1075 \u1083 \u1091 \u1073 \u1080 \u1085 \u1091 \
    void traverse() \{\
        cout << value << " ";\
        for (TreeNode* child : children) \{\
            child->traverse();\
        \}\
    \}\
\};\
\
// \uc0\u1059 \u1079 \u1077 \u1083  \u1073 \u1080 \u1085 \u1072 \u1088 \u1085 \u1086 \u1075 \u1086  \u1076 \u1077 \u1088 \u1077 \u1074 \u1072 \
class BinaryTreeNode \{\
public:\
    int value;                      // \uc0\u1047 \u1085 \u1072 \u1095 \u1077 \u1085 \u1080 \u1077  \u1091 \u1079 \u1083 \u1072 \
    BinaryTreeNode* left;           // \uc0\u1051 \u1077 \u1074 \u1099 \u1081  \u1087 \u1086 \u1090 \u1086 \u1084 \u1086 \u1082 \
    BinaryTreeNode* right;          // \uc0\u1055 \u1088 \u1072 \u1074 \u1099 \u1081  \u1087 \u1086 \u1090 \u1086 \u1084 \u1086 \u1082 \
    BinaryTreeNode* parent;         // \uc0\u1056 \u1086 \u1076 \u1080 \u1090 \u1077 \u1083 \u1100 \u1089 \u1082 \u1080 \u1081  \u1091 \u1079 \u1077 \u1083 \
    \
    // \uc0\u1050 \u1086 \u1085 \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1086 \u1088 \
    BinaryTreeNode(int val) : value(val), left(nullptr), right(nullptr), parent(nullptr) \{\}\
    \
    // \uc0\u1042 \u1089 \u1090 \u1072 \u1074 \u1082 \u1072  \u1083 \u1077 \u1074 \u1086 \u1075 \u1086  \u1087 \u1086 \u1090 \u1086 \u1084 \u1082 \u1072 \
    BinaryTreeNode* insertLeft(int val) \{\
        left = new BinaryTreeNode(val);\
        left->parent = this;\
        return left;\
    \}\
    \
    // \uc0\u1042 \u1089 \u1090 \u1072 \u1074 \u1082 \u1072  \u1087 \u1088 \u1072 \u1074 \u1086 \u1075 \u1086  \u1087 \u1086 \u1090 \u1086 \u1084 \u1082 \u1072 \
    BinaryTreeNode* insertRight(int val) \{\
        right = new BinaryTreeNode(val);\
        right->parent = this;\
        return right;\
    \}\
    \
    // \uc0\u1044 \u1077 \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1086 \u1088  (\u1076 \u1083 \u1103  \u1086 \u1095 \u1080 \u1089 \u1090 \u1082 \u1080  \u1087 \u1072 \u1084 \u1103 \u1090 \u1080 )\
    ~BinaryTreeNode() \{\
        delete left;\
        delete right;\
    \}\
\}}