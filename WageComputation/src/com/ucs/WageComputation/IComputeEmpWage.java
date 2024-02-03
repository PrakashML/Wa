package com.ucs.WageComputation;

public interface IComputeEmpWage {
    public void addCompanyEmpWage(String company, int emp_rate_per_hour, int num_of_working_days, int max_hrs_in_month);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
