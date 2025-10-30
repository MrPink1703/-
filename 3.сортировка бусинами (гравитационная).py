def gravity_sort(arr):
    n = len(arr)
    # Продолжаем выполнять перебор, пока не сделано обменов
    while True:
        swapped = False
        # Перебираем все соседние элементы, кроме уже отсортированных в конце
        for i in range(n - 1):
            if arr[i] > arr[i + 1]:
                # Меняем местами элементы, если порядок нарушен
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
                swapped = True
        # Если за текущий проход обменов не было, сортировка завершена
        if not swapped:
            break
    return arr

# Пример использования:
array = [9, 3, 7, 1, 5]
sorted_array = gravity_sort(array)
print(sorted_array)
#if arr[i] > arr[i + 1]: — если текущий элемент больше следующего, происходит обмен
#if not swapped: — если за проход не было обмена, массив отсортирован и цикл завершается