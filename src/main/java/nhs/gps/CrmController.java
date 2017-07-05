package nhs.gps;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class CrmController {

    private final GpRepository gpRepository;

    @RequestMapping
    public String home() {
        return "home";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/";
    }

    @RequestMapping("/gps")
    public String gps(Model model) {
        model.addAttribute(gpRepository.findAll());
        return "gps";
    }

    @RequestMapping("/gps/{id}")
    public String gp(@PathVariable("id") Long id, Model model) {
        model.addAttribute(gpRepository.findOne(id));
        return "gp";
    }

    public Gp getGp(@PathVariable("id") Long id) {
        return gpRepository.findOne(id);
    }

}
