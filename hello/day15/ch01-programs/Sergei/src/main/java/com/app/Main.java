package com.app;

public class Main {
    public static void main(String[] args) {

        Photo photo = new Photo();
        photo.setName("S.T.A.L.K.E.R.");
        photo.setWeight(23.17f);
        photo.setData(26);
        photo.setUrlAddress("D:/Games/Stalker Heart of Chornobil");
        System.out.println(photo);

        System.out.println("//////////////////////////////////////////////////////////");

        Audio audio = new Audio();
        audio.setName("Sound Track of STALKER 2");
        audio.setWeight(1.12f);
        audio.setData(11);
        audio.setUrlAddress("C:/My Documents/My Music/Sound Track of Stalker 2");
        System.out.println(audio);

        System.out.println("//////////////////////////////////////////////////////////");

        Video video = new Video();
        video.setName("Trailer of STALKER 2");
        video.setWeight(3.24f);
        video.setData(8);
        video.setUrlAddress("C:/My Documents/My Video/Trailer of Stalker 2");
        System.out.println(video);

        System.out.println("//////////////////////////////////////////////////////////");

        //тренировочка

        if (3 >= 5) {
            System.out.println("no no no ");
        }
        else if(3 == 5) {
            System.out.println("NO NO NO Nooooooo");
        }else {
            System.out.println("YES !!!!!!!!!!!!!!!");
        }
    }
}
