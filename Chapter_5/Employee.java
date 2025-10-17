public class Employee {
    public int employeeNumber;
    public double payRate = 0.0;
    public double cal = 0.0;
    public double calOvertime = 0.0;
    public double overtime = 0.0;
    
    static int Max_Employee_Number = 9999;
    static double Max_Rate = 60.00;
    static double Overtime_Multiplier = 1.5;

    Employee(int employeeNumber, double payRate)
    {
      this.employeeNumber = employeeNumber;
      this.payRate = payRate;
    }
    
    int getEmployee(){
       return this.employeeNumber;
     }
     
    double getPayRate(){
       return this.payRate;
     }
    
    void setEmployee(int employeeNumber){
      this.employeeNumber = employeeNumber;
    }

    void setPayRate(double payRate){
      this.payRate = payRate;
    }
    
    void Calculate(int employeeNumber, double payRate, int Max_Employee_Number, double Max_Rate, double Overtime_Multiplier){
      try{
         this.employeeNumber = employeeNumber;
         this.payRate = payRate;

         if(employeeNumber >= Max_Employee_Number || payRate >= Max_Rate){
            System.out.println("The max number is 9999");
            System.out.println("The max rate is 60.00");
         }
         cal = employeeNumber * payRate;
         calOvertime = cal * Overtime_Multiplier;
         overtime = calOvertime;
               
      } catch (Exception e){
         System.out.println("Non-sense");
      }
      
    }
    
    
    
}