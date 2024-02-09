package com.ohgiraffers.pokemon.electrict;

import com.ohgiraffers.pokemon.Pokemon;

public class Raichu extends Pokemon {

    public Raichu(){
        this.name = "라이츄";
        skillNum1 = "전기쇼크";
        skillNum2 = "꼬리흔들기";
        skillNum3 = "전광석화";
        skillNum4 = "10만볼트";
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
        System.out.println("라이~라이~라이~~~~~~~~~!!츄!!!");
    }


    public void evolution() {
        System.out.println("더이상 진화할 수 없습니다. ");
    }

}
