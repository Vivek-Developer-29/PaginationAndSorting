package com.paginationandsorting.service.impl;

import com.paginationandsorting.entity.DataTable;
import com.paginationandsorting.repository.DataRepository;
import com.paginationandsorting.service.PaginatorDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PaginatorDemoImpl implements PaginatorDemo {
    @Autowired
    DataRepository datarepo;

    @Override
    public Page<DataTable> getPaginatedDatatable(Pageable page) {
        return datarepo.findAll(page);
    }
}
