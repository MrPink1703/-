# cook your dish here
def bucket_sort(arr):
    if len(arr) == 0:
        return arr
    # Определение количества корзин
    bucket_count = 10
    # Находим минимальное и максимальное значение массива
    min_value = min(arr)
    max_value = max(arr)
    # Создаем корзины — список списков
    buckets = [[] for _ in range(bucket_count)]
    # Распределяем элементы по корзинам
    for num in arr:
        # Вычисляем индекс корзины для текущего элемента
        index = int((num - min_value) / (max_value - min_value + 1) * bucket_count)
        # Добавляем элемент в соответствующую корзину
        buckets[index].append(num)
    # Сортируем каждую корзину и объединяем результаты в итоговый отсортированный массив
    sorted_array = []
    for bucket in buckets:
        sorted_array.extend(sorted(bucket))
    return sorted_array

# Пример использования:
array = [0.42, 2.15, 1.35, 0.15, 5.67, 3.14, 2.71]
sorted_array = bucket_sort(array)
print(sorted_array)

#index = int((num - min_value) / (max_value - min_value + 1) * bucket_count) — вычисляет индекс корзины для элемента (пропорционально его значению)
#buckets[index].append(num) — добавляет элемент в выбранную корзину
