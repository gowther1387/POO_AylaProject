package Projeto_P3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemaCarro extends VendaDeCarro {
    private Map <TipoMarca, String > Lamborghini = new HashMap<>();
    private Map <TipoMarca, String > Bugatti = new HashMap<>();
    private Map <TipoMarca, String > koenigsegg = new HashMap<>();
    private ArrayList<String> carrosLambo = new ArrayList<>();
    private ArrayList<String> carrosBuga = new ArrayList<>();
    private ArrayList<String> carroskoe = new ArrayList<>();



    public void CadastrarUmCarroDaLambo(TipoMarca marca, String nome){
        if(!Lamborghini.containsValue(nome)){
            Lamborghini.put(marca, nome);
        }

    }

    public void CadastrarUmCarroDaBugatti(TipoMarca marca, String nome){
        if(!Bugatti.containsValue(nome)){
            Bugatti.put(marca, nome);
        }

    }

    public void CadastrarUmCarroDaKoenigsegg(TipoMarca marca, String nome){
        if(!koenigsegg.containsValue(nome)){
            koenigsegg.put(marca, nome);
        }

    }

    public ArrayList<String> pesquisarCarroLambo(TipoMarca marca, String nome){
        if (Lamborghini.containsKey(marca)) {
           carrosLambo.add(nome);
        }
        return carrosBuga;
    }

    public ArrayList<String> pesquisarCarroBuga(TipoMarca marca, String nome) {
        for (String c : Lamborghini.values()) {
            if (Bugatti.containsKey(marca)) {
                carrosBuga.add(nome);
            }
        }
        return carrosLambo;
    }


    public ArrayList<String> pesquisarCarrokoe(TipoMarca marca, String nome){
        if (koenigsegg.containsKey(marca)) {
            carroskoe.add(nome);
        }
        return carroskoe;
    }

    public void apagarUmcarroLambo(String nome){
        if(Lamborghini.containsKey(nome)){
            Lamborghini.remove(nome);
        }
    }

    public void apagarUmcarroBuga(String nome){
        if(Bugatti.containsKey(nome)){
            Bugatti.remove(nome);
        }
    }

    public void apagarUmcarroKoe(String nome){
        if(koenigsegg.containsKey(nome)){
            koenigsegg.remove(nome);
        }
    }
}