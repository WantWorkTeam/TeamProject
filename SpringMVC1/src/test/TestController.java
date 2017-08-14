package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	//3,4단계를 수행한 후, 자식컨트롤러가 ModelAndView,
	//String 등을 반환하면 이 반환된 결과값을
	//이용하여 어떤 페이지를 보여줄지를 결정해주는 자가 바로
	//ViewResolver이다. 즉 부모 컨트롤러는 ViewResolver를 통해서 결과
	//페이지를 보여준다.
	@RequestMapping("/test.do")
	public ModelAndView execute(){
		System.out.println(this.getClass().getName()+"불렀어?");
		//Model은 View로 가져갈 데이터를 담게될 객체 request.setAttribute()한 효과
		//View는 보여질 실제 페이지에 대한 키값....
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test/result");
		return mav;
	}
}
