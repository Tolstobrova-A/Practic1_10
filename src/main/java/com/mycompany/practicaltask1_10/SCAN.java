/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaltask1_10;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author User
 */
public class SCAN {
    public static void scanDirectory(File directory) {
        // Проверяем, является ли файл директорией
        if (directory.isDirectory()) {
            // Получаем список всех файлов и каталогов
            File[] filesAndDirectories = directory.listFiles();
            
            // Создаем список для файлов и каталогов
            List<File> fileList = new ArrayList<>();
            List<File> directoryList = new ArrayList<>();
            List<File> files = new ArrayList<>();
            // Добавляем файлы и каталоги в соответствующие списки
            for (File file : filesAndDirectories) {
                if (file.isDirectory()) {
                    files.addAll(directSearch(file));
//                    directoryList.add(file);
//                    scanDirectory(file);
                }else{
                    files.add(file);
                }
            }
            for (File file : files){
                if (file.isDirectory()){
                    directoryList.add(file);
                }else{
                    fileList.add(file);
                }
            }
            // Сортируем списки по имени
//            Collections.sort(directoryList);
//            Collections.sort(fileList);

            // Выводим названия каталогов
            for (File directoryFile : directoryList) {
                System.out.println(directoryFile.getAbsolutePath() + " folder");
            }

            // Выводим названия файлов с указанием их размера
            for (File file : fileList) {
                System.out.println(file.getAbsolutePath() + " " + file.length() + " байт");
            }

        } else {
            System.out.println(directory.getAbsolutePath() + " не является директорией");
        }
    }
    public static ArrayList<File> directSearch(File directories){
        ArrayList <File> fileList = new ArrayList<>();
        if (directories.isDirectory()){
            fileList.add(directories);
            File[] lisFile = directories.listFiles();
            for (File fil:lisFile){
                if (fil.isDirectory()){
                    fileList.addAll(directSearch(fil));
                }else{
                    fileList.add(fil);
                }
            }

        }else{
            fileList.add(directories);
        }
        return fileList;
    }
}
