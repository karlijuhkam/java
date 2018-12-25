package com.karlijuhkam;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int numberOfRows = 5;
        int numberOfSpases = numberOfRows - 1;
        int numberOfSymbols = numberOfRows * 2 - 1;

        String spaces = "", symbols = "";

        spaces = String.join("", Collections.nCopies(numberOfSpases, " "));
        symbols = String.join("", Collections.nCopies(numberOfSymbols, "*"));
        symbols = spaces + symbols;

        for (int r = 0; r < numberOfRows; r++) {
            System.out.println(symbols.substring(r, numberOfRows + 2 * r));
        }
    }
}
