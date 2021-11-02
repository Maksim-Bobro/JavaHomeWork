package com.pb.bobro.homework_5;

import javax.xml.crypto.Data;
import java.util.Date;

public class Reader {

 String name;
 String number;
 String fakultet;
 String tel;
 String date;

String getreader(){
 return  "читатель" + name +"номер билета"+ number+ "факултет"+ fakultet +"телефон"+ tel+"дата" +date;
}

 public Reader (String name, String number, String fakultet,String tel,String  date){
 this.name = name;
 this.number = number;
 this.fakultet = fakultet;
 this.tel = tel;
 this.date = date;
 }

}
