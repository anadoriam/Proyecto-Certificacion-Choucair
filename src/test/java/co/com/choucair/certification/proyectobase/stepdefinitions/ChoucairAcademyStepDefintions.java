package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import com.google.common.base.Equivalence;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Ana whants to learn automation at the academy Choucair$")
    public void thanAnaWhantsToLearnAutomationAtTheAcademyChoucair() {
      OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
   }

  @When("^he shearch for the chourse (.*) on the choucair academy platform$")
  public void heShearchForTheChourseMetodologíaBancolombiaOnTheChoucairAcademyPlatform(String course){
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
  }

   @Then("^he finds the course called recources (.*)$")
    public void heFindsTheCourseCalledRecourceMetodologíaBancolombia(String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
   }


}
