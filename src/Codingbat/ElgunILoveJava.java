package Codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElgunILoveJava {
    public static void main(String[] args) {


        String str = "I love Java. I enjoy Coding";
        String[]  array = str.split(" ");
         String word =" ";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    word = array[i];
                }
            }
        }


        }
    }







