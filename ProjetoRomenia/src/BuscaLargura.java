/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CPD-NOTE01
 */
public class BuscaLargura {

    BuscaLargura(int mat[][], int vOrigem, int vDestino, String vCidade[]) {

        boolean vParar = false;
        int vControle[] = new int[13]; // 13 = Quantidade de Cidades na matriz        

        for (int i = 0; i < vControle.length; i++) {
            vControle[i] = -1;
        }

        Lista lista = new Lista();
        lista.criaLista();
        lista.InserirFinal(new No(vOrigem), null);

        Lista lista1 = new Lista();
        lista1.criaLista();
        lista1.InserirFinal(new No(vOrigem), null);

        while (!lista.ListaVazia()) {
            No atual = lista.RemoverPrimeiro();
            int vAtual = atual.valor;

            for (int j = 0; j < mat.length; j++) {
                if (mat[vAtual][j] != 0) {

                    if (vControle[j] == -1) {
                        vControle[j] = 0;
                        lista.InserirFinal(new No(j), atual);
                        lista1.InserirFinal(new No(j), atual);

                        if (j == vDestino) {
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
        
        System.out.println();
        System.out.println("********** BUSCA LARGURA ***********");
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
        
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
