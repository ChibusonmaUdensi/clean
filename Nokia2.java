import java.util.Scanner;
public class Nokia2 {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String menuPrompt = """

List of menu factions

1. Phone book
2. Message 
3. Chat 
4. Call register
5. Tones
6. Settings 
7. Call divert 
8. Games 
9. Caculator
10. Reminders 
11. Clock 
12. Profiles 
13. SIM services

""";

String phonebookPrompt = """

1. Search
2. Service no.
3. Add name 
4. Erase
5. Edit
6. Assign tone
7. Send b card
8. Options
9. Speed dials 
10. voice calls

""";

String optionsprompt = """

1. Type of view 
2. Memory status

""";

String messagesprompt = """

1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number
10. Service command editor

""";

String  messageSettings1 = """

1. Set 1^2
2. Common ^3

""";

String messagesettings2 = """

1. Message center number
2. Message sent as 
3. Message validity

""";

String commonsettings = """

1. Delivery reports
2. Reply via same centre
3. Character support

""";

String chat = """

1. Chat

""";

String callregisterPrompt = """

1. Missed calls
2. Received calls
3. Dialed numbers
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepaid credit

""";

String showcalldurationPrompt = """

1. Last call duration
2. All calls duration
3. Received calls duration
4. Dialed calls duration
5. Clear timers

""";

String showcallcostsprompt = """

1. Last call cost
2. All calls cost
3. Clear counters

""";

String callcostsettingPrompt = """

1. Call cost limit
2. Show costs in

""";

String tonesprompt = """

1. Ringing tone 
2. Ringing volume
3. Incoming alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver

""";

String settingsprompt = """

1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings

""";

String callsettingsprompt = """

1. Automatic redial
2. Speed dialing
3. Call waiting options
4. Own number sending 
5. Phone line in use
6. Automatic answer

""";

String phonesettingsprompt = """

1. Language 
2. Cell info display
3. Welcome note
4. Network selection
5. Lights 
6. COnfirm SIM service actions

""";

String securitysettingsprompt = """

1. Pin code settings
2. Call barring request
3. Fixed dialing
4. Closed user group
5. Phone security
6. Change access codes

""";

String clockprompt = """

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time

""";



	System.out.print(menuPrompt);
	int menu = input.nextInt();

