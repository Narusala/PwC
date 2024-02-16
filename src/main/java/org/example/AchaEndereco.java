package org.example;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AchaEndereco
{
    private static final String ADDRESS_PATTERN = "\\d+\\d+\\w|(No)+\\s+\\d+\\d|^\\d+|\\d+\\d+\\s+\\w+$|\\d+\\d+$";

    public static String resolveEndereco(String end) {

        if (end.isEmpty())
            return null;

        final Retorno ret = new Retorno();

        final Pattern pattern = Pattern.compile(ADDRESS_PATTERN);

        final Matcher matcher = pattern.matcher(end);

        if (matcher.find())
        {
            final String[] parts = end.split(ADDRESS_PATTERN);
            ret.setRua(parts[0].isBlank() ? parts[1].replace(",", "").trim() : parts[0].replace(",", "").trim());
            ret.setNumero(end.replace(ret.getRua(), "").replace(",", "").trim());
            return ret.toString();
        }
        else
           return "Endereço não é válido";
    }

}