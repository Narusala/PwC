package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Scanner scanner = new Scanner(System.in);
       String rua = "", numero;
        while( !rua.equals("exit") )
        {
            System.out.println("Favor digitar o nome da rua:");
            rua = scanner.next();
            if(rua.equals("exit"))
                System.exit(0);
            System.out.println("Favor digitar o numero da rua:");
            numero = scanner.next();
            System.out.println(rua + "," + numero);
        }
    }
}