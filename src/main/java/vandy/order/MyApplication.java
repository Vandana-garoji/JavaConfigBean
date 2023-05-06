package vandy.order;

import vandy.kitchen.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "vandy")
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {

        var context =SpringApplication.run(MyApplication.class, args);


        /** 1 **/
        PizzaController vegPizzaController= (PizzaController) context.getBean("vegPizzaController");
        System.out.println(vegPizzaController.getMyPizza());


        /** 2 **/
        PizzaController nonVegPizzaController= (PizzaController) context.getBean("nonVegPizzaController");
        System.out.println(nonVegPizzaController.getMyPizza());


        /** 3 **/
//        PizzaController setterVegPizzaController= (PizzaController) context.getBean("setterVegPizzaController");
//        System.out.println(setterVegPizzaController.getMyPizza());


        /** 4 **/

//        PizzaController setterNonVegPizzaController= (PizzaController) context.getBean("setterNonVegPizzaController");
//        System.out.println(setterNonVegPizzaController.getMyPizza());



        /** 1st , 2nd  are for constructor bean injections **/
        /** 3rd , 4th  are for setter bean injections **/




    }
}
