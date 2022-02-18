package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:real_config.properties"
})

public interface RealConfig extends Config {
    @Key("deviceName")
    String deviceName();

    @Key("version")
    String version();

    @Key("appPath")
    String appPath();
}
