package SaimTask.loops3;

public class SampleBookText {
    public static void main(String[] args) {
        String bookText = "Chapter 1 datatypes and variables. Chapter " +
                "2 conditional statements. chapter 3 String manipulation. " +
                "Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. " +
                "chapter 8 instance and static. Chapter 9 Constructors. Chapter 10 Encapsulation " +
                "and Inheritance. Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions." +
                " Chapter 13 Collections. Chapter 14 Learn more.";
        int valueOfTheBook = 0;

       for(int i = 0;i < bookText.length()-7;i++){

           if( bookText.substring(i,i+7).equalsIgnoreCase("Chapter")  ){
               valueOfTheBook += 10;

           }
       }

        System.out.println(valueOfTheBook);
    }

}