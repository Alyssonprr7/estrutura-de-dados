package com.alessandron3;

import java.util.Stack;

public class Desafio {

    public static boolean estaBalanceado(String s) {
        Boolean retorno = false;
        String ultimo = "";
        Stack pilha = new Stack();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                char caracter = s.charAt(i);
                ultimo = String.valueOf(caracter);
                pilha.push(ultimo);

            }else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                String popado = ultimo;
                String closeBracket = "";
                if(i != 0 ) {
                    pilha.pop();
                    if (s.charAt(i) == '}') {
                        closeBracket = "{";
                    } else if (s.charAt(i) == ']') {
                        closeBracket = "[";
                    } else if (s.charAt(i) == ')') {
                        closeBracket = "(";
                    }
                    if (popado.equals(closeBracket)) {
                        retorno = true;
                        if(!pilha.isEmpty())
                            ultimo = (String) pilha.peek();
                    }else{
                        retorno = false;
                        break;
                    }
                }else{
                    retorno = false;
                    break;
                }

            }else{
                System.out.println("Insira um valor válido");
            }
        }
        return retorno;
    }

}
