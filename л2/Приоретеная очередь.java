{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
// \uc0\u1050 \u1083 \u1072 \u1089 \u1089  \u1076 \u1083 \u1103  \u1087 \u1088 \u1077 \u1076 \u1089 \u1090 \u1072 \u1074 \u1083 \u1077 \u1085 \u1080 \u1103  \u1079 \u1072 \u1076 \u1072 \u1095 \u1080 \
class Task \{\
    int id;\
    String name;\
    int priority;\
    \
    public Task(int id, String name, int priority) \{\
        this.id = id;\
        this.name = name;\
        this.priority = priority;\
    \}\
    \
    public int getId() \{ return id; \}\
    public String getName() \{ return name; \}\
    public int getPriority() \{ return priority; \}\
    \
    @Override\
    public String toString() \{\
        return String.format("Task\{id=%d, name='%s', priority=%d\}", id, name, priority);\
    \}\
\}\
\
public class PriorityQueueExample \{\
    public static void main(String[] args) \{\
        System.out.println("=== \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (Java) ===");\
        \
        // \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1089  \u1085 \u1072 \u1090 \u1091 \u1088 \u1072 \u1083 \u1100 \u1085 \u1099 \u1084  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1086 \u1084  (min-heap)\
        System.out.println("Min-heap \uc0\u1089  \u1094 \u1077 \u1083 \u1099 \u1084 \u1080  \u1095 \u1080 \u1089 \u1083 \u1072 \u1084 \u1080 :");\
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();\
        \
        minHeap.offer(10);\
        minHeap.offer(5);\
        minHeap.offer(15);\
        minHeap.offer(2);\
        \
        System.out.println("\uc0\u1069 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1074  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077  \u1074 \u1086 \u1079 \u1088 \u1072 \u1089 \u1090 \u1072 \u1085 \u1080 \u1103 :");\
        while (!minHeap.isEmpty()) \{\
            System.out.print(minHeap.poll() + " ");\
        \}\
        System.out.println();\
        \
        // \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1089  \u1082 \u1086 \u1084 \u1087 \u1072 \u1088 \u1072 \u1090 \u1086 \u1088 \u1086 \u1084  \u1087 \u1086  ID\
        System.out.println("\\n\uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1079 \u1072 \u1076 \u1072 \u1095  \u1087 \u1086  ID:");\
        Comparator<Task> idComparator = Comparator.comparing(Task::getId);\
        PriorityQueue<Task> taskQueueById = new PriorityQueue<>(idComparator);\
        \
        taskQueueById.add(new Task(10003, "Task 3", 10));\
        taskQueueById.add(new Task(10001, "Task 1", 5));\
        taskQueueById.add(new Task(10002, "Task 2", 1));\
        \
        System.out.println("\uc0\u1047 \u1072 \u1076 \u1072 \u1095 \u1080  \u1086 \u1090 \u1089 \u1086 \u1088 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1099 \u1077  \u1087 \u1086  ID:");\
        while (!taskQueueById.isEmpty()) \{\
            System.out.println(taskQueueById.poll());\
        \}\
        \
        // \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1089  \u1082 \u1086 \u1084 \u1087 \u1072 \u1088 \u1072 \u1090 \u1086 \u1088 \u1086 \u1084  \u1087 \u1086  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1091 \
        System.out.println("\\n\uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  \u1079 \u1072 \u1076 \u1072 \u1095  \u1087 \u1086  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1091 :");\
        Comparator<Task> priorityComparator = Comparator.comparing(Task::getPriority).reversed();\
        PriorityQueue<Task> taskQueueByPriority = new PriorityQueue<>(priorityComparator);\
        \
        taskQueueByPriority.add(new Task(1, "\uc0\u1053 \u1080 \u1079 \u1082 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 ", 1));\
        taskQueueByPriority.add(new Task(2, "\uc0\u1042 \u1099 \u1089 \u1086 \u1082 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 ", 10));\
        taskQueueByPriority.add(new Task(3, "\uc0\u1057 \u1088 \u1077 \u1076 \u1085 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 ", 5));\
        taskQueueByPriority.add(new Task(4, "\uc0\u1050 \u1088 \u1080 \u1090 \u1080 \u1095 \u1077 \u1089 \u1082 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 ", 15));\
        \
        System.out.println("\uc0\u1047 \u1072 \u1076 \u1072 \u1095 \u1080  \u1086 \u1090 \u1089 \u1086 \u1088 \u1090 \u1080 \u1088 \u1086 \u1074 \u1072 \u1085 \u1085 \u1099 \u1077  \u1087 \u1086  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1091  (\u1091 \u1073 \u1099 \u1074 \u1072 \u1085 \u1080 \u1077 ):");\
        while (!taskQueueByPriority.isEmpty()) \{\
            Task task = taskQueueByPriority.poll();\
            System.out.println(task.getName() + " (\uc0\u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 : " + task.getPriority() + ")");\
        \}\
        \
        // Max-heap \uc0\u1089  \u1094 \u1077 \u1083 \u1099 \u1084 \u1080  \u1095 \u1080 \u1089 \u1083 \u1072 \u1084 \u1080 \
        System.out.println("\\nMax-heap \uc0\u1089  \u1094 \u1077 \u1083 \u1099 \u1084 \u1080  \u1095 \u1080 \u1089 \u1083 \u1072 \u1084 \u1080 :");\
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());\
        \
        maxHeap.offer(10);\
        maxHeap.offer(5);\
        maxHeap.offer(15);\
        maxHeap.offer(2);\
        \
        System.out.println("\uc0\u1069 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1074  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077  \u1091 \u1073 \u1099 \u1074 \u1072 \u1085 \u1080 \u1103 :");\
        while (!maxHeap.isEmpty()) \{\
            System.out.print(maxHeap.poll() + " ");\
        \}\
        System.out.println();\
    \}\
\}}