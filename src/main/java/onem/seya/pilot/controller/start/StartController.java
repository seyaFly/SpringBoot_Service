package onem.seya.pilot.controller.start;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import cn.hutool.setting.dialect.Props;
import onem.seya.pilot.config.LangConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = StartController.PATH)
public class StartController {
    public static final String PATH = "/start";

    private Props systemLang = LangConfig.I18N_PROPS;

    @GetMapping(value = "/print", produces = { APPLICATION_JSON_VALUE })
    public String printStart(){
        String welcomeKey = "ms_welcome";
        return systemLang.getStr(welcomeKey);
    }
}
