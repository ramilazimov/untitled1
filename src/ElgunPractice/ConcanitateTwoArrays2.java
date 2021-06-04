package ElgunPractice;

public class ConcanitateTwoArrays2 {
    public static void main(String[] args) {
        char arr1[] = {'a','b','c','d'};
        char arr2[] = {'e','f','g','t'};
        int count = 0;
        char arr3[] = new char[arr1.length  + arr2.length];
        for(int j = 0,i = arr1.length;j < arr2.length;j++,i++){
            arr3[j] = arr1[j];
            arr3[i] = arr2[j];
        }
        System.out.println(arr3);
    }
}
