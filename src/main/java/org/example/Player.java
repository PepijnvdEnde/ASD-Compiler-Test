package org.example;

public class Player {
    public int hp;
    public int spd;
    public int str;
    Player(int hp, int spd, int str){
        this.hp = hp;
        this.spd = spd;
        this.str = str;
    }


    public void doAction(String text){
        System.out.println(text);
    }
}
