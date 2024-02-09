package com.ohgiraffers.pokemon;

public class Pokemon {

    protected String name;

    protected String skillNum1;
    protected String skillNum2;
    protected String skillNum3;
    protected String skillNum4;
    protected int pokedex;

    public Pokemon(){

    }

    public void attack1() {
        System.out.println("포켓몬이 1번 기술을 시전했다!!!");
    }

    public void attack2() {
        System.out.println("포켓몬이 2번 기술을 시전했다!!!");
    }

    public void attack3() {
        System.out.println("포켓몬이 3번 기술을 시전했다!!!");
    }

    public void attack4() {
        System.out.println("포켓몬이 4번 기술을 시전했다!!!");
    }


    public void howl() {
        System.out.println("포켓몬이 울부짖었다!!!");
    }

    public void evolution(){
        System.out.println("포켓몬이 진화했다!!!");
    }

    public Pokemon(String name){
        this.name = name;
    }

    public void attack1(String name) {
        System.out.println(name + " 이(가) " + skillNum1 + "을(를) 시전했다!!!");
    }

    public void attack2(String name) {
        System.out.println(name + " 이(가) " + skillNum2 + "을(를) 시전했다!!!");
    }

    public void attack3(String name) {
        System.out.println(name + " 이(가) " + skillNum3 + "을(를) 시전했다!!!");
    }

    public void attack4(String name) {
        System.out.println(name + " 이(가) " + skillNum4 + "을(를) 시전했다!!!");
    }


    public void howl(String name) {
        System.out.println(name + " 이(가) 울부짖었다!!!");
    }

    public void evolution(String name) {
        System.out.println(name + " 이(가) " + "진화했다!!!");
    }


}
