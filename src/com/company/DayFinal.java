package com.company;

import java.util.Scanner;

public class DayFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 10;
        Day day = new Day();

            day.setDay(sc.next());
            System.out.println(day.getDay());
            System.out.println("the next day is " + day.getNextDay() + " and the previous day is " + day.getPreviousDay());
            System.out.println("in "+sc.nextInt()+" days, the day will be "+ day.calculateDay(sc.nextInt()));

    }
}
