package lab2.transTableFSM;

import javafx.util.Pair;
import lab2.Events;
import lab2.States;

import java.util.HashMap;

public class TransTable {
    public HashMap<Pair<States, Events>, States> transitions = new HashMap<>();

    private void addTransition(Transition transition){
        transitions.put(transition.getTransKey(), transition.getEndState());
    }

    public void buildTransitions(){
        addTransition(new Transition(States.Q0, Events.PLUS, States.Q1));
        addTransition(new Transition(States.Q1, Events.DIGIT, States.Q2));
        addTransition(new Transition(States.Q2, Events.DIGIT, States.Q2));
        addTransition(new Transition(States.Q2, Events.CAPSLETTER, States.Q3));
        addTransition(new Transition(States.Q3, Events.CAPSLETTER, States.Q3));
    }
}
