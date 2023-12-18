package com.office.library.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  // @Controller ������̼��� ���̸� servlet-context.xml������ �̸� �ν��Ͽ� ��Ʈ�ѷ��� �����
@RequestMapping("/admin")
public class AdminHomeController {

	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
	public String home() {
		System.out.println("[AdminHomeController] home()");
		
		String nextPage = "admin/home";
		
		return nextPage;  // ���������� ��Ʈ�ѷ��� ����� ����� ��� �信 ������ ��ü�� ��� �ִ� Model ��ü�� ����
						  // servlet-context.xml�� ViewResolver�� ��Ʈ�ѷ����� ������ view�̸��� ���� view ȭ���� ã��
	}

}