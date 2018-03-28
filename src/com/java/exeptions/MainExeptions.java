package com.java.exeptions;

import java.util.ArrayList;

public class MainExeptions {
    public static void main(String[] args) {
        Coin coin = null;
        try {
            coin = new Coin(5);
        } catch (CoinLogicException e) {
            e.printStackTrace();
        }
        try {
            coin.setDiameter(5);
        } catch (CoinLogicException e) {
            e.printStackTrace();
        }

        System.out.println("kfnvcdscdscdsc");
        assert (1<0): "Error!!!!!!";
        System.out.println("dscdscdsc");


    }
}


class Coin {
    private double diameter;
    private double weight;

    Coin(double value) throws CoinLogicException {
        this.diameter = value;
    }
    
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) throws CoinLogicException {
        if (value <= 0) {
            throw new CoinLogicException("diameter is incorrect");
        }
        diameter = value;
    }
}

class CoinLogicException extends Exception {
    public CoinLogicException() {
        System.out.println("error");
    }

    public CoinLogicException(String message, Throwable exception) {
        super(message, exception);
    }

    public CoinLogicException(String message) {
        super(message);
    }

    public CoinLogicException(Throwable exception) {
        super(exception);
    }
}

class CoinSmall extends Coin{
    CoinSmall(int value) throws Exception {
        super(value);
    };
    
    @Override
    public double getDiameter() {
        return super.getDiameter();
    }

    @Override
    public void setDiameter(double value) throws CoinLogicException {
        super.setDiameter(value);
    }
}











