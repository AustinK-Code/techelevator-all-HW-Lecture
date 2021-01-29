package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {
    @Test
    public void have_party_with_30_cigars_and_false(){
        CigarParty sut = new CigarParty();

        boolean successful = sut.haveParty(30, false);

        Assert.assertFalse(successful);
    }
    @Test
    public void have_party_with_50_cigars_and_false(){
        CigarParty sut = new CigarParty();

        boolean successful = sut.haveParty(50, false);

        Assert.assertTrue(successful);
    }
    @Test
    public void have_party_with_70_cigars_and_true(){
        CigarParty sut = new CigarParty();

        boolean successful = sut.haveParty(70, true);

        Assert.assertTrue(successful);
    }

}
