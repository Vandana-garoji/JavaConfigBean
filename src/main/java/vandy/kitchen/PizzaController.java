package vandy.kitchen;


    /**  java config based constructor injection for 1st & 2nd beans **/

  public class PizzaController {

    private Pizza pizza;

    public  PizzaController(Pizza pizza){
        this.pizza =pizza;
    }

    public String getMyPizza(){
        return pizza.preparePizza();
    }
  }




  /**    java config based setter injection for 3rd & 4 th beans  **/

//  public class PizzaController {
//
//    private Pizza pizza;
//
//    public void setPizza(Pizza pizza){
//        this.pizza = pizza;
//   }
//
//    public String getMyPizza(){
//        return pizza.preparePizza();
//    }
//  }
