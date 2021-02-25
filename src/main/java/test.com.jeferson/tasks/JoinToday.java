package test.com.jeferson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import test.com.jeferson.userinterface.UtestJoinTodayPage;

public class JoinToday implements Task {

    public static JoinToday onThePage() {

        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinTodayPage.SIGNUP_BUTTON),
                Enter.theValue("IngresarTuNombre").into(UtestJoinTodayPage.INPUT_NAME),
                Enter.theValue("IngresarTuApellido").into(UtestJoinTodayPage.INPUT_LASTNAME),
                SelectFromOptions.byVisibleText("March").from(UtestJoinTodayPage.INPUT_MONT),
                SelectFromOptions.byVisibleText("number:4").from(UtestJoinTodayPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("number:1993").from(UtestJoinTodayPage.INPUT_YEAR),
                Enter.theValue("IngresarTuEmail").into(UtestJoinTodayPage.INPUT_EMAIL),
                Enter.theValue("IngresarIdioma").into(UtestJoinTodayPage.INPUT_LANGUAGES),
                Click.on(UtestJoinTodayPage.Enter_BUTTON));

    }
}
