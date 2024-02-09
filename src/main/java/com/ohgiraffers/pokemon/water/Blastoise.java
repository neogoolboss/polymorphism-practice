package com.ohgiraffers.pokemon.water;

import com.ohgiraffers.pokemon.Pokemon;

public class Blastoise extends Pokemon {

    public Blastoise(){
        this.name = "거북왕";
        skillNum1 = "물대포";
        skillNum2 = "지구던지기";
        skillNum3 = "하이드로펌프";
        skillNum4 = "파도타기";
    }

    @Override
    public void attack1() {
        super.attack1(name);
    }

    @Override
    public void attack2() {
        super.attack2(name);
    }
    @Override
    public void attack3() {
        super.attack3(name);
    }
    @Override
    public void attack4() {
        super.attack4(name);
    }

    public void howl() {
        System.out.println("거!!북!!와앙!!!");
    }


    public void evolution() {
        System.out.println("더이상 진화할 수 없습니다. ");
    }

}
