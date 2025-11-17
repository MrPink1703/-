{\rtf1\ansi\ansicpg1251\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import heapq\
from queue import PriorityQueue\
\
print("\\n=== \uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (Python) ===")\
\
# \uc0\u1057 \u1087 \u1086 \u1089 \u1086 \u1073  1: \u1089  \u1087 \u1086 \u1084 \u1086 \u1097 \u1100 \u1102  PriorityQueue\
print("\uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (PriorityQueue):")\
pq = PriorityQueue()\
\
# \uc0\u1044 \u1086 \u1073 \u1072 \u1074 \u1083 \u1103 \u1077 \u1084  \u1101 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1089  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1086 \u1084 \
pq.put((2, 'mid-priority item'))\
pq.put((1, 'high-priority item'))\
pq.put((3, 'low-priority item'))\
\
print("\uc0\u1069 \u1083 \u1077 \u1084 \u1077 \u1085 \u1090 \u1099  \u1074  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1072 :")\
while not pq.empty():\
    priority, item = pq.get()\
    print(f"\uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090  \{priority\}: \{item\}")\
\
# \uc0\u1057 \u1087 \u1086 \u1089 \u1086 \u1073  2: \u1089  \u1087 \u1086 \u1084 \u1086 \u1097 \u1100 \u1102  heapq\
print("\\n\uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1085 \u1072 \u1103  \u1086 \u1095 \u1077 \u1088 \u1077 \u1076 \u1100  (heapq):")\
customers = []\
\
heapq.heappush(customers, (2, "Harry"))\
heapq.heappush(customers, (3, "Charles"))\
heapq.heappush(customers, (1, "Riya"))\
heapq.heappush(customers, (4, "Stacy"))\
\
print("\uc0\u1050 \u1083 \u1080 \u1077 \u1085 \u1090 \u1099  \u1074  \u1087 \u1086 \u1088 \u1103 \u1076 \u1082 \u1077  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090 \u1072 :")\
while customers:\
    priority, customer = heapq.heappop(customers)\
    print(f"\uc0\u1055 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090  \{priority\}: \{customer\}")\
\
# \uc0\u1055 \u1088 \u1080 \u1084 \u1077 \u1088  \u1089  \u1087 \u1086 \u1083 \u1100 \u1079 \u1086 \u1074 \u1072 \u1090 \u1077 \u1083 \u1100 \u1089 \u1082 \u1080 \u1084 \u1080  \u1076 \u1072 \u1085 \u1085 \u1099 \u1084 \u1080 \
print("\\n\uc0\u1055 \u1086 \u1083 \u1100 \u1079 \u1086 \u1074 \u1072 \u1090 \u1077 \u1083 \u1100 \u1089 \u1082 \u1080 \u1077  \u1079 \u1072 \u1076 \u1072 \u1095 \u1080 :")\
tasks_heap = []\
heapq.heappush(tasks_heap, (5, "\uc0\u1053 \u1080 \u1079 \u1082 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090  - \u1087 \u1088 \u1086 \u1074 \u1077 \u1088 \u1082 \u1072  \u1087 \u1086 \u1095 \u1090 \u1099 "))\
heapq.heappush(tasks_heap, (1, "\uc0\u1042 \u1099 \u1089 \u1086 \u1082 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090  - \u1089 \u1088 \u1086 \u1095 \u1085 \u1072 \u1103  \u1079 \u1072 \u1076 \u1072 \u1095 \u1072 "))\
heapq.heappush(tasks_heap, (3, "\uc0\u1057 \u1088 \u1077 \u1076 \u1085 \u1080 \u1081  \u1087 \u1088 \u1080 \u1086 \u1088 \u1080 \u1090 \u1077 \u1090  - \u1086 \u1073 \u1099 \u1095 \u1085 \u1072 \u1103  \u1079 \u1072 \u1076 \u1072 \u1095 \u1072 "))\
\
while tasks_heap:\
    priority, task = heapq.heappop(tasks_heap)\
    print(f"[\{priority\}] \{task\}")}