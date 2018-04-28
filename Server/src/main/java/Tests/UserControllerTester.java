package Tests;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.SWE2Pro.SWE2.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTester {

	private MockMvc mockMvc;
	
	@InjectMocks
	private UserController userController;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	@Test
	public void test_login_get_return_status_NotOk() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/login").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(MockMvcResultMatchers.jsonPath("$.status", Matchers.is("NotOk")));
	}

	@Test
	public void test_login_post_return_status_Admin() throws Exception {
//		Mockito.when(methodCall)
		mockMvc.perform(MockMvcRequestBuilders.post("/login").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(MockMvcResultMatchers.jsonPath("$.Type", Matchers.is("Admin")));
	}

	@Test
	public void test_login_post_return_status_StoreOwner() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/login").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(MockMvcResultMatchers.jsonPath("$.Type", Matchers.is("StoreOwner")));
	}

	@Test
	public void test_login_post_return_status_Customer() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/login").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(MockMvcResultMatchers.jsonPath("$.Type", Matchers.is("Customer")));
	}

}
