package com.ucs.WageComputation;
public class WageComputation implements IComputeEmpWage {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public WageComputation() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    public void addCompanyEmpWage(String company, int emp_rate_per_hour, int num_of_working_days, int max_hrs_in_month){
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, emp_rate_per_hour, num_of_working_days, max_hrs_in_month);
        numOfCompany++;
    }

    public void computeEmpWage(){
        for (int i = 0; i < numOfCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.max_hrs_in_month && totalWorkingDays < companyEmpWage.num_of_working_days) {
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
        return totalEmpHrs * companyEmpWage.emp_rate_per_hour;
    }



    public static void main(String[] args) {
        WageComputation empWage = new WageComputation();
        empWage.addCompanyEmpWage("Jio", 15, 23, 100);
        empWage.addCompanyEmpWage("DMart", 20, 20, 100);
        empWage.computeEmpWage();
    }

}