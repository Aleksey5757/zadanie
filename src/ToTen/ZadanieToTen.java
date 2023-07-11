package ToTen;

public class ZadanieToTen {
    public static void main(String[] args) {
        int[] array = {1, 7, 9, 11, 15};
        int Value = findClosestToTen(array);
        System.out.println("Наиболее близкое значение к 10: " + Value);
    }

    public static int findClosestToTen(int[] array) {
        int target = 10; // Для сравнения
        int Value = array[0]; // Значением первого элемента массива

        for (int i = 1; i < array.length; i++) { // Проходим по всем остальным элементам массива
            // Сравниваем расстояние между текущим элементом и 10 с расстоянием между Value и 10
            if (Math.abs(array[i] - target) < Math.abs(Value - target)) {
                Value = array[i]; // Если текущий элемент ближе к 10, обновляем Value
            } else if (Math.abs(array[i] - target) == Math.abs(Value - target)) {
                Value = Math.max(Value, array[i]); // Если текущий элемент имеет такое же расстояние до 10, выбираем большее значение
            }
        }

        return Value; // Возвращаем наиболее близкое к 10 значение
    }
}
