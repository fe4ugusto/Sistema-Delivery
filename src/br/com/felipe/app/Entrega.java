package br.com.felipe.app;

import br.com.felipe.interfaces.Avaliacao;
import java.time.LocalDateTime;

public class Entrega implements Avaliacao {
    private String endereco;
    private Entregador entregador;
    private String status;
    private int avaliacao;
    private int tempoEstimado;
    private String instrucoes;
    private LocalDateTime dataEntrega;

    public Entrega(String endereco, Entregador entregador) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Endereço da entrega não pode ser vazio.");
        }
        if (entregador == null) {
            throw new IllegalArgumentException("Entregador não pode ser nulo.");
        }
        this.endereco = endereco;
        this.entregador = entregador;
        this.status = "A caminho";
        this.avaliacao = 0;
        this.tempoEstimado = 30; // valor padrão
        this.instrucoes = "Entregar na porta";
        this.dataEntrega = LocalDateTime.now().plusMinutes(tempoEstimado);
    }

    public void exibirDados() {
        System.out.println("=== ENTREGA ===");
        System.out.println("Endereço: " + endereco);
        System.out.println("Instruções: " + instrucoes);
        System.out.println("Entregador: " + entregador.getNome());
        System.out.println("Telefone: " + entregador.getTelefone());
        System.out.println("Status: " + status);
        System.out.println("Tempo estimado: " + tempoEstimado + " minutos");
        System.out.println("Data estimada de entrega: " + dataEntrega);
        System.out.println("Avaliação da entrega: " + avaliacao);
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isEmpty()) {
            throw new IllegalArgumentException("Status não pode ser vazio.");
        }
        this.status = novoStatus;
    }

    @Override
    public void avaliar(int nota) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("Nota deve ser entre 1 e 5.");
        }
        this.avaliacao = nota;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        if (tempoEstimado <= 0) {
            throw new IllegalArgumentException("Tempo estimado deve ser positivo.");
        }
        this.tempoEstimado = tempoEstimado;
        this.dataEntrega = LocalDateTime.now().plusMinutes(tempoEstimado);
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

	@Override
	public int getNota() {
		// TODO Auto-generated method stub
		return avaliacao;
	}
}