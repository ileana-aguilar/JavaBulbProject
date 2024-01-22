class Bulb {
  private String manufacturer;
  private String partNumber;
  protected int wattage;
  private int lumens;


public Bulb(String m, String p, int w, int l){
  if (w >= 5){
  this.manufacturer = m;
  this.partNumber = p;
  this.wattage = w;
  this.lumens = l;
  }
  else{
    throw new IllegalBulbException ("Bulb: " + m + "," + p + "," + w +  ","+ l +  " has wattage of less than 5!");
  }
 

}
//gets
 public String getManufacturer() { return this.manufacturer;}

public String getPartNumber() { return this.partNumber; }
 
public int getWattage(){ return this.wattage;}

public int getLumens(){ return this.lumens;}

//sets
public void setManufacturer(String m){ this.manufacturer = m; }
public void setPartNumber(String p){ this.partNumber = p;}
public void setWattage(int w){this.wattage = w;}
public void setLumens(int l){ this.lumens = l; }

//toString method
public String toString(){
  return manufacturer + "," + partNumber + "," + wattage + "," + lumens;
}
//Override the equals

 public boolean equals (Object other){
   
    if (this == other) return true;
    if (other == null ||(getClass() != other.getClass())) return false; 
    Bulb bul = (Bulb)other;
    if (manufacturer.equals(bul.manufacturer))return true;
    if (partNumber.equals(bul.partNumber)) return true; 
    if (wattage == (bul.wattage)) return true;
    if (lumens == (bul.lumens))return true;
    return false;
 
 }

 
//other = object
//this = pointer

 }
