package SaimTask.Array2;

public class ElgunArray {
    public static void main(String[] args) {
        String str [][] = {{"Mike Artrur","Mike123"},{"Jason Mike","Coole1233"},
                {"Johnny avard","Avard123"},{"Ford","Fiesta"}};

        for(int i = 0; i < str.length;i++){
            for (int j = 0; j<str[i].length;j++){
                if(str[i][j].length() > 5){
                    System.out.println(str[i][j]);
                }
            }
        }
    }
}
