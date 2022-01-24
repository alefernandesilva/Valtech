package steps;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browsers;
import metodos.Metodos;

public class ValtechPesquisa {
	
	Browsers browser = new Browsers();
	Metodos metodo = new Metodos();
	ElementosWeb elemento = new ElementosWeb();
	
	@Given("que o usuario esteja na homepage do buscador {string}")
	public void que_o_usuario_esteja_na_homepage_do_buscador(String buscador) {
		metodo.abrirNavegador("chrome", buscador);
	}
	@When("o usuario digita a palavra {string} no buscador google")
	public void o_usuario_digita_a_palavra_no_buscador_google(String palavra) {
		metodo.pausa(5000);
		metodo.escrever(elemento.getPesquisaGoogle(), palavra);
	}
	@When("o buscador apresenta os resultados")
	public void o_buscador_apresenta_os_resultados() {
	}
	@Then("o usuario valida os resultados {string} no buscador google")
	public void o_usuario_valida_os_resultados_no_buscador_google(String urlValtech) {
		metodo.pausa(10000);
		metodo.validarMensagem(elemento.getResultadoGoogle(), urlValtech);
	}
	@When("o usuario digita a palavra {string} no buscador bing")
	public void o_usuario_digita_a_palavra_no_buscador_bing(String palavra) {
		metodo.escrever(elemento.getPesquisaBing(), palavra);
	}
	@Then("o usuario valida os resultados {string} no buscador bing")
	public void o_usuario_valida_os_resultados_no_buscador_bing(String urlValtech) {
		metodo.pausa(10000);
		metodo.validarMensagem(elemento.getResultadoBing(), urlValtech);
	}
	@When("o usuario digita a palavra {string} no buscador yahoo")
	public void o_usuario_digita_a_palavra_no_buscador_yahoo(String palavra) {
		metodo.escrever(elemento.getPesquisaYahoo(), palavra);
	}
	@Then("o usuario valida os resultados {string} no buscador yahoo")
	public void o_usuario_valida_os_resultados_no_buscador_yahoo(String urlValtech) {
		metodo.pausa(10000);
		metodo.validarMensagem(elemento.getResultadoYahoo(), urlValtech);
	}
}