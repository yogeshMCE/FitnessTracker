package Controller;

import Service.FitnessService;
import View.FitnessView;
import View.Response;

public class FitnessController {
    private final FitnessView fitnessView;
    private final FitnessService fitnessService;

    public FitnessController() {
        this.fitnessView = new FitnessView(this);
        this.fitnessService=new FitnessService();
    }

    public void Start(){
        fitnessView.Display();
    }

    public Response processStepCounts(int steps){
        return fitnessService.processStepCounts(steps);
    }
}
