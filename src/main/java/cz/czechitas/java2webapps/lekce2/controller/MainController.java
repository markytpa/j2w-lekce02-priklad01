package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * @author Filip Jirsák
 */
@Controller
public class MainController {
  private final Random random = new Random();

  @GetMapping("/")
  public ModelAndView kostka() {
    int cislo = random.nextInt(6) + 1;

    ModelAndView result = new ModelAndView("kostka");
    result.addObject("cislo", cislo);
    result.addObject("obrazek", String.format("/images/kostka-%d.svg", cislo));
    return result;
  }
}
