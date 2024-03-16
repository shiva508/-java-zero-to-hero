package com.comrade.java_12.compactnumberformatting;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class CompactNumberFormattingClient {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1000, 1000000, 1000000000);
        numberFormateConverter(numbers, Locale.US);
        System.out.println("<==============================================>");
        numberFormateConverter(numbers, Locale.CHINA);
        System.out.println("<==============================================>");
        numberFormateConverterRounding(numbers, Locale.US);
        System.out.println("<==============================================>");
        numberFormateConverterRounding(numbers, Locale.CHINA);
        System.out.println("<==============================================>");
        numberFormateConverterParse(Locale.US);
        System.out.println("<==============================================>");
        numberFormateConverterParse(Locale.CHINA);
        System.out.println("<==============================================>");
    }

    private static void numberFormateConverterParse(Locale locale) {
        NumberFormat numberFormat=NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);

        try {
            Number number = numberFormat.parse("1K");
            System.out.println(number);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        numberFormat=NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
        try {
            Number number = numberFormat.parse("1 thousand");
            System.out.println(number);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static void numberFormateConverterRounding(List<Integer> numbers, Locale locale) {
        numbers.forEach(number->{
            NumberFormat numberFormat =  NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
            numberFormat.setRoundingMode(RoundingMode.HALF_EVEN);
            String numString = numberFormat.format(number);
            System.out.println(numString);
        });

        numbers.forEach(number->{
            NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
            numberFormat.setRoundingMode(RoundingMode.HALF_EVEN);
            String numString = numberFormat.format(number);
            System.out.println(numString);
        });
    }


    private static void numberFormateConverter(List<Integer> numbers, Locale locale) {
        numbers.forEach(number->{
            NumberFormat numberFormat =  NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
            String numString = numberFormat.format(number);
            System.out.println(numString);
        });

        numbers.forEach(number->{
           NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
            String numString = numberFormat.format(number);
            System.out.println(numString);
        });
    }
}
