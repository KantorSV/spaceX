package com.app02.rever.array;

import com.app01.Swap.MySwap;

public class MyRevert {

    public  void revert(int[] data){

        MySwap mySwap = new MySwap();
        for(int i = 0; i < data.length/2; i++){
            mySwap.swap1(data, i, data.length - 1 - i);
        }

    }

}
