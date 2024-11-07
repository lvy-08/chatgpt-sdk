package cn.bug.chatgpt.session.defaults;

import cn.bug.chatgpt.common.Constants;
import cn.bug.chatgpt.domain.chat.ChatCompletionRequest;
import cn.bug.chatgpt.domain.chat.ChatCompletionResponse;
import cn.bug.chatgpt.domain.chat.Message;
import cn.bug.chatgpt.domain.qa.QACompletionRequest;
import cn.bug.chatgpt.domain.qa.QACompletionResponse;
import cn.bug.chatgpt.session.Configuration;
import cn.bug.chatgpt.IOpenAiApi;
import cn.bug.chatgpt.session.OpenAiSession;
import io.reactivex.Single;

import java.util.Collections;

/**
 * @description
 */
public class DefaultOpenAiSession implements OpenAiSession {

    private IOpenAiApi openAiApi;

    public DefaultOpenAiSession(IOpenAiApi openAiApi) {
        this.openAiApi = openAiApi;
    }

    @Override
    public QACompletionResponse completions(QACompletionRequest qaCompletionRequest) {
        return this.openAiApi.completions(qaCompletionRequest).blockingGet();
    }

/*    @Override
    public QACompletionResponse completions(String question) {
        QACompletionRequest request = QACompletionRequest
                .builder()
                .prompt(question)
                .build();
        Single<QACompletionResponse> completions = this.openAiApi.completions(request);
        return completions.blockingGet();
    }*/

    @Override
    public QACompletionResponse completions(String question) {
        if (question == null || question.trim().isEmpty()) {
            throw new IllegalArgumentException("Question cannot be null or empty");
        }

        QACompletionRequest request = QACompletionRequest
                .builder()
                .prompt(question)
                .build();

        try {
            Single<QACompletionResponse> completions = this.openAiApi.completions(request);
            return completions.blockingGet(); // 考虑用非阻塞方式
        } catch (Exception e) {
            // 处理 API 调用中的异常
            throw new RuntimeException("Failed to get completions from OpenAI API", e);
        }
    }


    @Override
    public ChatCompletionResponse completions(ChatCompletionRequest chatCompletionRequest) {
        return this.openAiApi.completions(chatCompletionRequest).blockingGet();
    }

}

