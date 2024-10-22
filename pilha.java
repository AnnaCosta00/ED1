public class pilha {
    String lista[]; //criei a lista e criei a variável topo que recebe números!
    int topo;

    pilha(int tamanho){
        lista = new String[tamanho];
        topo = 0;
    }
    boolean cheia(){
        System.out.println("a lista esta cheia");
        return lista.length == topo; //estamos verificando se a lista esta cheia. Para isso precisamos iguala-la ao topo para que retorne um valor de verdadeiro ou falso        
    }
    

    boolean vazia(){ //aqui fizemos a mesma estrutura de cima, porém para a lista vazia, que retornará verdadeiro caso seja topo == 0
        if (topo == 0){
            return true;
            } 
        else{
            System.out.println("Tem elementos na lista");
            return false;
        }
    }
    boolean push(String valorQueVaiInserir){
        if (cheia()){
            return false;
        }
        lista[topo] = valorQueVaiInserir;
        topo++;
        return true;
    }
    String pop(){
        if (vazia()){
           System.out.println("sua lista não está vazia");
        }
        topo--;
        return lista[topo];
    }

    
            
     
    
}