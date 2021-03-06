/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Objects;

/**
 *
 * @author Ildevana
 */
public class Prova {

    private int idProva;
    private boolean aberta;
    private String nomeProf;
    private int qtdQuestoes;
    private String hash;

    public Prova(int idProva, boolean aberta, String nomeProf, int qtdQuestoes, String hash) {
        this.idProva = idProva;
        this.aberta = aberta;
        this.nomeProf = nomeProf;
        this.qtdQuestoes = qtdQuestoes;
        this.hash = hash;
    }

    public int getIdProva() {
        return idProva;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public int getQtdQuestoes() {
        return qtdQuestoes;
    }

    private void setId_Prova(int id_Prova) {
        this.idProva = id_Prova;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public void setQtdQuestoes(int qtdQuestoes) {
        this.qtdQuestoes = qtdQuestoes;
    }

    /**
     * @return the aberta
     */
    public boolean isAberta() {
        return aberta;
    }

    /**
     * @param aberta the aberta to set
     */
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    /**
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    @Override
    public String toString() {
        return "ID:" + idProva + "\nAberta:" + (aberta ? "SIM" : "NAO") + "\nNome Prof.:" + nomeProf + "\nQtd. Questoes:" + qtdQuestoes + "\nHash:" + hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Prova)) {
            return false;
        }
        return obj.hashCode() == this.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.idProva;
        hash = 47 * hash + (this.aberta ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.nomeProf);
        hash = 47 * hash + Objects.hashCode(this.hash);
        return hash;
    }

}
