package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// @Controller は画面遷移用のコントローラーに付与する
@Controller
@EnableAutoConfiguration
public class HelloController {
	// Controllerを付与したクラスがマッピングするURLの接頭辞を指定するのがRequestMapping
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello, Spring Boot Sample Application!";
	}
}
