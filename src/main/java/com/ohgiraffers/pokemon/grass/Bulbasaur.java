package com.ohgiraffers.pokemon.grass;

import com.ohgiraffers.pokemon.Pokemon;

public class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        this.name = "이상해씨";
        skillNum1 = "몸통박치기";
        skillNum2 = "씨뿌리기";
        skillNum3 = "덩굴채찍";
        skillNum4 = "잎날가르기";
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
        System.out.println("이상해~씌~~?");
    }

    @Override
    public void evolution() {
        super.evolution("이상해씨");
        System.out.println("이상해꼬옻!!!!");
    }

}
