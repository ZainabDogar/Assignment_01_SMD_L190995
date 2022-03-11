package Question_02;

class Employees 
{
  public int id;
  public String name;
}

interface PayrollCalculator 
{
  public int id1 = 0;
  public String name1 = " ";
  
  public int calculate_payroll();
}

class HourlyEmployee extends Employees implements PayrollCalculator 
{
  public int calculate_payroll()
  {
      System.out.print("Calculating HourlyEmployee payroll");
      return 1;
  }
}

class SalaryEmployees extends Employees implements PayrollCalculator 
{
  public int calculate_payroll() 
  {
      System.out.print("Calculating SalaryEmployee payroll");
      return 1;
  }
}

class CommissionEmployees extends SalaryEmployees implements PayrollCalculator 
{
  public int calculate_payroll() 
  {
      System.out.print("Calculating CommissionEmployee payroll");
      return 1;
  }
}

class main 
{
  public static void main(String[] args) 
  {
      CommissionEmployees ce = new CommissionEmployees();
	  System.out.print("MAIN FUNC!");
	  System.out.print("\n");
      ce.calculate_payroll();
  }
}