/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.iftm.projetotelajbutton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author jhonn
 */
public class ProjetoTelaJButton {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Teste JFrame + JPanel");
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel();
        painel.setBackground(Color.blue);
        
        JLabel label = new JLabel("PV, a melhor aula");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.BLACK);
        
        JButton botao = new JButton("Não clique aqui");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(botao, "Deu erro!!!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        
        janela.add(painel);
        painel.add(label);
        
        painel.add(botao);
        
        janela.setVisible(true);
    }
}
