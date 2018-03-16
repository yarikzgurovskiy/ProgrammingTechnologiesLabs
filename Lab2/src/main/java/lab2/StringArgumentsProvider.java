package lab2;

import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;

class StringArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of("asdasd", false),
                Arguments.of(null, false),
                Arguments.of("+56565656", true),
                Arguments.of("+", false),
                Arguments.of("+D", false)
        );
    }
}
