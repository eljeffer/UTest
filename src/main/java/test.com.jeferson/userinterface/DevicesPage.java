package test.com.jeferson.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage extends PageObject {

    public static final Target INPUT_COMPUTER= Target.the("para selecionar el computador").located(By.xpath("//div[@class='ui-select-box']//span[contains(text(),'Windows')]"));
    public static final Target INPUT_VERSION= Target.the("para selecionarl el sistema operativo").located(By.xpath("//div[@class='ui-select-box']//span[contains(text(),'10')]"));
    public static final Target INPUT_LANGUAGE= Target.the("para seleccionar el idioma").located(By.xpath("//div[@class='ui-select-box']//span[contains(text(),'Spanish')]"));
    public static final Target INPUT_MOBILE= Target.the("para seleccionar el celular ").located(By.xpath("//div[@class='ui-select-box']//span[contains(text(),'Select Brand')]"));
    public static final Target INPUT_MODEL= Target.the("para seleccionar la marca del celular").located(By.xpath("//div[@class='ui-select-box']//span[contains(text(),'Select a Model')]"));
    public static final Target INPUT_SYSTEM= Target.the("para seleccionar sistema operativo ").located(By.xpath("//div[@class='ui-select-box']//span[contains(text(),'Select OS')]"));
    public static final Target Enter_BUTTON2= Target.the("button to confirm nex location")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));
}
