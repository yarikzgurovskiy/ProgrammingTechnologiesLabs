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
            Events event = recognizeEvent(ch);
            currentState.changeState(this, event);
            if(currentState instanceof Error) return false;
        }
        return currentState instanceof Q2 || currentState instanceof Q3;
    }
    private Events recognizeEvent(char symbol){
        Events event = Events.ANY;
        if(symbol == '+') event = Events.PLUS;
        else if(symbol >= '0' && symbol <= '9') event = Events.DIGIT;
        else if(symbol >= 'A' && symbol <= 'Z') event = Events.CAPSLETTER;
        return event;
    }
}
