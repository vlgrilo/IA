/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CPD-NOTE01
 */
public class Bidirecional {

    Bidirecional(int mat[][], int vOrigem, int vDestino, String vCidade[]) {

        boolean vParar = false;
        int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        
        int vControle1[] = new int[13];

        int k = 0, l = 0;

        for (int i = 0; i < vControle.length; i++) {
            vControle[i] = -1;
            vControle1[i] = -1;
        }

        Lista lista = new Lista();
        lista.criaLista();
        lista.InserirFinal(new No(vOrigem), null);

        Lista lista1 = new Lista();
        lista1.criaLista();
        lista1.InserirFinal(new No(vOrigem), null);

        Lista lista2 = new Lista();
        lista2.criaLista();
        lista2.InserirFinal(new No(vOrigem), null);

        Lista lista3 = new Lista();
        lista3.criaLista();
        lista3.InserirFinal(new No(vOrigem), null);

        while (!lista.ListaVazia() && !lista2.ListaVazia()) {
            while (!lista.ListaVazia()) {
                No atual = lista.RemoverPrimeiro();
                int vAtual = atual.valor;

                for (int j = 0; j < mat.length; j++) {
                    if (mat[vAtual][j] != 0) {

                        if (vControle[j] == -1) {
                            vControle[j] = 0;
                            k = j;
                            lista.InserirFinal(new No(j), atual);
                            lista1.InserirFinal(new No(j), atual);

                            if (vControle[j] == vControle1[j]) {
                                vParar = true;
                                break;
                            }
                        }
                    }
                }

                if (vParar) {
                    break;
                }
            }

            while (!lista2.ListaVazia()) {
                No atual = lista2.RemoverFinal();
                int vAtual = atual.valor;
                
                for (int j = mat.length - 1; j >= 0; j--) {
                    if (mat[vAtual][j] != 0) {
                        if (vControle1[j] == -1) {
                            vControle1[j] = 0;
                            l = j;
                            lista2.InserirFinal(new No(j), atual);
                            lista3.InserirFinal(new No(j), atual);

                            if (vControle[j] == vControle1[j]) {
                                vParar = true;
                                break;
                            }
                        }
                    }
                }

                if (vParar) {
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("********** BIDIRECIONAL ***********");
        System.out.println();

        System.out.println("********** LISTA COMPLETA ***********");
        System.out.println("Lista 1");
        lista1.MostrarLista(vCidade);
        System.out.println();
        System.out.println("Lista 2");
        lista3.MostrarLista(vCidade);
        System.out.println("*************************************");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("********** MELHOR CAMINHO ***********");
        lista1.MelhorResultado(vOrigem, vDestino, vCidade);
        lista3.MelhorResultado(vOrigem, vDestino, vCidade);
        System.out.println("*************************************");

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
