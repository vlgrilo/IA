/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AffzPedro
 */
public class Principal {

    public static void main(String[] args) {
        int mat[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, //Arad     
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0}, //Bucharest
            {0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0}, //Craiova
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, //Dobreta
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, //Fagaras
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0}, //Lugoj
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //Mehadia
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1}, //Oradea
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, //Pitesti
            {0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0}, //Rimnicu
            {1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0}, //Sibiu
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //Timisoara
            {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0} //Zerind     
        };

        String vCidade[] = {
            "Arad", //0
            "Bucharest", //1
            "Craiova", //2
            "Dobreta", //3
            "Fagaras", //4
            "Lugoj", //5
            "Mehadia", //6
            "Oradea", //7
            "Pitesti", //8
            "Rimnicu", //9
            "Sibiu", //10
            "Timisoara", //11
            "Zerind" //12
        };

        int vOrigem = 0;
        int vDestino = 1;
        int vLimite = 10;

        BuscaLargura BuscaLarg = new BuscaLargura(mat, vOrigem, vDestino, vCidade);
        BuscaProfundidade BuscaProf = new BuscaProfundidade(mat, vOrigem, vDestino, vCidade);
        BuscaProfundidadeLimitada BuscaProfLimit = new BuscaProfundidadeLimitada(mat, vOrigem, vDestino, vCidade, vLimite);
        AprofundamentoIterativo Aprof = new AprofundamentoIterativo(mat, vOrigem, vDestino, vCidade, 0);
        Bidirecional Bidi = new Bidirecional(mat, vOrigem, vDestino, vCidade);
    }
}

