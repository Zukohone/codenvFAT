package com.codenvy.example.swing;
import java.util.Scanner;


public class Screen
{

  Pilha p;
  
	public Screen(){
		super();
     System.out.println("Bem vindo a calculadora");
     p = new Pilha();
     this.recebNum();
     this.enter();
     
     
	}

	
	public void recebNum() {
     System.out.println("Digite o primeiro algarismo:");
     Scanner sc = new Scanner(System.in);
     p.alg.add(sc.nextInt());
     
     System.out.println("Digite o segundo algarismo:");
     p.alg.add(sc.nextInt());
     
	}

	
	public void exibeNum() {
		// TODO implement me	
	}
	
	
	public void enter() {
     System.out.println("Digite a operacao algarismo:");
     System.out.println("1 -> soma");
     System.out.println("2 -> subtracao");
     System.out.println("3 -> multiplicacao");
     System.out.println("4 -> divisao");
     
     Scanner sc = new Scanner(System.in);
     int opr = sc.nextInt();
     int r;
     switch(opr){
       case 1:
       	r = Operadores.somaPilha(p.alg.get(0),p.alg.get(1));
       	System.out.println("o resultado e:   " + r);
         break;
       case 2:
       	r = Operadores.subPilha(p.alg.get(0),p.alg.get(1));
       	System.out.println("o resultado e:   " + r);
         break;
       case 3:
       	r = Operadores.multPilha(p.alg.get(0),p.alg.get(1));
       	System.out.println("o resultado e:   " + r);
       case 4:
         r = Operadores.dividePilha(p.alg.get(0),p.alg.get(1));
       	System.out.println("o resultado e:" + r);
       break;
       
       default:{
         System.out.println("operacao errada por favor digite novamente.");
         this.enter();
         break;
       }
     }
   

     

     
	}
	
}

