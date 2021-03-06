/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Ildevana
 */
public class Alternativa {

    private int idItemAval;
    private int sq_alternativa;
    private String texto;
    private boolean correta;

    public Alternativa(int idItemAval, int sq_alternativa, String texto, boolean correta) {
        this.idItemAval = idItemAval;
        this.sq_alternativa = sq_alternativa;
        this.texto = texto;
        this.correta = correta;
    }

    /**
     * @return the ID_ItemAval
     */
    public int getIdItemAval() {
        return idItemAval;
    }

    /**
     * @param ID_ItemAval the ID_ItemAval to set
     */
    public void setIdItemAval(int ID_ItemAval) {
        this.idItemAval = ID_ItemAval;
    }

    /**
     * @return the sq_alternativa
     */
    public int getSq_alternativa() {
        return sq_alternativa;
    }

    /**
     * @param sq_alternativa the sq_alternativa to set
     */
    public void setSq_alternativa(int sq_alternativa) {
        this.sq_alternativa = sq_alternativa;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the correta
     */
    public boolean isCorreta() {
        return correta;
    }

    /**
     * @param correta the correta to set
     */
    public void setCorreta(boolean correta) {
        this.correta = correta;
    }

    @Override
    public String toString() {
        return "Item: " + idItemAval + " Seq: " + sq_alternativa + " Correta: " + (correta ? "SIM" : "NAO") + " Texto: " + texto;
    }

}
