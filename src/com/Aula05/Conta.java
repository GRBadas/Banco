package com.Aula05;

import java.util.Scanner;

public class Conta extends Usuario{
    static Scanner input = new Scanner(System.in);

    private double saldo;

    public Conta() {
        System.out.println("Digite o saldo inicial da conta :");
        double saldo = input.nextDouble();
        this.saldo = saldo;
    }

    public void credito(){
        System.out.println("Digite quanto você deseja depositar :");
        double deposito = input.nextDouble();
        this.saldo = saldo + deposito;
        System.out.println("Seu saldo é : " + this.saldo);
    }

    public void debito(){
        System.out.println("Digite quanto você deseja sacar :");
        double saque = input.nextDouble();
        if (this.saldo < saque){           
          System.out.println("Você n tem esse dinheiro não, maluco, relaxa aí !");
        } else {
            this.saldo = saldo - saque;
            System.out.println("Seu saldo é : " + this.saldo);
        }
    }

    public void saldo(){
        System.out.println("Seu saldo é : " + this.saldo);
    }
}

