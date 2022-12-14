/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolstuff.ibcsia;

/**
 *
 * @author bruhm
 */
public class TutorialScreen extends javax.swing.JFrame {

    /**
     * Creates new form TutorialScreen
     */
    public TutorialScreen() {
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
        tutorialBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tutorialBox.setEditable(false);
        tutorialBox.setColumns(20);
        tutorialBox.setRows(5);
        tutorialBox.setText("Welcome to Client Recorder.\n\nHow to use:\n- The Start/Add Client Screen is the base screen you start on.\n- To add a client, do the following:\n1. Fill in all of the text boxes *except the notes/memo box, which is optional.\n2. Everytime you fill in a box, press enter.\n3. Do not put the dollar ($) sign in the cost box. \n4. Even if you put nothing in the notes/memo box, press enter.\n5. Once you have pressed enter for all boxes, press the \"Add Client\" button at the bottom of the screen.\n6. Your client has been added to a txt file.\n\n- The Search Client screen is accessed by pressing the \"Search\" button at the bottom left.\n- To search a client, do the following:\n1. Type in either the first name or last name of the client.\n2. Press enter to activate search.\n\n- The Delete Client screen is accessed by pressing the \"Delete\" button at the bottom right.\n- To delete a client, do the following:\n1. Press the \"Start\" button at the bottom left to bring up the list of clients you have added so far.\n2. Click one client you would like to delete; when done correctly, the client information should be highlighted.\n3. Press the \"Delete\" button at the bottom right to delete that client from the database (txt file).");
        jScrollPane1.setViewportView(tutorialBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TutorialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorialScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tutorialBox;
    // End of variables declaration//GEN-END:variables
}
