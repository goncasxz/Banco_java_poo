package aulaexemploconta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AulaExemploConta {
    public static void main(String[] args) {
        int user = 0;
        boolean exitFlag = false;
        List<Conta> contas = new ArrayList<>();
        int numConta;
       
        
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nBEM-VINDO AO BANCO");
            System.out.println("DIGITE A OPCAO DESEJADA:");
            System.out.println("1 - ABRIR CONTA");
            System.out.println("2 - FECHAR CONTA");
            System.out.println("3 - DEPOSITAR");
            System.out.println("4 - SACAR");
            System.out.println("5 - CONSULTAR SALDO");
            System.out.println("6 - PAGAR MENSALIDADE");
            System.out.println("7 - SAIR");
            int userChoice = input.nextInt();
            user = userChoice;
            switch (user){
                case 1:
                    Conta novaConta = new Conta(0.0f, false);
                    try{ 
                    novaConta.abrirConta();
                    } catch (InterruptedException e) {
                        System.out.println("EXCEÇÃO TRATADA" + e.getMessage());
                    }
                    contas.add(novaConta);
                    System.out.println("ID da conta: " + novaConta.getConta());
                    exitFlag = false;
                    break;
                   
                case 2:
                    System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA FECHAR: ");
                    numConta = input.nextInt();
                    
                    Conta contaParaFechar = encontrarConta(contas, numConta);
                    
                    if (contaParaFechar != null) {
                        contaParaFechar.fecharConta();
                        if (!contaParaFechar.isStatus()) {
                            contas.remove(contaParaFechar);
                        }
                    } else {
                        System.out.println("CONTA NAO ENCONTRADA!");
                    }
                    break;
                     
                case 3:
                    System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA DEPOSITAR: ");
                    numConta = input.nextInt();
                    
                    Conta contaParaDeposito = encontrarConta(contas, numConta);
                    
                    if (contaParaDeposito != null) {
                        if (!contaParaDeposito.isStatus()){
                            System.out.println("CONTA DESTINO FECHADA");
                        } else {
                            try{
                                contaParaDeposito.depositar();
                            } catch (InterruptedException e) {
                                System.out.println("EXCEÇÃO TRATADA" + e.getMessage());
                            }
                        } 
                    }else {
                        System.out.println("CONTA NAO ENCONTRADA");
                    }
                    break;
                    
                case 4:
                    System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA SACAR: ");
                    numConta = input.nextInt();
                    
                    Conta contaParaSaque = encontrarConta(contas, numConta);
                    
                    if (contaParaSaque != null) {
                        if (!contaParaSaque.isStatus()){
                            System.out.println("CONTA DESTINO FECHADA");
                        } else if (contaParaSaque.isStatus()){
                            try {
                            contaParaSaque.sacar();
                            } catch (InterruptedException e){
                                System.out.println("EXCEÇÃO TRATADA" + e.getMessage());
                            }
                        } 
                        }else {
                            System.out.println("CONTA NAO ENCONTRADA");
                    }
                    break;
                    
                case 5:
                    System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA CONSULTAR SALDO: ");
                    numConta = input.nextInt();
                    
                    Conta contaParaConsulta = encontrarConta(contas, numConta);
                    
                    if (contaParaConsulta != null) {
                        if (!contaParaConsulta.isStatus()){
                            System.out.println("CONTA DESTINO FECHADA");
                        } else if (contaParaConsulta.isStatus()){
                            try {
                            contaParaConsulta.consultarSaldo();
                            } catch (InterruptedException e){
                                System.out.println("EXCEÇÃO TRATADA" + e.getMessage());
                            }
                        } 
                        }else {
                            System.out.println("CONTA NAO ENCONTRADA");
                    }
                    break;
                    
                case 6:
                    System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA PAGAR MENSALIDADE: ");
                    numConta = input.nextInt();
                    
                    Conta contaParaPagarMensalidade = encontrarConta(contas, numConta);
                    
                    if (contaParaPagarMensalidade != null) {
                        if (!contaParaPagarMensalidade.isStatus()){
                            System.out.println("CONTA DESTINO FECHADA");
                        } else if (contaParaPagarMensalidade.isStatus()){
                            try {
                            contaParaPagarMensalidade.pagarMensalidade();
                            } catch (InterruptedException e){
                                System.out.println("EXCEÇÃO TRATADA" + e.getMessage());
                            }
                        } 
                        }else {
                            System.out.println("CONTA NAO ENCONTRADA");
                    }
                    break;
                    
                case 7:
                    System.out.println("OBRIGADO POR UTILIZAR O BANCO");
                    exitFlag = true;
                    break;
                    
                default:
                    try {
                    System.out.println("OPCAO INVALIDA");
                    Thread.sleep(1000);
                    break;
                    } catch (InterruptedException e){
                        System.out.println("EXCECAO TRATADA" );
                    }
                    
                    
            }
            

        } while (!exitFlag);
        
        
    }
    
    private static Conta encontrarConta(List<Conta> contas, int numConta) {
        for (Conta c : contas) {
            if (c.getConta() == numConta) {
                return c;
            }
        }
        return null; 
    }
    
}
