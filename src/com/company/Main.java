package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
            System.out.print("введите любое число от 13 до 100  ");
            n = scan.nextInt();

            if(n < 13) System.out.println("введите число больше 13");
            if(n > 100) System.out.println("введите число меньше 100");
            for(int m = 1; m <= 100; m++){
                ArrayList<Integer> arr = new ArrayList();
                for(int i = 1; i <= n; i++){
                    arr.add(i);
                }
                int i = 0;
                while(arr.get(i) != 13){
                    arr.remove(i);
                    i += m - 1;
                    if(i >= arr.size()){
                        i = i % arr.size();
                    }
                }
                if(arr.size() == 1){
                    System.out.println("количество шагов ровняется "+ m);
                    break;
                }
            }

    }
}