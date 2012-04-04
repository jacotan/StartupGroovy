package org.startupgroovy.vendingmachine

/**
 * Created by IntelliJ IDEA.
 * User: okudagyo
 * Date: 12/02/18
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public enum Coin {
    Jyuen(10),Gojyuen(50),Hyakuen(100),Gohyakuen(500),Senen(1000)
    Coin(int value){this.value = value}
    private final int value
    public int value(){return value}
}