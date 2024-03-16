package com.comrade.oops.object;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
public class ObjectClassClient {
    public static void main(String[] args) {
        //objectgetClassMethod();

        //teaGetClassMethod();
        //toStringFunctionality();
        //hashcodeFunctionality(object);
        //equalsMethodFunctionality();

        try {
            Tea masalaTea = new Tea("Masala", 10.40, new Sugar(12));
            Tea clonedMasalaTea=(Tea)masalaTea.clone();
            masalaTea.setRate(1222.00);
            masalaTea.getSugar().setNoOfTeaSpoons(4);
            System.out.println("Original object:"+masalaTea);
            System.out.println("Cloned object:"+clonedMasalaTea);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static void equalsMethodFunctionality() {
        Tea masalaTea = new Tea("Masala", 10.40);//X
        Tea masalaTea1 = new Tea("Masala", 10.40);//Y
        Tea masalaTea2 = masalaTea;//X
        boolean isEquals=masalaTea.equals(masalaTea1);
        System.out.println("isEquals:"+isEquals);
        isEquals=masalaTea2.equals(masalaTea);
        System.out.println("isEquals:"+isEquals);
        System.out.println(masalaTea.getRate().equals(masalaTea1.getRate()));
    }

    private static void teaGetClassMethod() {
        Tea masalaTea = new Tea("Masala", 10.40);
        System.out.println(masalaTea.getClass());
        Method[] methods = masalaTea.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
            //System.out.println(methods[i].getModifiers());
            Parameter[] parameters = methods[i].getParameters();
            for (int j = 0; j < parameters.length; j++) {
                System.out.println(parameters[j].getName());
                System.out.println(parameters[j].getType());
            }
        }
    }

    private static void objectgetClassMethod() {
        Object object = new Object();
        Method[] methods=object.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
    }

    private static void toStringFunctionality() {
        Tea masalaTea = new Tea("Masala", 10.40);
        System.out.println(masalaTea.toString());
    }

    private static void hashcodeFunctionality(Object object) {
        hashcodeMethod(object);
        Tea masalaTea = new Tea("Masala", 10.40);
        masalaTeaAddress("Masala",masalaTea);
        Tea gngerTea = new Tea("Ginger", 11.00);
        masalaTeaAddress("Ginger",gngerTea);
        gngerTea=masalaTea;
        masalaTeaAddress("Ginger",gngerTea);
        masalaTeaAddress("Masala",masalaTea);
    }

    private static void masalaTeaAddress(String teatTye,Tea masalaTea) {
        int addressOfMasalaTea=masalaTea.hashCode();
        System.out.println(teatTye+":"+addressOfMasalaTea);
    }

    private static void hashcodeMethod(Object object) {
        //hashcode
        int addressOfObject=object.hashCode();
        System.out.println("Addrees:"+addressOfObject);
    }

}
