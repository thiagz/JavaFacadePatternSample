/*
 * Adapter class which extends Monster and takes a Hero object as parameter
 * for the constructor
 */
package org.thiagz.facade;

import org.thiagz.facade.hero.Hero;
import org.thiagz.facade.hero.SciFiHero;
import org.thiagz.facade.location.Location;
import org.thiagz.facade.location.MountainLocation;
import org.thiagz.facade.monster.CrawlingMonster;
import org.thiagz.facade.monster.Monster;

/**
 *
 * @author Thiagz
 */
public class GameFacade{

    private Hero hero;
    private Monster monster;
    private Location location;

    public GameFacade(Hero hero, Monster monster, Location location) {
        this.hero = hero;
        this.monster = monster;
        this.location = location;
    }
    
    public GameFacade(){}

    public void startCustomGame() {
        hero.combatTechnique();
        monster.action();
        location.locationType();
    }
    
    public void startMountainGame() {
        
        hero = new SciFiHero();
        monster = new CrawlingMonster();
        location = new MountainLocation();
        
        hero.combatTechnique();
        monster.action();
        location.locationType();
    }


}
