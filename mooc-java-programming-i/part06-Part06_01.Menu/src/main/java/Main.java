
public class Main {
    public static void main(String[] args) {
          Menu exactum = new Menu();
        
        // When you have completed the method addMeal(String meal)
        // You can delete the comments below
        
        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
        exactum.addMeal("Roasted lamb in a red wine sauce");
        
        exactum.printMeals();

        exactum.clearMenu();
        exactum.printMeals();
    }
}
