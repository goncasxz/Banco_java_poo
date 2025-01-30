package aulaexemploconta;

import java.util.Scanner;



public class Conta {
    public int conta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private static int nextAccountNumber = 1000; 
    
    public Conta(float saldo, boolean status) {
        this.saldo = 0.0f;
        this.status = false;
    }
    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public static int gerarNumeroDeConta() {
        return nextAccountNumber++;
    }
    
    
    public void abrirConta() throws InterruptedException {
        this.status = true;
        Scanner object = new Scanner(System.in);
        System.out.println("Digite o nome completo do titular da conta: ");
        String user = object.nextLine();
        this.dono = user;
        while (!"CP".equals(this.tipo) && !"CC".equals(this.tipo)){
            Scanner object2 = new Scanner(System.in);
            System.out.println("Qual tipo de conta gostaria de abrir (CC/CP): ");
            String accountType = object2.nextLine();
            this.tipo = accountType;
            if (this.tipo == null) {
                System.out.println("TIPO DE DADO INVALIDO");
            } else switch (this.tipo) {
                case "CC":
                    this.saldo = 50.0f;
                    break;
                    //cc = conta corrente = 50 reais
                    //cp = conta pooupanca = 150 reais
                case "CP":
                    this.saldo = 150.0f;
                    break;
                default:
                    System.out.println("TIPO DE DADO INVALIDO");
                    this.tipo = null;
                    break;
            }
        }
        this.conta = gerarNumeroDeConta();
        
        System.out.println("CONTA CRIADA");
        System.out.println("DONO: " + this.dono);
        System.out.println("NUMERO: " + this.conta);
        System.out.println("SALDO: " + this.saldo);
        Thread.sleep(3500);
    }
    
    public void fecharConta(){
        if (!status) {
            System.out.println("CONTA JA ESTA FECHADA ");
            return;
        }
        
        if (this.saldo > 0) {
            System.out.println("SALDO POSITIVO DE R$" + this.saldo + " FAVOR SACAR ANTES DE FECHAR");
        } else if (this.saldo < 0){
            System.out.println("SALDO NEGATIVO DE R$" + this.saldo + ", QUITE A DIVIDA");
        } else {
            this.status = false;
            System.out.println("CONTA NUM " + this.conta + " FECHADA COM SUCESSO");
        }
        
    }
    
    public void depositar() throws InterruptedException{
        Scanner object4 = new Scanner(System.in);
        System.out.println("QUANTO DESEJA DEPOSITAR: ");
        float deposito = object4.nextFloat();
        this.saldo += deposito;
        System.out.println("DEPOSITO REALIZADO NO VALOR DE R$" + deposito);
        Thread.sleep(2500);
    }
    
    public void sacar() throws InterruptedException{
        Scanner object5 = new Scanner(System.in);
        System.out.println("QUANTO DESEJA SACAR: ");
        float saque = object5.nextFloat();
        if (saque > this.saldo){
            System.out.println("SALDO INSUFICIENTE");
        } else if (saque <= this.saldo){
            this.saldo -= saque;
            System.out.println("SAQUE EFETUADO COM SUCESSO");
            Thread.sleep(2500);
            
        }
    }
    
    public void consultarSaldo() throws InterruptedException{
        System.out.println("SEU SALDO E DE: R$" + this.saldo);
        Thread.sleep(2500);
    }
    
    public void pagarMensalidade() throws InterruptedException{
        float mensalidade;
        if (this.tipo == null) {
                System.out.println("TIPO DE CONTA INVALIDO");
            } else switch (this.tipo) {
                case "CC":
                    mensalidade = 12.0f;
                    this.saldo = this.saldo - mensalidade;
                    System.out.println("MENSALIDADE PAGA NO VALOR DE R$" + mensalidade);
                    Thread.sleep(1500);
                    break;
                case "CP":
                    mensalidade = 20.0f;
                    this.saldo = this.saldo - mensalidade;
                    System.out.println("MENSALIDADE PAGA NO VALOR DE R$" + mensalidade);
                    Thread.sleep(1500);
                    break;
                default:
                    System.out.println("TIPO DE DADO INVALIDO");
                    break;
            }
    }
}

   