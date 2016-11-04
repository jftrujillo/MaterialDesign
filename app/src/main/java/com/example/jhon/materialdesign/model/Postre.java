package com.example.jhon.materialdesign.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhon on 2/11/16.
 */

public class Postre {
    String nomnbre;
    String ingredientes;
    String precion;
    String imgUrl;

    //region Getters and Setter
    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPrecion() {
        return precion;
    }

    public void setPrecion(String precion) {
        this.precion = precion;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    //endregion

    public static List<Postre> initPostres(){
        List<Postre> data = new ArrayList<>();
        Postre postre = new Postre();
        postre.setNomnbre("Fresas con crema");
        postre.setIngredientes("Fresas, crema, azucar");
        postre.setPrecion("3000");
        postre.setImgUrl("http://cdn.kiwilimon.com/recetaimagen/268/thumb400x300-14757.jpg");

        Postre postre2 = new Postre();
        postre2.setNomnbre("Tres leches");
        postre2.setIngredientes("leche, leche, leche");
        postre2.setPrecion("2000");
        postre2.setImgUrl("http://cdn1.recetasgratis.net/es/images/0/3/4/img_postre_de_tres_leches_frio_34430_paso_4_600.jpg");

        Postre postre3 = new Postre();
        postre3.setNomnbre("Postre de milo");
        postre3.setIngredientes("leche, milo, azucar");
        postre3.setPrecion("2000");
        postre3.setImgUrl("http://www.resuelto.com/wp-content/uploads/2014/11/29272_154124_1.jpg");

        data.add(postre);
        data.add(postre2);
        data.add(postre3);
        data.add(postre);
        data.add(postre);
        data.add(postre2);
        data.add(postre3);
        return data;
    }
}
