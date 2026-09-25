package Q4;
public class AppGestaoPedidos {
    public static void main(String[] args) {
        GestaoPedidos gestao = new GestaoPedidos();

        gestao.adicionarPedido("Hambúrguer");
        gestao.adicionarPedido("Pizza");
        gestao.adicionarPedido("Batata Frita");
        gestao.adicionarPedido("Coxinha");

        System.out.println("Pedido feito: " + gestao.proximoPedido());
        System.out.println("Pedidos restantes: " + gestao.quantidadePendentes());
        System.out.println("Pedidos pendentes:");
        gestao.listarPedidos();
    }
} 
