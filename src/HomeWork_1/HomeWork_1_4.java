package HomeWork_1;

public class HomeWork_1_4 {
    public static void main(String[] args) {
        int diameterFirstPizza = 24;
        int diameterSecondPizza = 28;
        int radiusFirstPizza = diameterFirstPizza/2;
        int radiusSecondPizza = diameterSecondPizza/2;
        int calories = 40;
        double extraCalories = (Math.PI *radiusSecondPizza*radiusSecondPizza)*calories - (Math.PI *radiusFirstPizza*radiusFirstPizza)*calories;
        System.out.println("Extra calories = " + extraCalories);
    }
}
