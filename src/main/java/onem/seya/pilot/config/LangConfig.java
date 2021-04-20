package onem.seya.pilot.config;

import cn.hutool.setting.dialect.Props;
import onem.seya.pilot.common.Lang;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.Properties;

@Component
public class LangConfig {
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public static String I18N_PATH = "i18n/";
    public static Props  I18N_PROPS;

    @PostConstruct
    void init(){
        I18N_PROPS = loadLanguage(Lang.zh_CN);
    }

    public Props loadLanguage(String lang){
        String fileName = lang + ".properties";
        Props i18nProps = new Props(I18N_PATH + fileName, Charset.defaultCharset());

        LOGGER.info("system language is set to  "+ lang);
        return  i18nProps;
    }
}
