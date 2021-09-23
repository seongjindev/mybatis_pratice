package testgroup.sj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import testgroup.sj.mapper.IdNameModel;
import testgroup.sj.service.IdNameService;

import java.util.List;

@Slf4j
@Controller
public class HomeController {

    private final IdNameService idNameService;

    public HomeController(IdNameService idNameService) {
        this.idNameService = idNameService;
    }

    @GetMapping("/center")
    public String goMain(Model model) {
        log.info("goMain pass");
        List<IdNameModel> idName = idNameService.getIdName();
        model.addAttribute("idName", idName);
        return "center";
    }

    @GetMapping("/test-center")
    public String testGo() {
        log.info("test-center pass");
        return "center";
    }
}
