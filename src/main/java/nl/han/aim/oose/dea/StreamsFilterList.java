package nl.han.aim.oose.dea;

import java.awt.font.NumericShaper;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {

        return input.stream()
                .filter(s->s.length() < 3)
                .collect(Collectors.toList());



    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {


        return input.stream()
                .filter(s -> s.chars().anyMatch(Character::isDigit))
                .collect(Collectors.toList());
        // het is lastig om te bepalen wat ik moet gebruiken van operations

    }
}
