package com.ohgiraffers.pokemon.electrict;

import com.ohgiraffers.pokemon.Pokemon;

public class Pikachu extends Pokemon {

    public Pikachu(){
        this.name = "피카츄";
        skillNum1 = "전광석화";
        skillNum2 = "몸통박치기";
        skillNum3 = "전기자석파";
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
        System.out.println("피카피카~? 담배피카~?");
    }


    public void evolution() {
        System.out.println("피카츄는 진화하기를 거부했다!!!");
    }


}
