package com.baanBaini.commons.utils;


import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.random.RandomGenerator;

public interface IdGenerator {
    enum EntityType {
        USER("USR", 6),
        SELLER("SLR", 6),
        PRODUCT("PRO", 10);

        private final String entityType;
        private final Integer idLength;

        EntityType(String entityName, Integer length) {
            this.entityType = entityName;
            this.idLength = length;
        }

    }

    static String generateId(EntityType entityType ){
        return entityType.entityType+ "-" + generateRandomAlphaNunericString(entityType.idLength);
    }

    private static String generateRandomAlphaNunericString(int length){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        StringBuilder buffer = new StringBuilder();
        for(int i=0; i<length;i++){
            buffer.append(chars.charAt(random.nextInt(0,chars.length())));
        }
        return buffer.toString();
    }
}
