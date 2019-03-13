package com.zipcodewilmington.looplabs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
    
    public Integer[] removeDuplicates(int Duplicates) {
        return Arrays.stream(array).filter(i -> Collections.frequency(Arrays.asList(array), i) < Duplicates)
                .toArray(Integer[]::new);
        
    }
    
    public Integer[] removeDuplicatesExactly(int Duplicates) {
        return Arrays.stream(array).filter(i -> Collections.frequency(Arrays.asList(array), i) != Duplicates)
                .toArray(Integer[]::new);
    }
    
    
}
