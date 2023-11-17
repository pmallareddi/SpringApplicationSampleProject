package com.sping.sample.springBootApplication;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers){

        return numbers;
    }
}
