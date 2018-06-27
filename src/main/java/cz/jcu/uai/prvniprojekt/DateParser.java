/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.jcu.uai.prvniprojekt;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class DateParser {

    /**
     * Parse date in common Czech format.
     *
     * @param str Date to be parsed
     * @return parsed date, never null
     * @throws DateFormatException if time format of str is wrong
     */
    public Date parse(String str) throws DateFormatException{

        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Date d = df.parse(str);
            return d;
            /*return new SimpleDateFormat("d. M. yyyy").parse(str); */
            
        } catch (ParseException pe) {
            throw new DateFormatException();
        }

    }

}
