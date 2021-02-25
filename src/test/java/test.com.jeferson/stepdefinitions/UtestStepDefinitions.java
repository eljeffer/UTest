package test.com.jeferson.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.com.jeferson.tasks.Autodetecte;
import test.com.jeferson.tasks.Crear;
import test.com.jeferson.tasks.Devices;
import test.com.jeferson.tasks.JoinToday;
import test.com.jeferson.tasks.OpenUp;

public class
UtestStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());

    }

    @Given("^that Jefferson wants to learn and earn money Testing at UTest$")
    public void thatJeffersonWantsToLearnAndEarnMoneyTestingAtUTest() {
        OnStage.theActorCalled("Jefferson").wasAbleTo(OpenUp.thePage());
    }


    @When("^I registered my data on the (.*) platform$")
    public void iRegisteredMyDataOnTheUTestPlatform(String address) {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage(), (Autodetecte.the(address)),(Devices.nexThePage3()));

    }

    @Then("^pressing the register button called complete sep$")
    public void pressingTheRegisterButtonCalledCompleteSep() {
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.finisThePage());

    }
}
