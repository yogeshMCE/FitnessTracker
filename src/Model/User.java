package Model;

public class User {
    int count = 0;
    int id;
    int StepsTaken;
    double DistanceCovered;
    double CaloriesBurned;


    public User(int stepsTaken, double distanceCovered, double caloriesBurned) {
        count++;
        this.id = count;
        StepsTaken = stepsTaken;
        DistanceCovered = distanceCovered;
        CaloriesBurned = caloriesBurned;
    }

    @Override
    public String toString() {
        return  "Total Steps are: " +
                StepsTaken + " and You Have Covered Total: " +
                DistanceCovered + "Km Distance and have Burned: " +
                CaloriesBurned+" Calories";
    }

    public int getStepsTaken() {
        return StepsTaken;
    }

    public double getDistanceCovered() {
        return DistanceCovered;
    }

    public double getCaloriesBurned() {
        return CaloriesBurned;
    }
}


