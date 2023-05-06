package vandy.kitchen;


public class NonVegPizza implements Pizza {
    @Override
    public String preparePizza() {
        return "chicken pizza ready !";
    }
}
