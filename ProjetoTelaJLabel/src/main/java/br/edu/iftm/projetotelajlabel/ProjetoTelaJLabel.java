/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.iftm.projetotelajlabel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author jhonn
 */
public class ProjetoTelaJLabel {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Teste JFrame + JPanel");
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel();
        painel.setBackground(Color.blue);
        
        JLabel label = new JLabel("PV, a melhor aula");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.BLACK);
        janela.add(painel);
        painel.add(label);
        janela.setVisible(true);
    }
}
