package it.unibas.associazioni.vista;

import it.unibas.associazioni.Applicazione;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class Frame extends javax.swing.JFrame {

    public Frame() {
        
    }
    
    public void inizializza(){
        initComponents();
        this.setContentPane(new JScrollPane(Applicazione.getInstance().getPannelloPrincipale()));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void mostraErrori(String msg){
        JOptionPane.showMessageDialog(this, msg, "ERRORI", JOptionPane.ERROR_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
        itemInserisciPersona = new javax.swing.JMenuItem();
        itemCalcolaStatistica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        itemInserisciPersona.setText("jMenuItem1");
        jMenu1.add(itemInserisciPersona);

        itemCalcolaStatistica.setText("jMenuItem2");
        jMenu1.add(itemCalcolaStatistica);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCalcolaStatistica;
    private javax.swing.JMenuItem itemInserisciPersona;
    // End of variables declaration//GEN-END:variables
}
