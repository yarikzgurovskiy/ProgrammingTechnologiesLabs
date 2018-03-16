package lab2;

public class SwitchFSM extends FSM {

    @Override
    protected States nextState(Events event) {
        switch (currentState){
            case Q0:{
                switch (event){
                    case PLUS: return States.Q1;
                    default: return States.ERROR;
                }
            }
            case Q1:{
                switch(event){
                    case DIGIT: return States.Q2;
                    default: return States.ERROR;
                }
            }
            case Q2:{
                switch (event){
                    case DIGIT: return States.Q2;
                    case CAPSLETTER: return States.Q3;
                    default: return States.ERROR;
                }
            }
            case Q3:{
                switch (event){
                    case CAPSLETTER: return States.Q3;
                    default: return States.ERROR;
                }
            }
        }
        return States.ERROR;
    }
}
