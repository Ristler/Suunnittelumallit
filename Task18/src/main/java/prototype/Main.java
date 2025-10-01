package prototype;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Recommendation> allRecommendations = new ArrayList<>();
        Book book = new Book("Author testi", "Otsikko", "School", 1997);
        Book book2 = new Book("moikka", "title", "amk", 1993);
        Recommendation recommendation = new Recommendation("Students");
        Recommendation recommendation2 = new Recommendation("AMK");

        allRecommendations.add(recommendation);
        allRecommendations.add(recommendation2);
        recommendation.addBook(book);
        recommendation2.addBook(book2);

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while(choice != 0) {
            System.out.println("1. View existing recommendations");
            System.out.println("2. Clone recommendations");
            System.out.println("3. Modify recommendations");
            System.out.println("0. Quit");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    for (Recommendation r : allRecommendations) {
                        System.out.println(r);
                    }
                    break;

                case 2:
                    System.out.println("Available recommendations to clone:");
                    scanner.nextLine();
                    for (int i = 0; i < allRecommendations.size(); i++) {
                        System.out.println(i + 1 + ": " + allRecommendations.get(i));
                    }

                    System.out.println("Choose which recommendation to clone");
                    int toClone = 0;

                    try {
                        toClone = scanner.nextInt() - 1;
                        scanner.nextLine();

                    } catch (InputMismatchException e) {
                        System.out.println("You should input valid integer not a string.");
                        scanner.nextLine();
                        break;
                    }
                    if (toClone >= 0 && toClone < allRecommendations.size()) {
                        Recommendation clonedRecommendation = allRecommendations.get(toClone).clone();
                        allRecommendations.add(clonedRecommendation);
                        System.out.println("Cloned!");
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;

                case 3:
                    System.out.println("Available recommendations to modify:");
                    for(int i = 0; i < allRecommendations.size(); i++) {
                        System.out.println(i + 1 + ": "+ allRecommendations.get(i));
                    }

                    System.out.println("Choose which recommendation to modify");
                    int toModify = 0;
                    try {
                        toModify = scanner.nextInt() - 1;
                        scanner.nextLine();

                    } catch (InputMismatchException e) {
                        System.out.println("You should input valid integer not a string.");
                        scanner.nextLine();
                        break;
                    }
                    if(toModify >= 0 && toModify < allRecommendations.size()) {
                        System.out.println("New target audience");
                        String newTargetAudience = scanner.nextLine();
                        allRecommendations.get(toModify).changeTargetAudience(newTargetAudience);
                    } else {
                        System.out.println("Invalid option");

                    }
                    break;
            }
        }
    }
}
