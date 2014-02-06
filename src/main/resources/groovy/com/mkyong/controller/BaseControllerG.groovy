package groovy.com.mkyong.controller

import com.mkyong.controller.Crtl;
import org.springframework.ui.ModelMap;

public class BaseControllerG extends Crtl {

    @Override
    public String renderRequest(ModelMap model) {
        model.addAttribute("message", "Hello from groovy controlleRR");
        return "index"
    }
}