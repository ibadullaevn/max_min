import java.util.Scanner;

public class max_min_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min=0;
        int n = in.nextInt();

        for (int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if((a*b)<min){
                min=a*b;
            }
        }

        System.out.println("Area"+min);
    }
}

