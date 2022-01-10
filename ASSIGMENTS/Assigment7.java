package ASSIGMENTS;


import java.time.LocalDate;



public class Assigment7 {
    public static void main(String[] args) 
    {
        dateFormat();
        
    }
    


public static void dateFormat(){
    String day;
    String month;
    String year;
    System.out.println("enter the day: ");
    day=System.console().readLine();

    System.out.println("enter the month: ");
    month=System.console().readLine();

    System.out.println("enter the year: ");
    year=System.console().readLine();
    LocalDate sampleDate=LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
    System.out.println(sampleDate);
    for(int i=1;i<=Integer.parseInt(day);i++){
    LocalDate dateFrom=LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),i);


    System.out.println(dateFrom+" is "+dateFrom.getDayOfWeek());

    }
    
}
}