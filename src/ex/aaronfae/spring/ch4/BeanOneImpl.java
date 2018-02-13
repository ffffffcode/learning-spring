package ex.aaronfae.spring.ch4;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class BeanOneImpl implements BeanInterface {

}
