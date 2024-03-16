package com.comrade.java_13.textblock;

public class TextBlocksClient {
    public static void main(String[] args) {
        basicTextBlockOperations();
        String phone= """
                      Phone: 9347983059
                      Email: dasarishiva1@gmail.com
                      """;
        passingParameter(phone);
        formatter();
    }

    private static void formatter() {
        String table= """
                      1 * 1 = %d
                      1 * 2 = %d
                      1 * 3 = %d
                      1 * 4 = %d
                      1 * 5 = %d
                      """;
        System.out.println(table.formatted(1,2,3,4,5));
    }

    private static void passingParameter(String phone) {
        String addressUsingTextBlock= """ 
                                      Dasari Shiva s/o Mattaiah,
                                      H-no:2-239,Church street,
                                      Thalla Malkapuram(Vi),Garidepally(M),
                                      Suryapet(dist),Telanagana-508201
                                      """+phone+"""
                                      """;
        System.out.println(addressUsingTextBlock);
        System.out.println(addressUsingTextBlock.indent(2));
        return;
    }

    private static void basicTextBlockOperations() {
        String address="Dasari Shiva s/o Mattaiah,\n" +
                       "H-no:2-239,Church street,\n" +
                       "Thalla Malkapuram(Vi),Garidepally(M),\n" +
                       "Suryapet(dist),Telanagana-508201";
        System.out.println(address);
        String addressUsingTextBlock= """ 
                                      Dasari Shiva s/o Mattaiah,
                                      H-no:2-239,Church street,
                                      Thalla Malkapuram(Vi),Garidepally(M),
                                      Suryapet(dist),Telanagana-508201
                                      """;

        System.out.println(addressUsingTextBlock);
        System.out.println(address.equals(addressUsingTextBlock));
    }


}