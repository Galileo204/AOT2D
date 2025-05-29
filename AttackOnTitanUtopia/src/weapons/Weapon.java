package weapons;

import interfaces.Attacker;

public abstract class Weapon implements Attacker
{
    private final int baseDamage;

    public Weapon(int baseDamage)
    {
        this.baseDamage = baseDamage;
    }

    @Override
    public int getDamage() {
        return this.baseDamage;
    }
}
