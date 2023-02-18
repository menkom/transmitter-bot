package info.mastera.groupbot.bot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.validation.constraints.NotBlank;

@Slf4j
@Component
public class TransmitterBot extends TelegramLongPollingBot {

    private final String botUsername;
    private final String chatId;

    public TransmitterBot(TelegramSettings telegramSettings) {
        super(telegramSettings.getToken());
        this.botUsername = telegramSettings.getUsername();
        this.chatId = telegramSettings.getChatId();
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public void onUpdateReceived(Update update) {
        // this method is for responding on any messages and need to be overridden
    }

    public void sendMessageToChat(@NotBlank String text) throws TelegramApiException {
        var message = new SendMessage(chatId, text);
        execute(message);
    }
}
