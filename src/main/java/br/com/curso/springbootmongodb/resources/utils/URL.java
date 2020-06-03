package br.com.curso.springbootmongodb.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    public static String decodeParam(String text){
        try {
            return URLDecoder.decode(text, "UTF8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

}
