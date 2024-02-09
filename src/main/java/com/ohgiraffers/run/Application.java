package com.ohgiraffers.run;


import com.ohgiraffers.pokemon.Pokemon;
import com.ohgiraffers.pokemon.electrict.Pikachu;
import com.ohgiraffers.pokemon.electrict.Raichu;
import com.ohgiraffers.pokemon.fire.Charizard;
import com.ohgiraffers.pokemon.fire.Charmander;
import com.ohgiraffers.pokemon.grass.Bulbasaur;
import com.ohgiraffers.pokemon.grass.Venusaur;
import com.ohgiraffers.pokemon.water.Blastoise;
import com.ohgiraffers.pokemon.water.Squirtle;

public class Application {

    public static void main(String[] args) {

        System.out.println("=== 포켓몬 행동 호출 ===");
        Pokemon Pokemon = new Pokemon();
        Pokemon.attack1();
        Pokemon.attack2();
        Pokemon.attack3();
        Pokemon.attack4();
        Pokemon.howl();
        Pokemon.evolution();

        System.out.println("=== 피카츄 행동 호출 ===");
        Pikachu pikachu = new Pikachu();
        pikachu.attack1();
        pikachu.attack2();
        pikachu.attack3();
        pikachu.attack4();
        pikachu.howl();
        pikachu.evolution();

        System.out.println("=== 라이츄 행동 호출 ===");
        Raichu raichu = new Raichu();
        raichu.attack1();
        raichu.attack2();
        raichu.attack3();
        raichu.attack4();
        raichu.howl();
        raichu.evolution();

        System.out.println("=== 파이리 행동 호출 ===");
        Charmander charmander = new Charmander();
        charmander.attack1();
        charmander.attack2();
        charmander.attack3();
        charmander.attack4();
        charmander.howl();
        charmander.evolution();

        System.out.println("=== 리자몽 행동 호출 ===");
        Charizard charizard = new Charizard();
        charizard.attack1();
        charizard.attack2();
        charizard.attack3();
        charizard.attack4();
        charizard.howl();
        charizard.evolution();

        System.out.println("=== 이상해씨 행동 호출 ===");
        Bulbasaur bulbasaur = new Bulbasaur();
        bulbasaur.attack1();
        bulbasaur.attack2();
        bulbasaur.attack3();
        bulbasaur.attack4();
        bulbasaur.howl();
        bulbasaur.evolution();

        System.out.println("=== 이상해꽃 행동 호출 ===");
        Venusaur venusaur = new Venusaur();
        venusaur.attack1();
        venusaur.attack2();
        venusaur.attack3();
        venusaur.attack4();
        venusaur.howl();
        venusaur.evolution();

        System.out.println("=== 꼬부기 행동 호출 ===");
        Squirtle squirtle = new Squirtle();
        squirtle.attack1();
        squirtle.attack2();
        squirtle.attack3();
        squirtle.attack4();
        squirtle.howl();
        squirtle.evolution();

        System.out.println("=== 거북왕 행동 호출 ===");
        Blastoise blastoise = new Blastoise();
        blastoise.attack1();
        blastoise.attack2();
        blastoise.attack3();
        blastoise.attack4();
        blastoise.howl();
        blastoise.evolution();




    }

}
