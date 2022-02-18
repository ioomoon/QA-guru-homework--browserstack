package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.MobileConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static utils.FileUtils.getAbsolutePath;


public class EmulationMobileDriver implements WebDriverProvider {

    public static MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class);

    public static URL getLocalHostUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "Pixel 5 API 32");
        desiredCapabilities.setCapability("version", "11.0");
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app",
                getAbsolutePath("src/test/resources/apk/app-alpha-universal-release.apk"));

        return new AndroidDriver(getLocalHostUrl(), desiredCapabilities);
    }
}
