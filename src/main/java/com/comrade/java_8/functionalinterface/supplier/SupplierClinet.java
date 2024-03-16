package com.comrade.java_8.functionalinterface.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierClinet {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        simpleSuplier();
        suplierWithDateFormate();
    }

    private static void suplierWithDateFormate() {
        Supplier<LocalDateTime> supplierDatae = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplierDatae.get();
        Supplier<String> formatedDate = () -> dtf.format(localDateTime);
        System.out.println(formatedDate.get());
    }

    private static void simpleSuplier() {
        Supplier<Integer> randNumber = () -> new Random().nextInt(100);
        Integer randomVal = randNumber.get();
        System.out.println(randomVal);
    }
}
