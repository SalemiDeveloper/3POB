import java.util.ArrayList;
import java.util.List;

public class Carrinho 
{
    private List<ItemCarrinho> itensCarrinho = new ArrayList<>();

    public void adicionarItem(int idProduto, int quantidade) 
    {
        itensCarrinho.add(new ItemCarrinho(idProduto, quantidade));
    }

    public List<ItemCarrinho> getItensCarrinho() 
    {
        return itensCarrinho;
    }

    public double getValorTotal(List<Produto> produtos) 
    {
        double valorTotal = 0;
      
        for (ItemCarrinho item : itensCarrinho) 
        {
            int idProduto = item.getIdProduto();
            int quantidade = item.getQuantidade();

            for (Produto produto : produtos) 
            {
                if (produto.getId() == idProduto) 
                {
                    valorTotal += produto.getPreco() * quantidade;
                }
            }
        }
        return valorTotal;
    }
}
