## JAX-WS调用WSDL

> 示例WSDL地址：
http://192.168.88.124:8888/bps/EmployeeManagerService?wsdl

1 进入Eclipse，新建空项目。
2 CMD进入Eclipse该新项目（如：D:\eclipseWorkspace\jax-ws>）,生成该WSDL对应的客户端代码

>wsimport 工具在${JDK_HOME}/BIN 目录下

```cmd
D:\eclipseWorkspace\jax-ws>wsimport -d ./bin -s ./src http://192.168.88.124:8888/bps/EmployeeManagerService?wsdl
```

这会生成很多类,刷新eclipse项目。会发现新的类已经出现。

3 Eclipse编写客户端代码

```java
package com.jaxws.test;

import com.primeton.employeemanagerservice.EmployeeManagerServiceService;

public class ClientTester {
	public static void main(String[] args) {
		EmployeeManagerServiceService service = new EmployeeManagerServiceService();
		String ret = service.getEmployeeManagerServicePort().getEmpnameByEmpid("4176");
		//打印返回结果，本例是返回承钢员工姓名
		System.out.println(ret);
	}
}
```