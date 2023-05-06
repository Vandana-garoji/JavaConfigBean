package vandy.kitchen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


    @Bean(name = "vegPizzaBean")
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean(name = "nonVegPizzaBean")
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }


    /** 1. constructor Bean injection  **/

    @Bean(name = "vegPizzaController")
    public PizzaController vegPizzaController(){
        return new PizzaController(vegPizza());
    }


    /** 2. constructor Bean injection  **/

    @Bean(name = "nonVegPizzaController")
    public PizzaController NonVegPizzaController(){
        return new PizzaController(nonVegPizza());
    }



    /** 3. setter bean injection  **/

//    @Bean(name = "setterVegPizzaController")
//    public PizzaController setterVegPizzaController(){
//        PizzaController pizzaController = new PizzaController();
//        pizzaController.setPizza(vegPizza());
//        return pizzaController;
//    }


   /**  4. setter bean injection  **/

//    @Bean(name = "setterNonVegPizzaController")
//    public PizzaController setterNonVegPizzaController(){
//        PizzaController pizzaController = new PizzaController();
//        pizzaController.setPizza(nonVegPizza());
//        return pizzaController;
//    }

}
