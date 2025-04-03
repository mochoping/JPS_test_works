package kh.edu.Login;

import kh.edu.Login.service.UserService;
import kh.edu.Login.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
class LoginApplicationTests {

	@Test
	void contextLoads() {
	}

	/*
	@Autowired
	private MockMvc mvc;
    @MockBean
    private UserService userService;


	@Test
	public void loginSuccessTest() throws Exception{
		UserVO dummyUser = new UserVO();
		dummyUser.setUserId("user_lee");
		dummyUser.setUserPw("1234");

		when(userService.login(any(UserVO.class))).thenReturn(dummyUser);

		mvc.perform(
				// contriller post 에 작성한 api 앤드포인트로 전송
				post("/login.do")
						.param("UserId", "user_lee")
						.param("UserPw", "1234"))
				.andExpect(status().isOk())
				.andExpect(view().name("loginSuccess"));
		)
	}

	@Test
	public void loginFailTest() throws Exception {
		when(userService.login(any(UserVO.class))).thenReturn(null); // return을 null 로 쓴것

		mvc.perform(post("/login.do")
						.param("userId", "wrongUser")
						.param("userPw", "wrongPw"))
				.andExpect(status().isOk())
				.andExpect(view().name("loginFail"));
	}
	*/
}
