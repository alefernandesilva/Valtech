package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By pesquisaGoogle = By.name("q");
	private By resultadoGoogle = By.xpath("//*[contains(text(),'www.valtech.com')]");
	
	private By pesquisaBing = By.name("q");
	private By resultadoBing = By.xpath("//*[@id=\"b_results\"]/li[2]/div[1]/div/cite");
	//private By resultadoBing = By.xpath("//*[contains(text(),'www.valtech.com')]");
	
	private By pesquisaYahoo = By.name("p");
	private By resultadoYahoo = By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a/span");
	
	public By getPesquisaGoogle() {
		return pesquisaGoogle;
	}
	public By getResultadoGoogle() {
		return resultadoGoogle;
	}
	public By getPesquisaBing() {
		return pesquisaBing;
	}
	public By getResultadoBing() {
		return resultadoBing;
	}
	public By getPesquisaYahoo() {
		return pesquisaYahoo;
	}
	public By getResultadoYahoo() {
		return resultadoYahoo;
	}
}