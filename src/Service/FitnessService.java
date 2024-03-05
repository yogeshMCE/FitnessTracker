package Service;

import Dao.FitnessDao;
import Model.User;
import View.Response;

public class FitnessService {

    private final FitnessDao fitnessDao;

    public FitnessService() {
        this.fitnessDao = new FitnessDao();
    }

    public Response processStepCounts(int Steps){
      Object obj= "";
      boolean Status=false;
      double DistanceTravelled= fitnessDao.DistanceCovered(Steps);
      double CaloriesBurned= fitnessDao.CaloriesBurned(Steps);
      User user= new User(Steps,DistanceTravelled,CaloriesBurned);
      return new Response(Status,user);

    }
}
