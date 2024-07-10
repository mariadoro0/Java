package com.mariadoro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunzionaleDemo {
    public static void main(String[] args) {
        Stream<String> of = Stream.of("do","re","mi","fa","sol","la","si");
        of.filter(nota -> nota.endsWith("o")).forEach(n-> System.out.println(n));

        IntStream voti = IntStream.of(24,23,25,28,30,30,28,21,27);
        IntSummaryStatistics sm = voti.summaryStatistics();
        try {
            List<String> lines = Files.readAllLines(Paths.get("W:\\SWD23-25\\comune\\magazzino.txt"));
            lines.stream().forEach(Libro::new);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
