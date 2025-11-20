import java.util.*;

public class TSPNearestNeighbor {
    
    public static List<Integer> tspNearest(int[][] dist) {
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[dist.length];
        int curr = 0;
        path.add(curr);
        visited[curr] = true;
        
        // ЦИКЛ ВЫБОРА БЛИЖАЙШЕГО НЕПОСЕЩЁННОГО ГОРОДА
        for (int step = 1; step < dist.length; step++) {
            int nextCity = -1;
            int minDist = Integer.MAX_VALUE;
            
            // Поиск ближайшего непосещённого города
            for (int city = 0; city < dist.length; city++) {
                if (!visited[city] && dist[curr][city] < minDist && dist[curr][city] > 0) {
                    minDist = dist[curr][city];
                    nextCity = city;
                }
            }
            
            // Если найден следующий город, добавляем его в маршрут
            if (nextCity != -1) {
                path.add(nextCity);
                visited[nextCity] = true;
                curr = nextCity;
                System.out.println("Шаг " + step + ": переходим в город " + nextCity + 
                                 " (расстояние: " + minDist + ")");
            } else {
                System.out.println("Ошибка: не удалось найти следующий город");
                break;
            }
        }
        
        return path;
    }
    
    // Метод для вычисления общей длины маршрута (с возвратом в начало)
    public static int calculateTotalDistance(List<Integer> path, int[][] dist) {
        int total = 0;
        int n = path.size();
        
        // Суммируем расстояния между последовательными городами
        for (int i = 0; i < n - 1; i++) {
            total += dist[path.get(i)][path.get(i + 1)];
        }
        
        // Добавляем расстояние возврата в начальный город
        total += dist[path.get(n - 1)][path.get(0)];
        
        return total;
    }
    
    // Метод для ввода матрицы расстояний с консоли
    public static int[][] inputDistanceMatrix(Scanner scanner) {
        System.out.print("Введите количество городов: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        
        int[][] dist = new int[n][n];
        
        System.out.println("\nВведите матрицу расстояний " + n + "x" + n + ":");
        System.out.println("Формат: для каждого города введите " + n + " чисел через пробел");
        System.out.println("(расстояние до самого себя должно быть 0)\n");
        
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Расстояния от города " + i + " до других городов: ");
                    String line = scanner.nextLine();
                    String[] parts = line.trim().split("\\s+");
                    
                    if (parts.length != n) {
                        System.out.println("Ошибка: нужно ввести ровно " + n + " чисел! Попробуйте снова.");
                        continue;
                    }
                    
                    for (int j = 0; j < n; j++) {
                        dist[i][j] = Integer.parseInt(parts[j]);
                    }
                    break;
                    
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите только целые числа! Попробуйте снова.");
                }
            }
        }
        
        return dist;
    }
    
    // Метод для вывода матрицы расстояний
    public static void printDistanceMatrix(int[][] dist) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("МАТРИЦА РАССТОЯНИЙ:");
        System.out.println("=".repeat(50));
        
        System.out.print("     ");
        for (int i = 0; i < dist.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("    " + "-".repeat(dist.length * 4 + 1));
        
        for (int i = 0; i < dist.length; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 0; j < dist.length; j++) {
                System.out.printf("%4d", dist[i][j]);
            }
            System.out.println();
        }
    }
    
    // Метод для вывода подробного маршрута
    public static void printDetailedPath(List<Integer> path, int[][] dist) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("РЕЗУЛЬТАТЫ:");
        System.out.println("=".repeat(50));
        
        System.out.println("Найденный маршрут: " + path);
        
        // Вычисляем общую длину
        int totalDistance = calculateTotalDistance(path, dist);
        System.out.println("Общая длина маршрута: " + totalDistance);
        
        // Выводим детальный маршрут с расстояниями
        System.out.println("\nДЕТАЛЬНЫЙ МАРШРУТ:");
        System.out.println("-".repeat(40));
        
        int partialSum = 0;
        
        for (int i = 0; i < path.size(); i++) {
            int from = path.get(i);
            int to = path.get((i + 1) % path.size());
            int distance = dist[from][to];
            
            if (i < path.size() - 1) {
                System.out.printf("Город %d → Город %d : %d км\n", from, to, distance);
            } else {
                System.out.printf("Город %d → Город %d : %d км (возврат)\n", from, to, distance);
            }
            
            partialSum += distance;
            if (i < path.size() - 1) {
                System.out.printf("Текущая сумма: %d км\n\n", partialSum);
            }
        }
        
        System.out.println("-".repeat(40));
        System.out.printf("ОБЩАЯ СУММА: %d км\n", partialSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║        МЕТОД БЛИЖАЙШЕГО СОСЕДА ДЛЯ TSP        ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("Алгоритм начинает с города 0 и на каждом шаге");
        System.out.println("выбирает ближайший непосещённый город.");
        System.out.println();
        
        // Ввод данных с консоли
        int[][] distances = inputDistanceMatrix(scanner);
        
        // Выводим матрицу расстояний
        printDistanceMatrix(distances);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ВЫПОЛНЕНИЕ АЛГОРИТМА:");
        System.out.println("=".repeat(50));
        System.out.println("Начинаем с города 0");
        
        // Запуск алгоритма ближайшего соседа
        List<Integer> path = tspNearest(distances);
        
        // Вывод результатов
        printDetailedPath(path, distances);
        
        // Анализ алгоритма
        System.out.println("\n" + "=".repeat(50));
        System.out.println("АНАЛИЗ РЕЗУЛЬТАТОВ:");
        System.out.println("=".repeat(50));
        System.out.println("Количество городов: " + distances.length);
        System.out.println("Размер маршрута: " + path.size());
        System.out.println("Все города посещены: " + (path.size() == distances.length));
        
        // Проверка корректности
        boolean allVisited = true;
        for (int i = 0; i < distances.length; i++) {
            if (!path.contains(i)) {
                allVisited = false;
                break;
            }
        }
        System.out.println("Корректность маршрута: " + allVisited);
        
        scanner.close();
        
        System.out.println("\nПрограмма завершена.");
    }
}