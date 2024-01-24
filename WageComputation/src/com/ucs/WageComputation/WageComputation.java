package com.ucs.WageComputation;

public class WageComputation {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int emp_rate_per_hour = 20;
    public static final int num_of_working_days = 20;
    public static final int max_hrs_in_month = 100;

    public static void EmpWageCompute(){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= max_hrs_in_month && totalWorkingDays < num_of_working_days) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case is_part_time:
                    empHrs = 4;
                    break;
                case is_full_time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * emp_rate_per_hour;
        System.out.println("Total Emp Wage: " + totalEmpWage);

    }

    public static void main(String[] args) {
        EmpWageCompute();
    }
}
