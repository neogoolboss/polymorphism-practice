package com.ohgiraffers.pokemon.fire;

import com.ohgiraffers.pokemon.Pokemon;

public class Charmander extends Pokemon {

    public Charmander() {
        this.name = "파이리";
        skillNum1 = "할퀴기";
        skillNum2 = "불꽃세례";
        skillNum3 = "화염방사";
        skillNum4 = "회오리불꽃";
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
        System.out.println("파이리~~파이파이~~");
    }

    @Override
    public void evolution() {
        super.evolution("파이리");
        System.out.println("리자드!!!");
    }
}
