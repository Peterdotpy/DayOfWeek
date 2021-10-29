import java.util.*;
public class DayOfWeek {
public static void main(String[]args){
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome");
    System.out.println("Please type day");
    int  day = console.nextInt();
    System.out.println("Please type month");
    int month = console.nextInt();
    System.out.println("Please type year");
    int year = console.nextInt();
    theFV(month, day, year);
    leap(year);
    System.out.print("Thank you for using Peter's calender v1, further tools will be out soon");

}
    public static void theFV(int month, int day, int year){
       //month value, peter's secret formula, not for sale.
    int mv = 0;
    if (month==1){
            mv=mv+1;
        } else if (month==2){
            mv=mv+4;
        } else if (month==3){
            mv=mv+4;
        } else if (month==4){
            mv=mv+0;
        } else if (month==5){
            mv=mv+2;
        } else if (month==6){
            mv=mv+5;
        } else if (month==7){
            mv=mv+0;
        } else if (month==8){
            mv=mv+3;
        } else if (month==9){
            mv=mv+6;
        } else if (month==10){
            mv=mv+1;
        } else if (month==11){
            mv=mv+4;
        } else if (month==12){
            mv=mv+6;
        }
    //year value, peter's secret formula not for sale
        int yv = 4;
        if(year>= 1400&& year<=1499){
            yv=yv-2;
        } else if (year>=1500&&year<=1599){
            yv=yv-4;
        }  else if (year>=1600&&year<=1699){
            yv=yv+2;
        }  else if (year>=1700&&year<=1799){
            yv=mv+0;
        }  else if (year>=1800&&year<=1899){
            yv=yv-2;
        }  else if (year>=1900&&year<=1999){
            yv=yv-4;
        }  else if (year>=2000&&year<=2099){
            yv=yv+2;
        }
        int f= year;
        //get the last two value of the year, example: 2014 = im getting 14
        String valoff = String.valueOf(f);
        String strf = valoff.substring(2);
        int numberr = Integer.valueOf(strf);
        int strff = numberr / 4;
        //plus day value, month value, year value, year,
        int fin = day + mv + yv + strff + numberr;
        int finn = fin%7-1;
       if(finn==0){
           System.out.println("sunday");
       } else if(finn==1){
           System.out.println("monday");
       } else if(finn==2){
           System.out.println("tuesday");
       } else if(finn==3){
           System.out.println("wednesday");
       } else if(finn==4){
           System.out.println("thursday");
       } else if(finn==5){
           System.out.println("friday");
       } else if(finn==6){
           System.out.println("saturday");
       }


    }
    //leap year calculator
public static void leap(int year){


    if (year%4==0){
        System.out.println(year+ " is a leap year!");
    }else {
        System.out.println(year+ " is not a leap year!");
    }

}

}
