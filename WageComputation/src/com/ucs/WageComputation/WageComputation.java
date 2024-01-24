package com.ucs.WageComputation;

public class WageComputation {
    public static void main(String[] args) {
        int is_full_time = 2;
        int is_part_time = 1;
        int emp_rate_per_hour = 20;
        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == is_part_time){
            empHrs = 4;
        }
        else if (empCheck == is_full_time){
            empHrs = 8;
        }
        else {
            empHrs = 0;
        }
        empWage = empHrs * emp_rate_per_hour;
        System.out.println("Emp Wage: " + empWage);
    }
}
