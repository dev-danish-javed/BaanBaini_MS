package com.baanBaini.commons.utils;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;

/**
 * Utility class to convert object from one type to other
 */
public class Mapper {

    private static ModelMapper mapper;


    static {
        mapper = new ModelMapper();
        // setting mapping policy to strict
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    /**
     * Map the one type of object to other
     * @param source Object to be converted
     * @param destinationType the class to which the object id to be converted
     * @return converted result
     * @param <D>
     */
    public static  <D> D map(Object source, Class<D> destinationType){
       return  mapper.map(source, destinationType);
    }
}
