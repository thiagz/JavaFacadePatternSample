/*
 * Client class used to test Facade Pattern
 */
package org.thiagz.facade;

import org.thiagz.facade.hero.CowBoyHero;
import org.thiagz.facade.hero.Hero;
import org.thiagz.facade.location.Location;
import org.thiagz.facade.location.SpaceLocation;
import org.thiagz.facade.monster.FlyingMonster;
import org.thiagz.facade.monster.Monster;

/**
 *
 * @author Thiagz
 */
public class GameClient {
    public static void main(String args[]){
        Hero hero1 = new CowBoyHero();
        Monster monster1 = new FlyingMonster();
        Location location = new SpaceLocation();
        
        GameFacade game1 = new GameFacade(hero1, monster1, location);
        GameFacade game2 = new GameFacade();
        
        game1.startCustomGame();
        game2.startMountainGame();
    }
}
