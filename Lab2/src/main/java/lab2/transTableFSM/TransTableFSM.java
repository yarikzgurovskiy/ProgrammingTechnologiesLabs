package lab2.transTableFSM;


import javafx.util.Pair;
import lab2.Events;
import lab2.FSM;
import lab2.States;

public class TransTableFSM extends FSM {
    private TransTable transTable;

    public TransTableFSM(){
        transTable = new TransTable();
        transTable.buildTransitions();
    }
    @Override
    protected States nextState(Events event) {
        return transTable.transitions.getOrDefault(new Pair<>(currentState, event), States.ERROR);
    }
}
