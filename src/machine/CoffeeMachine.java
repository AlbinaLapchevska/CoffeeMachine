package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int Water = 400;
    public static int Milk = 540;
    public static int Beans = 120;
    public static int Cups = 9;
    public static int Money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String choise = scanner.nextLine();

        while (!choise.equals("exit")) {
            if (choise.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                String what = scanner.nextLine();
                switch (what) {
                    case "1": {buyEspresso();break;}
                    case "2": {buyLate();break;}
                    case "3": {buyCappucino();break;}
                }
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");


            } else if (choise.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int add = scanner.nextInt();
                Water = Water + add;
                System.out.println("Write how many ml of milk you want to add: ");
                int add2 = scanner.nextInt();
                Milk = Milk + add2;
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int add3 = scanner.nextInt();
                Beans = Beans + add3;
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int add4 = scanner.nextInt();
                Cups = Cups + add4;
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");


            } else if (choise.equals("take")) {
                System.out.println("I gave you $" + Money);
                Money = 0;
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");

            } else if (choise.equals("remaining")) {
                remaining();
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");

            }

            choise = scanner.nextLine();
        }
    }

    public static void remaining() {
        System.out.println("The coffee machine has:\n"
                + Water + " ml of water\n" +
                Milk + " ml of milk\n" +
                Beans + " g of coffee beans\n" +
                Cups + " disposable cups\n" + "$" +
                Money + " of money");
    }

    public static void buyEspresso() {
        if (Water >= 250 && Beans >= 16 && Cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            Water = Water - 250;
            Beans = Beans - 16;
            Money = Money + 4;
            Cups--;
        } else if (Water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (Beans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (Cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }

    public static void buyLate() {
        if (Water >= 350 && Beans >= 20 && Cups >= 1 && Milk >= 75) {
            System.out.println("I have enough resources, making you a coffee!");
            Water = Water - 350;
            Milk = Milk - 75;
            Beans = Beans - 20;
            Money = Money + 7;
            Cups--;
        } else if (Water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (Beans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (Cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (Milk < 75) {
            System.out.println("Sorry, not enough milk!");
        }
    }

    public static void buyCappucino() {
        if (Water >= 200 && Beans >= 12 && Cups >= 1 && Milk >= 100) {
            System.out.println("I have enough resources, making you a coffee!");
            Water = Water - 200;
            Milk = Milk - 100;
            Beans = Beans - 12;
            Money = Money + 6;
            Cups--;

        } else if (Water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (Beans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (Cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (Milk < 100) {
            System.out.println("Sorry, not enough milk!");
        }
    }

}
