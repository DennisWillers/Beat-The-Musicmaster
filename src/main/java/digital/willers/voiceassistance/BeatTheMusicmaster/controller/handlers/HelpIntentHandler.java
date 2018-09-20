package digital.willers.voiceassistance.BeatTheMusicmaster.controller.handlers;


import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

@Component
public class HelpIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Hilfe bekommen wollen sie alle!";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Beat the Musicmaster", speechText)
                .withReprompt(speechText)
                .build();
    }
}
