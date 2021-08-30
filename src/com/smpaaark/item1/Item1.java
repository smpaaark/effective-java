package com.smpaaark.item1;

import java.util.EnumSet;

public class Item1 {

    public static void main(String[] args) {
        Boolean booleanVal = Boolean.valueOf(false);
        if (booleanVal) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        EnumSet<SampleEnum> sampleEnums = EnumSet.noneOf(SampleEnum.class);
    }

}