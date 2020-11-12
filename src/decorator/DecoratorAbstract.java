package decorator;

import composant.Boisson;

public abstract class DecoratorAbstract extends Boisson{
    protected Boisson boisson;

    public  DecoratorAbstract(Boisson boisson) {
        this.boisson =  boisson;
    }
    public  abstract String getDescription();

}
