package br.edu.iftm.lista2;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;



public class TelaCadastro extends javax.swing.JFrame {
    private String cursoEscolha;
    private String interesse="";
    private String email;
    private String sms;
    
    
    public TelaCadastro() {
        initComponents();
        panelPrincipal.setFocusable(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTurno = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        entradaNome = new javax.swing.JTextField();
        entradaSenha = new javax.swing.JPasswordField();
        entradaCPF = new javax.swing.JFormattedTextField();
        tituloNome = new javax.swing.JLabel();
        tituloSenha = new javax.swing.JLabel();
        tituloCPF = new javax.swing.JLabel();
        curso = new javax.swing.JComboBox<>();
        tituloCurso = new javax.swing.JLabel();
        tituloComentario = new javax.swing.JLabel();
        lbContador = new javax.swing.JLabel();
        panelSec = new javax.swing.JPanel();
        tituloHDisponiveis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaHabilidade = new javax.swing.JList<>();
        tituloMHabilidades = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMinhasHabilidades = new javax.swing.JList<>();
        botaoAdicionar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        tema = new javax.swing.JToggleButton();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        scrollComentario = new javax.swing.JScrollPane();
        entradaComentario = new javax.swing.JTextArea();
        tituloInteresse = new javax.swing.JLabel();
        boxEmail = new javax.swing.JCheckBox();
        boxSMS = new javax.swing.JCheckBox();
        tituloTurno = new javax.swing.JLabel();
        rdManha = new javax.swing.JRadioButton();
        rdTarde = new javax.swing.JRadioButton();
        rdNoite = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(244, 244, 244));

        entradaNome.setBackground(new java.awt.Color(204, 204, 204));
        entradaNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        entradaNome.setForeground(new java.awt.Color(0, 0, 0));
        entradaNome.setText("Nome Completo");
        entradaNome.setToolTipText("Digite seu nome completo");
        entradaNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNomeFocusLost(evt);
            }
        });
        entradaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                entradaNomeKeyTyped(evt);
            }
        });

        entradaSenha.setBackground(new java.awt.Color(204, 204, 204));
        entradaSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        entradaSenha.setForeground(new java.awt.Color(0, 0, 0));
        entradaSenha.setToolTipText("Digite sua senha");

        entradaCPF.setBackground(new java.awt.Color(204, 204, 204));
        entradaCPF.setForeground(new java.awt.Color(0, 0, 0));
        entradaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
            createFormatter()
        ));
        entradaCPF.setToolTipText("Digite seu CPF");
        entradaCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tituloNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloNome.setForeground(new java.awt.Color(0, 0, 0));
        tituloNome.setText("Nome");

        tituloSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloSenha.setForeground(new java.awt.Color(0, 0, 0));
        tituloSenha.setText("Senha");

        tituloCPF.setForeground(new java.awt.Color(0, 0, 0));
        tituloCPF.setText("CPF");

        curso.setBackground(new java.awt.Color(204, 204, 204));
        curso.setForeground(new java.awt.Color(0, 0, 0));
        curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Informática", "Administração", "Eletrônica" }));
        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });

        tituloCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloCurso.setForeground(new java.awt.Color(0, 0, 0));
        tituloCurso.setText("Curso");

        tituloComentario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloComentario.setForeground(new java.awt.Color(0, 0, 0));
        tituloComentario.setText("Comentários adicionais");

        lbContador.setForeground(new java.awt.Color(0, 0, 0));
        lbContador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbContador.setText("0/200");

        panelSec.setBackground(new java.awt.Color(180, 180, 180));

        tituloHDisponiveis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloHDisponiveis.setForeground(new java.awt.Color(0, 0, 0));
        tituloHDisponiveis.setText("Habilidades Disponíveis");

        listaHabilidade.setBackground(new java.awt.Color(204, 204, 204));
        listaHabilidade.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(listaHabilidade);

        tituloMHabilidades.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloMHabilidades.setForeground(new java.awt.Color(0, 0, 0));
        tituloMHabilidades.setText("Minhas Habilidades");

        listaMinhasHabilidades.setBackground(new java.awt.Color(204, 204, 204));
        listaMinhasHabilidades.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(listaMinhasHabilidades);

        botaoAdicionar.setBackground(new java.awt.Color(100, 100, 100));
        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-baixo.png"))); // NOI18N
        botaoAdicionar.setToolTipText("Adicionar Habilidade");
        botaoAdicionar.setBorderPainted(false);
        botaoAdicionar.setFocusPainted(false);
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseExited(evt);
            }
        });
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoRemover.setBackground(new java.awt.Color(100, 100, 100));
        botaoRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-direita.png"))); // NOI18N
        botaoRemover.setToolTipText("Remover Habilidade");
        botaoRemover.setBorderPainted(false);
        botaoRemover.setFocusPainted(false);
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseExited(evt);
            }
        });
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        tema.setBackground(new java.awt.Color(100, 100, 100));
        tema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tema.setForeground(new java.awt.Color(0, 0, 0));
        tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forma-de-meia-lua.png"))); // NOI18N
        tema.setBorderPainted(false);
        tema.setFocusPainted(false);
        tema.addItemListener(itemListener);
        tema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                temaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                temaMouseExited(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(100, 100, 100));
        botaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixeira.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.setBorderPainted(false);
        botaoLimpar.setFocusPainted(false);
        botaoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoLimparMouseExited(evt);
            }
        });
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(100, 100, 100));
        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salve.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorderPainted(false);
        botaoSalvar.setFocusPainted(false);
        botaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoSalvarMouseExited(evt);
            }
        });
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSecLayout = new javax.swing.GroupLayout(panelSec);
        panelSec.setLayout(panelSecLayout);
        panelSecLayout.setHorizontalGroup(
            panelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSecLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecLayout.createSequentialGroup()
                        .addComponent(tituloMHabilidades)
                        .addGap(30, 30, 30)
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSecLayout.createSequentialGroup()
                            .addComponent(botaoSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tituloHDisponiveis, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelSecLayout.setVerticalGroup(
            panelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloHDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMHabilidades)
                    .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        entradaComentario.setBackground(new java.awt.Color(204, 204, 204));
        entradaComentario.setColumns(20);
        entradaComentario.setForeground(new java.awt.Color(0, 0, 0));
        entradaComentario.setLineWrap(true);
        entradaComentario.setRows(5);
        entradaComentario.setToolTipText("Insira observações adicionais");
        scrollComentario.setViewportView(entradaComentario);
        ((AbstractDocument) entradaComentario.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (fb.getDocument().getLength() + string.length() <= 200) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                int novaQuant = fb.getDocument().getLength() - length + (text != null ? text.length() : 0);
                if (novaQuant <= 200) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        entradaComentario.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                atualizarContador();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                atualizarContador();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                atualizarContador();
            }

            private void atualizarContador() {
                int tamanho = entradaComentario.getText().length();
                lbContador.setText(tamanho + "/200");
            }
        });

        tituloInteresse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloInteresse.setForeground(new java.awt.Color(0, 0, 0));
        tituloInteresse.setText("Interesses");

        boxEmail.setBackground(new java.awt.Color(244, 244, 244));
        boxEmail.setForeground(new java.awt.Color(0, 0, 0));
        boxEmail.setText("Receber Email");
        boxEmail.addItemListener(itemListener);

        boxSMS.setBackground(new java.awt.Color(244, 244, 244));
        boxSMS.setForeground(new java.awt.Color(0, 0, 0));
        boxSMS.setText("Receber SMS");
        boxSMS.addItemListener(itemListener);

        tituloTurno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloTurno.setForeground(new java.awt.Color(0, 0, 0));
        tituloTurno.setText("Turno Preferêncial");

        rdManha.setBackground(new java.awt.Color(244, 244, 244));
        grupoTurno.add(rdManha);
        rdManha.setForeground(new java.awt.Color(0, 0, 0));
        rdManha.setText("Manhã");

        rdTarde.setBackground(new java.awt.Color(244, 244, 244));
        grupoTurno.add(rdTarde);
        rdTarde.setForeground(new java.awt.Color(0, 0, 0));
        rdTarde.setText("Tarde");

        rdNoite.setBackground(new java.awt.Color(244, 244, 244));
        grupoTurno.add(rdNoite);
        rdNoite.setForeground(new java.awt.Color(0, 0, 0));
        rdNoite.setText("Noite");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloNome)
                                    .addComponent(tituloSenha)
                                    .addComponent(tituloCPF)
                                    .addComponent(tituloCurso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(entradaSenha)
                                    .addComponent(entradaCPF)
                                    .addComponent(entradaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(tituloComentario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(lbContador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollComentario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloInteresse)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(boxEmail)
                                .addGap(37, 37, 37)
                                .addComponent(boxSMS))
                            .addComponent(tituloTurno)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(rdManha)
                                .addGap(38, 38, 38)
                                .addComponent(rdTarde)
                                .addGap(39, 39, 39)
                                .addComponent(rdNoite)))))
                .addGap(18, 18, 18)
                .addComponent(panelSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloSenha))
                .addGap(15, 15, 15)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloCPF))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloComentario)
                    .addComponent(lbContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloInteresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSMS)
                    .addComponent(boxEmail))
                .addGap(18, 18, 18)
                .addComponent(tituloTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdManha)
                    .addComponent(rdTarde)
                    .addComponent(rdNoite))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(panelSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    DefaultListModel<String> habilidadeDisponiveis = new DefaultListModel<>();
    DefaultListModel<String> habilidadeSelecionadas = new DefaultListModel<>();
    
    private javax.swing.text.MaskFormatter createFormatter() {
        try {
            javax.swing.text.MaskFormatter fmt = new javax.swing.text.MaskFormatter("###.###.###-##");
            fmt.setPlaceholderCharacter('_');
            return fmt;
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private void entradaNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNomeFocusGained
        if(entradaNome.getText().equals("Nome Completo")){
            entradaNome.setText("");
        }
    }//GEN-LAST:event_entradaNomeFocusGained

    private void entradaNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNomeFocusLost
        if(entradaNome.getText().isEmpty()){
            entradaNome.setText("Nome Completo");
        }
    }//GEN-LAST:event_entradaNomeFocusLost

    private void entradaNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaNomeKeyTyped
        char i = evt.getKeyChar();
        if(!Character.isLetter(i) && i != ' '){
            evt.consume();
        }
    }//GEN-LAST:event_entradaNomeKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        habilidadeDisponiveis.addElement("Informática Básica");
        habilidadeDisponiveis.addElement("Informática Avançada");
        habilidadeDisponiveis.addElement("Versionamento GIT");
        habilidadeDisponiveis.addElement("Banco de Dados");
        habilidadeDisponiveis.addElement("Redes");
        habilidadeDisponiveis.addElement("Design Gráfico");
        habilidadeDisponiveis.addElement("Inglês Básico");
        habilidadeDisponiveis.addElement("Inglês Avançado");

        listaHabilidade.setModel(habilidadeDisponiveis);
        listaMinhasHabilidades.setModel(habilidadeSelecionadas);

        listaHabilidade.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        listaMinhasHabilidades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_formWindowOpened

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        for(String escolha : listaHabilidade.getSelectedValuesList()){
            if(!habilidadeSelecionadas.contains(escolha)){
                habilidadeSelecionadas.addElement(escolha);
                habilidadeDisponiveis.removeElement(escolha);
            }
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        for(String escolha : listaMinhasHabilidades.getSelectedValuesList()){
            if(!habilidadeDisponiveis.contains(escolha)){
                habilidadeDisponiveis.addElement(escolha);
                habilidadeSelecionadas.removeElement(escolha);
            }
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    ItemListener itemListener = new ItemListener(){
        public void itemStateChanged(ItemEvent evt){
            SwingUtilities.invokeLater(()->{
                String temp;
                if(boxEmail.isSelected() && boxSMS.isSelected()){
                    interesse = "Email e SMS";
                }if (boxEmail.isSelected() && email==null){
                    interesse = "Email";
                    temp = JOptionPane.showInputDialog(rootPane, "Email:");
                    if(temp == null||temp.trim().isEmpty()){
                        boxEmail.setSelected(false);
                    }else{
                        email = temp;
                    }
                }if (boxSMS.isSelected() && sms==null){
                    interesse = "SMS";
                    try{
                        MaskFormatter telefoneMascara = new MaskFormatter("(##)# ####-####");
                        telefoneMascara.setPlaceholderCharacter('_');
                        JFormattedTextField entradaTelefone = new JFormattedTextField(telefoneMascara);
                        int op = JOptionPane.showConfirmDialog(rootPane, entradaTelefone, "Telefone:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        temp = entradaTelefone.getText().trim();
                        if(op == JOptionPane.OK_OPTION && !temp.contains("_")){
                            sms = temp;
                        }else{
                            boxSMS.setSelected(false);
                        }
                    }catch(ParseException e){
                        e.printStackTrace();
                        boxSMS.setSelected(false);
                    }
                }
            });
            if(tema.isSelected()){
                panelPrincipal.setBackground(new Color(35,35,35));
                panelSec.setBackground(new Color(51,51,51));
                tituloNome.setForeground(Color.WHITE);
                tituloSenha.setForeground(Color.WHITE);
                tituloCPF.setForeground(Color.WHITE);
                tituloCurso.setForeground(Color.WHITE);
                tituloComentario.setForeground(Color.WHITE);
                lbContador.setForeground(Color.WHITE);
                tituloInteresse.setForeground(Color.WHITE);
                tituloTurno.setForeground(Color.WHITE);
                boxEmail.setForeground(Color.WHITE);
                boxEmail.setBackground(new Color(35,35,35));
                boxSMS.setForeground(Color.WHITE);
                boxSMS.setBackground(new Color(35,35,35));
                rdManha.setForeground(Color.WHITE);
                rdManha.setBackground(new Color(35,35,35));
                rdTarde.setForeground(Color.WHITE);
                rdTarde.setBackground(new Color(35,35,35));
                rdNoite.setForeground(Color.WHITE);
                rdNoite.setBackground(new Color(35,35,35));
                tituloHDisponiveis.setForeground(Color.WHITE);
                tituloMHabilidades.setForeground(Color.WHITE);
                tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brilho-do-sol.png")));
                UIManager.put("OptionPane.background", new Color(40,40,40));
                UIManager.put("Panel.background", new Color(40,40,40));
                UIManager.put("OptionPane.messageForeground", Color.WHITE);
            }else{
                panelPrincipal.setBackground(new Color(244,244,244));
                panelSec.setBackground(new Color(180,180,180));
                tituloNome.setForeground(Color.BLACK);
                tituloSenha.setForeground(Color.BLACK);
                tituloCPF.setForeground(Color.BLACK);
                tituloCurso.setForeground(Color.BLACK);
                tituloComentario.setForeground(Color.BLACK);
                lbContador.setForeground(Color.BLACK);
                tituloInteresse.setForeground(Color.BLACK);
                tituloTurno.setForeground(Color.BLACK);
                boxEmail.setForeground(Color.BLACK);
                boxEmail.setBackground(new Color(244,244,244));
                boxSMS.setForeground(Color.BLACK);
                boxSMS.setBackground(new Color(244,244,244));
                rdManha.setForeground(Color.BLACK);
                rdManha.setBackground(new Color(244,244,244));
                rdTarde.setForeground(Color.BLACK);
                rdTarde.setBackground(new Color(244,244,244));
                rdNoite.setForeground(Color.BLACK);
                rdNoite.setBackground(new Color(244,244,244));
                tituloHDisponiveis.setForeground(Color.BLACK);
                tituloMHabilidades.setForeground(Color.BLACK);
                tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forma-de-meia-lua.png")));
                UIManager.put("OptionPane.background", null);
                UIManager.put("Panel.background", null);
                UIManager.put("OptionPane.messageForeground", null);
            }
        }
    };
    
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        boolean valida=true;
        String nome, cpf, anotacao, turno="", habilidade="";
        String senha = (new String (entradaSenha.getPassword()));
        if(entradaNome.getText().isEmpty() || entradaNome.getText().equals("Nome Completo")){
            valida=false;
            JOptionPane.showMessageDialog(rootPane, "Preenchimento obrigatório para: Nome", "Erro", JOptionPane.ERROR_MESSAGE);
        }else
        if(senha.isEmpty()){
            valida=false;
            JOptionPane.showMessageDialog(rootPane, "Preenchimento obrigatório para: Senha", "Erro", JOptionPane.ERROR_MESSAGE);
        }else
        if(entradaCPF.getText().equals("___.___.___-__")){
            valida=false;
            JOptionPane.showMessageDialog(rootPane, "Preenchimento obrigatório para: CPF", "Erro", JOptionPane.ERROR_MESSAGE);
        }else
        if(curso.getSelectedItem().equals(" ")){
            valida=false;
            JOptionPane.showMessageDialog(rootPane, "Necessário selecionar um curso", "Erro", JOptionPane.ERROR_MESSAGE);
        }else
        if(entradaComentario.getText().isEmpty()){
            valida=false;
            JOptionPane.showMessageDialog(rootPane, "Preenchimento obrigatório para:\nComentários Adicionais", "Erro", JOptionPane.ERROR_MESSAGE);
        }else
        if(!rdManha.isSelected()&&!rdTarde.isSelected()&&!rdNoite.isSelected()){
            valida=false;
            JOptionPane.showMessageDialog(rootPane, "Necessário selecionar um turno", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if(valida){
            nome = entradaNome.getText();
            cpf = entradaCPF.getText();
            anotacao = entradaComentario.getText();
            if(rdManha.isSelected()){
                turno = "Manhã";
            }
            if(rdTarde.isSelected()){
                turno = "Tarde";
            }
            if(rdNoite.isSelected()){
                turno = "Noite";
            }
            for(int i=0; i<habilidadeSelecionadas.size();i++){
                String hab = habilidadeSelecionadas.elementAt(i);
                habilidade=habilidade+"> "+hab+"\n";
            }
            Pessoa pessoa = new Pessoa(nome, senha, cpf, cursoEscolha, anotacao, interesse, turno, habilidade);
            pessoa.setEmail(email);
            pessoa.setTelefone(sms);
            JOptionPane.showMessageDialog(rootPane, pessoa.toString(), "Dados", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        entradaNome.setText("Nome Completo");
        entradaSenha.setText("");
        entradaCPF.setText("");
        entradaComentario.setText("");
        curso.setSelectedIndex(0);
        grupoTurno.clearSelection();
        boxEmail.setSelected(false);
        boxSMS.setSelected(false);
        for(int i=0; i<habilidadeSelecionadas.size();i++){
            String hab = habilidadeSelecionadas.elementAt(i);
            habilidadeDisponiveis.addElement(hab);
        }
        habilidadeSelecionadas.clear();
        email=null;
        sms=null;
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        cursoEscolha = (String)curso.getSelectedItem();
    }//GEN-LAST:event_cursoActionPerformed

    private void botaoSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseEntered
        botaoSalvar.setBackground(new Color(150,150,150));
    }//GEN-LAST:event_botaoSalvarMouseEntered

    private void botaoSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseExited
        botaoSalvar.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_botaoSalvarMouseExited

    private void botaoLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLimparMouseEntered
        botaoLimpar.setBackground(new Color(150,150,150));
    }//GEN-LAST:event_botaoLimparMouseEntered

    private void botaoLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLimparMouseExited
        botaoLimpar.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_botaoLimparMouseExited

    private void temaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temaMouseEntered
        tema.setBackground(new Color(150,150,150));
    }//GEN-LAST:event_temaMouseEntered

    private void temaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temaMouseExited
        tema.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_temaMouseExited

    private void botaoAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseEntered
        botaoAdicionar.setBackground(new Color(150,150,150));
    }//GEN-LAST:event_botaoAdicionarMouseEntered

    private void botaoAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseExited
        botaoAdicionar.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_botaoAdicionarMouseExited

    private void botaoRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseEntered
        botaoRemover.setBackground(new Color(150,150,150));
    }//GEN-LAST:event_botaoRemoverMouseEntered

    private void botaoRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseExited
        botaoRemover.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_botaoRemoverMouseExited
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JCheckBox boxEmail;
    private javax.swing.JCheckBox boxSMS;
    private javax.swing.JComboBox<String> curso;
    private javax.swing.JFormattedTextField entradaCPF;
    private javax.swing.JTextArea entradaComentario;
    private javax.swing.JTextField entradaNome;
    private javax.swing.JPasswordField entradaSenha;
    private javax.swing.ButtonGroup grupoTurno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbContador;
    private javax.swing.JList<String> listaHabilidade;
    private javax.swing.JList<String> listaMinhasHabilidades;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSec;
    private javax.swing.JRadioButton rdManha;
    private javax.swing.JRadioButton rdNoite;
    private javax.swing.JRadioButton rdTarde;
    private javax.swing.JScrollPane scrollComentario;
    private javax.swing.JToggleButton tema;
    private javax.swing.JLabel tituloCPF;
    private javax.swing.JLabel tituloComentario;
    private javax.swing.JLabel tituloCurso;
    private javax.swing.JLabel tituloHDisponiveis;
    private javax.swing.JLabel tituloInteresse;
    private javax.swing.JLabel tituloMHabilidades;
    private javax.swing.JLabel tituloNome;
    private javax.swing.JLabel tituloSenha;
    private javax.swing.JLabel tituloTurno;
    // End of variables declaration//GEN-END:variables
}
