package org.example.asbtractFactory;

public class Loja {

    private Veiculo veiculo;
    private Economico veiculoEconomico;
    private Luxo veiculoLuxo;

    public void criarVeiculo(fabricaVeiculo fabrica){
        this.veiculoEconomico = fabrica.criarEconomico();
        this.veiculoLuxo = fabrica.criarLuxo();
    }
    public String exibirVeiculo(){
        return this.veiculoEconomico.toString() + "\n"
                + this.veiculoLuxo.toString();
    }
}
