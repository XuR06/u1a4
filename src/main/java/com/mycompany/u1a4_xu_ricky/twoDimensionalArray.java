/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a4_xu_ricky;

/**
 *
 * @author 343207676
 */
public class twoDimensionalArray extends javax.swing.JFrame {
    
    String[][] grades = new String[30][6];
    int numOfStudents = 0;
    

    /**
     * Creates new form twoDimensionalArray
     */
    public twoDimensionalArray() {
        initComponents();
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
        arrayOutput = new javax.swing.JTextArea();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        firstHeading = new javax.swing.JLabel();
        secondHeading = new javax.swing.JLabel();
        testOne = new javax.swing.JTextField();
        testTwo = new javax.swing.JTextField();
        testThree = new javax.swing.JTextField();
        testFour = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        calcAvg = new javax.swing.JButton();
        courseAvg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grade Calculator ");

        arrayOutput.setEditable(false);
        arrayOutput.setColumns(20);
        arrayOutput.setRows(5);
        jScrollPane1.setViewportView(arrayOutput);

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        firstHeading.setText("First Name");

        secondHeading.setText("Last Name");

        jLabel1.setText("Test 1:");

        jLabel2.setText("Test 2: ");

        jLabel3.setText("Test 3: ");

        jLabel4.setText("Test 4:");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        calcAvg.setText("Student Average");
        calcAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAvgActionPerformed(evt);
            }
        });

        courseAvg.setText("Course Average");
        courseAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAvgActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(firstHeading)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secondHeading)
                            .addGap(51, 51, 51))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(testOne)
                                .addComponent(testTwo)
                                .addComponent(testThree)
                                .addComponent(testFour))
                            .addGap(33, 33, 33)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(calcAvg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseAvg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstHeading)
                            .addComponent(secondHeading))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addComponent(add))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(calcAvg)
                        .addGap(18, 18, 18)
                        .addComponent(courseAvg)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        String str = "";
        double testMarkAsDouble = 0;
        output.setText("");
        
        if (numOfStudents == 30){
            output.setText("The array is full");
            return;
        }
        
        grades[numOfStudents][0] = firstName.getText().trim();
        grades[numOfStudents][1] = lastName.getText().trim();
        grades[numOfStudents][2] = testOne.getText().trim();
        grades[numOfStudents][3] = testTwo.getText().trim();
        grades[numOfStudents][4] = testThree.getText().trim();
        grades[numOfStudents][5] = testFour.getText().trim();

        try {
        for (int i = 2; i <= 5; i++) {
            testMarkAsDouble = Double.parseDouble(grades[numOfStudents][i]);
            if (testMarkAsDouble > 100 || testMarkAsDouble < 0) {
                output.setText("Invalid Input for Test Marks (Must be from 0-100)");
                return;
            }
        }
        } catch (Exception e) {
            output.setText("Please Enter Numbers As Test Marks");
            return;
        }
        
        if (numOfStudents > 0) {
            for (int i = 1; i <= numOfStudents; i++) {
                if (grades[numOfStudents][0].equals(grades[i-1][0]) && grades[numOfStudents][1].equals(grades[i-1][1])) {
                    output.setText("There is already a student with the same first and last name");
                    return;
                }
            }
        }

        for (int l = 0; l <= numOfStudents; l++) {
            str += grades[l][0];
            str += " ";
            str += grades[l][1];
            str += " ";
            str += grades[l][2];
            str += " ";
            str += grades[l][3];
            str += " ";
            str += grades[l][4];
            str += " ";
            str += grades[l][5];
            str += "\n";
            arrayOutput.setText(str);

        }

        numOfStudents++;
    }//GEN-LAST:event_addActionPerformed

    private void calcAvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcAvgActionPerformed
        // TODO add your handling code here:
        
        String firstNameAvg = firstName.getText().trim();
        String lastNameAvg = lastName.getText().trim();
        double avg = 0;
        
        
        for (int i = 0; i <= numOfStudents; i++){
            if (grades[i][0].equals(firstNameAvg) && grades[i][1].equals(lastNameAvg)){
                for (int l = 2; l <= 5; l++){
                avg += Double.parseDouble(grades[i][l]);
                } 
             avg /= 4;
             output.setText(""+firstNameAvg+" "+lastNameAvg+"'s Average is "+avg);
             break;
            } else
                output.setText("The Students Test Grades Were Not Inputted");
        }
    }//GEN-LAST:event_calcAvgActionPerformed

    private void courseAvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAvgActionPerformed
        // TODO add your handling code here:
        double courseAvg = 0;
        int count = 0;
        
        
        try {
            
                for (int i = 0; i < numOfStudents; i++) {
                    for (int l = 2; l <= 5; l++) {
                        courseAvg += Double.parseDouble(grades[i][l]);
                        count++;
                    }
                }
                courseAvg = courseAvg / count;
                output.setText("The Course Average is " + courseAvg + "%");
            
        } catch (Exception e) {
            output.setText("There are no inputs in the array");
            
        }
        
        
    }//GEN-LAST:event_courseAvgActionPerformed

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
            java.util.logging.Logger.getLogger(twoDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(twoDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(twoDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(twoDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new twoDimensionalArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea arrayOutput;
    private javax.swing.JButton calcAvg;
    private javax.swing.JButton courseAvg;
    private javax.swing.JLabel firstHeading;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextArea output;
    private javax.swing.JLabel secondHeading;
    private javax.swing.JTextField testFour;
    private javax.swing.JTextField testOne;
    private javax.swing.JTextField testThree;
    private javax.swing.JTextField testTwo;
    // End of variables declaration//GEN-END:variables
}
