package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.DemoForm;
import com.example.demo.Model.DemoGetMsg;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DemoController {

	//"localhost:8080/"がリクエストされた
	@RequestMapping("/")
	public String Home() {
	
		// login.htmlを表示
		return "login";
	
	}

	//"localhost:8080/login"がリクエストされた
	@RequestMapping("/login")
	public String LoginPage(Model model) {
	
		//メッセージ内容取得クラスをインスタンス化
		DemoGetMsg DGM = new DemoGetMsg();
		
		//login.htmlの${message}に表示する値をセット
		model.addAttribute("message", DGM.getMsg());
		model.addAttribute("msg2", DGM.getMsg2I());
		
		// login.htmlを表示
		return "login";
	}
	
	//"localhost:8080/input"がリクエストされた
    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("demoForm", new DemoForm());
        return "input";
    }
    
  //"localhost:8080/output"がリクエストされた
    @RequestMapping("/output")
    public String output(@ModelAttribute DemoForm demoForm, Model model) {
        model.addAttribute("demoForm", demoForm);
        return "output";
    }
}