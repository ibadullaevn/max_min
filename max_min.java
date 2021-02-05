import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        int min=0;
        int n = in.nextInt();
        int arr[]=new int[100];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if (arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
    System.out.println("Max"+max);
        System.out.println("Min"+min);
    }
}
