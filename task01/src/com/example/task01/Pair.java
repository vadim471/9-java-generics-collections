package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<F, S> {
    // TODO напишите реализацию
    private final F first;
    private final S second;

    public F getFirst(){
        return first;
    }
    public S getSecond(){
        return second;
    }

    private Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object object){
        if (this.first == object || this.second == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) object;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }


    public int hashCode(){
        return Objects.hash(first, second);
    }

    public void ifPresent(BiConsumer<? super F, ? super S> consumer) {
        if (first != null && second != null) {
            consumer.accept(first, second);
        }
    }
    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }
}
