package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.DzConfig;


import static org.assertj.core.api.Assertions.assertThat;

public class DzTest {

    @Test
    public void testRemoteRun() {
        System.setProperty("typeRun", "remote");
        DzConfig config = ConfigFactory.create(DzConfig.class, System.getProperties());

        assertThat(config.getBrowserName()).isEqualTo("CHROME");
        assertThat(config.getBrowserVersion()).isEqualTo("100.0");
    }

    @Test
    public void testLocaleRun() {
        DzConfig config = ConfigFactory.create(DzConfig.class, System.getProperties());

        assertThat(config.getBrowserName()).isEqualTo("FIREFOX");
        assertThat(config.getBrowserVersion()).isEqualTo("99.0");
    }
}