import java.util.Scanner;
class PizzaOrder{
    
    public String item1="Small Pizza";
    public String item2="Regular Pizza";
    public String item3="Large Price";
    public String item4="Cheese Topping";
    public String item5="Sausage Topping";
    public String item6="Mushroom Topping";
    public String item7="Oregano Topping";
    public String item8="Peper Topping";
    public String item9="Chicken Topping";
    
    
   private final double smallPizzaPrice=100;
   private final double regularPizzaPrice=115;
   private  final double largePizzaPrice=250;
   private  final double  cheeseToppingPrice=80;
   private  final double sausageToppingPrice=70;
   private  final double mushroomToppingPrice=75;
   private  final double oreganoToppingPrice=72;
   private  final double pepperToppingPrice=82;
   private  final double chickenToppingPrice=81;
           
    public double getSmallPizzaPrice(){
        return smallPizzaPrice;
    }
    public double getRegularPizzaPrice(){
        return regularPizzaPrice;
    }
    public double getLargePizzaPrice(){
        return largePizzaPrice;
    }
    public double getCheeseToppingPrice(){
        return cheeseToppingPrice;
    }
    public double getSausageToppingPrice(){
        return sausageToppingPrice;
    }
    public double getMushroomToppingPrice(){
        return mushroomToppingPrice;
    }
    public double getOreganoToppingPrice(){
        return oreganoToppingPrice;
    }
    public double getPepperToppingPrice(){
        return pepperToppingPrice;
    }
    public double getChickenToppingPrice(){
        return chickenToppingPrice;
    }
    

    
    
    public void display(){
        System.out.println("\nPizza Menu:");
        System.out.println("1. "+item1+" - Price:"+getSmallPizzaPrice());
        System.out.println("2. "+item2+" - Price:"+getRegularPizzaPrice() );
        System.out.println("3. "+item3+" - "+getLargePizzaPrice());
        System.out.println("4. "+item4+" - Price: "+getCheeseToppingPrice());
        System.out.println("5. "+item5+" - Price: "+getSausageToppingPrice());
        System.out.println("6. "+item6+" - Price: "+getMushroomToppingPrice());
        System.out.println("7. "+item7+" - Price: "+getOreganoToppingPrice());
        System.out.println("8. "+item8+" - Price: "+getPepperToppingPrice());
        System.out.println("9. "+item9+" - Price: "+getChickenToppingPrice());
    }
}
public class Main {

   
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        
        PizzaOrder p= new PizzaOrder();
        SelectPizza s= new SelectPizza();
        Payment p1=new Payment();
        
        System.out.println("****************************************");
        System.out.println("         Online Pizza Delivery          ");
        System.out.println("*****************************************");
        p.display();
        
        System.out.println("\nSelect your pizza:");
        int ch=obj.nextInt();
        s.addToChart(ch);
        System.out.println("\nSelect your payment option: \n 1. Bikash \n 2. Cash On Delivery");
        System.out.println("....................................................");
        int chh=obj.nextInt();
        p1.choosePayment(chh);
      
    }
    
}
