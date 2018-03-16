package lab2;

import javax.lang.model.type.NullType;

public abstract class FSM {
    protected States currentState;

    private Events recognizeEvent(char symbol){
        Events event = Events.ANY;
        if(symbol == '+') event = Events.PLUS;
        else if(symbol >= '0' && symbol <= '9') event = Events.DIGIT;
        else if(symbol >= 'A' && symbol <= 'Z') event = Events.CAPSLETTER;
        return event;
    }

    public boolean scanString(String input){
        if(input == null) return false;
        currentState = States.Q0;
        char[] symbols = input.toCharArray();
        for (char ch : symbols) {
            Events event = recognizeEvent(ch);
            currentState = nextState(event);
            if(currentState == States.ERROR) return false;
        }
        return currentState == States.Q2 || currentState == States.Q3;
    }

    protected abstract States nextState(Events event);
}
