package cn.jz.rednote.bot.test;

import com.alibaba.cloud.ai.graph.agent.ReactAgent;
import com.alibaba.cloud.ai.graph.checkpoint.savers.MemorySaver;
import com.alibaba.cloud.ai.graph.exception.GraphRunnerException;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

/**
 * @desc:
 * @author: jethrozz
 * @create: 2026/2/4 22:59
 **/
@Service
public class TestGlm {

    @Resource
    private ChatModel zhiPuAiChatModel;


    @PostConstruct
    public void test() throws GraphRunnerException {
        // 创建 agent
        ReactAgent agent = ReactAgent.builder()
                .name("jz_agent")
                .model(zhiPuAiChatModel)
                .systemPrompt("你是一个java开发专家")
                .saver(new MemorySaver())
                .build();

        AssistantMessage response = agent.call("你是谁");
        System.out.println(response.getText());
    }
}
