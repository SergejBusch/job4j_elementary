package ru.job4j.stream;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {

        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false)
                .flatMap(i -> StreamSupport.stream(Spliterators.spliteratorUnknownSize(i, 0), false))
                .map(n -> n).collect(Collectors.toList());
    }
}
