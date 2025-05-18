package ru.aa.sov.controller.web;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.aa.sov.dto.Magnet;
import ru.aa.sov.service.FormsService;
import ru.aa.sov.service.LocalService;
import ru.aa.sov.service.MagnetService;
import ru.aa.sov.service.TownsService;
import ru.aa.sov.service.TypesService;
import ru.aa.sov.util.PageDataBuilder;

import java.util.Optional;

@Controller
@RequestMapping("/web/items")
@RequiredArgsConstructor
public class ItemsController {

    private final MagnetService magnetService;
    private final FormsService formsService;
    private final TypesService typesService;
    private final LocalService localService;
    private final TownsService townsService;

    @GetMapping("/list")
    public String index(
            Model model,
            @RequestParam("page") Optional<Integer> page,
            @RequestParam("size") Optional<Integer> size,
            @RequestParam("sort") Optional<String> sort,
            @RequestParam("dir") Optional<String> dir
    ) {
        Page<Magnet> items = magnetService.getAll(PageDataBuilder.createPage(page, size, sort, dir));
        model = PageDataBuilder.addPaginationToModel(model, items.getTotalPages());
        model.addAttribute("forms", formsService.items());
        model.addAttribute("types", typesService.items());
        model.addAttribute("locals", localService.items());
        model.addAttribute("regions", townsService.regions());
        model.addAttribute("items", items);
        model.addAttribute("page", "items/list");
        return "page";
    }

}
