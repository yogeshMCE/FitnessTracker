package Dao;

public class FitnessDao {
    public double DistanceCovered(int Steps){
        return Steps * 0.76 / 1000;
    }
    public double CaloriesBurned(int Steps){
        return Steps * 0.05;
    }
}
