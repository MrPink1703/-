{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 #include <iostream>\
#include <queue>\
#include <string>\
#include <vector>\
using namespace std;\
\
// \uc0\u1055 \u1086 \u1083 \u1100 \u1079 \u1086 \u1074 \u1072 \u1090 \u1077 \u1083 \u1100 \u1089 \u1082 \u1072 \u1103  \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1091 \u1088 \u1072  \u1076 \u1083 \u1103  \u1079 \u1072 \u1076 \u1072 \u1095 \u1080 \
struct Task \{\
    string name;\
    int priority;\
    \
    // \uc0\u1055 \u1077 \u1088 \u1077 \u1075 \u1088 \u1091 \u1079 \u1082 \u1072  \u1086 \u1087 \u1077 \u1088 \u1072 \u1090 \u1086 \u1088 \u1072  \u1076 \u1083 \u1103  \u1089 \u1088 \u1072 \u1074 \u1085 \u1077 \u1085 \u1080 \u1103  \u1087 \u1086  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1091 \
    bool operator<(const Task& other) const \{\
        return priority < other.priority; // \uc0\u1052 \u1072 \u1082 \u1089 \u1080 \u1084 \u1072 \u1083 \u1100 \u1085 \u1099 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090  \u1087 \u1077 \u1088 \u1074 \u1099 \u1081 \
    \}\
\};\
\
int main() \{\
    cout << "=== \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (C++) ===" << endl;\
    \
    // \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1089  \u1087 \u1088 \u1080 \u1084 \u1080 \u1090 \u1080 \u1074 \u1085 \u1099 \u1084 \u1080  \u1090 \u1080 \u1087 \u1072 \u1084 \u1080 \
    cout << "\uc0\u1057  \u1087 \u1088 \u1080 \u1084 \u1080 \u1090 \u1080 \u1074 \u1085 \u1099 \u1084 \u1080  \u1090 \u1080 \u1087 \u1072 \u1084 \u1080 :" << endl;\
    priority_queue<int> pq;\
    \
    pq.push(10);\
    pq.push(20);\
    pq.push(15);\
    \
    cout << "\uc0\u1069 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090  \u1089  \u1085 \u1072 \u1080 \u1074 \u1099 \u1089 \u1096 \u1080 \u1084  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1086 \u1084 : " << pq.top() << endl;\
    pq.pop();\
    cout << "\uc0\u1055 \u1086 \u1089 \u1083 \u1077  \u1091 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1103 , \u1085 \u1072 \u1080 \u1074 \u1099 \u1089 \u1096 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 : " << pq.top() << endl;\
    \
    // \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1089  \u1087 \u1086 \u1083 \u1100 \u1079 \u1086 \u1074 \u1072 \u1090 \u1077 \u1083 \u1100 \u1089 \u1082 \u1080 \u1084 \u1080  \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1091 \u1088 \u1072 \u1084 \u1080 \
    cout << "\\n\uc0\u1057  \u1087 \u1086 \u1083 \u1100 \u1079 \u1086 \u1074 \u1072 \u1090 \u1077 \u1083 \u1100 \u1089 \u1082 \u1080 \u1084 \u1080  \u1089 \u1090 \u1088 \u1091 \u1082 \u1090 \u1091 \u1088 \u1072 \u1084 \u1080 :" << endl;\
    priority_queue<Task> taskQueue;\
    \
    taskQueue.push(\{"Task 1", 2\});\
    taskQueue.push(\{"Task 2", 1\});\
    taskQueue.push(\{"Task 3", 3\});\
    taskQueue.push(\{"Task 4", 5\});\
    taskQueue.push(\{"Task 5", 4\});\
    \
    cout << "\uc0\u1054 \u1073 \u1088 \u1072 \u1073 \u1086 \u1090 \u1082 \u1072  \u1079 \u1072 \u1076 \u1072 \u1095  \u1087 \u1086  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1091 :" << endl;\
    while (!taskQueue.empty()) \{\
        Task current = taskQueue.top();\
        cout << "\uc0\u1054 \u1073 \u1088 \u1072 \u1073 \u1072 \u1090 \u1099 \u1074 \u1072 \u1077 \u1090 \u1089 \u1103 : " << current.name << " (\u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 : " << current.priority << ")" << endl;\
        taskQueue.pop();\
    \}\
    \
    // \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1082 \u1072 \u1082  min-heap\
    cout << "\\nMin-heap (\uc0\u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1099 \u1081  \u1087 \u1086 \u1088 \u1103 \u1076 \u1086 \u1082 ):" << endl;\
    priority_queue<int, vector<int>, greater<int>> minHeap;\
    \
    minHeap.push(10);\
    minHeap.push(20);\
    minHeap.push(15);\
    minHeap.push(5);\
    \
    while (!minHeap.empty()) \{\
        cout << minHeap.top() << " ";\
        minHeap.pop();\
    \}\
    cout << endl;\
    \
    return 0;\
\}}