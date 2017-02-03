package br.unb.model.sae_context;

public class AlunoSae extends Aluno {
	private List<OcorrenciaAluno> listaOcorrenciaAluno;
	
	public void adicionaOcorrenciaAluno(OcorrenciaAluno ocorr){
		if (existeOcorrenciaAberto(ocorr.getSemestreAno(), ocorr.getDataInicio())){
			throw new Exception("O aluno já possui uma ocorrência.");
		}
		
		if (assinouTermoOcorrencia(ocorr.getSemestreAno())){
			throw new Exception("O aluno não possui termo de concessão.");
		}
		
		listaOcorrenciaAluno.add(ocorr);
	}
	
	public List<OcorrenciaAluno> getListaOcorrenciaAluno() {
		return listaOcorrenciaAluno;
	}

	public boolean existeOcorrenciaAberto(String semestreAno, Date dataInicio){
		// Removido para melhor visualização
	}
	
	public boolean assinouTermoOcorrencia(String semestreAno){
		// Removido para melhor visualização
	}
}
