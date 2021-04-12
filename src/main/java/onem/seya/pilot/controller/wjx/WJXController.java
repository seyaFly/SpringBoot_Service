package onem.seya.pilot.controller.wjx;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * 问卷星-API 验证
 *
 * 链接中加参数：https://www.wjx.cn/help/help.aspx?helpid=19&h=1
 * 答卷实时回传：https://www.wjx.cn/help/help.aspx?helpid=529&h=1
 */
@RestController
@RequestMapping(path = WJXController.PATH)
@RequestScope
@Api(value = WJXController.PATH, tags = "问卷星API")
public class WJXController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public static final String  PATH = "/api/wjx";

}
