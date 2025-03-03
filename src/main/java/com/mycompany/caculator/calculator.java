/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.caculator;

import java.awt.event.KeyEvent;
import TREE.ExpressionTree;
/**
 *
 * @author LENOVO
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    
    private String expression;
    private double Ans;
    
    public calculator() {
        initComponents();
        this.expression = ""; 
        this.Ans = 0f;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ScreenInput = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        InputText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        InputButton = new javax.swing.JButton();
        ButtonAns = new javax.swing.JButton();
        ACButoon = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        OpenButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        ButtonPow = new javax.swing.JButton();
        ButtonDivide = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonX = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        ButtonSub = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonFloat = new javax.swing.JButton();
        ButtonSQRT = new javax.swing.JButton();
        ButtonCalculate = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ScreenInput.setTitle("Input");
        ScreenInput.setModal(true);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        InputText.setColumns(20);
        InputText.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        InputText.setRows(5);
        InputText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InputTextKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(InputText);

        javax.swing.GroupLayout ScreenInputLayout = new javax.swing.GroupLayout(ScreenInput.getContentPane());
        ScreenInput.getContentPane().setLayout(ScreenInputLayout);
        ScreenInputLayout.setHorizontalGroup(
            ScreenInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScreenInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        ScreenInputLayout.setVerticalGroup(
            ScreenInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScreenInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Screen.setEditable(false);
        Screen.setColumns(20);
        Screen.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        Screen.setRows(5);
        jScrollPane2.setViewportView(Screen);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CALCULATOR");

        jPanel1.setLayout(new java.awt.GridLayout(6, 4));

        InputButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        InputButton.setText("INPUT");
        InputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputButtonActionPerformed(evt);
            }
        });
        jPanel1.add(InputButton);

        ButtonAns.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonAns.setText("Ans");
        ButtonAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnsActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAns);

        ACButoon.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ACButoon.setText("AC");
        ACButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACButoonActionPerformed(evt);
            }
        });
        jPanel1.add(ACButoon);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton4.setText("DEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        OpenButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        OpenButton.setText("(");
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonActionPerformed(evt);
            }
        });
        jPanel1.add(OpenButton);

        CloseButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        CloseButton.setText(")");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CloseButton);

        ButtonPow.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonPow.setText("^");
        ButtonPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPowActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonPow);

        ButtonDivide.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonDivide.setText("/");
        ButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivideActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonDivide);

        Button7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        jPanel1.add(Button7);

        Button8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        jPanel1.add(Button8);

        Button9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        jPanel1.add(Button9);

        ButtonX.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonX.setText("x");
        ButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonX);

        Button4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        jPanel1.add(Button4);

        Button5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        jPanel1.add(Button5);

        Button6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        jPanel1.add(Button6);

        ButtonSub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonSub.setText("-");
        ButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSub);

        Button1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        jPanel1.add(Button1);

        Button2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        jPanel1.add(Button2);

        Button3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        jPanel1.add(Button3);

        ButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonAdd.setText("+");
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAdd);

        Button0.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        jPanel1.add(Button0);

        ButtonFloat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonFloat.setText(".");
        ButtonFloat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFloatActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonFloat);

        ButtonSQRT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonSQRT.setText("sqrt()");
        ButtonSQRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSQRTActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSQRT);

        ButtonCalculate.setBackground(new java.awt.Color(153, 204, 255));
        ButtonCalculate.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonCalculate.setText("=");
        ButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculateActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCalculate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputButtonActionPerformed
        // TODO add your handling code here:
        ScreenInput.setSize(350,125);
        ScreenInput.setVisible(true);
    }//GEN-LAST:event_InputButtonActionPerformed

    private void ButtonPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPowActionPerformed
        // TODO add your handling code here:
        expression += "^"; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonPowActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        // TODO add your handling code here:
        expression += "0"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        expression += "1"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button1ActionPerformed

    private void ButtonFloatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFloatActionPerformed
        // TODO add your handling code here:
        expression += "."; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonFloatActionPerformed

    private void ButtonSQRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSQRTActionPerformed
        // TODO add your handling code here:
        expression += "sqrt("; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonSQRTActionPerformed

    private void ButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculateActionPerformed
        // TODO add your handling code here:
        ExpressionTree tree = new ExpressionTree();
        System.out.println(expression);
        double result = tree.Calculate(expression);
        Ans = result;
        expression = "";
        Screen.setText(String.valueOf(result));
    }//GEN-LAST:event_ButtonCalculateActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        expression += "2"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        expression += "3"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button3ActionPerformed

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        // TODO add your handling code here:
        expression += "+"; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        expression += "4"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        expression += "5"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        expression += "6"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button6ActionPerformed

    private void ButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubActionPerformed
        // TODO add your handling code here:
        expression += "-"; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonSubActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        expression += "7"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        expression += "8"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        expression += "9"; 
        Screen.setText(expression);
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXActionPerformed
        // TODO add your handling code here:
        expression += "x"; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonXActionPerformed

    private void OpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonActionPerformed
        // TODO add your handling code here:
        expression += "("; 
        Screen.setText(expression);
    }//GEN-LAST:event_OpenButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        expression += ")"; 
        Screen.setText(expression);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void ButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivideActionPerformed
        // TODO add your handling code here:
        expression += "/"; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonDivideActionPerformed

    private void ButtonAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnsActionPerformed
        // TODO add your handling code here:
        expression += "Ans"; 
        Screen.setText(expression);
    }//GEN-LAST:event_ButtonAnsActionPerformed

    private void ACButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACButoonActionPerformed
        // TODO add your handling code here:
        expression = "";
        Screen.setText(null);
    }//GEN-LAST:event_ACButoonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (expression.isEmpty()) return;
        expression = expression.substring(0, expression.length()-1);
        Screen.setText(expression);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void InputTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            expression = InputText.getText();
            ScreenInput.setVisible(false);
            Screen.setText(expression);
        }
    }//GEN-LAST:event_InputTextKeyPressed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACButoon;
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonAns;
    private javax.swing.JButton ButtonCalculate;
    private javax.swing.JButton ButtonDivide;
    private javax.swing.JButton ButtonFloat;
    private javax.swing.JButton ButtonPow;
    private javax.swing.JButton ButtonSQRT;
    private javax.swing.JButton ButtonSub;
    private javax.swing.JButton ButtonX;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton InputButton;
    private javax.swing.JTextArea InputText;
    private javax.swing.JButton OpenButton;
    private javax.swing.JTextArea Screen;
    private javax.swing.JDialog ScreenInput;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
