package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:MobileConfig.properties"
})

public interface MobileConfig extends Config {
    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("url")
    String url();
}
