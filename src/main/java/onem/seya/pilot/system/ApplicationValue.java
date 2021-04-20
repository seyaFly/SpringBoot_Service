package onem.seya.pilot.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationValue {

    @Value("${system.lang}")
    public String systemLang;

    public String getSystemLang() {
        return systemLang;
    }
}
