package br.com.felipe.main;

import br.com.felipe.app.Entrega;
import br.com.felipe.app.Entregador;
import br.com.felipe.app.Pagamento;
import br.com.felipe.app.PagamentoPix;
import br.com.felipe.app.Pedido;
import br.com.felipe.app.PetShop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // 1. Exibir petshop e catálogo
            PetShop petshop = new PetShop("PetShop Amigo Fiel", "Alimentação, Higiene, Brinquedos", new String[]{"Cães", "Gatos", "Pássaros"}, "Rua das Flores, 456");
            System.out.println("\n🐾 PetShop disponível:");
            petshop.exibirDados();
            petshop.verCatalogo();

            // 2. Cliente escolhe produtos do catálogo
            System.out.println("\n🛒 Adicionando produtos ao carrinho...");
            String[] produtosSelecionados = { "Comedouro Inox", "Coleira Nylon", "Brinquedo Mordedor" };
            double[] precosSelecionados = { 25.0, 15.0, 10.0 };

            // 3. Criar pedido
            Pedido pedido = new Pedido(produtosSelecionados, precosSelecionados, "Cachorro", 15.5);
            System.out.println("\n📦 Resumo do pedido:");
            pedido.exibirResumo();

            // 4. Processar pagamento antes da entrega
            Pagamento pagamento = new PagamentoPix(pedido.getValorTotal(), "PETSHOP@GMAIL.COM");
            System.out.println("\n💳 Processando pagamento...");
            pagamento.processarPagamento();
            pagamento.exibirDados();

            // 5. Atribuir entregador e criar entrega
            Entregador entregador = new Entregador("Gustavo", "20097-19075", "Moto");
            
            Entrega entrega = new Entrega("Rua Azul, 12300", entregador);
            entrega.setTempoEstimado(45); 
            entrega.setInstrucoes("Deixar na portaria, tocar campainha 3 vezes");
            System.out.println("\n🚚 Entrega em andamento:");
            entrega.exibirDados();

            // 6. Cliente avalia a entrega
            entrega.avaliar(5); // 
            System.out.println("⭐ Avaliação registrada: " + entrega.getNota() + " estrelas");

            System.out.println("\n✅ Pedido finalizado com sucesso! Obrigado por usar o petfast.");

        } catch (IllegalArgumentException e) {
            System.out.println("❌ Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Erro inesperado: " + e.getMessage());
        }
    }

}
