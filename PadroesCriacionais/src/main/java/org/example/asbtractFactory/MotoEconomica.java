package org.example.asbtractFactory;

public class MotoEconomica implements Veiculo,Economico {

    @Override
    public void descrever() {
        System.out.println("Moto econômica: leve e econômica.");
    }
}
