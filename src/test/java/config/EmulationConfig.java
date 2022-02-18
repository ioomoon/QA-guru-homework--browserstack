package config;
import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:emulation_config.properties"
})

public interface EmulationConfig extends Config {
    @Key("deviceName")
    String deviceName();

    @Key("version")
    String version();

    @Key("appPath")
    String appPath();
}
