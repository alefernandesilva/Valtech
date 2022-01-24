package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class Metodos extends Browsers {
	/**
	 * Metodo para escrever em um elemento
	 * @author alefernandesilva
	 */
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("***--- erro ao escrever no elemento ---***\n" + e.getMessage());
			System.out.println("***--- causa do erro ---***" + e.getCause());
		}
	}
	/**
	 * Metodo para abrir clicar em um elemento
	 * @author alefernandesilva
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("***--- erro ao clicar no elemento ---***\n" + e.getMessage());
			System.out.println("***--- causa do erro ---***" + e.getCause());
		}
	}
	/**
	 * Metodo submit
	 * @author alefernandesilva
	 */
	public void submit(By elemento) {
		try {
			driver.findElement(null).submit();
		} catch (Exception e) {
			System.out.println("***--- erro ao enviar ---***\n" + e.getMessage());
			System.out.println("***--- causa do erro ---***" + e.getCause());
		}
	}
	/**
	 * Metodo para validar mensagem
	 * @author alefernandesilva
	 */
	public void validarMensagem(By elemento, String msgEsperada) {
		try {
			String msgCapturada = driver.findElement(elemento).getText();
			assertEquals(msgEsperada, msgCapturada);
		
			
			System.out.println("Msg Capturada: " + msgCapturada);
		} catch (Exception e) {
			System.out.println("***--- erro ao validar mensagem ---***\n" + e.getMessage());
			System.out.println("***--- causa do erro ---***" + e.getCause());
		}
	}
	/**
	 * Metodo para pausar
	 * @author alefernandesilva
	 */
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println("***--- erro ao pausar com Thread.sleep ---***\n" + e.getMessage());
			System.out.println("***--- causa do erro ---***\n" + e.getCause());
		}
	}
}
