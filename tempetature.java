// Temperature Convertor

import java.util.Scanner;

public class tempetature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature;
        int choice;
        
        while (true) {

            System.out.println(" choose conversion type :");
            System.out.println(" 1.  celsius to fahrenheit");
            System.out.println(" 2. fahrenheit to celsius ");
            System.out.println(" 3. celsius to kelvin ");
            System.out.println(" 4.  kelvin to celsius");
            System.out.println(" 5.  kelvin to fahrenheit");
            System.out.println(" 6.  fahrenheit to kelvin");
            System.out.println(" 7.  exit ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println(" enter the temperature :");
                    temperature = sc.nextDouble();
                    double cf = ( temperature * 9/ 5 +32);
                    System.out.println(temperature + " Celsius is equal to " +  cf + " Fahrenheit ");

                    break;
                case 2 :
                    System.out.println(" enter the temperature :");
                    temperature = sc.nextDouble();
                    double fc = ( temperature-32) * 5/9 ;
                    System.out.println(temperature + " fahrenheit  is equal to " +  fc + " Fahrenheit ");

                    break;
                case 3:
                    System.out.println(" enter the temperature :");
                    temperature = sc.nextDouble();
                    double ck = temperature + 273.15 ;
                    System.out.println(temperature + " celsius  is equal to " + ck + " kelvin ");
                    
                    break;

                case 4:
                    System.out.println(" enter the temperature :");
                    temperature = sc.nextDouble();
                    double kc  = temperature - 273.15 ;
                    System.out.println(temperature + " celsius  is equal to " + kc  + " celsius ");

                    break;

                case 5:
                    System.out.println(" enter the temperature :");
                    temperature = sc.nextDouble();
                    double kf =(temperature - 273.15) * 9/5 + 32;
                    System.out.println(temperature + " kelvin is equal to " + kf  + " fahrenheit");

                    break;

                case 6:
                    System.out.println(" enter the temperature :");
                    temperature = sc.nextDouble();
                    double fk = ( temperature - 32)  * 9/5 +273.15 ;
                    System.out.println(temperature + " fahrenheit is equal to " + fk + " kelvin");

                    break;

                case 7:

                    System.exit(0);
                    
                
                default:

                    break;
            }
        }
    }
}
