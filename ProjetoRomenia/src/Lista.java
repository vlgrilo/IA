
public class Lista {

    No primeiro, ultimo;
    int tam, TotalDeElementos;

    public void criaLista() {
        primeiro = null;
        ultimo = null;
        tam = 0;
        TotalDeElementos = 0;
    }

    public boolean ListaVazia() {
        if (primeiro == null && ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InserirFinal(No novoNo, No novoPai) {

        if (ListaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
            primeiro.ant = ultimo.ant = null;
        } else {
            ultimo.prox = novoNo;
            novoNo.ant = ultimo;
            novoNo.prox = null;
            ultimo = novoNo;
        }
        novoNo.pai = novoPai;
        tam++;
        TotalDeElementos++;
    }

    public No RemoverFinal() {
        No atual = ultimo;

        if (!ListaVazia()) {
            if (tam > 1) {                
                ultimo = ultimo.ant;
                ultimo.prox = null;
            } else {                
                ultimo = null;
                primeiro = null;
            }
            tam--;         
        }              
        return atual;
    }
    
        public No RemoverPrimeiro() {
        No atual = primeiro;

        if (!ListaVazia()) {
            if (tam > 1) {                
                primeiro = primeiro.prox;
                primeiro.ant = null;
            } else {                
                ultimo = null;
                primeiro = null;
            }
            tam--;         
        }              
        return atual;
    }

    public void MostrarLista(String vCidade[]) {
        No NoTemp = primeiro;        

        for (int i = 0; i < TotalDeElementos; i++) {
            System.out.println("Cidade: " + vCidade[NoTemp.valor]);
                
            NoTemp = NoTemp.prox;            
        }
    }

    public void MelhorResultado(int vOrigem, int vDestino, String vCidade[]) {
        No NoTemp = ultimo;
        No NoAux = ultimo.pai;     
        int j = 0;
        
        String vResposta [] = new String[TotalDeElementos];
             
        for (int i = TotalDeElementos; i > 0; i--) {
            if (NoTemp.valor == vDestino) {                                             
                vResposta[j] = vCidade[NoTemp.valor];
                j++;
                            
                if (vOrigem == vDestino) {
                    break;
                }
                              
                NoAux    = NoTemp.pai;
                vDestino = NoAux.valor;
            }
            NoTemp = NoTemp.ant;
        }
        
        for(int i = j-1; i >= 0; i--){
            System.out.println(vResposta[i]);
        }
    }
}
