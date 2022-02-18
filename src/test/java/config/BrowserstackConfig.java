package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack_config.properties"
})

public interface BrowserstackConfig extends Config {
    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("url")
    String url();
}
