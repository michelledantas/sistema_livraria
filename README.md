# Sistema de livraria

O intuito deste projeto foi treinar e fixar os conceitos de SRP e OCP do SOLID.

## Regras de Implementação:
O sistema deve ser capaz de cadastrar os seguintes produtos: livros, jogos, filmes, álbuns de música e brinquedos. Além disso o sistema deve possuir um caixa. Este caixa deve ter a informação de dinheiro que está presente nele.

**Livros:** nome, id, preço, gêneros, escritor, editora .

**Jogos:** nome, id, preço, distribuidora, gênero e estúdio

**Filmes:** nome, id, preço, estúdio, diretores, gêneros e produtores

**Álbuns de música:** nome, id, preço, músicos/bandas, gêneros e selos

**Brinquedos:** nome, id, preço e tipo.

## Algumas funcionalidades do sistema:
- Você deve ser capaz de adicionar, ver, alterar e remover qualquer produto do sistema.
- Você deve ser capaz de ver quantos itens de um tipo específico existem no estoque.
- Você deve ser capaz de ver a listagem completa dos itens em estoque.
- Você deve ser capaz de ver a listagem dos itens em estoque por categoria.
- Você deve ser capaz de realizar a operação de compra, ao realizar esta operação os produtos comprados são removidos do estoque e o dinheiro pago deve ser adicionado ao caixa.

## Segunda Etapa:
Duas mudanças de escopo foi solicitada com urgência. 
- Agora um produto pode ser adicionado com um rótulo: destinado ao público adulto. Neste caso para que a compra do produto seja realizada será necessária a apresentação dos documentos do comprador (Nome, RG, CPF e Data de Nascimento) se o comprador tiver menos de 18 anos a compra deve ser bloqueada.

- Outra mudança solicitada foi que toda compra que passar de R$200,00 em livros deve receber um desconto de 15%.
