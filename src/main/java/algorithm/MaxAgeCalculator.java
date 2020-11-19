package algorithm;

import java.util.List;

public class MaxAgeCalculator {
    public  Trainer trainerWithMaxAge(List<Trainer> trainers){
        Trainer localTrainer = null;
        for (Trainer i : trainers){
            if (localTrainer==null || i.getAge() > localTrainer.getAge()){
                localTrainer = i;
            }
        }
        return localTrainer;
    }

    public boolean trainerWithMinAge(List<Trainer> trainers, int min){
        boolean value = false;
        for (Trainer i : trainers){
            if (i.getAge() > min){
                value = true;
            }
        }
        return value;
    }
}
