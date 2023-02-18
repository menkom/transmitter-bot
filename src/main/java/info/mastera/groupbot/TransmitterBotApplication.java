package info.mastera.groupbot;

import info.mastera.groupbot.bot.TelegramSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value = {TelegramSettings.class})
@SpringBootApplication
public class TransmitterBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransmitterBotApplication.class, args);
    }

}
