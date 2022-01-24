package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browsers {

	protected static WebDriver driver;
	/**
	 * Metodo para abrir um navegador
	 * @author alefernandesilva
	 */
	public void abrirNavegador(String navegador, String site) {
		try {
			if (navegador.equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (navegador.equalsIgnoreCase("FIREFOX")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (navegador.equalsIgnoreCase("EDGE")) {
				System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			} else if (navegador.equalsIgnoreCase("OPERA")) {
				System.setProperty("webdriver.opera.driver", "./Drivers/operadriver.exe");
				driver = new OperaDriver ();
			} else {
				System.out.println("Navegador inválido. Escolha outra opção entre: CHROME, FIREFOX, EDGE ou OPERA");
			}
		} catch (Exception e) {
			System.out.println("***--- erro ao abrir navegador ---***\n" + e.getMessage());
			System.out.println("***--- causa do erro ---***" + e.getCause());
		}
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * M�todo para fechar todas as abas do navegador
	 * @author alefernandesilva
	 */
	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("***--- erro ao fechar navegador ---***\n" + e.getMessage());
			System.err.println("***--- causa do erro ---***" + e.getCause());
		}
	}
}
