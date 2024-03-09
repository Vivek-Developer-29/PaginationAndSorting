package com.paginationandsorting.repository;

import com.paginationandsorting.entity.DataTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface DataRepository extends JpaRepository<DataTable, Long> {

    Page<DataTable> findAll(Pageable paging);
}
