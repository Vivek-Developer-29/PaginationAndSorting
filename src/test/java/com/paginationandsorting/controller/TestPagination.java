package com.paginationandsorting.controller;

import com.paginationandsorting.service.PaginatorDemo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestPagination {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private PaginatorDemo paginatorDemo;

    @Test
    public void testPaginationAndSorting() throws Exception {
        mockMvc.perform(get("/pagin")
                        .param("pageNo", "1")
                        .param("pageSize", "10")
                        .param("direction", "asc"))
                .andExpect(status().isOk());
    }
}
