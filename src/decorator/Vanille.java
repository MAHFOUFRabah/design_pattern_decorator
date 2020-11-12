package decorator;

import composant.Boisson;

public class Vanille extends  DecoratorAbstract{
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.9+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"avec Vanille ";
    }
}
