def exponential_search(arr, x):
    n = len(arr)
    # Если первый элемент уже равен искомому
    if arr[0] == x:
        return 0
    # Определяем диапазон для экспоненциального поиска
    bound = 1
    while bound < n and arr[bound] < x:
        bound *= 2  # Удваиваем границу, чтобы найти подходящий диапазон

    # Выполняем бинарный поиск в найденном диапазоне
    left = bound // 2
    right = min(bound, n - 1)
    return binary_search(arr, x, left, right)

def binary_search(arr, x, left, right):
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            left = mid + 1
        else:
            right = mid - 1
    return -1  # Не нашли

# Пример использования:
array = [1, 3, 5, 7, 9, 11, 13, 15]
target = 7
result = exponential_search(array, target)
print(f"Элемент {target} найден на позиции: {result}")

#while bound < n and arr[bound] < x: — увеличиваем границу вдвое (экспоненциально), пока не достигнем массива или пока текущий элемент не станет меньше искомого

#if arr[0] == x: — проверка, равен ли первый элемент искомому, в этом случае сразу возвращается индекс 0.