import java.util.Locale;
import java.util.Scanner;

public class Game {
    public void play() throws InterruptedException {
        Instruction instruction = new Instruction();
        instruction.showInstruction();

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("You are now at " + controller.currentLocation.getName());
            System.out.println();
            System.out.println("Where would you like to go? ");
            System.out.println(">");
            String choice = scanner.nextLine().toLowerCase();
            String[] arrayChoice = choice.split(" ");
            System.out.println(arrayChoice[0]);
            switch (arrayChoice[0]) {
                case "look":
                    controller.look(controller.currentLocation, arrayChoice[1]);
                    break;

                case "go":
                    controller.go(controller.currentLocation, arrayChoice[1]);
                    break;

                default:
                    System.out.println("Invalid Command");
            }
        }


    }


}