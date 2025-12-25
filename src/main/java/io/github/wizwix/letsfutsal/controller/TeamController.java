package io.github.wizwix.letsfutsal.controller;

import io.github.wizwix.letsfutsal.dto.TeamDTO;
import io.github.wizwix.letsfutsal.enums.Gender;
import io.github.wizwix.letsfutsal.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {

  private final TeamService service;

  @PostMapping("/create")
  public String create(@RequestParam String teamName, @RequestParam Gender gender, @RequestParam long minGrade,
                       @RequestParam long maxGrade, @RequestParam String region, @RequestParam String introduction) {
    TeamDTO dto = new TeamDTO();
    dto.setTeamName(teamName);
    dto.setGender(gender);
    dto.setMinGrade(minGrade);
    dto.setMaxGrade(maxGrade);
    dto.setRegion(region);
    dto.setIntroduction(introduction);

    service.create(dto);
    return "redirect:/team";
  }

  @GetMapping("/create")
  public String createForm() {
    return "team/create";
  }

  @GetMapping({"", "/", "/list"})
  public String list(Model model) {
    model.addAttribute("teams", service.list());
    return "team/list";
  }

  @GetMapping("/profile/{teamId}")
  public String profile(@PathVariable long teamId, Model model) {
    model.addAttribute("team", service.get(teamId));
    return "team/profile";
  }
}
