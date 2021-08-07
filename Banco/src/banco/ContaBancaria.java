
package banco;

import java.util.Scanner;

public class ContaBancaria {
     String nomedoBanco;
    private String agencia;
    private String conta;
    private String titular;
    private char tipo;
    private double saldo;
    
    Scanner ler =new Scanner(System.in);
    
    public void setAgencia(String agencia){
       this.agencia=agencia;
    }
    public String getAgencia(){
       return agencia;
    }
    public void setConta (String conta){
        this.conta=conta;
    }
    public String getConta(){
        return conta;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    public String getTitular(){
        return titular;
    }
    public void setTipo (char tipo){
         if (tipo=='P'|| tipo=='C'){
            this.tipo=tipo;          
        }        
    }
    public char getTipo(){
        return tipo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void  depositar (float valor){    
        if(valor>0.0){
            saldo+=valor;
            System.out.printf("Deposito realizado R$: %.2f\n",saldo);            
        }else{
              System.out.println("Deposito inválido");
        }
    } 
    public void sacar (float quantidade){
        if(quantidade>0.0 && quantidade<=saldo){
            saldo-=quantidade;
            System.out.printf("Valor sacado R$: %.2f\n",quantidade); 
            System.out.printf("Após o saque, o saldo é de R$: %.2f\n",saldo);                         
        }else{            
            System.out.println("Saque inválido"); 
        }          
    }     
    public void imprimir(){
        System.out.println("Dados da conta");
    }
}
