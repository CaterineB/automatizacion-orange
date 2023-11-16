package Orange.Definitions;

import Orange.Pages.LoginPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
	}

	@When("^el usuario diligencia usuario(.*)$" )
	public void llenarLogin(String userName){
		this.loginPage = new LoginPage(driver);
		this.loginPage.llenarLogin(userName);

	}





}