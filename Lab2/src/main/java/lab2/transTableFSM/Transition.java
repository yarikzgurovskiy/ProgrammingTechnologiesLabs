package lab2.transTableFSM;

import javafx.util.Pair;
import lab2.Events;
import lab2.States;

public class Transition {
    private Pair<States, Events> transKey;
    private States endState;
    Transition(States startState, Events trigger, States endState){
        this.transKey = new Pair<>(startState, trigger);
        this.endState = endState;
    }

    public Pair<States, Events> getTransKey() {
        return transKey;
    }

    public States getEndState() {
        return endState;
    }
}
