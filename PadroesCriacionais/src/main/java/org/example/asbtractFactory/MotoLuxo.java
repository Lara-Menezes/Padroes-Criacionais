package org.example.asbtractFactory;

public class MotoLuxo implements Veiculo, Luxo{
    @Override
    public void descrever() {
        System.out.println("Moto de luxo: potente e estilosa.");
    }
}
