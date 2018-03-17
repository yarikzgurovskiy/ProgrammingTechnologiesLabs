package lab2;


public abstract class FSM {
    protected States currentState;

    public boolean scanString(String input){
        if(input == null) return false;
        currentState = States.Q0;
        char[] symbols = input.toCharArray();
        for (char ch : symbols) {
            Events event = Events.recognizeEvent(ch);
            currentState = nextState(event);
            if(currentState == States.ERROR) return false;
        }
        return currentState == States.Q2 || currentState == States.Q3;
    }

    protected abstract States nextState(Events event);
}
