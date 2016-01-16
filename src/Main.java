import java.io.*;
import java.util.*;

/**
 * Created by Marina on 25.11.2015.
 */
public class Main {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = -1;
        double eps = -1;
        while(n<0) {
            System.out.print("Enter count of elements: n = ");
            n = Integer.parseInt(br.readLine());
        }

        System.out.print("Enter epsilon: e = ");
        eps = Double.parseDouble(br.readLine());

        double d = 1.0/(Math.pow((n+1),2));
        if(d < eps)
            System.out.print("Minimun: " + d);
        else
            System.out.print("all values are more then epsilon");

    }


    private static double func(int n){

        return 1.0/(Math.pow((n+1),2));
    }

}
