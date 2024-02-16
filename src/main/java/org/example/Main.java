package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        String endereco = "";
        while( !endereco.equals("exit") )
        {
            System.out.println("Favor digitar o endereço:");
            endereco = scanner.nextLine();
            if (endereco.equals("exit"))
                System.exit(0);
            System.out.println(AchaEndereco.resolveEndereco(endereco));

        }
    }
}