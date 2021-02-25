package test.com.jeferson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import test.com.jeferson.userinterface.AutodectectePage;

public class Autodetecte implements Task {
    private String address;

    public Autodetecte(String address) {
        this.address = address;
    }

    public static Autodetecte the(String address) {
        return Tasks.instrumented(Autodetecte.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("IngresarTuCiudad").into(AutodectectePage.INPUT_CITY),
                Enter.theValue("IngresarTuCodigopodtal").into(AutodectectePage.INPUT_CPOSTAL),
                SelectFromOptions.byVisibleText("Colombia").from(AutodectectePage.INPUT_COUNTRY),
                Click.on(AutodectectePage.Enter_BUTTON1));
    }
}