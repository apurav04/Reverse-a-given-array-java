package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr=new int[5];
        int[] temp= new int[arr.length];
        Scanner s= new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int j=0;
        for(int i =arr.length-1;i>=0;i--){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(temp[i]);
        }
    }
}
