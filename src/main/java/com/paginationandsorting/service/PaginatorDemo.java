package com.paginationandsorting.service;


import com.paginationandsorting.entity.DataTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PaginatorDemo {
    Page<DataTable> getPaginatedDatatable(Pageable page);

}
