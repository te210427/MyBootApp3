package jp.te4a.spring.boot.myapp3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* Helllo World!
*
*/
@RestController
public class HelloController
{
	@RequestMapping("/taro")
	public String index() {
		return "Taro desu!";
	}
}