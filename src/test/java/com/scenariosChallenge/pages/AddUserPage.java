package com.scenariosChallenge.pages;

import com.scenariosChallenge.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddUserPage {


    public AddUserPage(){

        //I used Page Factory Design Pattern to instantiate the webElement using
        //@FindBy annotation which makes it easier and convenient.

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-link pull-right']")
    public WebElement addUserButton;

    @FindBy(xpath = "//h3[@class='ng-binding']")
    public WebElement addUserText;


    @FindBy(name="FirstName")
    public WebElement firstName;

    @FindBy(name="LastName")
    public WebElement lastName;

    @FindBy(name="UserName")
    public WebElement userName;

    @FindBy(name="Password")
    public WebElement passWord;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement customerCompanyInput;

    @FindBy(name = "RoleId")
    public WebElement roleId;

    @FindBy( name = "Email")
    public WebElement e_mail;

    @FindBy(name = "Mobilephone")
    public WebElement cellPhone;

    @FindBy(xpath ="//button[@class='btn btn-success']" )
    public WebElement saveButton;

    @FindBy(xpath ="//table[@class='smart-table table table-striped']//tr/td[.='Nour']" )
    public WebElement addedUser;

    @FindBy(xpath ="(//td[@class='smart-table-data-cell'])[4]" )
    public WebElement customerText;

    @FindBy (xpath = "//table[@class='smart-table table table-striped']/tbody/tr/td[3]")
    public List<WebElement> userNames;


}
