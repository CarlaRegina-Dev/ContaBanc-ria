/* Crie uma classe ContaBancaria com as seguintes informações:
Atributos (deduza o tipo de cada atributo)
- Nome do banco
- Número da agência
- Número da conta
- Nome do titular
- Tipo (P – Poupança ou C – Corrente)
- Saldo
Métodos a serem implementados (pense nas regras envolvidas para saque e depósito)
- Sacar (valor)
- Depositar (valor)
- Imprimir dados (exibindo os atributos)
Crie uma classe AppMain com o método main() e:
- Instancie um objeto do tipo ContaBancaria, definindo valores para os atributos do objeto instanciado.
- Realize depósitos, saques e uma impressão dos dados a partir do objeto de ContaBancaria criado. */
package banco;
/*
 * @author Carla Regina dos Anjos dos Santos 
 * @turma: NOTURNO 211-DES-2N-DES082
 */
public class AppMain {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.nomedoBanco = "Black Clover"; 
        conta.setAgencia("0240");
        conta.setConta("96213-4");
        conta.setTitular("Asta");
        conta.setTipo('P');
        
        conta.depositar(2000.0f); 
        conta.sacar(500.0f);
        conta.imprimir();
                 
        System.out.println("Nome do Banco: "+ conta.nomedoBanco +"| Agência: "+ conta.getAgencia() +"| Conta: " + conta.getConta() + "|tipo: " + conta.getTipo()); 
        System.out.println("Cliente: " + conta.getTitular() + "| Saldo R$: " + conta.getSaldo());
    }
}
