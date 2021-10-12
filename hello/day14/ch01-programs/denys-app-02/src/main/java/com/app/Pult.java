package com.app;

public class Pult {
    public String pultName;
    public Tv tv;

    public void makeSound(int soundValue){
        tv.sound=soundValue;
    }

    public void changeCanal(int canalValue){
        tv.canal = canalValue;
    }

}