 switch (menu) {
 		case 1: { System.out.print( phonebookPrompt );
int phonebookoption = input.nextInt();

switch (phonebookoption) {
case 1: System.out.print("Search ");
break; 

case 2: System.out.print("Service no. ");
break; 

case 3: System.out.print("Add name ");
break; 

case 4: System.out.print("Erase ");
break; 

case 5: System.out.print("Edit ");
break; 

case 6: System.out.print("Assign tone ");
break; 

case 7: System.out.print("Send b card ");
break; 

case 8: { System.out.print(optionsprompt);
int options = input.nextInt();

switch (options) {
case 1: System.out.print( "Type of view" );
break; 
case 2: System.out.print("Memory status ");
break; 
}
}

case 9: { System.out.print("Speed dials ");
break; }

case 10: { System.out.print("Voice calls ");
break; }
}
}

break;

		case 2: System.out.print(messagesprompt);
int messagesoption = input.nextInt();

switch (messagesoption) {
case 1: { System.out.print("Write messages") ;
break; }

case 2: { System.out.print("Inbox") ;
break; }

case 3: { System.out.print("Outbox") ;
break; }

case 4: { System.out.print("Picture messages") ;
break; }

case 5: { System.out.print("Templates") ;
break; }

case 6: { System.out.print("Smileys") ;
break; }

	case 7:  System.out.print(messageSettings1) ;
int messagesettingoption1 = input.nextInt();

switch (messagesettingoption1) {
	case 1: System.out.print(messagesettings2);
	int messagesettings12 = input.nextInt();

switch (messagesettings12) {
case 1: System.out.print("message center number");
break; 

case 2: System.out.print("message sent as");
break; 
case 3: System.out.print("message validity");
break; 
default: System.out.print("put a number btw 1-3");
break;
}


break; }

	case 21:  System.out.print(commonsettings) ;
	int commonset = input.nextInt();

switch(commonset) {
case 1: System.out.print("Delivery reports");
break; 
case 2: System.out.print("Reply via same center");
break; 
case 3: System.out.print("Character support");
break; 
default: System.out.print("put a number btw 1-3");
break;
}
break;

case 8: System.out.print("Info services") ;
break; 

case 9: System.out.print("Voice mailbox number") ;
break; 

case 10: System.out.print("Service command editor") ;
break; 
}
break;

		case 3: System.out.print("chat");
break;

		case 4: System.out.print(callregisterPrompt);
int callregisterOption = input.nextInt();

switch(callregisterOption) {
case 1: System.out.print("Missed calls");
break; 

case 2: System.out.print("Received calls ");
break; 

case 3: System.out.print("Dialled numbers ");
break; 

case 4: System.out.print("Erase recent call list ");
break; 

case 5: System.out.print(showcalldurationPrompt);
int showcalldurationOption = input.nextInt();

switch (showcalldurationOption) {
case 1: System.out.print("Last call duration");
break; 

case 2: System.out.print("All calls duration");
break; 

case 3: System.out.print("Received calls duration");
break; 

case 4: System.out.print("Dialled calls duration");
break; 

case 5: System.out.print("Clear timers");
break; 
}
break;
case 6: System.out.print("Show call costs");
break; 

case 7: System.out.print("Call cost settings");
break; 

case 8: System.out.print("Prepaid credit");
break; 
}

case 5: System.out.print(tonesprompt);
int tonesOption = input.nextInt();

switch (tonesOption) {
case 1: System.out.print("Ringing tone"); 
break;

case 2: System.out.print("Ringing volume"); 
break;

case 3: System.out.print("Incoming call alert"); 
break;

case 4: System.out.print("Composer"); 
break;

case 5: System.out.print("Message alert tone"); 
break;

case 6: System.out.print("Keypad tones"); 
break;

case 7: System.out.print("Warning and game tones"); 
break;

case 8: System.out.print("Vibration and alert"); 
break;

case 9: System.out.print("Screen saver"); 
break;
}

case 6: System.out.print(settingsprompt);
int settingsoption = input.nextInt();

switch (settingsoption) {
case 1: System.out.print(callsettingsprompt);
int callsettingsoption2 = input.nextInt();

switch(callsettingsoption2) {
case 1: System.out.print("Automatic redial");
break;

case 2: System.out.print("Speed dialing");
break;

case 3: System.out.print("Call waiting options");
break;

case 4: System.out.print("Own number settings");
break;

case 5: System.out.print("Phone line in use");
break;

case 6: System.out.print("Automatic answer");
break;
}

case 2: System.out.print(phonesettingsprompt);
int phonesettingsOption = input.nextInt();

switch (phonesettingsOption) {
case 1: System.out.print("Language");
break;

case 2: System.out.print("Cell info display");
break;

case 3: System.out.print("Welcome note");
break;

case 4: System.out.print("Network selection");
break;

case 5: System.out.print("Lights");
break;

case 6: System.out.print("Confirm SIM service");
break;
}
break;

case 3: System.out.print(securitysettingsprompt);
int securitysettingsOption = input.nextInt();

switch (securitysettingsOption) {
case 1: System.out.print("PIN code request");
break;

case 2: System.out.print("Call barring service");
break;

case 3: System.out.print("Fixed dialing");
break;

case 4: System.out.print("Closed user group");
break;

case 5: System.out.print("Phone security");
break;

case 6: System.out.print("Change access codes");
break;
}
break;
case 4: System.out.print("Restore factory settings");
break;
}
break;


case 7: System.out.print("Call divert");
break;
 
case 8: System.out.print("Games");
break; 

case 9: System.out.print("Caculator");
break; 

case 10: System.out.print("Reminders");
break;

case 11: System.out.print(clockprompt);
int clockOption = input.nextInt();

switch (clockOption) {
case 1: System.out.print("Alarm clock");
break; 

case 2: System.out.print("Clock setting");
break; 

case 3: System.out.print("Date settings");
break; 

case 4: System.out.print("Stopwatch");
break; 

case 5: System.out.print("Countdown timer");
break; 

case 6: System.out.print("Auto update of date and time");
break; 
}
}
}
}