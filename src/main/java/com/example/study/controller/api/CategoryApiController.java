package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.CategoryApiRequest;
import com.example.study.model.network.response.CategoryApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryApiController implements CrudInterface<CategoryApiRequest, CategoryApiResponse> {

    @Override
    @PostMapping("")
    public Header<CategoryApiResponse> create(Header<CategoryApiRequest> request) {
        return null;
    }

    @Override
    @GetMapping("{id}")
    public Header<CategoryApiResponse> read(Long id) {
        return null;
    }

    @Override
    @PutMapping("")
    public Header<CategoryApiResponse> update(Header<CategoryApiRequest> request) {
        return null;
    }

    @Override
    @DeleteMapping("{id")
    public Header delete(Long id) {
        return null;
    }
}