package apps.testing.home.base;

import io.appium.java_client.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class BrowserConfig {

    @Bean
    public WebDriver setupConfig(){
        FirefoxProfile geoDisabled = new FirefoxProfile();
        geoDisabled.setPreference("geo.enabled", false);
        geoDisabled.setPreference("geo.provider.use_corelocation", false);
        geoDisabled.setPreference("geo.prompt.testing", false);
        geoDisabled.setPreference("geo.prompt.testing.allow", false);
        geoDisabled.setPreference("permissions.default.desktop-notification", 1);

        //DesiredCapabilities capabilities = new DesiredCapabilities();

        //capabilities.setCapability(FirefoxDriver.Capability.PROFILE,geoDisabled);
        //new FirefoxDriver()
         WebDriverManager.chromedriver().setup();//capabilities(capabilities);


        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        options.addPreference("dom.webnotifications.enabled", false);
        options.addPreference("dom.push.enabled", false);
        options.addPreference("permissions.default.desktop-notification", 1);

        WebDriver driver = new ChromeDriver();

        return driver;
    }

}
