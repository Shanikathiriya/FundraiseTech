package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mystepdef
{
    Findcause findcause= new Findcause();

    @Given("user is on home page")
    public void user_is_on_home_page() {
       // System.out.println("hello");
        findcause.SearchCause();

    }

    @When("user click on find cause enter char")
    public void user_click_on_find_cause_enter_char() {
        findcause.Typechar();
    }

    @When("select 3rd cause from list and click")
    public void select_3rd_cause_from_list_and_click() {
       findcause.chooseThirdOption();
    }
    @Then("user should Confirm with a message that the selected 3rd Cause exists in the Search results")
    public void user_should_confirm_with_a_message_that_the_selected_3rd_cause_exists_in_the_search_results() {
        System.out.println("is seleect");
    }

}
