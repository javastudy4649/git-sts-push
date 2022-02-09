package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.DemoForm;
import com.example.demo.Model.DemoGetMsg;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DemoController {

	//"localhost:8080/"�����N�G�X�g���ꂽ
	@RequestMapping("/")
	public String Home() {
	
		// login.html��\��
		return "login";
	
	}

	//"localhost:8080/login"�����N�G�X�g���ꂽ
	@RequestMapping("/login")
	public String LoginPage(Model model) {
	
		//���b�Z�[�W���e�擾�N���X���C���X�^���X��
		DemoGetMsg DGM = new DemoGetMsg();
		
		//login.html��${message}�ɕ\������l���Z�b�g
		model.addAttribute("message", DGM.getMsg());
		model.addAttribute("msg2", DGM.getMsg2I());
		
		// login.html��\��
		return "login";
	}
	
	//"localhost:8080/input"�����N�G�X�g���ꂽ
    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("demoForm", new DemoForm());
        return "input";
    }
    
  //"localhost:8080/output"�����N�G�X�g���ꂽ
    @RequestMapping("/output")
    public String output(@ModelAttribute DemoForm demoForm, Model model) {
        model.addAttribute("demoForm", demoForm);
        return "output";
    }
}