import org.junit.Test;

import org.junit.Assert;


public class DragonTest {
    private static final String DRAGON_NAME = "Bob";
    private static final String DRAGON_DESCRIPTION = "He is funny";
    private static final int DRAGON_FOOD_LEVEL = 50;
    private static final int DRAGON_WATER_LEVEL = 50;
    private static final int DRAGON_HAPPY_LEVEL = 50;
    private static final int DRAGON_AWAKE_LEVEL = 50;
    Dragon bob=new Dragon(DRAGON_NAME, DRAGON_DESCRIPTION, DRAGON_FOOD_LEVEL, DRAGON_WATER_LEVEL, DRAGON_HAPPY_LEVEL);

    @Test
    public void shouldHaveAName() {
        Assert.assertEquals(bob.getName(),DRAGON_NAME);
    }
    @Test
    public void foodLevelShouldIncrease() {
        Dragon bob =new Dragon("Bob","He is funny",50,50, 50);
        int beforePetIsFed = bob.getFoodLevel();
        bob.feedPet();
        int afterPetIsFed=bob.getFoodLevel();
        Assert.assertEquals(afterPetIsFed-beforePetIsFed,15);
    }
    @Test
    public void waterLevelShouldIncrease() {
        Dragon bob =new Dragon("Bob","He is funny",50,50, 50);
        int beforePetIsWatered = bob.getWaterLevel();
        bob.waterPet();
        int afterPetIsWatered=bob.getWaterLevel();
        Assert.assertEquals(afterPetIsWatered-beforePetIsWatered,15);
    }
    @Test
    public void happyLevelShouldIncrease() {
        Dragon bob =new Dragon("Bob","He is funny",50,50, 50);
        int beforePetIsPlayedWith = bob.getHappyLevel();
        bob.playWithPet();
        int afterPetIsPlayedWith=bob.getHappyLevel();
        Assert.assertEquals(afterPetIsPlayedWith-beforePetIsPlayedWith,15);
    }


}
