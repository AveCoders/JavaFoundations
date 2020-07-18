package com.avecoder.javafoundations.polymorphism;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DynamicPolymorphismTest {

    @Test
    public void testDynamicPolymorphism() {
        List<Mammal> mammals = new ArrayList<>();
        mammals.add(new Mammal());
        mammals.add(new Cat());
        mammals.add(new Dog());
        mammals.add(new Caesar());

        for(Mammal mammal : mammals) {
            mammal.name();
        }

    }
}
