import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaFactory pizzaFactory = new PizzaFactory();

        while (true) {
            System.out.println("Pizza Menu:");
            System.out.println("1. Chicago Cheese Pizza");
            System.out.println("2. NY Style Cheese Pizza");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                Pizza pizza = pizzaFactory.getInt("ChicagoCheesePizza");
                processPizzaOrder(pizza);
            } else if (choice == 2) {
                Pizza pizza = pizzaFactory.getInt("NyStyleCheesePizza");
                processPizzaOrder(pizza);
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }

    private static void processPizzaOrder(Pizza pizza) {
        if (pizza != null) {
            pizza.createPizza();
            pizza.orderPizza();
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Invalid pizza selection.");
        }
    }
}

interface Pizza {
    void createPizza();
    void orderPizza();
    void prepare();
    void bake();
    void cut();
    void box();
}

class NyStyleCheesePizza implements Pizza {
    public void createPizza() {
        System.out.println("Pizza NyStyleCheesePizza is created");
    }

    public void orderPizza() {
        System.out.println("Pizza NyStyleCheesePizza order is placed");
    }

    public void prepare() {
        System.out.println("Pizza NyStyleCheesePizza is prepared");
    }

    public void bake() {
        System.out.println("Pizza NyStyleCheesePizza is baked");
    }

    public void cut() {
        System.out.println("Pizza NyStyleCheesePizza is cut");
    }

    public void box() {
        System.out.println("Pizza NyStyleCheesePizza is boxed");
    }
}

class ChicagoCheesePizza implements Pizza {
    public void createPizza() {
        System.out.println("Pizza ChicagoCheesePizza is created");
    }

    public void orderPizza() {
        System.out.println("Pizza ChicagoCheesePizza order is placed");
    }

    public void prepare() {
        System.out.println("Pizza ChicagoCheesePizza is prepared");
    }

    public void bake() {
        System.out.println("Pizza ChicagoCheesePizza is baked");
    }

    public void cut() {
        System.out.println("Pizza ChicagoCheesePizza is cut");
    }

    public void box() {
        System.out.println("Pizza ChicagoCheesePizza is boxed");
    }
}

class PizzaFactory {
    public Pizza getInt(String str) {
        if (str.equalsIgnoreCase("ChicagoCheesePizza")) {
            return new ChicagoCheesePizza();
        } else if (str.equalsIgnoreCase("NyStyleCheesePizza")) {
            return new NyStyleCheesePizza();
        }
        return null;
    }
}
