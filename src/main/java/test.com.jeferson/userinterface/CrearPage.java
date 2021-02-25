package test.com.jeferson.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearPage extends PageObject {

    public static final Target INPUT_PASSEWOR= Target.the("para selecionarl el sistema operativo").located(By.id("password"));
    public static final Target INPUT_PASSEWOR2= Target.the("para seleccionar el idioma").located(By.id("confirmPassword"));
    public static final Target INPUT_CHECK1= Target.the("para seleccionar el celular ").located(By.xpath("//div[@class='row col-xs-12']//span[contains(text(),'Select Brand')]"));
    public static final Target INPUT_CHECK2= Target.the("para seleccionar la marca del celular").located(By.xpath("//div[@class='row col-xs-12']//span[contains(text(),'" +
            "           You must accept Privacy & Security Policy to be able to continue" +
            "        ')]"));
    public static final Target INPUT_CHECK3= Target.the("para seleccionar sistema operativo ").located(By.xpath("//div[@class='row col-xs-12']//span[contains(text(),'" +
            "           You must accept Privacy & Security Policy to be able to continue" +
            "        ')]"));
    public static final Target Enter_BUTTON3= Target.the("button to confirm nex location")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));
}
