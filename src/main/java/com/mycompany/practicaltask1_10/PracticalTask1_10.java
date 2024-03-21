/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicaltask1_10;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PracticalTask1_10 {
    
    public static void main(String[] args) {
        System.out.println("Practical task №1_10. Variant 5. Student Tolsbrova A.V. Group RIBO-01-22");
        // Запрашиваем путь к каталогу у пользователя
        System.out.println("Введите путь к каталогу: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        // Создаем объект File для указанного пути
        File directory = new File(path);

        // Вызываем метод для сканирования и вывода результатов
        SCAN.scanDirectory(directory);
    }

    
    
}
