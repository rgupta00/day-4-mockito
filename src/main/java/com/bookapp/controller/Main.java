package com.bookapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    //now i wnat to log4j2 via slf4j
    private static Logger logger= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        System.out.println("------");
       logger.info("code is working till line no 10");
      try{
          int i=6/0;
      }catch (ArithmeticException e){
          logger.error("divide by zero");
      }

    }
}
