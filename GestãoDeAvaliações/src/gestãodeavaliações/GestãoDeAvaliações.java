/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestãodeavaliações;

import dados.InicializadorBancoDados;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ildevana
 */
public class GestãoDeAvaliações {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //InicializadorBancoDados.criarBd();//já criado :D
        } catch (Exception ex) {
            Logger.getLogger(GestãoDeAvaliações.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
