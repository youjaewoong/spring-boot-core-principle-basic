package hello.core.autowired;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import hello.core.member.Member;

public class AutoWiredTest {

	@Test
	void AutowiredOption() {
		 AnnotationConfigApplicationContext ac = 
				 new AnnotationConfigApplicationContext(TestBean.class);
	}
	
	static class TestBean{
		//호출 안됨
		@Autowired(required = false)
		public void setNoBean1(Member member) {
			System.out.println("setNoBean1 = " + member);
		}
		//null 호출
		@Autowired
		public void setNoBean2(@Nullable Member member) {
			System.out.println("setNoBean2 = " + member);
		}
		//Optional.empty 호출
		@Autowired(required = false)
		public void setNoBean3(Optional<Member> member) {
			System.out.println("setNoBean3 = " + member);
		}
	}
}