package com.greenfox.frontend.controllers;


import com.greenfox.frontend.TestUtil;
import com.greenfox.frontend.services.LogService;
import com.greenfox.frontend.services.ResultService;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RESTController.class)
@AutoConfigureMockMvc
class RESTControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogService logService;

    @MockBean
    private ResultService resultService;

    @Test
    void getDoubling_success() throws Exception {
        mockMvc.perform(get("/doubling")
                .contentType(MediaType.APPLICATION_JSON)
                .param("input", "10"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.result", Is.is(20)))
                .andExpect(jsonPath("$.received", Is.is(10)));
    }

    @Test
    void getDoubling_withoutInput() throws Exception {
        mockMvc.perform(get("/doubling")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", Is.is("Please provide an input!")));
    }

    @Test
    void getGreeter_success() throws Exception {
        mockMvc.perform(get("/greeter")
                .contentType(MediaType.APPLICATION_JSON)
                .param("name", "petike")
                .param("title", "student"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.welcome_message", Is.is("Oh, hi there petike, my dear student!")));
    }

    @Test
    void getGreeter_withoutName() throws Exception {
        mockMvc.perform(get("/greeter")
                .contentType(MediaType.APPLICATION_JSON)
                .param("title", "student"))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", Is.is("Please provide a name!")));
    }

    @Test
    void getGreeter_withoutTitle() throws Exception {
        mockMvc.perform(get("/greeter")
                .contentType(MediaType.APPLICATION_JSON)
                .param("name", "petike"))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", Is.is("Please provide a title!")));
    }

    @Test
    void getGreeter_withoutNameAndTitle() throws Exception {
        mockMvc.perform(get("/greeter")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", Is.is("Please provide a name and a title!")));
    }

    @Test
    void getAppendA_success() throws Exception {
        mockMvc.perform(get("/appenda/{appendable}","kuty")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.appended").value("kutya"));
    }

    @Test
    void getAppendA_withoutApendable() throws Exception {
        mockMvc.perform(get("/appenda")
                .contentType(TestUtil.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isNotFound());
    }

    @Test
    void getDoUntil_success() throws Exception {

        when(resultService.getSum(ArgumentMatchers.any())).thenCallRealMethod();
        mockMvc.perform(post("/dountil/{action}","sum")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"until\":\"5\"}"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.result").value(15));
    }

    @Test
    void getDoUntil_noInputNumber() throws Exception {

        mockMvc.perform(post("/dountil/{action}","sum")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"until\":\"null\"}"))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON))
                .andExpect(jsonPath("$.error").value("Please provide a number!"));
    }
}