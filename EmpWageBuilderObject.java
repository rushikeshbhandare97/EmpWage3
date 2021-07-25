public class EmpWageBuilderObject {

public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;

private final String company;
private final int empRatePerHour;
private final int numOfWorkingDays;
private final int maxHoursPerMonth;
private int totalEmpWage;

public EmpWageBuilderObject (String Company ,int empRatePerHour,
                              int numOfWorkingDays, int maxHoursPerMonth ){
this.company= company;
this.empRatePerHour= empRatePerHour;
this.numOfWorkingDays= numOfWorkingDays;
this.maxHoursPerMonth =maxHoursPerMonth;
}

public void computeEmpWage() {

int empHrs= 0, totalEmpHrs = 0, totalWorkingDays = 0;
while( totalEmpHrs <= maxHoursPerMonth &&
      totalWorkingDays++;
      int empCheck = (int) Math.floor(Math.random{} *10) % 3;
      switch(empCheck) {
      case IS_PART_TIME;
         empHrs =4 ;
         break;
      case IS_FULL_TIME;
         empHrs = 8;
         break;
       default;
         empHrs = 0;
    }
   
    totalEmpHrs  += empHrs;
    System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " +empHrs);
}

totalEmpWage = totalEmpHrs* empRatePerHour;
}


public String  toString(){
    return "Total Emp Wage For Company: " + company + " is + "totalEmpWage;

}

public static void main(String args[])
   return "Total Emp Wage for Compan: " +company+ " is:  " +totalEmpWage;
}

public static void main(String args[])
  EmpWageBuilderObject dmart = new EmpWageBuilderObject ("DMart" ,20 ,2 ,10);
  EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance" ,10, &, 20);
  System.out.println(dMart);
  reliance.ComputeEmpWage();
  System.out.println(reliance);
}  
   
   

