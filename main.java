import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        List<Produto> produtos = new ArrayList<>();
        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) 
        {
            produtos.add(new Produto(i, "Produto " + i, 10.0 * i));
        }

        boolean continuarCompras = true;
        while (continuarCompras) 
        {
            System.out.println("Produtos disponíveis:");
            for (Produto produto : produtos) 
            {
                System.out.println(produto);
            }

            int idProduto;
            int quantidade;

            do 
            {
                System.out.print("Digite o ID do produto a ser adicionado ao carrinho: ");
                idProduto = scanner.nextInt();
                if (idProduto < 1 || idProduto > 10) 
                {
                    System.out.println("Número inválido, digite outro número.");
                }
            } while (idProduto < 1 || idProduto > 10);

            do 
            {
                System.out.print("Digite a quantidade desejada: ");
                quantidade = scanner.nextInt();
                if (quantidade <= 0) 
                {
                    System.out.println("Quantidade inválida, digite outra quantidade.");
                }
            } while (quantidade <= 0);

            carrinho.adicionarItem(idProduto, quantidade);

            System.out.print("Deseja adicionar outro produto ao carrinho? (S/N): ");
            String resposta = scanner.next();
            continuarCompras = resposta.equalsIgnoreCase("S");
        }

        List<ItemCarrinho> itensCarrinho = carrinho.getItensCarrinho();
        System.out.println("Itens no carrinho:");

        for (ItemCarrinho item : itensCarrinho) 
        {
            int idProduto = item.getIdProduto();
            int quantidade = item.getQuantidade();

            for (Produto produto : produtos) 
            {
                if (produto.getId() == idProduto) 
                {
                    System.out.println(produto.getNome() + " - Quantidade: " + quantidade);
                }
            }
        }

        double valorTotal = carrinho.getValorTotal(produtos);
        System.out.println("Valor total do carrinho: R$" + valorTotal);
    }
}
