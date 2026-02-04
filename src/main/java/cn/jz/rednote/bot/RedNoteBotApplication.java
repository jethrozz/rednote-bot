package cn.jz.rednote.bot;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @desc:
 * @author: jethrozz
 * @create: 2026/2/4 22:18
 **/
@SpringBootApplication
public class RedNoteBotApplication {


    public static void main(String[] args) {
        System.out.println("[REDNOTE-BOT] 开始启动...");
        new SpringApplication(RedNoteBotApplication.class).run(args);
        System.out.println("[REDNOTE-BOT] 启动完成...");
    }
}
