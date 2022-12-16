public class HealthyBurger extends Hamburger{
    private double healthyExtra1Price, healthyExtra2Price;
    private String  healthyExtra1Name, healthyExtra2Name;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, "", price);
    }

    public void addHealthyAddition1(double healthyExtra1Price, String healthyExtra1Name) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2 (String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

@Override
    public double itemizeHamburger() {

       double burgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            burgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            burgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return burgerPrice;
    }
}
