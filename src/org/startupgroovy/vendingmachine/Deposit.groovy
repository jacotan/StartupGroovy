package org.startupgroovy.vendingmachine

/**
 * Created by IntelliJ IDEA.
 * User: jacotan
 * Date: 12/02/18
 * Time: 16:52
 * To change this template use File | Settings | File Templates.
 */
class Deposit {
    Map<Coin,Integer> stock;

    Deposit(){
        stock = [Coin.Jyuen:0 ,Coin.Gojyuen:0,Coin.Hyakuen:0,Coin.Gohyakuen:0,Coin.Senen:0]
    }

    //コインいっこいれる
    public void drop(Coin coin){
    }

    //集計する
    public int sumup(){

    }
}
