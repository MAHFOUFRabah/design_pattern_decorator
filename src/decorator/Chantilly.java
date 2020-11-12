package decorator;

import composant.Boisson;

public class Chantilly extends  DecoratorAbstract{
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.7+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"au Chantilly ";
    }
}
