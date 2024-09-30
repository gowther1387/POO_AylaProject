package Projeto_P3;

import javax.swing.*;
import java.awt.*;

import static java.awt.Image.SCALE_SMOOTH;

public class VendaDeCarro extends JFrame {
    JLabel linha1, linha2;
    ImageIcon lamborImg = new ImageIcon("C:\\Users\\Frederyck Lohan\\OneDrive\\Documentos\\lamboLogo.png");
    ImageIcon buggatiImg = new ImageIcon( "C: \\Users\\Frederyck Lohan\\OneDrive\\Documentos\\bubuLougo.png");
    JButton botaoLambo, botaoBuga;

    public void compraEVenda() {
        setTitle("Seja bem-vindo a nossa loja");
        setSize(1920, 1080);
        setLocation(300, 300);
        setResizable(false);
        getContentPane().setBackground(Color.white);


        Image scaledImg1 = lamborImg.getImage().getScaledInstance(350, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledLamboImg = new ImageIcon(scaledImg1);
        Image scaledImg2 = buggatiImg.getImage().getScaledInstance(350, 200, SCALE_SMOOTH);
        ImageIcon scaledBugaImg = new ImageIcon((scaledImg2));


        linha1 = new JLabel("Seja bem-vindo a nossa loja", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));


        linha2 = new JLabel(scaledLamboImg, JLabel.LEFT);
        linha2 = new JLabel(scaledBugaImg, JLabel.CENTER);


        botaoLambo = new JButton (scaledLamboImg);
        botaoBuga = new JButton(scaledBugaImg);


        JPanel panelImagens = new JPanel(new GridLayout(1, 3)); // 1 linha, 2 colunas
        panelImagens.add(linha1); // Adiciona a primeira imagem (Lambo)
        panelImagens.add(linha1); // Adiciona a segunda imagem (Bugatti)


        getContentPane().setLayout(new GridLayout(2, 1));
        getContentPane().setLayout(new GridLayout(3, 1)); // Define o layout da janela
        getContentPane().add(linha1);
        getContentPane().add(linha2);
}
}