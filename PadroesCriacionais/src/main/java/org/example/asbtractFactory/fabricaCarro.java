package org.example.asbtractFactory;

public class fabricaCarro extends fabricaVeiculo{

    @Override
    Economico criarEconomico() {
        return new CarroEconomico();
    }

    @Override
    Luxo criarLuxo() {
        return new CarroLuxo();
    }
}
