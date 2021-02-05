import java.util.Scanner;

public class max_min_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min=0;
        int n = in.nextInt();
        int at=0;

        for (int i=0;i<n;i++){
            int a = in.nextInt();
            if(a<min){
                min=a;
                at=i;
            }
        }

        System.out.println("Min"+min+"at"+at);
    }
}

