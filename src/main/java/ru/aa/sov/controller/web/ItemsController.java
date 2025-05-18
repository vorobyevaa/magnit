package ru.aa.sov.controller.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/items")
@RequiredArgsConstructor
public class ItemsController {

  //  private final FeedbackService feedbackService;

    @GetMapping("/")
    public String index(
            Model model
     //       @RequestParam("page") Optional<Integer> page,
      //      @RequestParam("size") Optional<Integer> size,
     //       @RequestParam("sort") Optional<String> sort,
     //       @RequestParam("dir") Optional<String> dir
    ) {
   //     Page<Feedback> items = feedbackService.getAll(PageDataBuilder.createPage(page, size, sort, dir));
    //    model = PageDataBuilder.addPaginationToModel(model, items.getTotalPages());
    //    model.addAttribute("items", items);
    //    model.addAttribute("page", "feedback/list");
        return "page";
    }

}
