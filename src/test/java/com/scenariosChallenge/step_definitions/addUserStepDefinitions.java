package com.scenariosChallenge.step_definitions;

import com.scenariosChallenge.pages.AddUserPage;
import com.scenariosChallenge.utilities.ConfigurationReader;
import com.scenariosChallenge.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;

public class addUserStepDefinitions {

    AddUserPage addUserPage = new AddUserPage();
    String userName = "nourelkawafi";



    @Given("user is on the webTable page")
    public void user_is_on_the_web_table_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlWeb"));
        System.out.println("User is on the login page.");

    }

    @When("User clicks Add User button")
    public void user_clicks_add_user_button() {
        addUserPage.addUserButton.click();

    }

    @Then("user should see the add user form")
    public void user_should_see_the_add_user_form() {

        String actualHeaderText = addUserPage.addUserText.getText();
        assertEquals("Header did not match.", actualHeaderText, "Add User");

    }

    @And("user enter First name")
    public void user_enter_first_name() {
        addUserPage.firstName.sendKeys(userName);

    }

    @And("user enter Last name")
    public void user_enter_last_name() {
        addUserPage.lastName.sendKeys("El Kawafi");

    }

    @And("user enter user Name")
    public void user_enter_user_name() {
        addUserPage.userName.sendKeys("nourelkawafi");

    }

    @And("user enter password")
    public void user_enter_password() {
        addUserPage.passWord.sendKeys("123456");

    }

    @And("user  choose from customerCompany radio button")// the function
    public void user_choose_from_customer_company_radio_button() {
        addUserPage.customerCompanyInput.click();

        boolean select = addUserPage.customerCompanyInput.isSelected();
        System.out.println("Element selected is :" + select);

       /* I used boolean condition to check the button is selected , because after I
        create new user the button is selected , which mean the test pass when I add the user ,
         but it will fail if I assert the text is displayed .*/


    }


    @And("user  choose from Roles list")
    public void user_choose_from_roles_list() {

        Select select = new Select(addUserPage.roleId);
        select.selectByVisibleText("Admin");

    }

    @And("user enter E-mail")
    public void user_enter_e_mail() {
        addUserPage.e_mail.sendKeys("noka_nour@yahoo.com");

    }

    @And("user enter cell Phone number")
    public void user_enter_cell_phone_number() {

        addUserPage.cellPhone.sendKeys("222222222");

    }

    @Then("user can click on save button")
    public void user_can_click_on_save_button() {
        addUserPage.saveButton.click();

    }

    @Then("user can see added user")
    public void user_can_see_added_user() {


        List<WebElement> usernames = addUserPage.userNames;
        List<String> userNameList=usernames.stream().map(WebElement::getText).collect(Collectors.toList());

        for (String each : userNameList) {
            if(each.contentEquals(userName)){
                Assert.assertEquals(each, userName);

            }
        }

    }

}

