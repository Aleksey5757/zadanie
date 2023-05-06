package Zadanie1;

import Phone1.Phone;

public class Demo {
    public static void main (String[] args) {
     Otrezok otrezok1=new Otrezok(1,1,2,2); //координаты 1 отрезка
     Otrezok otrezok2=new Otrezok(-3,0,1,1); //координаты 2 отрезка
     double epsilon = 0.0001; // точность сравнения

Double length1 = Math.sqrt(Math.pow(otrezok1.coordinate_x2 - otrezok1.coordinate_x1, 2) + Math.pow(otrezok1.coordinate_y2 - otrezok1.coordinate_y1, 2)); //вычесляем длинну отрезка
Double length2 = Math.sqrt(Math.pow(otrezok2.coordinate_x2 - otrezok2.coordinate_x1, 2) + Math.pow(otrezok2.coordinate_y2 - otrezok2.coordinate_y1, 2));
        System.out.println("Длина 1 отрезка: " + length1);
        System.out.println("Длина 2 отрезка: " + length2);

        if (length1.equals(length2) || Math.abs(length1 - length2) < epsilon) {
            System.out.println("Отрезки равны");
        } else {
            System.out.println("Отрезки не равны");
        }

    }
}
