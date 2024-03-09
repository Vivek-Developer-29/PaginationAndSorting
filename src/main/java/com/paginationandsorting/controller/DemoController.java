package com.paginationandsorting.controller;

import com.paginationandsorting.entity.DataTable;
import com.paginationandsorting.service.PaginatorDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    PaginatorDemo paginatorDemo;

    @GetMapping("/pagin")
    public List<DataTable> getData(
            @RequestParam int pageNo,
            @RequestParam int pageSize,
            @RequestParam String direction
    ){
        Pageable paging = null;
        Page<DataTable> pagedDataTable = null;

            paging = PageRequest.of(pageNo-1, pageSize, direction.equalsIgnoreCase("desc") ? Sort.by("Id").descending() : Sort.by("Id"));
            pagedDataTable = paginatorDemo.getPaginatedDatatable(paging);

        return pagedDataTable.getContent();
    }
}