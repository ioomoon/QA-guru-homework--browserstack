package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import config.RealConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static utils.FileUtils.getAbsolutePath;


public class RealMobileDriver implements WebDriverProvider {

    public static RealConfig realConfig = ConfigFactory.create(RealConfig.class);

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
        desiredCapabilities.setCapability("deviceName", realConfig.deviceName());
        desiredCapabilities.setCapability("version", realConfig.version());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app",
                getAbsolutePath(realConfig.appPath()));

        return new AndroidDriver(getLocalHostUrl(), desiredCapabilities);
    }

}
