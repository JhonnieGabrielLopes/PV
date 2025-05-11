/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.iftm.projetotelajpanel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jhonn
 */
public class ProjetoTelaJPanel {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Teste JFrame + JPanel");
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel();
        painel.setBackground(Color.red);
        janela.add(painel);
        janela.setVisible(true);
    }
}
