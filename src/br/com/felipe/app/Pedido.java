package br.com.felipe.app;


public class Pedido {
    private String[] itens;
    private double[] valores;
    private double valorTotal;
    private String tipoDePet;
    private double peso;

    public Pedido(String[] itens, double[] valores, String tipoDePet, double peso) {
        this.itens = itens;
        this.valores = valores;
        this.tipoDePet = tipoDePet;
        this.peso = peso;
        calcularValorTotal();
    }

    private void calcularValorTotal() {
        valorTotal = 0;
        for (double v : valores) {
            valorTotal += v;
        }
    }

    public void exibirResumo() {
        System.out.println("=== PEDIDO ===");
        System.out.println("Tipo de Pet: " + tipoDePet);
        System.out.println("Peso aproximado: " + peso + " kg");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("- " + itens[i] + " R$" + valores[i]);
        }
        System.out.println("Total: R$" + valorTotal);
    }

	public String[] getItens() {
		return itens;
	}

	public void setItens(String[] itens) {
		this.itens = itens;
	}

	public double[] getValores() {
		return valores;
	}

	public void setValores(double[] valores) {
		this.valores = valores;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

    public String getTipoDePet() {
        return tipoDePet;
    }

    public void setTipoDePet(String tipoDePet) {
        this.tipoDePet = tipoDePet;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}