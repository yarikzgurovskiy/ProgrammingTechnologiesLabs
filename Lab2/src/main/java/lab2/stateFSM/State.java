package lab2.stateFSM;

import lab2.Events;
import lab2.stateFSM.concreteStates.Error;

public abstract class State {

    public void changeState(StateFSM stateFSM, Events event){
        stateFSM.setCurrentState(new Error());
    }
}
