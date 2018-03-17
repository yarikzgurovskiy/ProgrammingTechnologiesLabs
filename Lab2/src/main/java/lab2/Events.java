package lab2;

public enum Events {
    PLUS, DIGIT, CAPSLETTER, ANY;

    public static Events recognizeEvent(char symbol){
        Events event = Events.ANY;
        if(symbol == '+') event = Events.PLUS;
        else if(Character.isDigit(symbol)) event = Events.DIGIT;
        else if(Character.isUpperCase(symbol)) event = Events.CAPSLETTER;
        return event;
    }
}
