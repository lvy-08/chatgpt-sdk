package cn.bug.chatgpt.session;

import cn.bug.chatgpt.domain.chat.ChatCompletionRequest;
import cn.bug.chatgpt.domain.chat.ChatCompletionResponse;
import cn.bug.chatgpt.domain.qa.QACompletionRequest;
import cn.bug.chatgpt.domain.qa.QACompletionResponse;

/**
 * @description OpenAi 会话接口
 */
public interface OpenAiSession {

    /**
     * 文本问答
     * @param qaCompletionRequest 请求信息
     * @return                    返回结果
     */
    @Deprecated
    QACompletionResponse completions(QACompletionRequest qaCompletionRequest);

    /**
     * 文本问答；简单请求
     * @param question 请求信息
     * @return         返回结果
     */
    @Deprecated
    QACompletionResponse completions(String question);

    /**
     * 默认 GPT-3.5 问答模型
     * @param chatCompletionRequest 请求信息
     * @return                      返回结果
     */
    ChatCompletionResponse completions(ChatCompletionRequest chatCompletionRequest);

}

