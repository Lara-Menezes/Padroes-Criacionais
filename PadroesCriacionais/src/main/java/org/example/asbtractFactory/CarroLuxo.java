package org.example.asbtractFactory;

public class CarroLuxo implements Veiculo,Luxo {
    @Override
    public void descrever() {
        System.out.println("Carro de luxo: espaçoso e confortável.");
    }
}
