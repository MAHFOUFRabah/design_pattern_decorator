package decorator;

import composant.Boisson;

public class Chocolat extends  DecoratorAbstract{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"au Chocolat ";
    }
}
