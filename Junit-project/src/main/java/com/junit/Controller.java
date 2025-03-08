package com.junit;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

 public int addsum(int i, int j) {
     return i+j;
     }
}


