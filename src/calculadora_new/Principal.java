package calculadora_new;

import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Principal extends javax.swing.JFrame {
    String[] ArrayOperaciones = {"*", "-", "+", "/", "%", ".", "^"};
    String regex = String.join("|", Arrays.stream(ArrayOperaciones).map(Pattern::quote).toArray(String[]::new));
    boolean modoOscuro = false;
    int xMouse, yMouse;
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botones = new javax.swing.JPanel();
        borrar = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        division = new javax.swing.JButton();
        por = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        btt0 = new javax.swing.JButton();
        btt1 = new javax.swing.JButton();
        btt2 = new javax.swing.JButton();
        btt3 = new javax.swing.JButton();
        btt4 = new javax.swing.JButton();
        btt5 = new javax.swing.JButton();
        btt6 = new javax.swing.JButton();
        btt7 = new javax.swing.JButton();
        btt8 = new javax.swing.JButton();
        btt9 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        quitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(244, 253, 251));
        pantalla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pantallaMouseDragged(evt);
            }
        });
        pantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pantallaMousePressed(evt);
            }
        });

        txtOperacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        resultado.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        resultado.setForeground(new java.awt.Color(55, 62, 71));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 130));

        botones.setBackground(new java.awt.Color(255, 255, 255));

        borrar.setBackground(new java.awt.Color(242, 253, 251));
        borrar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        borrar.setForeground(new java.awt.Color(55, 62, 71));
        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        potencia.setBackground(new java.awt.Color(242, 253, 251));
        potencia.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        potencia.setForeground(new java.awt.Color(55, 62, 71));
        potencia.setText("^");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        mod.setBackground(new java.awt.Color(242, 253, 251));
        mod.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        mod.setForeground(new java.awt.Color(55, 62, 71));
        mod.setText("%");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        division.setBackground(new java.awt.Color(242, 253, 251));
        division.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        division.setForeground(new java.awt.Color(55, 62, 71));
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        por.setBackground(new java.awt.Color(242, 253, 251));
        por.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        por.setForeground(new java.awt.Color(55, 62, 71));
        por.setText("*");
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(242, 253, 251));
        menos.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        menos.setForeground(new java.awt.Color(55, 62, 71));
        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        mas.setBackground(new java.awt.Color(242, 253, 251));
        mas.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        mas.setForeground(new java.awt.Color(55, 62, 71));
        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        btt0.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt0.setForeground(new java.awt.Color(55, 62, 71));
        btt0.setText("0");
        btt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt0ActionPerformed(evt);
            }
        });

        btt1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt1.setForeground(new java.awt.Color(55, 62, 71));
        btt1.setText("1");
        btt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt1ActionPerformed(evt);
            }
        });

        btt2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt2.setForeground(new java.awt.Color(55, 62, 71));
        btt2.setText("2");
        btt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt2ActionPerformed(evt);
            }
        });

        btt3.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt3.setForeground(new java.awt.Color(55, 62, 71));
        btt3.setText("3");
        btt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt3ActionPerformed(evt);
            }
        });

        btt4.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt4.setForeground(new java.awt.Color(55, 62, 71));
        btt4.setText("4");
        btt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt4ActionPerformed(evt);
            }
        });

        btt5.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt5.setForeground(new java.awt.Color(55, 62, 71));
        btt5.setText("5");
        btt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt5ActionPerformed(evt);
            }
        });

        btt6.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt6.setForeground(new java.awt.Color(55, 62, 71));
        btt6.setText("6");
        btt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt6ActionPerformed(evt);
            }
        });

        btt7.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt7.setForeground(new java.awt.Color(55, 62, 71));
        btt7.setText("7");
        btt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt7ActionPerformed(evt);
            }
        });

        btt8.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt8.setForeground(new java.awt.Color(55, 62, 71));
        btt8.setText("8");
        btt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt8ActionPerformed(evt);
            }
        });

        btt9.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btt9.setForeground(new java.awt.Color(55, 62, 71));
        btt9.setText("9");
        btt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt9ActionPerformed(evt);
            }
        });

        punto.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        punto.setForeground(new java.awt.Color(55, 62, 71));
        punto.setText(".");
        punto.setAlignmentY(0.0F);
        punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        enter.setBackground(new java.awt.Color(0, 203, 192));
        enter.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        enter.setForeground(new java.awt.Color(255, 255, 255));
        enter.setText("=");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        quitar.setBackground(new java.awt.Color(242, 253, 251));
        quitar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        quitar.setForeground(new java.awt.Color(55, 62, 71));
        quitar.setText("<");
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(botonesLayout.createSequentialGroup()
                                .addComponent(btt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(botonesLayout.createSequentialGroup()
                                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btt0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private double evaluateOperation(String operation) {
        String[] tokens = operation.split("(?<=[" + regex + "])|(?=[" + regex + "])"); // Reemplazar los operadores definidos por espacios para la tokenización

        List<String> expression = new ArrayList<>(Arrays.asList(tokens));

        // Aplicar operaciones de par en par según la lista de operadores
        for (String operator : ArrayOperaciones) expression = applyOperation(expression, operator);
        
        return Double.parseDouble(expression.get(0)); // Devolver el resultado final convertido a double
    }

    private List<String> applyOperation(List<String> expression, String operator) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < expression.size()) {
            if (expression.get(i).equals(operator)) {
                double left = Double.parseDouble(result.remove(result.size() - 1));
                double right = Double.parseDouble(expression.get(i + 1));
                double intermediateResult = 0;

                switch (operator) {
                    case "*" -> intermediateResult = left * right;
                    case "/" -> intermediateResult = left / right;
                    case "%" -> intermediateResult = left % right;
                    case "+" -> intermediateResult = left + right;
                    case "-" -> intermediateResult = left - right;
                    case "^" -> intermediateResult = Math.pow(left, right);
                    case "." -> intermediateResult = left + right / Math.pow(10, String.valueOf(right).length());
                }

                result.add(String.valueOf(intermediateResult));
                i += 2;
            } else {
                result.add(expression.get(i));
                i++;
            }
        }
        return result;
    }
    
    private String evaluar(String operacion){
        double result = evaluateOperation(operacion);
        return String.valueOf(result);
    }
    
    private void addNumero(String digito){
        String nuevo = txtOperacion.getText() + digito;
        txtOperacion.setText(nuevo);
    }
    
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        txtOperacion.setText("");
        resultado.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void btt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt1ActionPerformed
        addNumero("1");
        enter.doClick();
    }//GEN-LAST:event_btt1ActionPerformed

    private void btt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt2ActionPerformed
        addNumero("2");
        enter.doClick();
    }//GEN-LAST:event_btt2ActionPerformed

    private void btt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt3ActionPerformed
        addNumero("3");
        enter.doClick();
    }//GEN-LAST:event_btt3ActionPerformed

    private void btt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt0ActionPerformed
        addNumero("0");
        enter.doClick();
    }//GEN-LAST:event_btt0ActionPerformed

    private void btt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt6ActionPerformed
        addNumero("6");
        enter.doClick();
    }//GEN-LAST:event_btt6ActionPerformed

    private void btt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt5ActionPerformed
        addNumero("5");
        enter.doClick();
    }//GEN-LAST:event_btt5ActionPerformed

    private void btt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt4ActionPerformed
        addNumero("4");
        enter.doClick();
    }//GEN-LAST:event_btt4ActionPerformed

    private void btt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt9ActionPerformed
        addNumero("9");
        enter.doClick();
    }//GEN-LAST:event_btt9ActionPerformed

    private void btt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt8ActionPerformed
        addNumero("8");
        enter.doClick();
    }//GEN-LAST:event_btt8ActionPerformed

    private void btt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt7ActionPerformed
        addNumero("7");
        enter.doClick();
    }//GEN-LAST:event_btt7ActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        addNumero(".");
    }//GEN-LAST:event_puntoActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        addNumero("/");
    }//GEN-LAST:event_divisionActionPerformed

    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
        addNumero("*");
    }//GEN-LAST:event_porActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        addNumero("-");
    }//GEN-LAST:event_menosActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        addNumero("+");
    }//GEN-LAST:event_masActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        addNumero("%");
    }//GEN-LAST:event_modActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        addNumero("^");
    }//GEN-LAST:event_potenciaActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        try {
            resultado.setText(evaluar(txtOperacion.getText()));
        } catch (Exception e) {
            resultado.setText("Error");
        }
    }//GEN-LAST:event_enterActionPerformed

    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed
        String quitarUltimo = txtOperacion.getText();
        if (quitarUltimo.isBlank() == false || quitarUltimo.isEmpty() == false){
            txtOperacion.setText(quitarUltimo.substring(0, quitarUltimo.length()-1));
        }
    }//GEN-LAST:event_quitarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (!modoOscuro) {
            Color fondo1Dark = Color.decode("#212b41"); 
            Color fondo2Dark = Color.decode("#2e3951");
            Color textColor = Color.decode("#0db387");

            pantalla.setBackground(fondo1Dark);
            botones.setBackground(fondo2Dark);

            txtOperacion.setForeground(textColor);
            resultado.setForeground(textColor);

            division.setBackground(fondo1Dark);
            mas.setBackground(fondo1Dark);
            por.setBackground(fondo1Dark);
            potencia.setBackground(fondo1Dark);
            borrar.setBackground(fondo1Dark);
            menos.setBackground(fondo1Dark);
            mod.setBackground(fondo1Dark);
            quitar.setBackground(fondo1Dark);
            punto.setBackground(fondo1Dark);

            division.setForeground(textColor);
            mas.setForeground(textColor);
            por.setForeground(textColor);
            potencia.setForeground(textColor);
            borrar.setForeground(textColor);
            menos.setForeground(textColor);
            mod.setForeground(textColor);
            quitar.setForeground(textColor);
            punto.setForeground(textColor);


            btt1.setBackground(fondo2Dark);
            btt2.setBackground(fondo2Dark);
            btt3.setBackground(fondo2Dark);
            btt4.setBackground(fondo2Dark);
            btt5.setBackground(fondo2Dark);
            btt6.setBackground(fondo2Dark);
            btt7.setBackground(fondo2Dark);
            btt8.setBackground(fondo2Dark);
            btt9.setBackground(fondo2Dark);
            btt0.setBackground(fondo2Dark);

            btt0.setForeground(Color.WHITE);
            btt1.setForeground(Color.WHITE);
            btt2.setForeground(Color.WHITE);
            btt3.setForeground(Color.WHITE);
            btt4.setForeground(Color.WHITE);
            btt5.setForeground(Color.WHITE);
            btt6.setForeground(Color.WHITE);
            btt7.setForeground(Color.WHITE);
            btt8.setForeground(Color.WHITE);
            btt9.setForeground(Color.WHITE);
            modoOscuro = true;
        } else {
            Principal new_p = new Principal();
            this.dispose();
            new_p.setVisible(true);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pantallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pantallaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pantallaMousePressed

    private void pantallaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pantallaMouseDragged
        this.setLocation(evt.getXOnScreen()-xMouse, evt.getYOnScreen()-yMouse);
    }//GEN-LAST:event_pantallaMouseDragged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JPanel botones;
    private javax.swing.JButton btt0;
    private javax.swing.JButton btt1;
    private javax.swing.JButton btt2;
    private javax.swing.JButton btt3;
    private javax.swing.JButton btt4;
    private javax.swing.JButton btt5;
    private javax.swing.JButton btt6;
    private javax.swing.JButton btt7;
    private javax.swing.JButton btt8;
    private javax.swing.JButton btt9;
    private javax.swing.JButton division;
    private javax.swing.JButton enter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton mod;
    private javax.swing.JPanel pantalla;
    private javax.swing.JButton por;
    private javax.swing.JButton potencia;
    private javax.swing.JButton punto;
    private javax.swing.JButton quitar;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel txtOperacion;
    // End of variables declaration//GEN-END:variables
}
