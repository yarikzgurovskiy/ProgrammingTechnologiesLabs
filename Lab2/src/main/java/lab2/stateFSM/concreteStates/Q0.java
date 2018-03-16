package lab2.stateFSM.concreteStates;

import lab2.Events;
import lab2.stateFSM.State;
import lab2.stateFSM.StateFSM;

public class Q0 extends State {
    @Override
    public void changeState(StateFSM stateFSM, Events event) {
        if(event == Events.PLUS){
            stateFSM.setCurrentState(new Q1());
        }
        else {
            super.changeState(stateFSM, event);
        }
    }
}
