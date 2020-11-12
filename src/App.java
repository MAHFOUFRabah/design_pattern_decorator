import composant.Boisson;
import composant.Espresso;
import decorator.Chantilly;
import decorator.Chocolat;
import decorator.Vanille;

public class App {
    public static void main(String[] args) {
        Boisson boisson= new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------");
        boisson =new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------");
        boisson =new Vanille(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------");
        boisson =new Chantilly(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------"); 

    }
}
