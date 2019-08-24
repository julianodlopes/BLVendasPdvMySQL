/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public final class VerificarCampo extends JTextField {

    private int maximoCaracteres = -1;  //Definição de -1 
    //como valor normal de um jTextField sem limite de caracteres.

    public VerificarCampo(String tipo, int maximo) {
        super();
        if (tipo.equals("Numeros")) {
            setMaximoCaracteres(maximo);  //Define o tamanho máximo
            //que deve ser aceito no jTextField. 
            addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTextFieldKeyTyped(evt);
                }
            });
        }
        if (tipo.equals("Letras")) {
            setMaximoCaracteres(maximo);  //Define o tamanho máximo
            //que deve ser aceito no jTextField.  
            addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTextFieldKeyTyped2(evt);
                }
            });
        }

        if (tipo.equals("Numeros/Letras")) {
            setMaximoCaracteres(maximo);  //Define o tamanho máximo
            //que deve ser aceito no jTextField. 
            addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTextFieldKeyTyped3(evt);
                }
            });
        }
        if (tipo.equals("Numeros/Ponto")) {
            setMaximoCaracteres(maximo);  //Define o tamanho máximo
            //que deve ser aceito no jTextField. 
            addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTextFieldKeyTyped4(evt);
                }
            });
        }
    }

//Aceita apenas números.
    private void jTextFieldKeyTyped(KeyEvent evt) {

        String caracteres = "0987654321";  //Lista de caracteres que devem ser aceitos.
        if (!caracteres.contains(evt.getKeyChar() + "")) {  //Se o caracter que gerou o evento 
            //não estiver na lista.
            evt.consume();  //Aciona esse propriedade para eliminar a ação do evento.
        }
        if ((getText().length() >= getMaximoCaracteres()) && (getMaximoCaracteres() != -1)) {
//if para saber se precisa verificar também o tamanho da string do campo.
//Maior ou igual ao tamanho máximo, cancela e nao deixa inserir mais.
            evt.consume();
            setText(getText().substring(0, getMaximoCaracteres())); //Esta linha acima é para remover os caracters inválidos caso o usuário tenha copiado o conteúdo de algum lugar, ou seja, com tamanho maior que o definido. 
        }

    }

//Aceita apenas letras.
    private void jTextFieldKeyTyped2(KeyEvent evt) {

        String caracteres = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzâÂàÀáÁãÃêÊèÈéÉîÎìÌíÍõÕôÔòÒóÓüÜûÛúÚùÙçÇ-/'\'.:μ()º%, ";  //Lista de caracters que devem ser aceitos.
        if (!caracteres.contains(evt.getKeyChar() + "")) {  //Se o caracter que gerou o evento não estiver na lista.
            evt.consume();  //Aciona esse propriedade para eliminar a ação do evento.
        }
        if ((getText().length() >= getMaximoCaracteres()) && (getMaximoCaracteres() != -1)) {
//if para saber se precisa verificar também o tamanho da string do campo.
//Maior ou igual ao tamanho máximo, cancela e nao deixa inserir mais.
            evt.consume();
            setText(getText().substring(0, getMaximoCaracteres()));  //Esta linha acima é para remover os caracters inválidos caso o usuário tenha copiado o conteúdo de algum lugar, ou seja, com tamanho maior que o definido. 
        }

    }

//Aceita números e letras.
    private void jTextFieldKeyTyped3(KeyEvent evt) {

        String caracteres = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzâÂàÀáÁãÃêÊèÈéÉîÎìÌíÍõÕôÔòÒóÓüÜûÛúÚùÙçÇ0123456789-/'\'.:μ()º%, ";  //Lista de caracters que devem ser aceitos 
        if (!caracteres.contains(evt.getKeyChar() + "")) {  //Se o caracter que gerou o evento não estiver na lista.
            evt.consume();  //Aciona esse propriedade para eliminar a ação do evento.
        }
        if ((getText().length() >= getMaximoCaracteres()) && (getMaximoCaracteres() != -1)) {
//if para saber se precisa verificar também o tamanho da string do campo.
//Maior ou igual ao tamanho máximo, cancela e nao deixa inserir mais.
            evt.consume();
            setText(getText().substring(0, getMaximoCaracteres()));  //Esta linha acima é para remover os caracteres inválidos caso o usuário tenha copiado o conteúdo de algum lugar, ou seja, com tamanho maior que o definido 
        }

    }

//Aceita apenas números.
    private void jTextFieldKeyTyped4(KeyEvent evt) {

        String caracteres = "0987654321.";  //Lista de caracteres que devem ser aceitos.
        if (!caracteres.contains(evt.getKeyChar() + "")) {  //Se o caracter que gerou o evento 
            //não estiver na lista.
            evt.consume();  //Aciona esse propriedade para eliminar a ação do evento.
        }
        if ((getText().length() >= getMaximoCaracteres()) && (getMaximoCaracteres() != -1)) {
//if para saber se precisa verificar também o tamanho da string do campo.
//Maior ou igual ao tamanho máximo, cancela e nao deixa inserir mais.
            evt.consume();
            setText(getText().substring(0, getMaximoCaracteres())); //Esta linha acima é para remover os caracters inválidos caso o usuário tenha copiado o conteúdo de algum lugar, ou seja, com tamanho maior que o definido. 
        }

    }
    
    public int getMaximoCaracteres() {
        return maximoCaracteres;
    }

    public void setMaximoCaracteres(int maximoCaracteres) {
        this.maximoCaracteres = maximoCaracteres;
    }
}
