def ternary_search(arr, x, left=0, right=None):
    if right is None:
        right = len(arr) - 1
    
    while left <= right:
        # делим диапазон на три части
        third = (right - left) // 3
        mid1 = left + third
        mid2 = right - third

        # сравниваем искомое с элементами по границам частей
        if arr[mid1] == x:
            return mid1
        if arr[mid2] == x:
            return mid2

        # если x меньше arr[mid1], ищем в первой части
        if x < arr[mid1]:
            right = mid1 - 1
        # если x больше arr[mid2], ищем в третьей части
        elif x > arr[mid2]:
            left = mid2 + 1
        # иначе ищем в средней части
        else:
            left = mid1 + 1
            right = mid2 - 1
    return -1  # не нашли

# Пример использования:
array = [1, 3, 5, 7, 9, 11, 13, 15]
target = 15
result = ternary_search(array, target)
print(f"Элемент {target} найден на позиции: {result}")


#third = (right - left) // 3 — делим текущий диапазон на три части

#if arr[mid1] == x: и if arr[mid2] == x: — проверяем, находится ли элемент в границах деления