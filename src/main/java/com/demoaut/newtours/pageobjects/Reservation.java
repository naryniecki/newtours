package com.demoaut.newtours.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reservation {

    WebDriver drv;

    @FindBy(name="tripType")
    WebElement tripType;

    @FindBy(name="passCount")
    WebElement passCount;

    @FindBy(name="fromPort")
    WebElement fromPort;

    @FindBy(name="fromMonth")
    WebElement fromMonth;

    @FindBy(name="fromDay")
    WebElement fromDay;

    @FindBy(name="toPort")
    WebElement toPort;

    @FindBy(name="toMonth")
    WebElement toMonth;

    @FindBy(name="toDay")
    WebElement toDay;

    @FindBy(name="servClass")
    WebElement servClass;

    @FindBy(name="airline")
    WebElement airline;

    @FindBy(name="findFlights")
    WebElement findFlights;

    public Reservation(WebDriver drv) {
        this.drv = drv;
        PageFactory.initElements(drv, this);
    }

    public Reservation2 clickContinue() {
        this.findFlights.click();
        return new Reservation2(drv);
    }

    public void setDepartureMonth(String departureMonth) { new Select(this.fromMonth).selectByVisibleText(departureMonth); }

    public void setDepartureDay(String departureDay) {
        new Select(this.fromDay).selectByValue(departureDay);
    }

    public void setDestination(String destination) {
        new Select(this.toPort).selectByValue(destination);
    }

    public void setReturnMonth(String returnMonth) {
        new Select(this.toMonth).selectByVisibleText(returnMonth);
    }

    public void setReturnDay(String returnDay) {
        new Select(this.toDay).selectByValue(returnDay);
    }
}