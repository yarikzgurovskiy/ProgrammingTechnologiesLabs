package lab2.stateFSM.concreteStates;

import lab2.Events;
import lab2.stateFSM.State;
import lab2.stateFSM.StateFSM;

public class Q2 extends State {
    @Override
    public void changeState(StateFSM stateFSM, Events event) {
        if(event == Events.DIGIT) {
            return;
        } else if(event == Events.CAPSLETTER){
            stateFSM.setCurrentState(new Q3());
        } else {
            super.changeState(stateFSM, event);
        }
    }
}
