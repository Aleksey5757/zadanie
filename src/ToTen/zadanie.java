package ToTen;

public class zadanie {
          public static void main(String[] args) {
            int[] array = {1, 2, 7, 9, 12, 15};
            int closestValue = findClosestToTen(array);
            System.out.println("Наиболее близкое значение к 10: " + closestValue);
        }

        public static int findClosestToTen(int[] array) {
            int target = 10; // Для сравнения
            int closestValue = array[0]; // Значением первого элемента массива

            for (int i = 1; i < array.length; i++) { // Проходим по всем остальным элементам массива
                // Сравниваем расстояние между текущим элементом и 10 с расстоянием между closestValue и 10
                if (Math.abs(array[i] - target) < Math.abs(closestValue - target)) {
                    closestValue = array[i]; // Если текущий элемент ближе к 10, обновляем closestValue
                } else if (Math.abs(array[i] - target) == Math.abs(closestValue - target)) {
                    closestValue = Math.max(closestValue, array[i]); // Если текущий элемент имеет такое же расстояние до 10, выбираем большее значение
                }
            }

            return closestValue; // Возвращаем наиболее близкое к 10 значение
        }
    }
