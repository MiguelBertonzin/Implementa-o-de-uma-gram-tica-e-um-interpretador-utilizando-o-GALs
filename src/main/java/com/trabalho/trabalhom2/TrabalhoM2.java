
package com.trabalho.trabalhom2;


import GALs.AnalysisError;
import GALs.LexicalError;
import GALs.Lexico;
import GALs.SemanticError;
import GALs.Semantico;
import GALs.Sintatico;
import GALs.SyntaticError;
import java.io.IOException;
/**
 *
 * @author Miguel
 */
public class TrabalhoM2 {

    public static void main(String[] args) throws IOException, AnalysisError{
         
         try
         {
            //Lexico lexico = new Lexico("A = 1111; B = 1111; C = B + A; show(C);");            //SOMA 15 + 15 = 30
            //Lexico lexico = new Lexico("A = 11110; B = 1111; C = A - B; show(C);");           //SUBTRAÇÃO 30 - 15 = 15
            //Lexico lexico = new Lexico("A = 1100; B = A^10; show(B);");                       //EXPONENCIAÇÃO 12^2 = 144
            //Lexico lexico = new Lexico("A = 100 ; B = 11 ; C = A * B; show(C);");             //MULTIPLICAÇÃO 4 * 3 = 12
            Lexico lexico = new Lexico("A = 10100  ; B = 101  ; C = A / B; show(C);");          //DIVISÃO  20/5 = 4 
            
            
            
            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();

            sintatico.parse(lexico, semantico);
        }
            catch ( LexicalError | SyntaticError | SemanticError e )
            {
                System.out.println("Comando não encontrado.");
            }
  }
}