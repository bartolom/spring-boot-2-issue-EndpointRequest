package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@WebMvcTest(FooController.class)
@WebMvcTest(controllers = FooController.class, secure = false)
public class FooControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	//@WithMockUser(username = "staff", roles = { "STAFF" })
	public void testBar() throws Exception {
		mvc.perform(get("/bar")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}
	
}
