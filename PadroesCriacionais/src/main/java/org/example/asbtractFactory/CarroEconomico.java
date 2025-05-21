package org.example.asbtractFactory;

public class CarroEconomico implements Veiculo,Economico{
    @Override
    public void descrever() {
        System.out.println("Carro econômico: compacto e eficiente.");
    }
}
