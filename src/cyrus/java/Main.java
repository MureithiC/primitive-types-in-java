package cyrus.java;

public class Main {

    public static void main(String[] args) {
	// Int has a width of 32 bits.
        int myIntMaxValue = Integer.MAX_VALUE;
        int myIntMinValue = Integer.MIN_VALUE;

        System.out.println("Maximum Integer value = " + myIntMaxValue);
        System.out.println("Minimum Integer value = " + myIntMinValue);

        //If you try to print larger integer than maximum you get an overflow.
        System.out.println("Busted Maximum Integer value = " + (myIntMaxValue + 1));
        System.out.println("Busted Minimum Integer value = " + (myIntMinValue - 1));

        //Bytes has a width of 8 bits
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;

        System.out.println("Maximum Byte value = " + myMaxByteValue);
        System.out.println("Minimum Byte value = " + myMinByteValue);

        System.out.println("Busted Maximum Byte value = " + (myMaxByteValue + 1));
        System.out.println("Busted Minimum Byte value = " + (myMinByteValue -1));

        //Short has a width of 16 bits
        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        System.out.println("Maximum Byte value = " + myMaxShortValue);
        System.out.println("Minimum Byte value = " + myMinShortValue);

        System.out.println("Busted Maximum Short value = " + (myMaxShortValue + 1));
        System.out.println("Busted Minimum Short value = " + (myMinShortValue -1));

        //Long has 64 bits
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;

        System.out.println("Maximum Long value = " + myMaxLongValue);
        System.out.println("Minimum Long value = " + myMinLongValue);

        System.out.println("Busted Maximum Long value = " + (myMaxLongValue + 1));
        System.out.println("Busted Minimum Long value = " + (myMinLongValue -1));


        //Primitive type challenge:
        byte myByteChallenge = 120;
        short myShortChallenge = 30000;
        int myIntChallenge = 20000000;
        long myLongChallenge = (50000 + ((myIntChallenge + myByteChallenge + myShortChallenge)*10L));

        System.out.println(myLongChallenge);

        //Float

        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("Float maximum value = " + myMaxFloatValue);
        System.out.println("Float minimum value = " + myMinFloatValue);

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        System.out.println("Double minimum value = " + myMinDoubleValue);

        double myFirstDoubleValue = 20.00d;
        double mySecondDoubleValue = 80.00d;

        double myResult = (myFirstDoubleValue + mySecondDoubleValue) * 100.00d;
        System.out.println("This is my total: " + myResult);
        double myRemainder = myResult % 41.00d;
        System.out.println("This is my Remainder " + myRemainder);
        boolean noRemainder = (myRemainder == 0) ? true : false;
        System.out.println("No remainder: " + noRemainder);
        if (!noRemainder) {
            System.out.println("There is some remainder!");

        }



    }

}
