package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {
    private Rabbit4 rabbit;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
//        System.out.println("Wood3 -> bean is created");
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
