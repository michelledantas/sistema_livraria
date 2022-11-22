package br.com.letscode.domain.adm;

import br.com.letscode.domain.model.Produto;
import lombok.Data;

import javax.management.openmbean.OpenDataException;
import java.util.ArrayList;
import java.util.List;

@Data
public class Estoque<T extends Produto> {

    List<T> estoque = new ArrayList<>();

    public List<T> getEstoque() {
        return this.estoque;
    }


    public T getProduto(Integer idRegistro){
        for (T t : estoque){
            if (t.getIdRegistro().equals(idRegistro)){
                return t;
            }
        }
        return null;
    }

    public List<T> getAllProduto(){
        if(!estoque.isEmpty()){
            return estoque;
        }
        return null;
    }

    public void imprimirTodosProdutos(){
        if(!estoque.isEmpty()){
            System.out.println("Estoque:");
            estoque.forEach(System.out::println);

        }
    }



    public void addEstoque(T produto){
        if(!estoque.contains(produto)){
            estoque.add(produto);
        }
    }

    public void removeProduto(T produto){
        estoque.remove(produto);
    }

    public void updateProduto(T produto) throws OpenDataException {
        int indiceProduto = estoque.indexOf(produto);

        if(indiceProduto > -1){
            estoque.set(indiceProduto, produto);
        } else {
            throw new OpenDataException("Produto não encontrado");
        }
    }
}
