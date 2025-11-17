{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
public class QueueDequeExample \{\
    public static void main(String[] args) \{\
        System.out.println("=== \uc0\u1054 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1080  \u1044 \u1077 \u1082  (Java) ===");\
        \
        // \uc0\u1054 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (Queue)\
        System.out.println("\uc0\u1054 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (Queue):");\
        Queue<String> queue = new LinkedList<>();\
        \
        queue.add("\uc0\u1073 \u1072 \u1085 \u1072 \u1085 ");\
        queue.add("\uc0\u1103 \u1073 \u1083 \u1086 \u1082 \u1086 ");\
        queue.add("\uc0\u1072 \u1085 \u1072 \u1085 \u1072 \u1089 ");\
        \
        System.out.println("\uc0\u1069 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1074  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077  FIFO:");\
        while (!queue.isEmpty()) \{\
            System.out.println(queue.poll());\
        \}\
        \
        // \uc0\u1044 \u1077 \u1082  (Deque) \u1082 \u1072 \u1082  \u1089 \u1090 \u1077 \u1082 \
        System.out.println("\\n\uc0\u1044 \u1077 \u1082  \u1082 \u1072 \u1082  \u1089 \u1090 \u1077 \u1082 :");\
        Deque<Integer> stack = new ArrayDeque<>();\
        \
        stack.push(1);\
        stack.push(2);\
        stack.push(3);\
        \
        System.out.println("\uc0\u1069 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1074  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077  LIFO:");\
        while (!stack.isEmpty()) \{\
            System.out.println(stack.pop());\
        \}\
        \
        // \uc0\u1044 \u1077 \u1082  \u1082 \u1072 \u1082  \u1076 \u1074 \u1091 \u1089 \u1090 \u1086 \u1088 \u1086 \u1085 \u1085 \u1103 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100 \
        System.out.println("\\n\uc0\u1044 \u1077 \u1082  \u1082 \u1072 \u1082  \u1076 \u1074 \u1091 \u1089 \u1090 \u1086 \u1088 \u1086 \u1085 \u1085 \u1103 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100 :");\
        Deque<String> deque = new ArrayDeque<>();\
        \
        deque.addFirst("\uc0\u1087 \u1077 \u1088 \u1074 \u1099 \u1081 ");\
        deque.addLast("\uc0\u1074 \u1090 \u1086 \u1088 \u1086 \u1081 ");\
        deque.addLast("\uc0\u1090 \u1088 \u1077 \u1090 \u1080 \u1081 ");\
        deque.addFirst("\uc0\u1085 \u1091 \u1083 \u1077 \u1074 \u1086 \u1081 ");\
        \
        System.out.println("\uc0\u1042 \u1089 \u1077  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099 : " + deque);\
        System.out.println("\uc0\u1055 \u1077 \u1088 \u1074 \u1099 \u1081  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 : " + deque.getFirst());\
        System.out.println("\uc0\u1055 \u1086 \u1089 \u1083 \u1077 \u1076 \u1085 \u1080 \u1081  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 : " + deque.getLast());\
        \
        deque.removeFirst();\
        deque.removeLast();\
        System.out.println("\uc0\u1055 \u1086 \u1089 \u1083 \u1077  \u1091 \u1076 \u1072 \u1083 \u1077 \u1085 \u1080 \u1103  \u1087 \u1077 \u1088 \u1074 \u1086 \u1075 \u1086  \u1080  \u1087 \u1086 \u1089 \u1083 \u1077 \u1076 \u1085 \u1077 \u1075 \u1086 : " + deque);\
        \
        // \uc0\u1055 \u1088 \u1080 \u1084 \u1077 \u1088  \u1087 \u1088 \u1086 \u1074 \u1077 \u1088 \u1082 \u1080  \u1089 \u1082 \u1086 \u1073 \u1086 \u1082  \u1089  \u1087 \u1086 \u1084 \u1086 \u1097 \u1100 \u1102  \u1076 \u1077 \u1082 \u1072 \
        System.out.println("\\n\uc0\u1055 \u1088 \u1086 \u1074 \u1077 \u1088 \u1082 \u1072  \u1087 \u1088 \u1072 \u1074 \u1080 \u1083 \u1100 \u1085 \u1086 \u1089 \u1090 \u1080  \u1089 \u1082 \u1086 \u1073 \u1086 \u1082 :");\
        String brackets = "(\{[]\})";\
        Deque<Character> bracketStack = new ArrayDeque<>();\
        boolean isValid = true;\
        \
        for (char c : brackets.toCharArray()) \{\
            if (c == '(' || c == '\{' || c == '[') \{\
                bracketStack.push(c);\
            \} else \{\
                if (bracketStack.isEmpty()) \{\
                    isValid = false;\
                    break;\
                \}\
                char last = bracketStack.pop();\
                if ((c == ')' && last != '(') || \
                    (c == '\}' && last != '\{') || \
                    (c == ']' && last != '[')) \{\
                    isValid = false;\
                    break;\
                \}\
            \}\
        \}\
        \
        System.out.println("\uc0\u1057 \u1090 \u1088 \u1086 \u1082 \u1072  '" + brackets + "' " + \
                          (isValid && bracketStack.isEmpty() ? "\uc0\u1074 \u1072 \u1083 \u1080 \u1076 \u1085 \u1072 " : "\u1085 \u1077 \u1074 \u1072 \u1083 \u1080 \u1076 \u1085 \u1072 "));\
    \}\
\}}