{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Node \{\
    int data;\
    Node prev;\
    Node next;\
\
    public Node(int data) \{\
        this.data = data;\
        this.prev = null;\
        this.next = null;\
    \}\
\}\
\
class DoublyLinkedList \{\
    Node head;\
    Node tail;\
\
    public DoublyLinkedList() \{\
        this.head = null;\
        this.tail = null;\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1074  \u1082 \u1086 \u1085 \u1077 \u1094 \
    public void append(int data) \{\
        Node newNode = new Node(data);\
        if (head == null) \{\
            head = newNode;\
            tail = newNode;\
        \} else \{\
            tail.next = newNode;\
            newNode.prev = tail;\
            tail = newNode;\
        \}\
    \}\
    \
    // \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1077  \u1074  \u1085 \u1072 \u1095 \u1072 \u1083 \u1086 \
    public void prepend(int data) \{\
        Node newNode = new Node(data);\
        if (head == null) \{\
            head = newNode;\
            tail = newNode;\
        \} else \{\
            newNode.next = head;\
            head.prev = newNode;\
            head = newNode;\
        \}\
    \}\
    \
    // \uc0\u1059 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1077  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1072 \
    public void remove(int data) \{\
        Node current = head;\
        while (current != null) \{\
            if (current.data == data) \{\
                if (current.prev != null) \{\
                    current.prev.next = current.next;\
                \} else \{\
                    head = current.next;\
                \}\
                \
                if (current.next != null) \{\
                    current.next.prev = current.prev;\
                \} else \{\
                    tail = current.prev;\
                \}\
                return;\
            \}\
            current = current.next;\
        \}\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1089 \u1087 \u1080 \u1089 \u1082 \u1072 \
    public void display() \{\
        Node current = head;\
        System.out.print("\uc0\u1044 \u1074 \u1091 \u1089 \u1074 \u1103 \u1079 \u1085 \u1099 \u1081  \u1089 \u1087 \u1080 \u1089 \u1086 \u1082 : ");\
        while (current != null) \{\
            System.out.print(current.data);\
            if (current.next != null) \{\
                System.out.print(" <-> ");\
            \}\
            current = current.next;\
        \}\
        System.out.println();\
    \}\
    \
    // \uc0\u1042 \u1099 \u1074 \u1086 \u1076  \u1074  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1084  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077 \
    public void displayReverse() \{\
        Node current = tail;\
        System.out.print("\uc0\u1042  \u1086 \u1073 \u1088 \u1072 \u1090 \u1085 \u1086 \u1084  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077 : ");\
        while (current != null) \{\
            System.out.print(current.data);\
            if (current.prev != null) \{\
                System.out.print(" <-> ");\
            \}\
            current = current.prev;\
        \}\
        System.out.println();\
    \}\
\}\
\
public class Main \{\
    public static void main(String[] args) \{\
        System.out.println("=== \uc0\u1044 \u1074 \u1091 \u1089 \u1074 \u1103 \u1079 \u1085 \u1099 \u1081  \u1089 \u1087 \u1080 \u1089 \u1086 \u1082  (Java) ===");\
        \
        DoublyLinkedList list = new DoublyLinkedList();\
        \
        list.append(10);\
        list.append(20);\
        list.append(30);\
        list.prepend(5);\
        \
        list.display();\
        list.displayReverse();\
        \
        list.remove(20);\
        System.out.println("\uc0\u1055 \u1086 \u1089 \u1083 \u1077  \u1091 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1103  20:");\
        list.display();\
    \}\
\}}