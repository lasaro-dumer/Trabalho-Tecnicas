/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Negocio.Alternativa;
import Negocio.DAOException;
import Negocio.ItemAval;
import Negocio.Resposta;
import java.awt.event.ItemEvent;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Lasaro
 */
public class ItemAvaliacaoPanel extends javax.swing.JPanel {

    private JRadioButton[] radioIndex;
    private int altCorreta;
    private ItemAval item;
    private int idProva;
    private int idAluno;
    private Resposta resposta;

    /**
     * Creates new form ItemAvaliacaoPanel
     */
    public ItemAvaliacaoPanel() {
        initComponents();
        lblResultado.setVisible(false);
        lblComentario.setVisible(false);
        radioIndex = new JRadioButton[]{rdAlt1, rdAlt2, rdAlt3, rdAlt4, rdAlt5};
        altCorreta = -1;
        resposta = null;
    }

    public ItemAvaliacaoPanel(ItemAval item, int idProva, int idAluno) throws DAOException, Exception {
        this();
        this.item = item;
        lblIDItem.setText(""+item.getIdItemAval());
        lblEnumciado.setText(item.getEnumuciado());
        lblComentario.setText(item.getComentario());
        Alternativa a;
        Queue<Alternativa> alts = item.getAlternativas();

        int i = 0;
        while (!alts.isEmpty()) {
            a = alts.poll();
            radioIndex[i].setText(a.getTexto());
            if (a.isCorreta()) {
                altCorreta = i;
            }
            i++;
        }
        if (altCorreta == -1) {
            throw new Exception("nenhuma alternativa correta para o item " + item.getIdItemAval());
        }
        if (i < radioIndex.length) {
            throw new Exception("Numero de alternativas do item " + item.getIdItemAval() + " é insuficiente.");
        }
        this.idProva = idProva;
        this.idAluno = idAluno;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alternativas = new javax.swing.ButtonGroup();
        lblEnumciado = new javax.swing.JLabel();
        rdAlt1 = new javax.swing.JRadioButton();
        rdAlt2 = new javax.swing.JRadioButton();
        rdAlt3 = new javax.swing.JRadioButton();
        rdAlt4 = new javax.swing.JRadioButton();
        rdAlt5 = new javax.swing.JRadioButton();
        btnConfirmar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblComentario = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jLabel1 = new javax.swing.JLabel();
        lblIDItem = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnumciado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnumciado.setText("Texto enumciado");
        lblEnumciado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(lblEnumciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 291, 80));

        alternativas.add(rdAlt1);
        rdAlt1.setText("texto alternativa 1");
        rdAlt1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemAvaliacaoPanel.this.itemStateChanged(evt);
            }
        });
        add(rdAlt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 291, -1));

        alternativas.add(rdAlt2);
        rdAlt2.setText("texto alternativa 2");
        rdAlt2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemAvaliacaoPanel.this.itemStateChanged(evt);
            }
        });
        add(rdAlt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 291, -1));

        alternativas.add(rdAlt3);
        rdAlt3.setText("texto alternativa 3");
        rdAlt3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemAvaliacaoPanel.this.itemStateChanged(evt);
            }
        });
        add(rdAlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 291, -1));

        alternativas.add(rdAlt4);
        rdAlt4.setText("texto alternativa 4");
        rdAlt4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemAvaliacaoPanel.this.itemStateChanged(evt);
            }
        });
        add(rdAlt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 291, -1));

        alternativas.add(rdAlt5);
        rdAlt5.setText("texto alternativa 5");
        rdAlt5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemAvaliacaoPanel.this.itemStateChanged(evt);
            }
        });
        add(rdAlt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 291, -1));

        btnConfirmar.setText("Confirmar resposta");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblResultado.setText("<html>Resultado: <b style=\"color:red;\">RESPOSTA ERRADA</b>");
        add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 20));

        lblComentario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblComentario.setText("Texto comentario");
        lblComentario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(lblComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 291, 45));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 320));

        jLabel1.setText("ID do item: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblIDItem.setText("jLabel2");
        add(lblIDItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void itemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            btnConfirmar.setEnabled(true);
        }
    }//GEN-LAST:event_itemStateChanged

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int alt = -1;
        rdAlt1.setEnabled(false);
        rdAlt2.setEnabled(false);
        rdAlt3.setEnabled(false);
        rdAlt4.setEnabled(false);
        rdAlt5.setEnabled(false);

        for (int i = 0; i < radioIndex.length; i++) {
            if (radioIndex[i].isSelected()) {
                alt = i;
                break;
            }
        }
        if (radioIndex[altCorreta].isSelected()) {
            lblResultado.setText("<html><b style=\"color:green;\">RESPOSTA CORRETA</b>");
        } else {
            lblResultado.setText("<html><b style=\"color:red;\">RESPOSTA ERRADA</b>");
        }

        lblResultado.setVisible(true);
        lblComentario.setVisible(true);
        resposta = new Resposta(item.getIdItemAval(), idProva, alt, idAluno);
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alternativas;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblEnumciado;
    private javax.swing.JLabel lblIDItem;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JRadioButton rdAlt1;
    private javax.swing.JRadioButton rdAlt2;
    private javax.swing.JRadioButton rdAlt3;
    private javax.swing.JRadioButton rdAlt4;
    private javax.swing.JRadioButton rdAlt5;
    // End of variables declaration//GEN-END:variables

    public Resposta getResposta() {
        return resposta;
    }

    public int getIDItem() {
        return item.getIdItemAval();
    }
}
