package com.company;

import java.util.Scanner;

public class Task1 {

    public static void search (long tmp, long count, long countFor){

        if (tmp <= countFor) {
            if (tmp == 1)
                System.out.println(tmp);
            else
                System.out.println(0);
        } else {

            while (tmp > countFor) {
                count++;
                tmp -= countFor;
            }
            count++;
            long getRazryad = (long)(Math.pow(10, --countFor));
            if (tmp == 1) {
                System.out.println(count / getRazryad);
            } else if (tmp == ++countFor){
                System.out.println(count % 10);
            } else
                System.out.println(count / (long)Math.pow(10,(countFor-tmp)) % 10);
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        long number = scanner.nextLong();
        long tmp = number - 10;
        long count = 0, countFor = 0;


        if (number < 9){
            System.out.println(++number);
            return;
        }else if (number <189){
            count = 9;
            tmp -= -2;
            countFor = 2;
        }else if (number <2889){
            tmp -= 178;
            count = 99;
            countFor = 3;
        }else if (number <38889){
            tmp -= 2878;
            count = 999;
            countFor = 4;
        }else if (number <488889){
            tmp -= 38878;
            count = 9999;
            countFor = 5;
        }else if (number <5888889){
            tmp -= 488878;
            count = 99999;
            countFor = 6;
        }else if (number <68888889){
            tmp -= 5888878;
            count = 999999;
            countFor = 7;
        }else if (number <788888889){
            tmp -= 68888878;
            count = 9999999;
            countFor = 8;
        }else if (number <8888888889L){
            tmp -= 788888878;
            count = 99999999;
            countFor = 9;
        }else if (number <98888888889L){
            tmp -= 8888888878L;
            count = 999999999;
            countFor = 10;
        }else if (number <1088888888889L){
            tmp -= 98888888878L;
            count = 9999999999L;
            countFor = 11;
        }else if (number <11888888888889L){
            tmp -= 1088888888878L;
            count = 99999999999L;
            countFor = 12;
        }else if (number <128888888888889L){
            tmp -= 11888888888878L;
            count = 999999999999L;
            countFor = 13;
        }else if (number <1388888888888889L){
            tmp -= 128888888888878L;
            count = 9999999999999L;
            countFor = 14;
        }else if (number <14888888888888889L){
            tmp -= 1388888888888878L;
            count = 99999999999999L;
            countFor = 15;
        }else if (number <158888888888888889L){
            tmp -= 14888888888888878L;
            count = 999999999999999L;
            countFor = 16;
        }else if (number <1688888888888888889L){
            tmp -= 158888888888888878L;
            count = 9999999999999999L;
            countFor = 17;
        }else if (number <9188888888888888889L){
            tmp -= 1688888888888888878L;
            count = 99999999999999999L;
            countFor = 18;
        }

        search(tmp, count, countFor);
    }
}
