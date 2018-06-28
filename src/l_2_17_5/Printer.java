package l_2_17_5;

import java.util.Optional;

public class Printer {

    public void whenCreatesEmptyOptional_thenCorrect() {
        Optional<String> empty = Optional.empty();

    }

    public static void main(String[] args) {
        Printer printer=new Printer();
        printer.whenCreatesEmptyOptional_thenCorrect();
    }

}