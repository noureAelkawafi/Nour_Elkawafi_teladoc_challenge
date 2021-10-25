package com.scenariosChallenge.step_definitions;

import com.scenariosChallenge.pages.DeleteUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class deleteUserStepDefinitions {

    DeleteUserPage deleteUserPage = new DeleteUserPage();
    String expected = "novak";

    @When("user click on the delete button")
    public void user_click_on_the_delete_button() {
        deleteUserPage.deleteButton.click();

    }

    @And("user click on the ok button")
    public void user_click_on_the_ok_button() {

        deleteUserPage.okButton.click();


    }

    @Then("user should see user has been delete")
    public void user_should_see_user_has_been_delete() {

        List<WebElement> usernames = deleteUserPage.userNames;
        List<String> userNameList = usernames.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(userNameList);
        for (String each : userNameList) {
            Assert.assertFalse(each.equals(expected));
        }
    }
    }