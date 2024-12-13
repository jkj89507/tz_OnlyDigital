import components.Footer;
import helpers.Utils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FooterComponentCollectionTest {
    static final String WEB_APP_URL = "https://only.digital/";
    static WebDriver driver;
    static Footer footerComponent;

    @BeforeAll
    public static void setUpBeforeAll() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(WEB_APP_URL);
        Utils.delay(15000);
        footerComponent = new Footer(driver);
        footerComponent.scrollToFooter();
    }

    @AfterAll
    public static void setUpAfterAll() {
        driver.quit();
    }

    @DisplayName("TC.0. Существование футера")
    @Test
    @Order(1)
    public void footerComponentIsExist() {
        Assertions.assertTrue(footerComponent.checkFooter());
    }

    @DisplayName("TC.1. Существование кнопки 'Начать проект'")
    @Test
    @Order(2)
    public void startProjectBtnIsExist() {
        Assertions.assertTrue(footerComponent.checkFooter());
    }

    @DisplayName("TC.2. Существование текста 'Номер телефона'")
    @Test
    @Order(3)
    public void phoneCompanyTextIsExist() {
        Assertions.assertTrue(footerComponent.checkPhoneCompanyText());
    }

    @DisplayName("TC.3. Существование текста 'Почта'")
    @Test
    @Order(4)
    public void mailCompanyTextIsExist() {
        Assertions.assertTrue(footerComponent.checkMailCompanyText());
    }

    @DisplayName("TC.4. Существование кнопки 'Awwwards'")
    @Test
    @Order(5)
    public void awwwardsSocialMediaBtnIsExist() {
        Assertions.assertTrue(footerComponent.checkAwwwardsSocialMediaBtn());
    }

    @DisplayName("TC.5. Существование кнопки 'Vkontakte'")
    @Test
    @Order(6)
    public void vkontakteSocialMediaBtnIsExist() {
        Assertions.assertTrue(footerComponent.checkVkontakteSocialMediaBtn());
    }

    @DisplayName("TC.6. Существование кнопки 'Telegram'")
    @Test
    @Order(7)
    public void telegramSocialMediaBtnIsExist() {
        Assertions.assertTrue(footerComponent.checkTelegramSocialMediaBtn());
    }

    @DisplayName("TC.7. Существование кнопки 'Vimeo'")
    @Test
    @Order(8)
    public void vimeoSocialMediaBtnIsExist() {
        Assertions.assertTrue(footerComponent.checkVimeoSocialMediaBtn());
    }

    @DisplayName("TC.8. Существование кнопки 'Behance'")
    @Test
    @Order(9)
    public void behanceSocialMediaBtnIsExist() {
        Assertions.assertTrue(footerComponent.checkBehanceSocialMediaBtn());
    }

    @DisplayName("TC.9. Существование кнопки 'В начало'")
    @Test
    @Order(10)
    public void goToStartBtnIsExist() {
        Assertions.assertTrue(footerComponent.checkGoToStartBtn());
    }

    @DisplayName("TC.10. Существование англоязычного слогана")
    @Test
    @Order(11)
    public void discriptionCompanyText1IsExist() {
        Assertions.assertTrue(footerComponent.checkDiscriptionCompanyText1());
    }

    @DisplayName("TC.11. Существование русского слогана")
    @Test
    @Order(12)
    public void discriptionCompanyText2IsExist() {
        Assertions.assertTrue(footerComponent.checkDiscriptionCompanyText2());
    }

    @DisplayName("TC.12. Существование текста копирайта")
    @Test
    @Order(13)
    public void copyrightTextIsExist() {
        Assertions.assertTrue(footerComponent.checkCopyrightText());
    }

    @DisplayName("TC.13. Существование логотипа компании")
    @Test
    @Order(14)
    public void logoCompanyImgIsExist() {
        Assertions.assertTrue(footerComponent.checkLogoCompanyImg());
    }
}