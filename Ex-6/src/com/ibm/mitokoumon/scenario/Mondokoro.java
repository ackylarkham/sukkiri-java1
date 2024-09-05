package com.ibm.mitokoumon.scenario;

public class Mondokoro {
    public static void showMondokoro() {
        System.out.println("助さん、格さん。もういいでしょう。");
        System.err.println("この紋所が目に入らぬか！");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Togame.doTogame();
    }
}
