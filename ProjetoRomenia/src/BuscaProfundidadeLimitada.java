/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CPD-NOTE01
 */
public class BuscaProfundidadeLimitada {

    BuscaProfundidadeLimitada(int mat[][], int vOrigem, int vDestino, String vCidade[], int vLimiteProf) {

        boolean vParar = false;
        int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        
        int vProfundidade = 0;

        for (int i = 0; i < vControle.length; i++) {
            vControle[i] = -1;
        }

        Lista lista = new Lista();
        lista.criaLista();
        lista.InserirFinal(new No(vOrigem), null);

        Lista lista1 = new Lista();
        lista1.criaLista();
        lista1.InserirFinal(new No(vOrigem), null);

        vControle[vOrigem] = vProfundidade;

        while (!lista.ListaVazia()) {
            No atual = lista.RemoverFinal();
            int vAtual = atual.valor;

            vProfundidade = vProfundidade + 1;

            for (int j = 0; j < mat.length; j++) {
                if (mat[vAtual][j] != 0) {

                    if ((vControle[j] > vProfundidade || vControle[j] == -1)) {
                        if (vLimiteProf >= vProfundidade) {
                            vControle[j] = vProfundidade;
                            lista.InserirFinal(new No(j), atual);
                            lista1.InserirFinal(new No(j), atual);

                            if (j == vDestino) {
                                vParar = true;
                                break;
                            }
                        }
                    }
                }
            }

            if (vParar) {
                break;
            }
        }
               
        System.out.println();
        System.out.println("********** BUSCA PROFUNDIDADE LIMITADA ***********");
        System.out.println();

        System.out.println("********** LISTA COMPLETA ***********");
        lista1.MostrarLista(vCidade);
        System.out.println("*************************************");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("********** MELHOR CAMINHO ***********");
        lista1.MelhorResultado(vOrigem, vDestino, vCidade);
        System.out.println("*************************************");
    }
}
