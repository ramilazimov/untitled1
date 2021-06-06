package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = " Intro to java";
        book.author = "Savitch";
        book.title = "programming";
        book.price = 85.0;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.length = 60;
        audioBook.author = "Unmetch";
        audioBook.price = 11.81;
        audioBook.title = "Selenium cookBook";
        audioBook.type = "Automation";
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.title = "Java data structure";
        eBook.author = "Savitch";
        eBook.type = "programming";
        eBook.size = 2;
        eBook.readBook();
    }


}
