/*
 * This is the sub-class of location
 * It is a montain battle field
 */
package org.thiagz.facade.location;

/**
 *
 * @author Thiagz
 */
public class SpaceLocation implements Location{

    @Override
    public void locationType() {
        System.out.println("This is the space battlefield");
    }   
}