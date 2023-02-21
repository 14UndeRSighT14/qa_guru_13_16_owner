package qa.guru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:dz-${typeRun}.properties",
        "classpath:dz-locale.properties",
})

public interface DzConfig extends Config{
    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();
}
