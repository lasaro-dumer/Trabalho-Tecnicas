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
public class Categoria {

    private int cat;
    private String nome;

    public Categoria(int cat, String nome) {
        this.cat = cat;
        this.nome = nome;
    }

    public int getCat() {
        return cat;
    }

    public String getNome() {
        return nome;
    }

    private void setCat(int cat) {
        this.cat = cat;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "" + cat + "\t-" + nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Categoria) {
            Categoria c = (Categoria) obj;
            if (c.getCat() != this.cat) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.cat;
        return hash;
    }
}
