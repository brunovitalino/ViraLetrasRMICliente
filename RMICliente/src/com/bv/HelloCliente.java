package com.bv;

import java.rmi.Naming;

/* 
	Classname: HelloCliente 
	Descricao: Cliente RMI. 
*/
public class HelloCliente
{
	static String mensagem = "NENHUMA MENSAGEM RECEBIDA";
	  
	// the Hello interface. 
	static Hello obj = null; 
	public static void main(String args[]) 
	{ 
		String appName = "HelloWorld";
		String endereco = "127.0.0.1";
		int porta = 1099;
		
		try
		{
			obj = (Hello)Naming.lookup("//"+endereco+":"+Integer.toString(porta)+"/"+appName); 
			mensagem = obj.Saudacao(); 
			System.out.println("Mensagem do servidor RMI: "+mensagem);
		}
		catch (Exception e)
		{
			System.out.println("Mensagem do servidor RMI: "+mensagem);
			System.out.println("ERRO: " + e.getMessage()); 
			e.printStackTrace();
		}
	} 
}
