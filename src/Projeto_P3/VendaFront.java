package Projeto_P3;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VendaFront {
    public static void main(String[] args) {
        VendaDeCarro janela = new VendaDeCarro(); // Instancia a classe 'vendaDeCarros'
        janela.compraEVenda(); // Chama o método para configurar a interface
        janela.setVisible(true); // Torna a janela visível

        // Aqui usamos WindowAdapter em vez de WindowListener
        janela.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
  });
}}
