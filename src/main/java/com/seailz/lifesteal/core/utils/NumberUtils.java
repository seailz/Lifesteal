package com.seailz.lifesteal.core.utils;

import java.util.concurrent.ThreadLocalRandom;

public class NumberUtils {

    public static int generateRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
