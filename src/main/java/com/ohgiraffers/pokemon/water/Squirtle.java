package com.ohgiraffers.pokemon.water;

import com.ohgiraffers.pokemon.Pokemon;

public class Squirtle extends Pokemon {

    public Squirtle() {
        this.name = "꼬부기";
        skillNum1 = "몸통박치기";
        skillNum2 = "거품";
        skillNum3 = "물대포";
        skillNum4 = "로케트박치기";
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
        System.out.println("꼬오 부욱~?");
    }

    @Override
    public void evolution() {
        super.evolution("꼬부기");
        System.out.println("어니!?부기!?!!!!");
    }

}
