/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class SimpleCalculator extends javax.swing.JFrame {

    float value1;
    float value2;
    float result;
    char oprator;
    
    
    public SimpleCalculator() {
        initComponents();
        onBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupBtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        oneBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        allClearBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        substractionBtn = new javax.swing.JButton();
        additionBtn = new javax.swing.JButton();
        multificationBtn = new javax.swing.JButton();
        precentageBtn = new javax.swing.JButton();
        divitionBtn = new javax.swing.JButton();
        offBtn = new javax.swing.JRadioButton();
        onBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimpleCalculator");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 50));

        oneBtn.setBackground(new java.awt.Color(51, 153, 255));
        oneBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        oneBtn.setText("1");
        oneBtn.setBorderPainted(false);
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });
        jPanel1.add(oneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 40));

        fourBtn.setBackground(new java.awt.Color(51, 153, 255));
        fourBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fourBtn.setText("4");
        fourBtn.setBorderPainted(false);
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fourBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 40));

        zeroBtn.setBackground(new java.awt.Color(51, 153, 255));
        zeroBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.setBorderPainted(false);
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });
        jPanel1.add(zeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, 40));

        sevenBtn.setBackground(new java.awt.Color(51, 153, 255));
        sevenBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.setBorderPainted(false);
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sevenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 40));

        twoBtn.setBackground(new java.awt.Color(51, 153, 255));
        twoBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        twoBtn.setText("2");
        twoBtn.setBorderPainted(false);
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(twoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 80, 40));

        allClearBtn.setBackground(new java.awt.Color(51, 153, 255));
        allClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        allClearBtn.setText("AC");
        allClearBtn.setBorderPainted(false);
        allClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(allClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 80, 40));

        fiveBtn.setBackground(new java.awt.Color(51, 153, 255));
        fiveBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.setBorderPainted(false);
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, 40));

        dotBtn.setBackground(new java.awt.Color(51, 153, 255));
        dotBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dotBtn.setText(".");
        dotBtn.setBorderPainted(false);
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dotBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 80, 40));

        eightBtn.setBackground(new java.awt.Color(51, 153, 255));
        eightBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eightBtn.setText("8");
        eightBtn.setBorderPainted(false);
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 80, 40));

        threeBtn.setBackground(new java.awt.Color(51, 153, 255));
        threeBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        threeBtn.setText("3");
        threeBtn.setBorderPainted(false);
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(threeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 80, 40));

        ClearBtn.setBackground(new java.awt.Color(51, 153, 255));
        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ClearBtn.setText("C");
        ClearBtn.setBorderPainted(false);
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 80, 40));

        sixBtn.setBackground(new java.awt.Color(51, 153, 255));
        sixBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sixBtn.setText("6");
        sixBtn.setBorderPainted(false);
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sixBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, 40));

        equalBtn.setBackground(new java.awt.Color(51, 153, 255));
        equalBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setBorderPainted(false);
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(equalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 80, 40));

        nineBtn.setBackground(new java.awt.Color(51, 153, 255));
        nineBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nineBtn.setText("9");
        nineBtn.setBorderPainted(false);
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 80, 40));

        substractionBtn.setBackground(new java.awt.Color(51, 153, 255));
        substractionBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        substractionBtn.setText("-");
        substractionBtn.setBorderPainted(false);
        substractionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(substractionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 40));

        additionBtn.setBackground(new java.awt.Color(51, 153, 255));
        additionBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        additionBtn.setText("+");
        additionBtn.setBorderPainted(false);
        additionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(additionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, 40));

        multificationBtn.setBackground(new java.awt.Color(51, 153, 255));
        multificationBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        multificationBtn.setText("*");
        multificationBtn.setBorderPainted(false);
        multificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multificationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(multificationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 80, 40));

        precentageBtn.setBackground(new java.awt.Color(51, 153, 255));
        precentageBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        precentageBtn.setText("%");
        precentageBtn.setBorderPainted(false);
        precentageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precentageBtnActionPerformed(evt);
            }
        });
        jPanel1.add(precentageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 80, 40));

        divitionBtn.setBackground(new java.awt.Color(51, 153, 255));
        divitionBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        divitionBtn.setText("/");
        divitionBtn.setBorderPainted(false);
        divitionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divitionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(divitionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 80, 40));

        groupBtn.add(offBtn);
        offBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        offBtn.setText("OFF");
        offBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offBtnActionPerformed(evt);
            }
        });
        jPanel1.add(offBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        groupBtn.add(onBtn);
        onBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        onBtn.setText("ON");
        onBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBtnActionPerformed(evt);
            }
        });
        jPanel1.add(onBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        
        display.setText(display.getText()+"5");
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        
        display.setText(display.getText()+"9");
    }//GEN-LAST:event_nineBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        
        display.setText(display.getText()+"0");
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        
        display.setText(display.getText()+"1");
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        
        display.setText(display.getText()+"2");
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        
        display.setText(display.getText()+"3");
    }//GEN-LAST:event_threeBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        
        display.setText(display.getText()+"4");
    }//GEN-LAST:event_fourBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        
        display.setText(display.getText()+"6");
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        
        display.setText(display.getText()+"7");
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        
        display.setText(display.getText()+"8");
    }//GEN-LAST:event_eightBtnActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        
        display.setText(display.getText()+".");
    }//GEN-LAST:event_dotBtnActionPerformed

    private void additionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionBtnActionPerformed
       
        try{
            oprator='+';
            value1=Float.parseFloat(display.getText());
            display.setText("");
        }catch(Exception e){
            display.setText("invalid input!");
        }
    }//GEN-LAST:event_additionBtnActionPerformed

    private void substractionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractionBtnActionPerformed
        
        try{
            oprator='-';
            value1=Float.parseFloat(display.getText());
            display.setText("");
        }catch(Exception e){
            display.setText("invalid input!");
        }
    }//GEN-LAST:event_substractionBtnActionPerformed

    private void multificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multificationBtnActionPerformed
        
        try{
            oprator='*';
            value1=Float.parseFloat(display.getText());
            display.setText("");
        }catch(Exception e){
            display.setText("invalid input!");
        }
    }//GEN-LAST:event_multificationBtnActionPerformed

    private void divitionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divitionBtnActionPerformed
        
        try{
            oprator='/';
            value1=Float.parseFloat(display.getText());
            display.setText("");
        }catch(Exception e){
            display.setText("invalid input!");
        }
    }//GEN-LAST:event_divitionBtnActionPerformed

    private void precentageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precentageBtnActionPerformed
        
        try{
            oprator='%';
            value1=Float.parseFloat(display.getText());
            display.setText("");
        }catch(Exception e){
            display.setText("invalid input!");
        }
    }//GEN-LAST:event_precentageBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        
        try{
            
        
        if(oprator=='+'){
            value2=Float.parseFloat(display.getText());
            result=value1+value2;
            display.setText(Float.toString(result));
        }
        else if(oprator=='-'){
            value2=Float.parseFloat(display.getText());
            result=value1-value2;
            display.setText(Float.toString(result));
        }
        else if(oprator=='*'){
            value2=Float.parseFloat(display.getText());
            result=value1*value2;
            display.setText(Float.toString(result));
        }
        else if(oprator=='/'){
            value2=Float.parseFloat(display.getText());
            result=value1/value2;
            display.setText(Float.toString(result));
        }
        else if(oprator=='%'){
            
            if(display.getText().equals("")){
                value2=1;
            }
            else{
                value2=Float.parseFloat(display.getText());
                        
            }
            result=(value1/value2)*100;
            display.setText(Float.toString(result));
        }
        else{
            display.setText("invalid oprator!");
        }
        
        }catch(Exception e){
            display.setText("invalid input!");
                }
    }//GEN-LAST:event_equalBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        
        String number=display.getText();
        
        if(number!=null && !number.isEmpty()){
            display.setText(number.substring(0,number.length()-1));
        }
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void allClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allClearBtnActionPerformed
        
        display.setText("");
        value1=0;
        value2=0;
        result=0;
        oprator='\u0000';
    }//GEN-LAST:event_allClearBtnActionPerformed

    private void onBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBtnActionPerformed
       
        onBtn.setEnabled(false);//onBtn function is disable
        offBtn.setEnabled(true);//offBtn functio is enable
        ClearBtn.setEnabled(true);
        additionBtn.setEnabled(true);
        allClearBtn.setEnabled(true);
        display.setEnabled(true);
        divitionBtn.setEnabled(true);
        dotBtn.setEnabled(true);
        eightBtn.setEnabled(true);
        equalBtn.setEnabled(true);
        fiveBtn.setEnabled(true);
        fourBtn.setEnabled(true);
        jPanel1.setEnabled(true);
        multificationBtn.setEnabled(true);
        nineBtn.setEnabled(true);
        oneBtn.setEnabled(true);
        precentageBtn.setEnabled(true);
        sevenBtn.setEnabled(true);
        sixBtn.setEnabled(true);
        substractionBtn.setEnabled(true);
        threeBtn.setEnabled(true);
        twoBtn.setEnabled(true);
        zeroBtn.setEnabled(true);
    }//GEN-LAST:event_onBtnActionPerformed

    private void offBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offBtnActionPerformed
        
        onBtn.setEnabled(true);//onBtn function is enable
        offBtn.setEnabled(false);//offBtn function is disable
        ClearBtn.setEnabled(false);
        additionBtn.setEnabled(false);
        allClearBtn.setEnabled(false);
        display.setEnabled(false);
        divitionBtn.setEnabled(false);
        dotBtn.setEnabled(false);
        eightBtn.setEnabled(false);
        equalBtn.setEnabled(false);
        fiveBtn.setEnabled(false);
        fourBtn.setEnabled(false);
        jPanel1.setEnabled(false);
        multificationBtn.setEnabled(false);
        nineBtn.setEnabled(false);
        oneBtn.setEnabled(false);
        precentageBtn.setEnabled(false);
        sevenBtn.setEnabled(false);
        sixBtn.setEnabled(false);
        substractionBtn.setEnabled(false);
        threeBtn.setEnabled(false);
        twoBtn.setEnabled(false);
        zeroBtn.setEnabled(false);
    }//GEN-LAST:event_offBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton additionBtn;
    private javax.swing.JButton allClearBtn;
    private javax.swing.JTextField display;
    private javax.swing.JButton divitionBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.ButtonGroup groupBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multificationBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JRadioButton offBtn;
    private javax.swing.JRadioButton onBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton precentageBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton substractionBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
