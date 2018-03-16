package lab2.stateFSM.concreteStates;

import lab2.Events;
import lab2.stateFSM.State;
import lab2.stateFSM.StateFSM;

public class Q1 extends State {
    @Override
    public void changeState(StateFSM stateFSM, Events event) {
        if(event == Events.DIGIT){
            stateFSM.setCurrentState(new Q2());
        }
        else {
            super.changeState(stateFSM, event);
        }

    }
}
