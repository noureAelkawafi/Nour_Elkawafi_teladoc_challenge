package com.scenariosChallenge.pages;

import com.scenariosChallenge.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeleteUserPage {

    public DeleteUserPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//table[@class='smart-table table table-striped']//tr/td[.='novak']/../td[11]//button")
    public WebElement deleteButton;


    @FindBy(xpath = "//button[@class='btn ng-scope ng-binding btn-primary']")
    public WebElement okButton;

    @FindBy(xpath ="//td[.='novak']" )
    public WebElement  checkUser;

    @FindBy (xpath = "//table[@class='smart-table table table-striped']/tbody/tr/td[3]")
    public List<WebElement> userNames;














}
