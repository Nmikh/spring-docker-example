package com.controller;

import com.model.Item;
import com.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @PostMapping("/item/{name}")
    public ResponseEntity createItem(@PathVariable String name) {
        Item save = itemRepository.save(Item.builder().itemName(name).build());

        return ResponseEntity.ok(save);
    }

    @GetMapping("/item/{id}")
    public ResponseEntity getItem(@PathVariable String id) {
        Optional<Item> byId = itemRepository.findById(id);

        return ResponseEntity.ok(byId.get());
    }
}
