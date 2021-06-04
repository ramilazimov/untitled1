package day22_String_manipulation;

public class IndexOfExamples {
    public static void main(String[] args) {
        String technologies = "java, html, css, cucumber, selenium, testng ,maven, ";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfjava = technologies.indexOf("java");
        System.out.println(" java is at index " + indexOfjava);
        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + indexOfCss);
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("SQL");
        System.out.println(" sql is at index " + indexOfSql);
        if(technologies.contains("maven")){
            System.out.println(" maven is present");
        } else {
            System.out.println("maven is not present");
        }
        if(technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
    }
}
