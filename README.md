# SpringMVC4
RequestMapping

1.因为是复制过来的项目，导致遇到问题：
	
	Could not publish server configuration for Tomcat v8.0 Server at localhost.
	Multiple Contexts have a path of "/SpringMVC2".

1）修改工程名：propeties --> web project setting 修改工程名即可。
2）servers.xml修改或者eclipse下面remove当前服务

2. The requested resource is not available

发现直接放在webContent下是可行的。
发现问题是因为路径引起：当前是web-inf/view/userlist.jsp
关键还是springmvc-servlet.xml配置：如果value最开始加斜杠才是从WebContent开始的。

	<!-- 前缀 :说明如果直接放在web-inf下，不需要加前缀-->
		<property name="prefix" value="/WEB-INF/view/"></property>
		
3.RequestMapping的使用：
springmvc-servlet.xml

	<!-- 配置视图解析器 -->
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<!-- 前缀 :说明如果直接放在web-inf下，不需要加前缀-->
		<property name="prefix" value="/WEB-INF/view/"></property>
		<!-- 后缀 ： -->
		<property name="suffix" value=".jsp"></property>
	</bean>
	
RequestMapping:(可添加显示post，get，例如method=RequestMethod.GET)		
说明：通过RequestMapping请求地址映射。

	@RequestMapping("/user")
	public class UserController {
	@RequestMapping(value="/list.do")
	public String list(){
		System.out.println("---查询用户信息----");
		return "userlist";
	}
	}			

