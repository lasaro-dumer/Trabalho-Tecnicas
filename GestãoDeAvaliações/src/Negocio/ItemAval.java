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
public class ItemAval {

    private int idItemAval;
    private String enumuciado;
    private String comentario;

    public ItemAval(int idItemAval, String enumuciado, String comentario) {
        this.idItemAval = idItemAval;
        this.enumuciado = enumuciado;
        this.comentario = comentario;
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
    private void setIdItemAval(int ID_ItemAval) {
        this.idItemAval = ID_ItemAval;
    }

    /**
     * @return the enumuciado
     */
    public String getEnumuciado() {
        return enumuciado;
    }

    /**
     * @param enumuciado the enumuciado to set
     */
    public void setEnumuciado(String enumuciado) {
        this.enumuciado = enumuciado;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
