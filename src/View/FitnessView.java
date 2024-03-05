package View;

import Constant.Color;
import Controller.FitnessController;

import java.util.Scanner;

public class FitnessView implements Color {

   private final Scanner scanner;
   private final FitnessController fitnessController;

    public FitnessView(FitnessController fitnessController) {
        this.scanner = new Scanner(System.in);
        this.fitnessController= fitnessController;
    }


    public void Display(){
       int Steps = 1;
        while(Steps !=0){
            System.out.println(MENU_TEXT+"Enter Your Steps Count and For Exit Enter 0: ");
             Steps= scanner.nextInt();
            if(Steps!=0)processStepCounts(Steps);
        }
    }
    private void processStepCounts(int Steps){
        Response response = fitnessController.processStepCounts(Steps);
        System.out.println(response.data);
    }

}
