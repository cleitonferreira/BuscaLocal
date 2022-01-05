package com.example.buscalocal;

public class Principal {

    public static void main(String[] args) {

        Instancia instancia = new Instancia("instance1.data");

        Construtivo construtivo = new Construtivo(instancia.getMatriz());
        construtivo.initialiaze();


        EstruturasVizinhanca estruturasVizinhanca = new EstruturasVizinhanca(construtivo);
        estruturasVizinhanca.busca();
    }

}
