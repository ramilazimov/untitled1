package Codingbat;

import java.util.Arrays;

public class InterviewGroup {
    public static void main(String[] args) {
        String[] group = {"Elgun","Kamran","Ramil","Bahruz",
                "Suleyman","Abbas","Mehdi","Orxan","Elvin","Pervin","Aygun","Rahib","Rasim","Emil",};
        String twoPerson = " ";
        String unidueCouple = "";
        for(int i =0;i < group.length;i++){
            for(int j = i+1;j < group.length;j++){
                twoPerson +=  group[i] + "-" + group[j] + " " ;
            }
        }
        //System.out.println(twoPerson);
        String[] arrStr = twoPerson.split(" ");

        System.out.println(arrStr.length);
        System.out.println(Arrays.toString(arrStr));

                }
            }

