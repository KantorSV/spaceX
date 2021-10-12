package com.app;

public class Main {
    public static void main(String[] args) {
        Ff ff = new Ff();
        String filePath = "D:\\Games\\games\\Anomaly 1.5.1. Boomsticks and Sharpsticks\\MODS\\07. Patch_AFTER_JSRS_Port_3.6_Sound_Overhaul\\gamedata\\configs\\items\\weapons\\weapon_ammo.ltx";
        ff.readFromFile(filePath);
    }
}
