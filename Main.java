
import java.util.Scanner;

// Parent Class
class Workout {
    String type;
    int duration;

    public void showWorkout() {
        System.out.println("Workout: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

// Child Class
class RunningWorkout extends Workout {
    double distance;

    public void showDetails() {
        System.out.println("--- Workout Summary ---");
        super.showWorkout();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Calories burned: " + (distance * 60));
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RunningWorkout workout = new RunningWorkout();

        System.out.print("Enter workout type: ");
        workout.type = input.nextLine();

        System.out.print("Enter duration (minutes): ");
        workout.duration = input.nextInt();

        System.out.print("Enter distance (km): ");
        workout.distance = input.nextDouble();

        workout.showDetails();

        input.close();
    }
}
