package br.com.letscode.domain.adm;

import br.com.letscode.domain.DAO.DAO;
import br.com.letscode.domain.model.Produto;
import lombok.Data;

import javax.management.openmbean.OpenDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class EstoqueDAO implements DAO<Produto, Integer> {

    List<Produto> estoque = new ArrayList<>();

    public List<Produto> getEstoque() {
        return this.estoque;
    }


    public Produto getProduto(Integer idRegistro){
        for (Produto t : estoque){
            if (t.getIdRegistro().equals(idRegistro)){
                return t;
            }
        }
        return null;
    }

    @Override
    public void add(Produto type) {
        if(!estoque.contains(type)){
            estoque.add(type);
        }
    }

    @Override
    public void update(Produto type) throws OpenDataException {
        int indiceProduto = estoque.indexOf(type);

        if(indiceProduto > -1){
            estoque.set(indiceProduto, type);
        } else {
            throw new OpenDataException("Produto não encontrado");
        }
    }

    @Override
    public Optional<Produto> findOne(Integer key) {
        return Optional.empty();
    }

    @Override
    public List<Produto> findAll() {
        return estoque;
    }

    @Override
    public void delete(Produto type) {
        estoque.remove(type);
    }





}
