package numerical_analysis;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tokenizer.TokenizerException;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        jTextArea1.setEditable(false);
        getContentPane().setBackground(Color.decode("#57A8F1"));  //Whatever color
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_number = new javax.swing.JTextField();
        id_true = new javax.swing.JTextField();
        id_app = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        id_result = new javax.swing.JTextArea();
        id_number2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id_number3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        id_result1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        id_number4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        id_result2 = new javax.swing.JTextArea();
        id_x0 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        id_result3 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        id_result4 = new javax.swing.JTextArea();
        id_n_el = new javax.swing.JTextField();
        id_n_col = new javax.swing.JTextField();
        id_n_row = new javax.swing.JTextField();
        id_x_c = new javax.swing.JTextField();
        id_y_x = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id_NEWTON_nu = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        id_NEWTON_res = new javax.swing.JTextArea();
        id_NEWTON_bt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        id_x1 = new javax.swing.JTextField();
        id_false = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        id_result5 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Numerical Analysis");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_number.setText("Add number to be rounded to 2 decimal places");
        id_number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_numberMouseClicked(evt);
            }
        });
        id_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_numberActionPerformed(evt);
            }
        });
        getContentPane().add(id_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 280, 30));

        id_true.setText("Please add true vale");
        id_true.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_trueMouseClicked(evt);
            }
        });
        getContentPane().add(id_true, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        id_app.setText("add approximate vale");
        id_app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_appMouseClicked(evt);
            }
        });
        getContentPane().add(id_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 102, -1, -1));

        id_result.setEditable(false);
        id_result.setColumns(20);
        id_result.setRows(5);
        jScrollPane1.setViewportView(id_result);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 142, 280, 152));

        id_number2.setText("Please add number");
        id_number2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_number2MouseClicked(evt);
            }
        });
        getContentPane().add(id_number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ERRORS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 4, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SIGNIFICANT DIGITS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BISECTION METHOD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        id_number3.setText("Please add function");
        id_number3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_number3MouseClicked(evt);
            }
        });
        getContentPane().add(id_number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Calculate");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        id_result1.setEditable(false);
        id_result1.setColumns(20);
        id_result1.setRows(5);
        jScrollPane3.setViewportView(id_result1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 200, 174));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ITERATION METHOD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        id_number4.setText("Please add function");
        id_number4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_number4MouseClicked(evt);
            }
        });
        getContentPane().add(id_number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 200, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setText("Calculate");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        id_result2.setEditable(false);
        id_result2.setColumns(20);
        id_result2.setRows(5);
        jScrollPane5.setViewportView(id_result2);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 230, 174));

        id_x0.setText("add X0");
        id_x0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_x0MouseClicked(evt);
            }
        });
        getContentPane().add(id_x0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("FALSE POSITION ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("Calculate");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        id_result3.setEditable(false);
        id_result3.setColumns(20);
        id_result3.setRows(5);
        jScrollPane6.setViewportView(id_result3);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 200, 152));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setText("Calculate");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        id_result4.setEditable(false);
        id_result4.setColumns(20);
        id_result4.setRows(5);
        jScrollPane7.setViewportView(id_result4);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 250, 174));

        id_n_el.setText("n for element");
        id_n_el.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_n_elMouseClicked(evt);
            }
        });
        getContentPane().add(id_n_el, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        id_n_col.setText("n of column");
        id_n_col.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_n_colMouseClicked(evt);
            }
        });
        getContentPane().add(id_n_col, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        id_n_row.setText("n of row");
        id_n_row.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_n_rowMouseClicked(evt);
            }
        });
        getContentPane().add(id_n_row, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        id_x_c.setText("Insert the values of column x");
        id_x_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_x_cMouseClicked(evt);
            }
        });
        id_x_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_x_cActionPerformed(evt);
            }
        });
        getContentPane().add(id_x_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 230, -1));

        id_y_x.setText("Insert the values of column y");
        id_y_x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_y_xMouseClicked(evt);
            }
        });
        getContentPane().add(id_y_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 230, -1));

        jLabel6.setText("Operation:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));

        jTextField1.setText("Upper Value");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        jTextField2.setText("Lower Value");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("NEWTON-RAPHSON");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        id_NEWTON_nu.setText("add function");
        id_NEWTON_nu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_NEWTON_nuMouseClicked(evt);
            }
        });
        getContentPane().add(id_NEWTON_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 187, -1));

        id_NEWTON_res.setEditable(false);
        id_NEWTON_res.setColumns(20);
        id_NEWTON_res.setRows(5);
        jScrollPane8.setViewportView(id_NEWTON_res);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 207, 152));

        id_NEWTON_bt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_NEWTON_bt.setText("Calculate");
        id_NEWTON_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_NEWTON_btMouseClicked(evt);
            }
        });
        id_NEWTON_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_NEWTON_btActionPerformed(evt);
            }
        });
        getContentPane().add(id_NEWTON_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 220, 160));

        id_x1.setText("add X0");
        id_x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_x1MouseClicked(evt);
            }
        });
        getContentPane().add(id_x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, -1));

        id_false.setText("add function");
        id_false.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_falseMouseClicked(evt);
            }
        });
        getContentPane().add(id_false, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 189, -1));

        id_result5.setEditable(false);
        id_result5.setColumns(20);
        id_result5.setRows(5);
        jScrollPane10.setViewportView(id_result5);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 280, 174));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setText("Calculate");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, -1, -1));

        jTextField3.setText("1st Floating Point Number");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 270, -1));

        jTextField4.setText("2nd Floating Point Number");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 270, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("INTERPOLATION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Floating Point Numbers");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, 20));

        jCheckBox1.setText("Add");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        jCheckBox2.setText("Subtract");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, -1, -1));

        jCheckBox3.setText("Multiply");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, -1, -1));

        jCheckBox4.setText("Divide");
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Team Members");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 650, 370, 30));

        getAccessibleContext().setAccessibleName("NumericalAnalysis");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        id_result.setText("");
        String number_text = id_number.getText();
        String true_text = id_true.getText();
        String app_text = id_app.getText();
        if (number_text.equals("") || true_text.equals("") || app_text.equals("")) {

            id_result.setText("rong input value");
        } else {
            NumericalErrors d1 = new NumericalErrors();
            d1.function = Double.valueOf(number_text);
            d1.true_value = Double.valueOf(true_text);
            d1.approx_value = Double.valueOf(app_text);
            d1.set_data();

            id_result.setText(d1.toString());
        }

        //System.out.println(d1);
        //String result_text=id_result.setText(d1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void id_numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_numberMouseClicked
        id_number.setText("");
    }//GEN-LAST:event_id_numberMouseClicked

    private void id_trueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_trueMouseClicked
        id_true.setText("");
    }//GEN-LAST:event_id_trueMouseClicked

    private void id_appMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_appMouseClicked
        id_app.setText("");
    }//GEN-LAST:event_id_appMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jTextArea1.setText("");
        String number_text = id_number2.getText();

        if (number_text.equals("") || number_text.equals("Please add number")) {
            jTextArea1.setText("rong input value");
        } else {
            ArrayList<Integer> signifi = new ArrayList<Integer>();

            SignificantDigits s1 = new SignificantDigits();

            signifi = s1.findSignificantDigits(number_text);
            for (int i = 0; i < signifi.size(); i++) {

                jTextArea1.setText(signifi.toString() + "\n");
            }

            //System.out.print(signifi.get(i)+"");
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void id_number2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_number2MouseClicked
        id_number2.setText("");
    }//GEN-LAST:event_id_number2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        id_result1.setText("");
        String number_text = id_number3.getText();
        if (number_text.equals("")) {
            id_result1.setText("rong input value");
        } else {
            BisectionMethod bi = new BisectionMethod();
            bi.function = number_text;
            bi.calculate();

            double number = bi.x;
            Double doubleInstance = new Double(number);
            String numberAsString = doubleInstance.toString();

            id_result1.setText("the root is " + numberAsString);
        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void id_number3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_number3MouseClicked
        id_number3.setText("");
    }//GEN-LAST:event_id_number3MouseClicked

    private void id_number4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_number4MouseClicked
        id_number4.setText("");
    }//GEN-LAST:event_id_number4MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        id_result2.setText("");

        String x0 = id_x0.getText();
        String number_text = id_number4.getText();

        if (x0.equals("") || number_text.equals("")) {
            id_result2.setText("rong input value");
        } else {

            IterationMethod i1 = new IterationMethod();
            i1.function = number_text;
            i1.x = Double.valueOf(x0);;
            i1.calculate();

            if (i1.ans.length < 5) {
                id_result2.setText("not found");
            } else {
                for (int i = 0; i < i1.ans.length; ++i) {
                    id_result2.setText(id_result2.getText() + "\n" + i1.ans[i]);
                }
            }
        }

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void id_x0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_x0MouseClicked
        id_x0.setText("");
    }//GEN-LAST:event_id_x0MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        id_result3.setText("");
        String id_false_method = id_false.getText();
        String upper = jTextField1.getText();
        String lower = jTextField2.getText();
        String output;

        if ((jTextField1.getText()).equals("") || (jTextField2.getText()).equals("") || (id_false.getText()).equals("")) {
            id_result3.setText("rong input value");
        } else {
            FalsePositionMethod fal = new FalsePositionMethod();
            try {
                output = fal.findRootByFalsePositionMethod(id_false_method, upper, lower);
                id_result3.setText(output);

            } catch (TokenizerException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked

        id_result4.setText("");

        String for_x = id_x_c.getText();
        String for_y = id_y_x.getText();

        String n_el = id_n_el.getText();
        String n_col = id_n_col.getText();
        String n_row = id_n_row.getText();

        if (for_x.equals("") || for_y.equals("") || n_el.equals("") || n_el.equals("") || n_col.equals("") || n_row.equals("")) {

            id_result4.setText("rong input value");
        } else {

            InterpolationMethod int1 = new InterpolationMethod();
            int1.array_x = for_x;
            int1.array_y = for_y;
            int1.column = Integer.valueOf(n_col);
            int1.row = Integer.valueOf(n_row);
            int1.number = Integer.valueOf(n_el);
            int1.calculate();

            id_result4.setText(int1.resu);
        }

    }//GEN-LAST:event_jButton6MouseClicked

    private void id_x_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_x_cMouseClicked
        id_x_c.setText("");
    }//GEN-LAST:event_id_x_cMouseClicked

    private void id_y_xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_y_xMouseClicked
        id_y_x.setText("");
    }//GEN-LAST:event_id_y_xMouseClicked

    private void id_n_elMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_n_elMouseClicked
        id_n_el.setText("");
    }//GEN-LAST:event_id_n_elMouseClicked

    private void id_n_colMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_n_colMouseClicked
        id_n_col.setText("");
    }//GEN-LAST:event_id_n_colMouseClicked

    private void id_n_rowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_n_rowMouseClicked
        id_n_row.setText("");
    }//GEN-LAST:event_id_n_rowMouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void id_NEWTON_nuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_NEWTON_nuMouseClicked
        id_NEWTON_nu.setText("");
    }//GEN-LAST:event_id_NEWTON_nuMouseClicked

    private void id_NEWTON_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_NEWTON_btMouseClicked
        String output = null;
        id_NEWTON_res.setText("");
        String function = id_NEWTON_nu.getText();
        String id_x1 = this.id_x1.getText();
        if (function.equals("") || id_x1.equals("")) {
            output = "rong input value";
        } else {
            NewtonRaphsonMethod ne = new NewtonRaphsonMethod();
            try {
                output = ne.findRootByNewtonRaphsonMethod(function, id_x1);
            } catch (TokenizerException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        id_NEWTON_res.setText(output);
    }//GEN-LAST:event_id_NEWTON_btMouseClicked

    private void id_NEWTON_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_NEWTON_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_NEWTON_btActionPerformed

    private void id_x1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_x1MouseClicked
        id_x1.setText("");
    }//GEN-LAST:event_id_x1MouseClicked

    private void id_falseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_falseMouseClicked
        id_false.setText("");
    }//GEN-LAST:event_id_falseMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        //Floating-Point Numbers Calculate Button
        String n1 = jTextField3.getText();
        String n2 = jTextField4.getText();
        String res = "";
        if (jCheckBox1.isSelected()) {
            if (res != "") {
                res += "\n";
            }
            res += "Sum = " + FloatNumber.addFloatNumbers(n1, n2);
        }
        if (jCheckBox2.isSelected()) {
            if (res != "") {
                res += "\n";
            }
            res += "Subtration = " + FloatNumber.subtractFloatNumbers(n1, n2);
        }
        if (jCheckBox3.isSelected()) {
            if (res != "") {
                res += "\n";
            }
            res += "Multiplcation = " + FloatNumber.multiplyFloatNumbers(n1, n2);
        }
        if (jCheckBox4.isSelected()) {
            if (res != "") {
                res += "\n";
            }
            res += "Division = " + FloatNumber.divideFloatNumbers(n1, n2);
        }

        id_result5.setText(res);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void id_x_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_x_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_x_cActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void id_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_numberActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "-------------------------------------------\n"
                + "|               Team Work                    |\n"
                + "|       Fayad MOhamed Fayad      |\n"
                + "|         Muhammad Al-Halaby       |\n"
                + "|              Mostafa Elsherif             |\n"
                + "|               Islam M. Kortam            |\n"
                + "|  Abdelrahman Abdelmoneem  |\n"
                + "|              Ahmed Ghanem             |\n"
                + "|            Ammar Abdelrazik            |\n"
                + "--------------------------------------------", "Team Memmbers Names" + "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton8MouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton id_NEWTON_bt;
    private javax.swing.JTextField id_NEWTON_nu;
    private javax.swing.JTextArea id_NEWTON_res;
    private javax.swing.JTextField id_app;
    private javax.swing.JTextField id_false;
    private javax.swing.JTextField id_n_col;
    private javax.swing.JTextField id_n_el;
    private javax.swing.JTextField id_n_row;
    private javax.swing.JTextField id_number;
    private javax.swing.JTextField id_number2;
    private javax.swing.JTextField id_number3;
    private javax.swing.JTextField id_number4;
    private javax.swing.JTextArea id_result;
    private javax.swing.JTextArea id_result1;
    private javax.swing.JTextArea id_result2;
    private javax.swing.JTextArea id_result3;
    private javax.swing.JTextArea id_result4;
    private javax.swing.JTextArea id_result5;
    private javax.swing.JTextField id_true;
    private javax.swing.JTextField id_x0;
    private javax.swing.JTextField id_x1;
    private javax.swing.JTextField id_x_c;
    private javax.swing.JTextField id_y_x;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
