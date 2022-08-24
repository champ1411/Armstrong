package com.company;
import java.util.Scanner;
public class  Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true) {
            System.out.print("Enter 1 to input a number  2.Enter a number to get till n :");
            int ch=in.nextInt();
            if(ch==1) {
                System.out.print("Enter a number :");
                int n = in.nextInt();
                System.out.println(Isarmstrong(n));
            }
            else if(ch==2){
                Isarmstrong();
                System.out.println();
            }
            else
                break;
      }
    }
    static boolean Isarmstrong(int n){
        int temp=n;
        int sum=0,count=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp=n;
        while(temp!=0){
            int rem=temp%10;
            int mul=1;
            for(int i=0;i<count;i++){
                mul=mul*rem;
            }
            sum+=mul;
            temp/=10;
        }
        return sum==n;
    }
    static void Isarmstrong(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a limiter :");
        double n=in.nextInt();
        for(int i=0;i<n;i++) {
            int temp = i;
            double sum = 0, count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            temp = i;
            while (temp != 0) {
                int rem = temp % 10;
                int mul = 1;
                for (int j = 0; j < count; j++) {
                    mul = mul * rem;
                }
                sum += mul;
                temp /= 10;
            }
             if(sum == i)
                 System.out.print(i+" ");
        }

    }
}
