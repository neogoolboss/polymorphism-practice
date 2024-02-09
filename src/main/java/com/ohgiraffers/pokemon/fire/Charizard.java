package com.ohgiraffers.pokemon.fire;

import com.ohgiraffers.pokemon.Pokemon;

public class Charizard extends Pokemon {

    public Charizard(){
        this.name = "리자몽";
        skillNum1 = "용의분노";
        skillNum2 = "파괴광선";
        skillNum3 = "불대문자";
        skillNum4 = "화염방사";
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
        System.out.println("리자!!!몽!");
    }


    public void evolution() {
        System.out.println("더이상 진화할 수 없습니다. ");
    }

}

