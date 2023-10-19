import builderpattern.NutritionFacts;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(250, 1)
                .calories(250)
                .build();
    }
}