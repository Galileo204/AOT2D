package game.engine.titans;

import game.engine.interfaces.Attackee;
import game.engine.interfaces.Attacker;
import game.engine.interfaces.Mobil;


public abstract class Titan implements Attackee, Mobil, Attacker
{

    private int baseHealth;
    private int currentHealth = baseHealth;
    private int baseDamage;
    private int heightInMeters;
    private int distanceFromBase;
    private int speed;
    private int resourcesValue;
    private int dangerLevel;

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public void setCurrentHealth(int health){
        this.currentHealth = health;
    }

    public int getBaseHealth()
    {
        return this.baseHealth;
    }

    public int distanceFromBase()
    {
        return this.getDistance();
    }

    public void setDistanceFromBase(int distance)
    {
      this.setDistance(distance);
    }

    public int getSpeed()
    {
        return this.getSpeed();
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getResourcesValue()
    {
        return this.resourcesValue;
    }

    public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed, int resourcesValue, int dangerLevel)
    {
        this.currentHealth = baseHealth;
        this.baseHealth = baseHealth;
        this.baseDamage = baseDamage;
        this.heightInMeters = heightInMeters;
        this.distanceFromBase = distanceFromBase;
        this.speed = speed;
        this.resourcesValue = resourcesValue;
        this.dangerLevel = dangerLevel;
    }

}
