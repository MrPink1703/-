import math

def jump_search(arr, x):
    n = len(arr)
    # Вычисляем размер шага: приблизительно корень из длины массива
    step = int(math.sqrt(n))
    prev = 0

    # Находим блок, в котором может находиться элемент x
    while prev < n and arr[min(step, n) - 1] < x:
        prev = step
        step += int(math.sqrt(n))
        if prev >= n:
            return -1  # Элемент не найден

    # Линейный поиск внутри найденного блока
    for i in range(prev, min(step, n)):
        if arr[i] == x:
            return i  # Индекс найденной позиции
    return -1  # Элемент не найден

# Пример использования:
array = [1, 3, 5, 7, 9, 11, 13, 15]
target = 7
result = jump_search(array, target)
print(f"Элемент {target} найден на позиции: {result}")

#step = int(math.sqrt(n)) — находим размер шага, равный корню из длины массива
#while prev < n and arr[min(step, n) - 1] < x: — ищем блок, в котором может находиться искомый элемент, проверяя последний элемент текущего блока