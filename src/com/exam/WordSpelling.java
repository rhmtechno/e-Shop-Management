package com.exam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l2pc210m
 */
public class WordSpelling {  
    public String m(int p){
      String s="";
      int i=p;
      if(i==0)s="Zero";
      if(i>=10000000){
      int k=i/10000000;
       i=i%10000000;
      s=s+m(k)+" Core";
      }
      if(i>=100000){
      int k=i/100000;
       i=i%100000;
      s=s+" "+WordSpelling.m1(k)+" lakh";
      }
      
      if(i>=1000){
      int k=i/1000;
       i=i%1000;
      s=s+" "+WordSpelling.m1(k)+" thousand";
      }
      
      if(i>=100){
      int k=i/100;
       i=i%100;
      s=s+" "+WordSpelling.m1(k)+" hundred";
      }
      s=s+" "+WordSpelling.m1(i);
      
    
    return s;
    }
    
    
    public static String  m1(int k){
    String s="";
    if(k==1)s="one";
    if(k==2)s="two";
    if(k==3)s="three";
    if(k==4)s="four";
    if(k==5)s="five";
    if(k==6)s="six";
    if(k==7)s="seven";
    if(k==8)s="eight";
    if(k==9)s="nine";
    if(k==10)s="ten";
    if(k==11)s="eleven";
    if(k==12)s="twelve";
    if(k==13)s="thirteen";
    if(k==14)s="fourteen";
    if(k==15)s="fifteen";
    if(k==16)s="sixteen";
    if(k==17)s="seventeen";
    if(k==18)s="eighteen";
    if(k==19)s="nineteen";
    if(k==20)s="twenty";
    if(k==30)s="thirty";
    if(k==40)s="forty";
    if(k==50)s="fifty";
    if(k==60)s="sixty";
    if(k==70)s="seventy";
    if(k==80)s="eighty";
    if(k==90)s="ninty";
    
    
    if(k>20 && k<30){
    int i=k%10;
    s="twenty "+m1(i);
    }
    
    
    if(k>30 && k<40){
    int i=k%10;
    s="thirty "+m1(i);
    }
    if(k>40 && k<50){
    int i=k%10;
    s="forty "+m1(i);
    }
    if(k>50 && k<60){
    int i=k%10;
    s="fifty "+m1(i);
    }
    if(k>60 && k<70){
    int i=k%10;
    s="sixty "+m1(i);
    }
    if(k>70 && k<80){
    int i=k%10;
    s="seventy "+m1(i);
    }
    if(k>80 && k<90){
    int i=k%10;
    s="eighty "+m1(i);
    }
    if(k>90 && k<100){
    int i=k%10;
    s="ninty "+m1(i);
    }
     return s;
    } 
    
    
    
    
    
}
