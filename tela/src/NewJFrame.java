
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vlgri
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        mcam.setLineWrap(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        origem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        destino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        mapa = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mcam = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        bidir = new javax.swing.JRadioButton();
        largura = new javax.swing.JRadioButton();
        prof = new javax.swing.JRadioButton();
        profLimite = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        limite = new javax.swing.JTextField();
        aprof = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        origem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        origem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arad", "Bucharest", "Craiova", "Dobreta", "Fagaras", "Lugoj", "Mehadia", "Oradea", "Pitesti", "Rimnicu", "Sibiu", "Timisoara", "Zerind" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Origem");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Destino");

        destino.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arad", "Bucharest", "Craiova", "Dobreta", "Fagaras", "Lugoj", "Mehadia", "Oradea", "Pitesti", "Rimnicu", "Sibiu", "Timisoara", "Zerind" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de Busca");

        mapa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/mapa.jpeg"))); // NOI18N

        javax.swing.GroupLayout mapaLayout = new javax.swing.GroupLayout(mapa);
        mapa.setLayout(mapaLayout);
        mapaLayout.setHorizontalGroup(
            mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );
        mapaLayout.setVerticalGroup(
            mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        mcam.setEditable(false);
        mcam.setColumns(20);
        mcam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mcam.setRows(5);
        mcam.setPreferredSize(new java.awt.Dimension(242, 89));
        mcam.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(mcam);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mapa");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Melhor Caminho");

        buttonGroup1.add(bidir);
        bidir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bidir.setText("Bidirecional");
        bidir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bidirMouseClicked(evt);
            }
        });

        buttonGroup1.add(largura);
        largura.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        largura.setText("Busca Largura");
        largura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                larguraMouseClicked(evt);
            }
        });

        buttonGroup1.add(prof);
        prof.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        prof.setText("Busca Profundidade");
        prof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profMouseClicked(evt);
            }
        });

        buttonGroup1.add(profLimite);
        profLimite.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        profLimite.setText("Busca Profundidade Limitada");
        profLimite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profLimiteMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Limite:");

        limite.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        limite.setEnabled(false);

        buttonGroup1.add(aprof);
        aprof.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        aprof.setSelected(true);
        aprof.setText("Aprofundamento Iterativo");
        aprof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aprofMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(bidir)
                    .addComponent(largura)
                    .addComponent(prof)
                    .addComponent(profLimite)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limite))
                    .addComponent(aprof)
                    .addComponent(destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(origem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(aprof)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bidir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(largura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prof)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profLimite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aprofMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprofMouseClicked
        limite.setEnabled(false);
        limite.setText("");
        mcam.setText("");
    }//GEN-LAST:event_aprofMouseClicked

    private void bidirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bidirMouseClicked
        limite.setEnabled(false);
        limite.setText("");
        mcam.setText("");
    }//GEN-LAST:event_bidirMouseClicked

    private void larguraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_larguraMouseClicked
        limite.setEnabled(false);
        limite.setText("");
        mcam.setText("");
    }//GEN-LAST:event_larguraMouseClicked

    private void profMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseClicked
        limite.setEnabled(false);
        limite.setText("");
        mcam.setText("");
    }//GEN-LAST:event_profMouseClicked

    private void profLimiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profLimiteMouseClicked
        limite.setEnabled(true);
        limite.setText("");
        mcam.setText("");
    }//GEN-LAST:event_profLimiteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int mat[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, //Arad     
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0}, //Bucharest
            {0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0}, //Craiova
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, //Dobreta
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, //Fagaras
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0}, //Lugoj
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //Mehadia
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1}, //Oradea
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, //Pitesti
            {0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0}, //Rimnicu
            {1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0}, //Sibiu
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //Timisoara
            {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0} //Zerind     
        };

        String vCidade[] = {
            "Arad", //0
            "Bucharest", //1
            "Craiova", //2
            "Dobreta", //3
            "Fagaras", //4
            "Lugoj", //5
            "Mehadia", //6
            "Oradea", //7
            "Pitesti", //8
            "Rimnicu", //9
            "Sibiu", //10
            "Timisoara", //11
            "Zerind" //12
        };

        int vOrigem = origem.getSelectedIndex();
        int vDestino = destino.getSelectedIndex();
        int vLimite = 0;

        if (aprof.isSelected()) {
            //aprofundamento iterativo
            AprofundamentoIterativo Aprof = new AprofundamentoIterativo(mat, vOrigem, vDestino, vCidade, 0);
        } else if (bidir.isSelected()) {
            //bidirecional
            Bidirecional Bidi = new Bidirecional(mat, vOrigem, vDestino, vCidade);
        } else if (largura.isSelected()) {
            //busca largura
            BuscaLargura BuscaLarg = new BuscaLargura(mat, vOrigem, vDestino, vCidade);
        } else if (prof.isSelected()) {
            //busca profundidade
            BuscaProfundidade BuscaProf = new BuscaProfundidade(mat, vOrigem, vDestino, vCidade);
        } else if (profLimite.isSelected()) {
            //busca profundidade limitada
            vLimite = Integer.parseInt(limite.getText());
            BuscaProfundidadeLimitada BuscaProfLimit = new BuscaProfundidadeLimitada(mat, vOrigem, vDestino, vCidade, vLimite);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public class AprofundamentoIterativo {

        AprofundamentoIterativo(int mat[][], int vOrigem, int vDestino, String vCidade[], int vAprofundamento) {
            boolean vParar = false;
            int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        
            int vProfundidade = 0;

            for (int i = 0; i < vControle.length; i++) {
                vControle[i] = -1;
            }

            Lista lista = new Lista();
            lista.criaLista();
            lista.InserirFinal(new No(vOrigem), null);

            Lista lista1 = new Lista();
            lista1.criaLista();
            lista1.InserirFinal(new No(vOrigem), null);

            vControle[vOrigem] = vProfundidade;

            while (!lista.ListaVazia()) {
                No atual = lista.RemoverFinal();
                int vAtual = atual.valor;

                vProfundidade = vProfundidade + 1;
                vAprofundamento = vAprofundamento + 1;

                for (int j = 0; j < mat.length; j++) {
                    if (mat[vAtual][j] != 0) {
                        if (vControle[j] > vProfundidade || vControle[j] == -1) {
                            if (vAprofundamento >= vProfundidade) {
                                vControle[j] = vProfundidade;
                                lista.InserirFinal(new No(j), atual);
                                lista1.InserirFinal(new No(j), atual);

                                if (j == vDestino) {
                                    vParar = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (vParar) {
                        break;
                    }
                }
            }

            if (vParar == false) {
                new AprofundamentoIterativo(mat, vOrigem, vDestino, vCidade, vAprofundamento + 1);
            } else {
                System.out.println();
                System.out.println("********** APROFUNDAMENTO ITERATIVO ***********");
                System.out.println();

                System.out.println("********** LISTA COMPLETA ***********");
                lista1.MostrarLista(vCidade);
                System.out.println("*************************************");

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("********** MELHOR CAMINHO ***********");
                lista1.MelhorResultado(vOrigem, vDestino, vCidade);
                System.out.println("Limite Minimo: " + vAprofundamento);
                System.out.println("*************************************");
            }
        }
    }

    public class Bidirecional {

        Bidirecional(int mat[][], int vOrigem, int vDestino, String vCidade[]) {

            boolean vParar = false;
            int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        
            int vControle1[] = new int[13];

            int k = 0, l = 0;

            for (int i = 0; i < vControle.length; i++) {
                vControle[i] = -1;
                vControle1[i] = -1;
            }

            Lista lista = new Lista();
            lista.criaLista();
            lista.InserirFinal(new No(vOrigem), null);

            Lista lista1 = new Lista();
            lista1.criaLista();
            lista1.InserirFinal(new No(vOrigem), null);

            Lista lista2 = new Lista();
            lista2.criaLista();
            lista2.InserirFinal(new No(vOrigem), null);

            Lista lista3 = new Lista();
            lista3.criaLista();
            lista3.InserirFinal(new No(vOrigem), null);

            while (!lista.ListaVazia() && !lista2.ListaVazia()) {
                while (!lista.ListaVazia()) {
                    No atual = lista.RemoverPrimeiro();
                    int vAtual = atual.valor;

                    for (int j = 0; j < mat.length; j++) {
                        if (mat[vAtual][j] != 0) {

                            if (vControle[j] == -1) {
                                vControle[j] = 0;
                                k = j;
                                lista.InserirFinal(new No(j), atual);
                                lista1.InserirFinal(new No(j), atual);

                                if (vControle[j] == vControle1[j]) {
                                    vParar = true;
                                    break;
                                }
                            }
                        }
                    }

                    if (vParar) {
                        break;
                    }
                }

                while (!lista2.ListaVazia()) {
                    No atual = lista2.RemoverFinal();
                    int vAtual = atual.valor;

                    for (int j = mat.length - 1; j >= 0; j--) {
                        if (mat[vAtual][j] != 0) {
                            if (vControle1[j] == -1) {
                                vControle1[j] = 0;
                                l = j;
                                lista2.InserirFinal(new No(j), atual);
                                lista3.InserirFinal(new No(j), atual);

                                if (vControle[j] == vControle1[j]) {
                                    vParar = true;
                                    break;
                                }
                            }
                        }
                    }

                    if (vParar) {
                        break;
                    }
                }
            }

            System.out.println();
            System.out.println("********** BIDIRECIONAL ***********");
            System.out.println();

            System.out.println("********** LISTA COMPLETA ***********");
            System.out.println("Lista 1");
            lista1.MostrarLista(vCidade);
            System.out.println();
            System.out.println("Lista 2");
            lista3.MostrarLista(vCidade);
            System.out.println("*************************************");

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("********** MELHOR CAMINHO ***********");
            lista1.MelhorResultado(vOrigem, vDestino, vCidade);
            //lista3.MelhorResultado(vOrigem, vDestino, vCidade);
            System.out.println("*************************************");

            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public class BuscaLargura {

        BuscaLargura(int mat[][], int vOrigem, int vDestino, String vCidade[]) {

            boolean vParar = false;
            int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        

            for (int i = 0; i < vControle.length; i++) {
                vControle[i] = -1;
            }

            Lista lista = new Lista();
            lista.criaLista();
            lista.InserirFinal(new No(vOrigem), null);

            Lista lista1 = new Lista();
            lista1.criaLista();
            lista1.InserirFinal(new No(vOrigem), null);

            while (!lista.ListaVazia()) {
                No atual = lista.RemoverPrimeiro();
                int vAtual = atual.valor;

                for (int j = 0; j < mat.length; j++) {
                    if (mat[vAtual][j] != 0) {

                        if (vControle[j] == -1) {
                            vControle[j] = 0;
                            lista.InserirFinal(new No(j), atual);
                            lista1.InserirFinal(new No(j), atual);

                            if (j == vDestino) {
                                vParar = true;
                                break;
                            }
                        }
                    }
                }

                if (vParar) {
                    break;
                }
            }

            System.out.println();
            System.out.println("********** BUSCA LARGURA ***********");
            System.out.println();

            System.out.println("********** LISTA COMPLETA ***********");
            lista1.MostrarLista(vCidade);
            System.out.println("*************************************");

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("********** MELHOR CAMINHO ***********");
            lista1.MelhorResultado(vOrigem, vDestino, vCidade);
            System.out.println("*************************************");

            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public class BuscaProfundidade {

        BuscaProfundidade(int mat[][], int vOrigem, int vDestino, String vCidade[]) {

            boolean vParar = false;
            int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        
            int vProfundidade = 0;

            for (int i = 0; i < vControle.length; i++) {
                vControle[i] = -1;
            }

            Lista lista = new Lista();
            lista.criaLista();
            lista.InserirFinal(new No(vOrigem), null);

            Lista lista1 = new Lista();
            lista1.criaLista();
            lista1.InserirFinal(new No(vOrigem), null);

            vControle[vOrigem] = vProfundidade;

            while (!lista.ListaVazia()) {
                No atual = lista.RemoverFinal();
                int vAtual = atual.valor;

                vProfundidade = vProfundidade + 1;

                for (int j = 0; j < mat.length; j++) {
                    if (mat[vAtual][j] != 0) {

                        if (vControle[j] > vProfundidade || vControle[j] == -1) {
                            vControle[j] = vProfundidade;
                            lista.InserirFinal(new No(j), atual);
                            lista1.InserirFinal(new No(j), atual);

                            if (j == vDestino) {
                                vParar = true;
                                break;
                            }
                        }
                    }
                }

                if (vParar) {
                    break;
                }
            }
            System.out.println();
            System.out.println("********** BUSCA PROFUNDIDADE ***********");
            System.out.println();

            System.out.println("********** LISTA COMPLETA ***********");
            lista1.MostrarLista(vCidade);
            System.out.println("*************************************");

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("********** MELHOR CAMINHO ***********");
            lista1.MelhorResultado(vOrigem, vDestino, vCidade);
            System.out.println("*************************************");
        }
    }

    public class BuscaProfundidadeLimitada {

        BuscaProfundidadeLimitada(int mat[][], int vOrigem, int vDestino, String vCidade[], int vLimiteProf) {

            boolean vParar = false;
            int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        
            int vProfundidade = 0;

            for (int i = 0; i < vControle.length; i++) {
                vControle[i] = -1;
            }

            Lista lista = new Lista();
            lista.criaLista();
            lista.InserirFinal(new No(vOrigem), null);

            Lista lista1 = new Lista();
            lista1.criaLista();
            lista1.InserirFinal(new No(vOrigem), null);

            vControle[vOrigem] = vProfundidade;

            while (!lista.ListaVazia()) {
                No atual = lista.RemoverFinal();
                int vAtual = atual.valor;

                vProfundidade = vProfundidade + 1;

                for (int j = 0; j < mat.length; j++) {
                    if (mat[vAtual][j] != 0) {

                        if ((vControle[j] > vProfundidade || vControle[j] == -1)) {
                            if (vLimiteProf >= vProfundidade) {
                                vControle[j] = vProfundidade;
                                lista.InserirFinal(new No(j), atual);
                                lista1.InserirFinal(new No(j), atual);

                                if (j == vDestino) {
                                    vParar = true;
                                    break;
                                }
                            }
                        }
                    }
                }

                if (vParar) {
                    break;
                }
            }

            System.out.println();
            System.out.println("********** BUSCA PROFUNDIDADE LIMITADA ***********");
            System.out.println();

            System.out.println("********** LISTA COMPLETA ***********");
            lista1.MostrarLista(vCidade);
            System.out.println("*************************************");

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("********** MELHOR CAMINHO ***********");
            lista1.MelhorResultado(vOrigem, vDestino, vCidade);
            System.out.println("*************************************");
        }
    }

    public class Lista {

        String resultado = "";
        No primeiro, ultimo;
        int tam, TotalDeElementos;

        public void criaLista() {
            primeiro = null;
            ultimo = null;
            tam = 0;
            TotalDeElementos = 0;
        }

        public boolean ListaVazia() {
            if (primeiro == null && ultimo == null) {
                return true;
            } else {
                return false;
            }
        }

        public void InserirFinal(No novoNo, No novoPai) {

            if (ListaVazia()) {
                primeiro = novoNo;
                ultimo = novoNo;
                primeiro.ant = ultimo.ant = null;
            } else {
                ultimo.prox = novoNo;
                novoNo.ant = ultimo;
                novoNo.prox = null;
                ultimo = novoNo;
            }
            novoNo.pai = novoPai;
            tam++;
            TotalDeElementos++;
        }

        public No RemoverFinal() {
            No atual = ultimo;

            if (!ListaVazia()) {
                if (tam > 1) {
                    ultimo = ultimo.ant;
                    ultimo.prox = null;
                } else {
                    ultimo = null;
                    primeiro = null;
                }
                tam--;
            }
            return atual;
        }

        public No RemoverPrimeiro() {
            No atual = primeiro;

            if (!ListaVazia()) {
                if (tam > 1) {
                    primeiro = primeiro.prox;
                    primeiro.ant = null;
                } else {
                    ultimo = null;
                    primeiro = null;
                }
                tam--;
            }
            return atual;
        }

        public void MostrarLista(String vCidade[]) {
            No NoTemp = primeiro;

            for (int i = 0; i < TotalDeElementos; i++) {
                System.out.println("Cidade: " + vCidade[NoTemp.valor]);
                
                NoTemp = NoTemp.prox;
            }

        }

        public void MelhorResultado(int vOrigem, int vDestino, String vCidade[]) {
            No NoTemp = ultimo;
            No NoAux = ultimo.pai;
            int j = 0;

            String vResposta[] = new String[TotalDeElementos];

            for (int i = TotalDeElementos; i > 0; i--) {
                if (NoTemp.valor == vDestino) {
                    vResposta[j] = vCidade[NoTemp.valor];
                    j++;

                    if (vOrigem == vDestino) {
                        break;
                    }

                    NoAux = NoTemp.pai;
                    vDestino = NoAux.valor;
                }
                NoTemp = NoTemp.ant;
            }

            for (int i = j - 1; i >= 0; i--) {
                System.out.println(vResposta[i]);
                resultado += vResposta[i] + '\n';
            }

            if (resultado.contains((CharSequence) destino.getSelectedItem())) {
                mcam.setText(resultado);
            } else {
                mcam.setText("N??o foi possivel chegar no destino com esse limite");
            }

        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aprof;
    private javax.swing.JRadioButton bidir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton largura;
    private javax.swing.JTextField limite;
    private javax.swing.JPanel mapa;
    private javax.swing.JTextArea mcam;
    private javax.swing.JComboBox<String> origem;
    private javax.swing.JRadioButton prof;
    private javax.swing.JRadioButton profLimite;
    // End of variables declaration//GEN-END:variables
}
