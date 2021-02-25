package test.com.jeferson.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import test.com.jeferson.userinterface.DevicesPage;

public class Devices implements Task {

    public static Devices nexThePage3() {
        return Tasks.instrumented(Devices.class);
    }
        @Override
        public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(
                    SelectFromOptions.byVisibleText("IngresarTuMarcadecomputador").from(DevicesPage.INPUT_COMPUTER),
                    SelectFromOptions.byVisibleText("IngresarLaVersiondelComputador").from(DevicesPage.INPUT_VERSION),
                    SelectFromOptions.byVisibleText("IngresarelIdoma").from(DevicesPage.INPUT_LANGUAGE),
                    SelectFromOptions.byVisibleText("IngresarMarcaDeCelular").from(DevicesPage.INPUT_MOBILE),
                    SelectFromOptions.byVisibleText("Ingresarmodelodelcelular").from(DevicesPage.INPUT_MODEL),
                    SelectFromOptions.byVisibleText("Ingresarelsistemaoperativo").from(DevicesPage.INPUT_SYSTEM),
                    Click.on(DevicesPage.Enter_BUTTON2));
    }
}
