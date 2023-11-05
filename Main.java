import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean running = true;
    
    while (running) {
      System.out.println("Welcome to the chemistry study suite!");
      System.out.println("What would you like to start with?\n 1. Polyatomic Ion Studying\n 2. Periodic Table Studying\n 3. Significant Figure Studying\n 4. Quit");
      System.out.print("Enter Choice: ");
      int choice = input.nextInt();
      System.out.println();

      switch (choice) {
        case 1:
          polyatomicFlashcards();
          break;
        case 2:
          periodicTable();
          break;
        case 3:
          significantFigures();
          break;
        case 4:
          System.out.println("Quitting...");
          running = !running;
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
  
  public static void polyatomicFlashcards() {
    Scanner input = new Scanner(System.in);
    
    Map<String, String> flashcards = new HashMap<>();
    flashcards.put("dihydrogen phosphate", "H2PO4 -1");
    flashcards.put("hydrogen bicarbonate", "HCO3 -1");
    flashcards.put("hydrogen sulfate", "HSO4 -1");
    flashcards.put("nitrate", "NO3 -1");
    flashcards.put("nitrite", "NO2 -1");
    flashcards.put("hydroxide", "OH -1");
    flashcards.put("cyanide", "CN -1");
    flashcards.put("thiocynate", "SCN -1");
    flashcards.put("permanganate", "MnO4 -1");
    flashcards.put("perchlorate", "ClO4 -1");
    flashcards.put("chlorate", "Cl03 -1");
    flashcards.put("chlorite", "Cl02 -1");
    flashcards.put("hypochlorite", "Cl0 -1");
    flashcards.put("acetate", "C2H3O2 -1");
    flashcards.put("hydrogen phosphate", "HPO4 -2");
    flashcards.put("carbonate", "CO3 -2");
    flashcards.put("sulfate", "SO4 -2");
    flashcards.put("sulfite", "SO3 -2");
    flashcards.put("chromate", "CrO4 -2");
    flashcards.put("dichromate", "Cr2O7 -2");
    flashcards.put("peroxide", "O2 -2");
    flashcards.put("oxalate", "C2O4 -2");
    flashcards.put("phosphate", "PO4 -3");
    flashcards.put("phosphate", "PO3 -3");
    flashcards.put("ammonium", "NH4 +1");

    int flashcardsDone = 0;
    int score = 0;
    Map<String, String> incorrectFlashcards = new HashMap<>();

    System.out.println("Welcome to polyatomic ion studying");

    for (Map.Entry<String, String> flashcard : flashcards.entrySet()) {
      String name = flashcard.getKey();
      String formula = flashcard.getValue();

      System.out.println("Name: " + name);
      System.out.println("Press enter to see the formula");
      input.nextLine();

      System.out.println("Formula: " + formula);
      System.out.println("You remembered it? (yes or no; type 'exit' to exit)");
      String isCorrect = input.nextLine();

      if (isCorrect.equalsIgnoreCase("exit")) {
        System.out.println("Exiting... \n");
        break;
      }
      if (isCorrect.equalsIgnoreCase("yes")) {
        System.out.println("\nNice!\n");
        score++;
      } else {
        System.out.println("Oops! You'll get it next time!");
        incorrectFlashcards.put(name, formula);
      }
      flashcardsDone++;
    }
    showScore(score, flashcardsDone);
  }

  public static void periodicTable(){
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the Periodic Table studying! Here you can input the name of any of the first 20 elements, and we will tell you information about it \n");

    Map<String, Element> elements = new HashMap<>();
    elements.put("hydrogen", new Element("Hydrogen", "H", 1, 1.01, 1, "nonmetal"));
    elements.put("helium", new Element("Helium", "He", 2, 4.00, 8, "noble gas"));
    elements.put("lithium", new Element("Lithium", "Li", 3, 6.94, 1, "alkali metal"));
    elements.put("berrylium", new Element("Berrylium", "Be", 4, 9.01, 2, "alkaline earth metal"));
    elements.put("boron", new Element("Boron", "B", 5, 10.81, 3, "metalloid"));
    elements.put("carbon", new Element("Carbon", "C", 6, 12.01, 4, "nonmetal"));
    elements.put("nitrogen", new Element("Nitrogen", "N", 7, 14.00, 5, "nonmetal"));
    elements.put("oxygen", new Element("Oxygen", "O", 8, 16.00, 6, "nonmetal"));
    elements.put("fluorine", new Element("Fluorine", "F", 9, 19.000, 7, "halogen"));
    elements.put("neon", new Element("Neon", "Ne", 10, 20.18, 8, "noble gas"));
    elements.put("sodium", new Element("Sodium", "Na", 11, 22.99, 1, "alkali metal"));
    elements.put("magnesium", new Element("Magnesium", "Mg", 12, 24.30, 2, "alkaline earth metal"));
    elements.put("aluminum", new Element("Aluminum", "Al", 13, 26.98, 3, "metal"));
    elements.put("silicon", new Element("Silicon", "Si", 14, 28.09, 4, "metalloid"));
    elements.put("phosphorus", new Element("Phosphorus", "P", 15, 30.97, 5, "nonmetal"));
    elements.put("sulfur", new Element("Sulfur", "S", 16, 32.06, 6, "nonmetal"));
    elements.put("chlorine", new Element("Chlorine", "Cl", 17, 35.45, 7, "halogen"));
    elements.put("argon", new Element("Argon", "Ar", 18, 39.95, 8, "noble gas"));
    elements.put("potassium", new Element("Potassium", "K", 19, 39.10, 1, "alkali metal"));
    elements.put("calcium", new Element("Calcium", "Ca", 20, 40.08, 2, "alkaline earth metal"));

    while (true) {
      System.out.println("Enter the name of an element you would like to learn more about (type 'exit' to exit):");
      String elementName = input.nextLine();
      
      if (elementName.equalsIgnoreCase("exit")) {
        System.out.println("Exiting... \n");
        break;
      }
      if (elements.get(elementName) != null) {
        System.out.println(elements.get(elementName));
      } else {
        System.out.println("Sorry! We don't recognize that element!");
      }
    }
  }

  public static void significantFigures() {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to significant figures studying");
    System.out.println("You will be given multiplication problems with random floats that you will have to give to the proper number of significant figures. A calculator is suggested, but using it to round isn't\n");

    int counter = 1;
    int score = 0;
    while (true) {
      int power1 = (int) (Math.random() * 3 + 1);
      double num1 = (double) (Math.floor(Math.random() * 101 * (Math.pow(10, power1)))) / Math.pow(10, power1);
      
      int power2 = (int) (Math.random() * 3 + 1);
      double num2 = (double) (Math.floor(Math.random() * 101 * (Math.pow(10, power2)))) / Math.pow(10, power2);
      
      System.out.println("Question " + counter + ": " + num1 + " * " + num2 + "\n");
      System.out.print("Enter the answer rounded to the correct significant figures (or type 'exit' to exit): ");
      String guess = input.nextLine();
      if (guess.equalsIgnoreCase("exit")) {
        System.out.println("Exiting...");
        break;
      }
      
      double answer = multiplyWithSigFigs(num1, num2);
      if (Double.parseDouble(guess) == answer) {
        System.out.println("Correct! Nice Job!\n");
        score++;
      } else if (Math.abs(Double.parseDouble(guess) - answer) < 1) {
        System.out.println("Close! The correct answer was " + answer + ". Pay attention to those significant figures and rounding!\n");
      } else {
        System.out.println("Incorrect. The correct answer was " + answer + ".\n");
      }
      counter++;
    }
    showScore(score, counter);
  }

  public static double multiplyWithSigFigs(double num1, double num2) {
    BigDecimal bd1 = new BigDecimal(num1);
    BigDecimal bd2 = new BigDecimal(num2);

    BigDecimal answer = bd1.multiply(bd2);
    int answerSigFigs = Math.min(Double.toString(num1).length() - 1, Double.toString(num2).length() - 1);
    answer = answer.round(new java.math.MathContext(answerSigFigs));

    return answer.doubleValue();
  }

  public static void showScore(int score, int total) {
    Scanner input = new Scanner(System.in);
    System.out.println("Show score? (yes or no):");
    String seeScore = input.nextLine();
    if (seeScore.equalsIgnoreCase("yes")){
      System.out.println("Your score was " + score + " out of " + total + "\n");
    }
  }
}