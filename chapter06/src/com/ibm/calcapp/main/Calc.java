package com.ibm.calcapp.main;
public class Calc {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b =2;
        int total = com.ibm.calcapp.logics.CalcLogic.add(a,b);
        int delta = com.ibm.calcapp.logics.CalcLogic.sub(a,b);

        System.out.println("足すと" + total + "引くと" + delta);
    }
}
