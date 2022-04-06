package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier", "ext");
        // ApplicationContext context = new AnnotationConfigApplicationContext("ma");  // pour scanner tout les packages de ma

        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());

    }
}
