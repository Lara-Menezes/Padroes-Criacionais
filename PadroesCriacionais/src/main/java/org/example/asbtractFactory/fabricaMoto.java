package org.example.asbtractFactory;

public class fabricaMoto extends fabricaVeiculo{

    @Override
    Economico criarEconomico() {
        return new MotoEconomica();
    }

    @Override
    Luxo criarLuxo() {
        return new MotoLuxo();
    }
}
