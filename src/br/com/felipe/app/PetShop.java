package br.com.felipe.app;

public class PetShop {
    private String nome;
    private String categoriasPrincipais;
    private String[] tiposDeAnimais;
    private String localizacao;
    private CatalogoProdutos catalogo;

    public PetShop(String nome, String categoriasPrincipais, String[] tiposDeAnimais, String localizacao) {
        this.nome = nome;
        this.categoriasPrincipais = categoriasPrincipais;
        this.tiposDeAnimais = tiposDeAnimais;
        this.localizacao = localizacao;
        this.catalogo = new CatalogoProdutos();
        
    }

    public String getNome() {
        return nome;
    }

    public String getCategoriasPrincipais() {
        return categoriasPrincipais;
    }

    public String[] getTiposDeAnimais() {
        return tiposDeAnimais;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoriasPrincipais(String categoriasPrincipais) {
        this.categoriasPrincipais = categoriasPrincipais;
    }

    public void setTiposDeAnimais(String[] tiposDeAnimais) {
        this.tiposDeAnimais = tiposDeAnimais;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void exibirDados() {
        System.out.println("PetShop: " + nome);
        System.out.println("Categorias principais: " + categoriasPrincipais);
        System.out.println("Tipos de animais atendidos: " + String.join(", ", tiposDeAnimais));
        System.out.println("Localização: " + localizacao);
    }
    
    public void verCatalogo() {
    	
    	System.out.println("\nCatálogo de Produtos da PetShop " + nome);
    	catalogo.exibirProdutos();
    	
    }
}