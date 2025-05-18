package ru.aa.sov.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PageDataBuilder {
    public static Model addPaginationToModel(Model model, int totalPages) {
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return model;
    }

    public static Pageable createPage(
            Optional<Integer> page,
            Optional<Integer> size,
            Optional<String> order,
            Optional<String> direction
    ) {
        Sort sort = Sort.by(order.orElse("id"));

        if (order.isPresent() && !order.get().isEmpty() && order.get().contains(":")) {
            sort = generateSort(order.get());
        } else {
            if (direction.isPresent() && direction.get().equals("asc")) {
                sort = sort.ascending();
            } else {
                sort = sort.descending();
            }
        }
        return PageRequest.of(page.orElse(1) - 1, size.orElse(10), sort);
    }

    private static Sort generateSort(String orderString) {
        return Sort.by(Arrays.stream(orderString.split(","))
                .map(order -> {
                    String[] parts = order.split(":");
                    return parts.length > 1 && parts[1].equals("desc") ? Sort.Order.desc(parts[0]) : Sort.Order.asc(parts[0]);
                })
                .collect(Collectors.toList()));
    }
}
