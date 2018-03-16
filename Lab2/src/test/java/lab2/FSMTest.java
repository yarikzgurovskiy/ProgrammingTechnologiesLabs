package lab2;
import lab2.stateFSM.StateFSM;
import lab2.transTableFSM.TransTableFSM;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {
    private static SwitchFSM switchFSM;
    private static TransTableFSM transTableFSM;
    private static StateFSM stateFSM;

    @BeforeAll
    static void createFSM(){
        switchFSM = new SwitchFSM();
        transTableFSM = new TransTableFSM();
        stateFSM = new StateFSM();
    }

    private static Stream<String> incorrectStringProvider(){
        return Stream.of(null, "", "+", "+F2", "+FF", "+3s", "3F", "+3F4", "+3+3FF");
    }

    @ParameterizedTest
    @ValueSource(strings = {"+00ASAS", "+3", "+232323423423F", "+1DFDFDQ" })
    void testCorrectStringsWithValueSource(String arg) {
        assertAll("Value Source",
                () -> assertTrue(stateFSM.scanString(arg)),
                () -> assertTrue(transTableFSM.scanString(arg)),
                () -> assertTrue(switchFSM.scanString(arg)));

    }

    @ParameterizedTest
    @MethodSource("incorrectStringProvider")
    void testIncorrectStringsWithMethodSource(String arg){
        assertAll("Method Source",
                () -> assertFalse(stateFSM.scanString(arg)),
                () -> assertFalse(switchFSM.scanString(arg)),
                () -> assertFalse(transTableFSM.scanString(arg)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testArguments.csv")
    void testMachineWithCSVFileSource(String arg, boolean result){
        assertAll("csvFileSource",
                () -> assertEquals(stateFSM.scanString(arg), result),
                () -> assertEquals(switchFSM.scanString(arg), result),
                () -> assertEquals(transTableFSM.scanString(arg), result));
    }

    @ParameterizedTest
    @ArgumentsSource(StringArgumentsProvider.class)
    void testMachineWithArgumentsSource(String arg, boolean result){
        assertAll("ArgumentsSource",
                () -> assertEquals(stateFSM.scanString(arg), result),
                () -> assertEquals(switchFSM.scanString(arg), result),
                () -> assertEquals(transTableFSM.scanString(arg), result)
        );
    }
}
