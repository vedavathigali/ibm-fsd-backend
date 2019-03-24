package springassignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Springexample {
public static void main(String args[]) {
	BeanFactory container = new XmlBeanFactory(new ClassPathResource("employeeconfig.xml"));
Employee obj = (Employee) container.getBean("employee");
/*System.out.println(obj.getDesignation());
System.out.println(obj.getId());
System.out.println(obj.getName());
System.out.println(obj.getAddress());
*/System.out.println(obj);





}
}
