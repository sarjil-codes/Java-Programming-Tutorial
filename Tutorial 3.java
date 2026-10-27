import java.util.Scanner;
import java.util.Random;

public class Tutorial {

```
// Q1: Calculator
public static void q1() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter two integer numbers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    System.out.print("Enter the operand: ");
    char operand = scanner.next().charAt(0);

    switch (operand) {
        case '+':
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
        case '-':
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        case '*':
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            break;
        case '/':
            if (num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero.");
            }
            break;
        case '%':
            if (num2 != 0) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            } else {
                System.out.println("Error: Division by zero.");
            }
            break;
        default:
            System.out.println("Invalid operand.");
    }
}

// Q2: Random Number to Word
public static void q2() {
    Random rand = new Random();
    int num = rand.nextInt(6);

    String word;

    switch (num) {
        case 0: word = "zero"; break;
        case 1: word = "one"; break;
        case 2: word = "two"; break;
        case 3: word = "three"; break;
        case 4: word = "four"; break;
        case 5: word = "five"; break;
        default: word = "unknown"; break;
    }

    System.out.println(num + " is " + word + ".");
}

// Q3: Sales Commission
public static void q3() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter sales volume: ");
    double sales = scanner.nextDouble();

    double rate;

    if (sales <= 100) {
        rate = 0.05;
    } else if (sales <= 500) {
        rate = 0.075;
    } else if (sales <= 1000) {
        rate = 0.10;
    } else {
        rate = 0.125;
    }

    double commission = sales * rate;
    System.out.printf("Commission: %.2f%n", commission);
}

// Q4: Two-Player Dice Game
public static void q4() {
    Random rand = new Random();

    int p1_roll1 = rand.nextInt(6) + 1;
    int p1_roll2 = rand.nextInt(6) + 1;
    int p1_total = p1_roll1 + p1_roll2;

    int p2_roll1 = rand.nextInt(6) + 1;
    int p2_roll2 = rand.nextInt(6) + 1;
    int p2_total = p2_roll1 + p2_roll2;

    System.out.println("Player 1 rolls: " + p1_roll1 + " and "
            + p1_roll2 + " (Total: " + p1_total + ")");
    System.out.println("Player 2 rolls: " + p2_roll1 + " and "
            + p2_roll2 + " (Total: " + p2_total + ")");

    if (p1_total > p2_total) {
        System.out.println("Player 1 wins!");
    } else if (p2_total > p1_total) {
        System.out.println("Player 2 wins!");
    } else {
        System.out.println("It's a tie!");
    }
}

// Q5: Simultaneous Equations
public static void q5() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a, b, c, d, e, f: ");

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
    double f = scanner.nextDouble();

    double denominator = a * d - b * c;

    if (denominator == 0) {
        System.out.println("The equation has no solution");
    } else {
        double x = (e * d - b * f) / denominator;
        double y = (a * f - e * c) / denominator;

        System.out.println("x = " + x + ", y = " + y);
    }
}

// Q6: Point Inside, On, or Outside a Circle
public static void q6() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter radius of circle: ");
    double radius = scanner.nextDouble();

    System.out.print("Enter point coordinates (x y): ");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    double distanceSquared = x * x + y * y;
    double radiusSquared = radius * radius;

    if (distanceSquared < radiusSquared) {
        System.out.println("Point (" + x + ", " + y + ") is INSIDE the circle.");
    } else if (distanceSquared == radiusSquared) {
        System.out.println("Point (" + x + ", " + y + ") is ON the circle.");
    } else {
        System.out.println("Point (" + x + ", " + y + ") is OUTSIDE the circle.");
    }
}

// Main Method
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("===== Java Programming Questions =====");
    System.out.println("1. Calculator");
    System.out.println("2. Random Number to Word");
    System.out.println("3. Sales Commission");
    System.out.println("4. Dice Game");
    System.out.println("5. Simultaneous Equations");
    System.out.println("6. Point and Circle");

    System.out.print("Choose a question (1-6): ");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1: q1(); break;
        case 2: q2(); break;
        case 3: q3(); break;
        case 4: q4(); break;
        case 5: q5(); break;
        case 6: q6(); break;
        default:
            System.out.println("Invalid choice.");
    }
}
```

}
