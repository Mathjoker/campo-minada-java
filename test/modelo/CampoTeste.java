package modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class CampoTeste {
	
	private Campo campo = new Campo(3, 3);
	
	void iniciarCampo() {
		
	}
	
	@Test
	void testeVisinhoReal() {
		Campo vizinho = new Campo(3,2);
		
		boolean resultadi = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultadi);
	}
	
}
