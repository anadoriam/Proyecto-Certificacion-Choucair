package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Test;
import org.openqa.selenium.By;

import javax.xml.soap.Text;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UNICH = Target.the("Seleccionar Universidad Choucair")
            .located(By.xpath("(//IMG[@class='card-img-top'])[1]"));

    public static final Target INPUT_COURSE = Target.the("BUSCAR EL CURSO")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_IR = Target.the("DAR CLICK PARA BUSCAR ")
            .located(By.xpath("//BUTTON[@class='btn btn-secondary'][text()='Ir']"));

    public static final Target SELECT_CO = Target.the("SELECCIONAR CURSO ")
            //Teniendo en cuenta que el curso no se encuentra pondre un curso diferente en su lugar
            .located(By.xpath("//a[text()='Metodología Bancolombia']"));

    public static final Target NAME_COURSE = Target.the("EXTRAE EL NOMBRE DEL CURSO ")
            .located(By.xpath("//A[@class='aalink'][text()='Metodología Bancolombia']"));

}
