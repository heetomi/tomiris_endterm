package com.example.demo.controller;

import com.example.demo.model.LostItem;
import com.example.demo.service.LostItemDbService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class LostItemController {

    private final LostItemDbService service;

    public LostItemController(LostItemDbService service) {
        this.service = service;
    }

    @GetMapping
    public List<LostItem> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LostItem getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody LostItem item) {
        service.create(item);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody LostItem item) {
        service.update(id, item);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
