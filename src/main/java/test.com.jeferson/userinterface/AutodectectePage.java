package test.com.jeferson.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutodectectePage extends PageObject {

    public static final Target INPUT_CITY= Target.the("where do we write the City").located(By.name("city"));
    public static final Target INPUT_CPOSTAL= Target.the("where do we write the cpostal").located(By.name("zip"));
    public static final Target INPUT_COUNTRY= Target.the("where do we write the contry")
            .located(By.className("btn btn-default form-control ui-select-toggle"));
    public static final Target Enter_BUTTON1= Target.the("button to confirm nex location")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'chevron_right')]"));
}
