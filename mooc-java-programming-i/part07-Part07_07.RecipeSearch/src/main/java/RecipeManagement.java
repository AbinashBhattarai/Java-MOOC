import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManagement {
    private Scanner scanner;
    private String path;
    private ArrayList<Recipe> recipes;

    public RecipeManagement(Scanner scanner, String path) {
        this.scanner = scanner;
        this.path = path;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        boolean fileReadSuccessfully = false;

        try(Scanner scanner = new Scanner(Paths.get(this.path))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(scanner.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                this.recipes.add(new Recipe(name, cookingTime, ingredients));
            }

            fileReadSuccessfully = true;

        } catch (Exception e) {
            System.out.println("Cannot read file.");
        }


        if (fileReadSuccessfully) {
            listRecipes();
        }
    }

    private void listRecipes() {
        System.out.println("");
        System.out.println("Commands: \n" + 
                            "list - lists the recipes \n" + 
                            "stop - stops the program \n" + 
                            "find name - searches recipes by name \n" +
                            "find cooking time - searches recipes by cooking time \n" +
                            "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                return;
            }
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : this.recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                findRecipe();
            } else if (command.equals("find cooking time")) {
                findRecipeByTime();
            } else if (command.equals("find ingredient")) {
                findRecipeByIngredient();
            }
        }
    }

    private void findRecipe() {
        System.out.print("Searched word: ");
        String word = this.scanner.nextLine();

        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    private void findRecipeByTime() {
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(this.scanner.nextLine());

        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    private void findRecipeByIngredient() {
        System.out.print("Ingredient: ");
        String word = this.scanner.nextLine(); 

        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(word)) {
                System.out.println(recipe);
            }
        }
    }
}
