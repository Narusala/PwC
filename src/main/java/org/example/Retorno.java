package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Retorno
{

    private String rua = "";
    private String numero;

    @Override
    public String toString()
    {
        return "{\""+rua+"\", \""+numero+"\"}";
    }
}