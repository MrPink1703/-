{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 #include <iostream>\
using namespace std;\
\
// \uc0\u1057 \u1090 \u1088 \u1091 \u1082 \u1090 \u1091 \u1088 \u1072  \u1091 \u1079 \u1083 \u1072  \u1076 \u1074 \u1091 \u1089 \u1074 \u1103 \u1079 \u1085 \u1086 \u1075 \u1086  \u1089 \u1087 \u1080 \u1089 \u1082 \u1072 \
struct Node \{\
    int data;\
    Node* prev;\
    Node* next;\
    \
    Node(int value) \{\
        data = value;\
        prev = nullptr;\
        next = nullptr;\
    \}\
\};\
\
// \uc0\u1050 \u1083 \u1072 \u1089 \u1089  \u1076 \u1074 \u1091 \u1089 \u1074 \u1103 \u1079 \u1085 \u1086 \u1075 \u1086  \u1089 \u1087 \u1080 \u1089 \u1082 \u1072 \
class DoublyLinkedList \{\
private:\
    Node* head;\
    Node* tail;\
    \
public:\
    DoublyLinkedList() \{\
        head = nullptr;\
        tail = nullptr;\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1074  \u1082 \u1086 \u1085 \u1077 \u1094 \
    void append(int value) \{\
        Node* newNode = new Node(value);\
        if (head == nullptr) \{\
            head = newNode;\
            tail = newNode;\
        \} else \{\
            tail->next = newNode;\
            newNode->prev = tail;\
            tail = newNode;\
        \}\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1074  \u1085 \u1072 \u1095 \u1072 \u1083 \u1086 \
    void prepend(int value) \{\
        Node* newNode = new Node(value);\
        if (head == nullptr) \{\
            head = newNode;\
            tail = newNode;\
        \} else \{\
            newNode->next = head;\
            head->prev = newNode;\
            head = newNode;\
        \}\
    \}\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1072 \
    void remove(int value) \{\
        Node* current = head;\
        while (current != nullptr) \{\
            if (current->data == value) \{\
                if (current->prev != nullptr) \{\
                    current->prev->next = current->next;\
                \} else \{\
                    head = current->next;\
                \}\
                \
                if (current->next != nullptr) \{\
                    current->next->prev = current->prev;\
                \} else \{\
                    tail = current->prev;\
                \}\
                \
                delete current;\
                return;\
            \}\
            current = current->next;\
        \}\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1089 \u1087 \u1080 \u1089 \u1082 \u1072 \
    void display() \{\
        Node* current = head;\
        cout << "\uc0\u1044 \u1074 \u1091 \u1089 \u1074 \u1103 \u1079 \u1085 \u1099 \u1081  \u1089 \u1087 \u1080 \u1089 \u1086 \u1082 : ";\
        while (current != nullptr) \{\
            cout << current->data;\
            if (current->next != nullptr) \{\
                cout << " <-> ";\
            \}\
            current = current->next;\
        \}\
        cout << endl;\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1074  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1084  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077 \
    void displayReverse() \{\
        Node* current = tail;\
        cout << "\uc0\u1042  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1084  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077 : ";\
        while (current != nullptr) \{\
            cout << current->data;\
            if (current->prev != nullptr) \{\
                cout << " <-> ";\
            \}\
            current = current->prev;\
        \}\
        cout << endl;\
    \}\
\};\
\
int main() \{\
    cout << "=== \uc0\u1044 \u1074 \u1091 \u1089 \u1074 \u1103 \u1079 \u1085 \u1099 \u1081  \u1089 \u1087 \u1080 \u1089 \u1086 \u1082  (C++) ===" << endl;\
    \
    DoublyLinkedList list;\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1103 \u1077 \u1084  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099 \
    list.append(10);\
    list.append(20);\
    list.append(30);\
    list.prepend(5);\
    \
    list.display();\
    list.displayReverse();\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1103 \u1077 \u1084  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \
    list.remove(20);\
    cout << "\uc0\u1055 \u1086 \u1089 \u1083 \u1077  \u1091 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1103  20:" << endl;\
    list.display();\
    \
    return 0;\
\}}