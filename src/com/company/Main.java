package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Для введенной с клавиатуры строки необходимо провести отсев пробелов.
//Результат в виде строки без пробелов вывести на экран.

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String readIn = in.readLine();

        char[] readInChar = readIn.toCharArray();
        for (int i = 0; i < readInChar.length; i++){
            if (readInChar[i] == ' '){
                readInChar[i] = '\u0000';
            }
        }
        System.out.println(readInChar);
    }
}
