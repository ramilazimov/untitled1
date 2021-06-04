package day30_StudentArray;

import java.util.Locale;
import java.util.SplittableRandom;

public class StudentArray {
    public static void main(String[] args) {
        String id, firstName,lastName,butchNum,phoneNum;
        String[] student1 = new String[5];
        student1[0] = "ID6788934";
        student1[1] = "ramil";


       // String [] student = {"56778","Ramil","Azimov","22","678483784"};
        String [] student = {"56778","Ramil","Azimov","22","678483784"};
        System.out.println("student ID" + student[0]);
        System.out.println("student ID" + student[1]);
        System.out.println("student ID" + student[2]);
        System.out.println("student ID" + student[3]);
        System.out.println("student ID" + student[4]);

        System.out.println("student data length: " + student.length);
       if(student.length == 5){
            System.out.println("pass : data array has correct length");
        } else {
            System.out.println("fail : data array has incorrect length");
        }
        System.out.println(student[1].toUpperCase() + " " +  student[2].toUpperCase());
        System.out.println(student[2].toUpperCase());
        String mobileNum = student[3];
        int[] nums = {33,44,55,};

        for (int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + " : ");
        }
    }
}
