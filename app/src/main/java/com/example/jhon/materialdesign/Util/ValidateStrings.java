package com.example.jhon.materialdesign.Util;

/**
 * Created by jhon on 28/10/16.
 */

public class ValidateStrings {

    public static boolean areStringsValidate(String...params){
        for (String param : params) {
            if (param.equals("")){
                    return false;
                }
            if (param.startsWith(" ")){
                return false;
            }
        }
        return true;
    }
}
