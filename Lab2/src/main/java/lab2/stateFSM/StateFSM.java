package lab2.stateFSM;

import lab2.Events;
import lab2.stateFSM.concreteStates.Error;
import lab2.stateFSM.concreteStates.Q0;
import lab2.stateFSM.concreteStates.Q2;
import lab2.stateFSM.concreteStates.Q3;

public class StateFSM {
    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public boolean scanString(String input){
        if(input == null) return false;
        currentState = new Q0();
        char[] symbols = input.toCharArray();
        for (char ch : symbols) {
            Events event = Events.recognizeEvent(ch);
            currentState.changeState(this, event);
            if(currentState instanceof Error) return false;
        }
        return currentState instanceof Q2 || currentState instanceof Q3;
    }
}
