package org.example.factoryMethod;

public class Luxury extends Loja{
    public Veiculo criarVeiculo(String tipoVeiculo){
        switch (tipoVeiculo){
            case "moto":
                return new MotoLuxo();
            case "carro":
                return new CarroLuxo();
        }
        return null;
    }
}
