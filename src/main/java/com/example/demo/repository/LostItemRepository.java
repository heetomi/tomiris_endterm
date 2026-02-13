package com.example.demo.repository;

import com.example.demo.model.LostItem;

import java.util.List;
import java.util.Optional;

public interface LostItemRepository {
    List<LostItem> findAll();
    Optional<LostItem> findById(Long id);

    LostItem create(LostItem item);
    LostItem update(Long id, LostItem item);

    void delete(Long id);
}
