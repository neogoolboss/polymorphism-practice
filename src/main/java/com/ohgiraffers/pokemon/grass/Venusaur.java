package com.ohgiraffers.pokemon.grass;

import com.ohgiraffers.pokemon.Pokemon;

public class Venusaur extends Pokemon {

    public Venusaur(){
        this.name = "이상해꽃";
        skillNum1 = "덩굴채찍";
        skillNum2 = "파괴광선";
        skillNum3 = "메가드레인";
        skillNum4 = "솔라빔";
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
        System.out.println("이상해애애!!!!끄오오옻!!!");
    }


    public void evolution() {
        System.out.println("더이상 진화할 수 없습니다. ");
    }

}


