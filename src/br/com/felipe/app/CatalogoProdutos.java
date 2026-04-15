package br.com.felipe.app;

import java.util.ArrayList;
import java.util.List;

public class CatalogoProdutos {
    private List<Produto> produtos;

    public CatalogoProdutos() {
        this.produtos = new ArrayList<>();
        inicializarProdutos();
    }

    private void inicializarProdutos() {
        // Produtos de exemplo para pets
        adicionarProduto(new Produto(1, "Comedouro Inox", 25.00, "Alimentação", 50, "Único"));
        adicionarProduto(new Produto(2, "Bebedouro Automático", 45.00, "Alimentação", 30, "Único"));
        adicionarProduto(new Produto(3, "Coleira Nylon", 15.00, "Acessórios", 100, "P/M/G"));
        adicionarProduto(new Produto(4, "Brinquedo Mordedor", 10.00, "Brinquedos", 80, "Único"));
        adicionarProduto(new Produto(5, "Shampoo para Cães", 20.00, "Higiene", 40, "Único"));
        adicionarProduto(new Produto(6, "Cama Pet Conforto", 80.00, "Móveis", 20, "P/M/G"));
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }

    public void exibirProdutos() {
        System.out.println("=== CATÁLOGO DE PRODUTOS PARA PETS ===");
        for (Produto p : produtos) {
            System.out.println(p.getId() + " - " + p.getNome() + " - R$" + p.getPreco() + " (" + p.getCategoria() + ", Tamanho: " + p.getTamanho() + ", Estoque: " + p.getEstoque() + ")");
        }
    }

    public List<Produto> buscarPorCategoria(String categoria) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public Produto buscarPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}