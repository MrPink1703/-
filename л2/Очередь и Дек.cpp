{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 #include <iostream>\
#include <queue>\
#include <deque>\
#include <string>\
using namespace std;\
\
int main() \{\
    cout << "=== \uc0\u1054 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1080  \u1044 \u1077 \u1082  (C++) ===" << endl;\
    \
    // \uc0\u1054 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (Queue)\
    cout << "\uc0\u1054 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (queue):" << endl;\
    queue<string> q;\
    \
    q.push("Tom");\
    q.push("Bob");\
    q.push("Sam");\
    \
    cout << "\uc0\u1055 \u1077 \u1088 \u1074 \u1099 \u1081  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 : " << q.front() << endl;\
    cout << "\uc0\u1055 \u1086 \u1089 \u1083 \u1077 \u1076 \u1085 \u1080 \u1081  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 : " << q.back() << endl;\
    \
    cout << "\uc0\u1042 \u1089 \u1077  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1074  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077  FIFO:" << endl;\
    while (!q.empty()) \{\
        cout << q.front() << " ";\
        q.pop();\
    \}\
    cout << endl;\
    \
    // \uc0\u1044 \u1077 \u1082  (Deque)\
    cout << "\\n\uc0\u1044 \u1077 \u1082  (deque):" << endl;\
    deque<int> d = \{1, 2, 3\};\
    \
    d.push_front(0);  // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1103 \u1077 \u1084  \u1074  \u1085 \u1072 \u1095 \u1072 \u1083 \u1086 \
    d.push_back(4);   // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1103 \u1077 \u1084  \u1074  \u1082 \u1086 \u1085 \u1077 \u1094 \
    \
    cout << "\uc0\u1069 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1076 \u1077 \u1082 \u1072 : ";\
    for (int num : d) \{\
        cout << num << " ";\
    \}\
    cout << endl;\
    \
    cout << "\uc0\u1055 \u1077 \u1088 \u1074 \u1099 \u1081  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 : " << d.front() << endl;\
    cout << "\uc0\u1055 \u1086 \u1089 \u1083 \u1077 \u1076 \u1085 \u1080 \u1081  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 : " << d.back() << endl;\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1089  \u1086 \u1073 \u1086 \u1080 \u1093  \u1082 \u1086 \u1085 \u1094 \u1086 \u1074 \
    d.pop_front();\
    d.pop_back();\
    \
    cout << "\uc0\u1055 \u1086 \u1089 \u1083 \u1077  \u1091 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1103  \u1089  \u1086 \u1073 \u1086 \u1080 \u1093  \u1082 \u1086 \u1085 \u1094 \u1086 \u1074 : ";\
    for (int num : d) \{\
        cout << num << " ";\
    \}\
    cout << endl;\
    \
    return 0;\
\}}