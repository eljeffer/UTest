package test.com.jeferson.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinTodayPage extends PageObject {

    public static final Target SIGNUP_BUTTON = Target.the("button that shows us the form to sing up")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__dropdown-menu']//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_NAME = Target.the("where do we write the name").located(By.name("firstName"));
    public static final Target INPUT_LASTNAME= Target.the("where do we write the lastname").located(By.name("lastName"));
    public static final Target INPUT_EMAIL= Target.the("where do we write the email").located(By.name("email"));
    public static final Target INPUT_MONT= Target.the("where do we select the mont").located(By.name("birthMonth"));
    public static final Target INPUT_DAY= Target.the("").located(By.name("birthDay"));
    public static final Target INPUT_YEAR= Target.the("").located(By.name("birthYear"));
    public static final Target INPUT_LANGUAGES= Target.the("where do we write the languages").located(By.name("languages"));
    public static final Target Enter_BUTTON= Target.the("button to confirm nex location")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a[contains(text(),'Next: Location')]"));




}

