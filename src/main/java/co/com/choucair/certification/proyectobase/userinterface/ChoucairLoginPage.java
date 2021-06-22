package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Boton de ingresar a Login de Choucair Academy")
            .located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a"));
    public static final Target INPUT_USER = Target.the("Ingresamos el usuario")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("ingresamos la contraseña")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("seleccionamos el boton Acceder")
            .located(By.xpath("//BUTTON[@type='submit'][text()='Acceder']"));

}


