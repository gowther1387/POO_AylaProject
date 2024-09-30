package Projeto_P3;

import java.util.ArrayList;

public interface VendasInterface {

    void CadastrarUmCarroDaLambo(TipoMarca marca, String nome);
    void CadastrarUmCarroDaBugatti(TipoMarca marca, String nome);
    void CadastrarUmCarroDaKoenigsegg(TipoMarca marca, String nome);

    ArrayList<String> pesquisarCarroLambo(TipoMarca marca, String nome);
    ArrayList<String> pesquisarCarroBuga(TipoMarca marca, String nome);
    ArrayList<String> pesquisarCarrokoe(TipoMarca marca, String nome);

    void apagarUmcarroLambo(String nome);
    void apagarUmcarroBuga(String nome);
    void apagarUmcarroKoe(String nome);
}
