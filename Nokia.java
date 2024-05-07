public class Nokia {
private boolean isOn;
private String model;
private String[] phoneBook = new String[10];

public String[] addNameToPhoneBook(String nameToBeSaved){
for(int index = 0; index < phoneBook.length; index++){

this.phoneBook[index] = nameToBeSaved;
System.out.println(phoneBook[index]);
}

 return this.phoneBook;

}


public boolean turnOnOrOff(){
if(isOn==false){

return this.isOn = true;
}
else{

return this.isOn = false;
}

}

public boolean getIsOn(){
return this.isOn;
}

public String getModel(){
return this.model;
}

public String getPhoneBook(){
 String name = phoneBook[0];
return name;
}
public static void main(String[] args) {


    Nokia nokia3310 = new Nokia ();
 Nokia nokiaAsha = new Nokia ();
System.out.println("is this phone on?: " + nokia3310.getIsOn());

	boolean  isOn = nokia3310.turnOnOrOff();
    System.out.println("is this phone on?: " + isOn );

boolean  isOn2 = nokia3310.turnOnOrOff();
    System.out.println("Is this phone on?: " + isOn2 );

nokia3310.addNameToPhoneBook("Chibusonma");

nokia3310.addNameToPhoneBook("Lambo");
nokia3310.addNameToPhoneBook("Nwanyisunday");

//System.out.print(nokia3310.getPhoneBook());




}

}