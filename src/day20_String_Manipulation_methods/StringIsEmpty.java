package day20_String_Manipulation_methods;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(""));
        System.out.println(jobTitle.length());

        if(jobTitle.isEmpty()){
            System.out.println("job title is missing");
        }else {
            System.out.println("job title looks good");
        }
        if(jobTitle.length() == 0){
            System.out.println(" job title is empty");
        } else {
            System.out.println(" job title is not empty");
        }
        System.out.println(jobTitle.equals(""));
        if("".equals(jobTitle)){
            System.out.println("job title is empty");
        } else {
            System.out.println("job title is not empty");
        }
        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());

        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);

            String userName = "";
            String pwd = "";
            if(userName.isEmpty()){
                System.out.println("cannot be empty");
            } else {
                System.out.println("right");
            }
        }
    }
}
