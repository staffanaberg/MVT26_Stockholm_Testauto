package excercises;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        //Skriv ett program som läser in två tal och sedan skriver ut kvoten mellan dem (dvs. utför division mellan de två talen)
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in två heltal och tryck på enter efter varje tal");

        boolean isRunning = true;
        boolean isCorrect = false;
        int number1 = 0;
        while(isRunning) {

            try {
                //Har jag genomfört nästa steg tidigare på ett korrekt sätt?
                if(!isCorrect) {
                    System.out.println("Skriv in första talet:");
                    number1 = Integer.parseInt(scan.nextLine());
                    isCorrect = true;
                }
                System.out.println("Skriv in andra talet:");
                int number2 = Integer.parseInt(scan.nextLine());
                System.out.println("Kvoten blir: " + (number1 / number2));
                isRunning = false;
            }
            //Fånga felen och skriv ut ett felmeddelande
            //Uppdatera så att meddelandet i Exception e även kommer med
            catch (NumberFormatException e) {
                System.out.println("Du måste skriva ett tal " + e);
            } catch (ArithmeticException e) {
                System.out.println("Du får inte dividera med 0 " + e);
            } catch (Exception e) {
                System.out.println("FEEEEL!!! " + e);
            }
        }
        //Uppdatera programmet så att det fångar olika fel beroende
        // på vilket Exception man får

        //Uppdatera programmet så att inläsning upprepas till dess
        // att man har korrekta värden

        //Uppdatera programmet så att man enbart behöver läsa in
        //det värde som inte är korrekt (om enbart ett av dem är inkorrekt)

    }

}
