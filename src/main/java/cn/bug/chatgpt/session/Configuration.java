package cn.bug.chatgpt.session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

/**
 * @description 配置信息
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {

    @Getter
    @NotNull
    private String apiKey;

    @Getter
    private String apiHost;

    @Getter
//    @NotNull
    private String authToken;

}
