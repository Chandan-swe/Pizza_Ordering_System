
import java.util.Scanner;


class SelectPizza extends PizzaOrder implements ISelectPizza{
    public double bill;
public double qty;
public double total;



Scanner input= new Scanner(System.in);

       
        public void addToChart(int chh) {
           if(chh==1){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getSmallPizzaPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka    ");
               System.out.println("--------------------------------------------");
               
           }
           else if(chh==2){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getRegularPizzaPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
           }
           else if(chh==3){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getLargePizzaPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
          else if(chh==4){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getCheeseToppingPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
         else  if(chh==5){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getSausageToppingPrice();
               System.out.println("--------------------------------------------");
               System.out.println("\nTotal Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
          else if(chh==6){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getMushroomToppingPrice();
               System.out.println("--------------------------------------------");
               System.out.println("\nTotal Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
          else if(chh==7){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getOreganoToppingPrice();
               System.out.println("--------------------------------------------");
               System.out.println("\nTotal Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
         else  if(chh==8){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getPepperToppingPrice();
               System.out.println("--------------------------------------------");
               System.out.println("\nTotal Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
         else  if(chh==9){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getChickenToppingPrice();
               System.out.println("--------------------------------------------");
               System.out.println("\nTotal Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
         
         else{
             System.out.println("Invalid Input");
         }
        }
}
