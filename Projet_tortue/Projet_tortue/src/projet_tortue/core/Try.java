/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue.core;

/**
 *This class
 * @author skaering
 */
public class Try extends Reference{ 
    private final Exercice theTry;
    private String graduation;
    private String appreciation;
  /*
    Constructor for the Try class 
    @param String code the code of the pupil, Exercice theTry the exercise corresponding to the try
    */
 public Try (Exercice theTry,String code){
     super(code);
     this.theTry=theTry;
   }
 /////////////////////////////////////////////////////////
/*
 this method allow to know the graduation for a try
 @return String graduation 
 */
    public String getGraduation() {
        return graduation;
    }
/////////////////////////////////////////////////////////
/*
 this method allow to set the graduation for a try
 @param String graduation 
 */
    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
/////////////////////////////////////////////////////////
/*
 this method allow to know the appreciation for a try
 @return String Appreciation 
 */
    public String getAppreciation() {
        return appreciation;
    }
/////////////////////////////////////////////////////////
/*
 this method allow to set the graduation for a try
 @param String graduation 
 */
    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }
 
    
}
