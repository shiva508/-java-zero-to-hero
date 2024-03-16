package com.comrade.java_15.sealed.inerface;

public sealed interface AtmService permits SbiAtmService {
    public void transferMoney();
}
