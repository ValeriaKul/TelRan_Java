package HomeWork_1;

public class HomeWork_1_4 {
    public static void main(String[] args) {
        int calories = 40;
        int diameterFirstPizza = 24;
        int diameterSecondPizza = 28;
        int radiusFirstPizza = diameterFirstPizza/2;
        int radiusSecondPizza = diameterSecondPizza/2;
        double differentSquare = (Math.PI *radiusSecondPizza*radiusSecondPizza) - (Math.PI *radiusFirstPizza*radiusFirstPizza);
        double extraCalories = differentSquare*calories;
        System.out.println("Extra calories = " + extraCalories);
    }
}
