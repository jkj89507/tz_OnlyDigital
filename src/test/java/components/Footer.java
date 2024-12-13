package components;

import org.openqa.selenium.*;

public class Footer {
    private WebDriver webDriver;

    private final By scroller = By.xpath(
            ".//div[@class='scroll-content']"
    );
    private final By footerComponent = By.xpath(
            ".//footer"
    );
    private final By startProjectBtn = By.xpath(
            ".//footer/div[1]/div[1]/div[1]"
    );
    private final By phoneCompanyText = By.xpath(
            ".//footer/div[1]/div[2]/div[1]/a[1]"
    );
    private final By mailCompanyText = By.xpath(
            ".//footer/div[1]/div[2]/div[1]/a[2]"
    );
    private final By awwwardsSocialMediaBtn = By.xpath(
            ".//footer/div[1]/div[2]/div[2]/div/div[1]"
    );
    private final By vkontakteSocialMediaBtn = By.xpath(
            ".//footer/div[1]/div[2]/div[2]/div/div[2]"
    );
    private final By telegramSocialMediaBtn = By.xpath(
            ".//footer/div[1]/div[2]/div[2]/div/div[3]"
    );
    private final By vimeoSocialMediaBtn = By.xpath(
            ".//footer/div[1]/div[2]/div[2]/div/div[4]"
    );
    private final By behanceSocialMediaBtn = By.xpath(
            ".//footer/div[1]/div[2]/div[2]/div/div[5]"
    );
    private final By goToStartBtn = By.xpath(
            ".//footer/div[2]"
    );
    private final By discriptionCompanyText1 = By.xpath(
            ".//footer/div[3]/div[1]/p[1]"
    );
    private final By discriptionCompanyText2 = By.xpath(
            ".//footer/div[3]/div[1]/p[2]"
    );
    private final By copyrightText = By.xpath(
            ".//footer/div[3]/div[2]/p"
    );
    private final By logoCompanyImg = By.xpath(
            ".//footer/div[3]/div[2]/div"
    );

    public Footer(WebDriver driver) {
        this.webDriver = driver;
    }

    public void scrollToFooter() {
        Point footerLocation = this.webDriver.findElement(footerComponent).getLocation();
        JavascriptExecutor js = (JavascriptExecutor) this.webDriver;
        js.executeScript("arguments[0].style.transform = 'translate3d(0px,"
                + Integer.toString(-1 * footerLocation.getY() + 50) + "px, 0px)';",
                this.webDriver.findElement(this.scroller));
    }

    public boolean checkFooter() {
        return this.webDriver.findElement(this.footerComponent).isDisplayed();
    }

    public boolean checkStartProjectBtn() {
        return this.webDriver.findElement(this.startProjectBtn).isDisplayed();
    }

    public boolean checkPhoneCompanyText() {
        return this.webDriver.findElement(this.phoneCompanyText).isDisplayed();
    }

    public boolean checkMailCompanyText() {
        return this.webDriver.findElement(this.mailCompanyText).isDisplayed();
    }

    public boolean checkAwwwardsSocialMediaBtn() {
        return this.webDriver.findElement(this.awwwardsSocialMediaBtn).isDisplayed();
    }

    public boolean checkVkontakteSocialMediaBtn() {
        return this.webDriver.findElement(this.vkontakteSocialMediaBtn).isDisplayed();
    }

    public boolean checkTelegramSocialMediaBtn() {
        return this.webDriver.findElement(this.telegramSocialMediaBtn).isDisplayed();
    }

    public boolean checkVimeoSocialMediaBtn() {
        return this.webDriver.findElement(this.vimeoSocialMediaBtn).isDisplayed();
    }

    public boolean checkBehanceSocialMediaBtn() {
        return this.webDriver.findElement(this.behanceSocialMediaBtn).isDisplayed();
    }

    public boolean checkGoToStartBtn() {
        return this.webDriver.findElement(this.goToStartBtn).isDisplayed();
    }

    public boolean checkDiscriptionCompanyText1() {
        return this.webDriver.findElement(this.discriptionCompanyText1).isDisplayed();
    }

    public boolean checkDiscriptionCompanyText2() {
        return this.webDriver.findElement(this.discriptionCompanyText2).isDisplayed();
    }

    public boolean checkCopyrightText() {
        return this.webDriver.findElement(this.copyrightText).isDisplayed();
    }

    public boolean checkLogoCompanyImg() {
        return this.webDriver.findElement(this.logoCompanyImg).isDisplayed();
    }
}
