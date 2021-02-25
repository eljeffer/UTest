package test.com.jeferson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import test.com.jeferson.userinterface.CrearPage;

public class Crear implements Task {

    public static Crear finisThePage() {
        return Tasks.instrumented(Crear.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Ingresarcontrasena").into(CrearPage.INPUT_PASSEWOR),
                Enter.theValue("IngresarTucontrasena").into(CrearPage.INPUT_PASSEWOR2),
                Click.on(CrearPage.INPUT_CHECK1),
                Click.on(CrearPage.INPUT_CHECK2),
                Click.on(CrearPage.INPUT_CHECK3),
                Click.on(CrearPage.Enter_BUTTON3));

    }
}
