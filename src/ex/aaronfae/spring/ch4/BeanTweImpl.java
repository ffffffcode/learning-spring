package ex.aaronfae.spring.ch4;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class BeanTweImpl implements BeanInterface {

}
