package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
 //       count(5);
//        count(7);
        int num = 999;
        count(num);
//        String word = "wooden spoon";
//        count(word.length());
        printAge();

    }

    public static void count(int num){

        for (int i = 0;i <= num;i++){


            System.out.println();
            System.out.print(i + " ");
        }


    }
    public static void printAge(){
        int count =0;
        for (int i =1977;i<2021;i++){
            count++;

        }
        System.out.println("My age - " + count);
    }
    /**
     * method name: printAge
     * @param/input: int year
     * "Birth year: 1984. Age: 38"
     */
    public static void printAge(int year) {
        int age = 2021 - year;//calculate age
        System.out.println("Birth year: " + year +". Age: " + age);
    }
}
