#Team-Tim
##Group 8 - Project Part 3
######Astrid Stenvall | Felicia Olsson | Stefan Vitas | Tim Westerberg
####Console Application for a conductor, selling single tickets/monthly cards on a train and need access to see the passenger list. 
We have used the scanner to read data input, making it possible for the user to navigate in menus by choosing between 
different options. The price of Single Ticket and Monthly Card are depending on the passengers age and the two options 
are presented to the user after adding a new passenger to the passenger list. When the user proceed there will be a 
ticket/card printed with the passengers name, the price, and the price type on it.

###StartUp
We began our project with creating a document for our textual analysis, choosing candidates for our variables, objects, 
methods and actors within the code. Thereafter, we chose which candidates to include in our project, followed by a 
motivation as to why these were chosen. After this was done we wrote pseudocode on a shared screen and made a sloppy 
draft of our first UML diagram, this was made to plan and prepare our coding process before getting started with our 
crafting in Java. The tasks thereafter, were split amongst the group members and put together as a team, some 
contributing more than others. This startup became a problem for us, since we started unaware of the differences between 
our experiences (strengths and weaknesses) in coding and working as a group.  
 
##Textual Analysis
The purpose of our textual analysis was to get an overview of how to build the code and start “talking code”, rather 
than getting straight into crafting it in Java language. For this, we had discussions about candidates:
 
###Candidates 
The following candidates that were nominated by the team in the beginning was: 
- Nouns - Ticket, train, age, conditions, list, values and price.
- Verbs - Sell, pay and print out.
- Actors -  Conductor and traveller.

###Chosen Candidates
The following candidates we chose to integrate within our code: 
- Objects - myTicket & myPassenger. 
- Methods - ShowTicket, ReturnMonthlyPrice, ReturnSinglePrice, AddPassenger & ShowPassenger. 
- Variables - myName, myAge, myPrice, myTicketType & myPassengerList. 
- Actor - The Conductor.

###Final Candidates
We had a struggle with our project in the beginning and had to redo, the final Candidates in our end version are the 
following:
- Objects - myTicket, myPassenger, myScanner, aPassengerList
- Methods - showTicket, addPassenger, showPassenger, returnTicketType, returnMonthlyPrice, returnSinglePrice, pause
- Variables - int: aAge, myAge, aPrice, myPrice, index, aInput. String: myName, aFullName, aName, myTicketType
- Actor - The user supposed to interact with the system is a conductor.

####Thoughts about our Candidates
The objects handled in the code are myTicket and myPassenger which we need to reach the methods from Passenger- and 
Ticket-class in our Main class. 

Secondly, the object myScanner is used to enable the possibility for the conductor to interact with the 
console-application program by reading input. 

Thirdly, the object aPassengerList which is an ArrayList. We chose the ArrayList instead of Array because we needed a 
list growing in size when new Passengers were added to the list. 
 
##Daily Logs
###29/10-2020
######4/4 attending
Everyone participated in discussions about how to dispose our time, Tim created and shared a Google Drive for our project 
documents. Everyone participated in our Textual Analysis, priorly Tim and Astrid wrote. Felicia created a shared UML. 
Tim, Astrid and Felicia wrote in day log.

###30/10-2020
######4/4 attending
Did research, talked about ideas, coded our "skeleton" in pseudocode together (Felicia shared screen), tried to solve 
issues, all agreed individually on the decision to split the code into individual tasks. Felicia made a Discord Server 
and invited the rest of the group. Group had a conflict about cooperation, Astrid wanted to leave the group (Felicia 
asked Astrid to please join us again). 
Tim and Felicia wrote in day log.

###2/11-2020
######3/4 attending
Astrid decided to continue as a part of our group(Yay!). Tim spent time to research vector and Stefan had coded examples 
of the ArrayList. Felicia did the switch-case + if/else in Application class while sharing screen. 
Everyone participated on meeting after 14.30 (Decided on guidelines for upcoming meetings, what to do next, issues discussed).
Tim wrote in report: introduction + textual analysis. 
Tim and Felicia wrote in day log.

###3/11-2020
######4/4 attending
Felicia made a repository on GitHub giving the group members access; Everyone attending on meeting with Sandra around 
14.15, Tim sharing screen. Code fixes by Tim during her feedback; Delete class Application, move code to other classes
(switch->main & passenger, if/else->passenger & ticket). Tim wrote about Object oriented programming in report.
Felicia wrote in day log.

###4/11-2020
######4/4 attending
Astrid and Stefan decided to try out Enum in Ticket-class together. Tim got responsibility over ArrayList. Felicia coded 
with shared screen, Main class, and pushed to GitHub, assigned to look over UML, and read through report. Felicia also 
made a runnable version of the assignment on her own. Everyone participates in discussing issue and solutions (passenger 
list), planned tasks until next time:
- Solve ArrayList; Finish up UML; Complete Ticket class; Read through the assignment and Report, discuss what's left to 
do on Friday(if any).
Tim finished our first draft of our report. 
Tim and Felicia wrote in day log.

###5/11-2020
######4/4 attending
Astrid had been researching Enum and wasn't sure if we should use it. Felicia was done with her task. Everyone 
participated at our meeting and checked in what we have done, and what we plan to do next. 

###6/11-2020
######3/4 attending
Decided to delete everything(Code, UML) and start from scratch together, after feedback from Sandra. Group decided together
to put Felicia in charge of the project, so she could guide the others with help from the version she completed alone. 
Made our new UML together(Tim coding with a shared screen, Stefan translating UML to Tim and the other way around at the end, 
Felicia was support/guide). Astrid had evening plans and couldn't join us in the afternoon.
Felicia wrote in day log (discord).

###7/11-2020
######4/4 attending
Stefan and Tim repeated what we did the day before by explaining it to Astrid, suggested exercise by Felicia. Tim shared
screen, Astrid and Tim was taking turns in writing code finishing the UML into code and completed Ticket class together, 
Felicia as well but to illustrate mostly. Felicia suggested that it would be a good idea for Astrid to try to write code 
from UML on her own until tomorrow.
Felicia wrote in day log (discord).

###8/11-2020
######4/4 attending
Felicia felt ill and was late to the meeting. When she arrived, she supported Astrid, Tim and Stefan to get started with 
the Passenger Class and finish main together (Tim shared screen). Astrid also showed how far she got on her own with the 
task (translating UML into on her own code).
Felicia wrote in day log (discord).

###9/11-2020
######4/4 attending
Finished up Passenger class and moved ArrayList from Passenger to main (Felicia support, Astrid and Tim coding on Tim's 
shared screen). We couldn't make the ArrayList work the way we wanted in Passenger class, so we decided to have it in main. 
We completed the code, which also is able to run. We split parts to present the 12:th:
- Astrid: Menu
- Felicia: Passenger
- Stefan: Ticket
- Tim: ArrayList
Felicia wrote in day log (discord). Tim updated our day log in the shared Drive. 

###10/11-2020
######4/4 attending
Meeting with Sandra, feedback and guidance to move arraylist to passenger (Tim shared screen). Over all: Small detail 
fixes in the code (Tim shared screen and took turns to code with astrid after meeting), no major adjustments, fixing 
layout adjustments for user experience (Astrid). Creating our ppt (Felicia), looking over our UML (Stefan) and code are 
correct (Everyone) and discussed our report (Everyone). 
Astrid wrote in day log yesterday. Felicia wrote in day log (discord).

###11/11-2020
####4/4 attending
Today, Felicia shared screen while adjusting details from Sandra's feedback in our code, Felicia wrote the report in .md 
file while the rest of the group helped out with input. Felicia and Astrid finished UML, Tim fixed UML .png for our ppt, 
we had discussions about the time we had together, appreciating each others contributions to the group, and our now 
finished project. 
Felicia wrote in day log (discord).
We all wrote the day log in here. 

##Object Orientation 
Object orientated programming supports encapsulation, heritage, and puts objects into a permanent secondary memory which 
allows the program and applications to access the objects (Elmasri & Navate, 2004). Our program includes a Main class 
invoking the private methods from Passenger- and Ticket-class. We categorized our classes Passenger and Ticket with 
focus on our two prior objects: Passenger and Ticket, which makes this an object orientated application. The objects are 
varying and integrating with each other which is the general idea of the Java language being object orientated, with the 
general idea of easily being able to use and reuse the classes within the programme. Choosing names for the classes which 
makes sense makes it easier for bystanders, and the programming team to understand the code. 

##Responsibilities
####Which classes and methods have who had responsibility over?
#####Astrid: 
- v.1: Ticket class and Enum for ticket types, get/set/constructor-methods
- v.2: Everything
- Presentation: Menu
#####Felicia:
- v.1: Application class and Menu-methods
- v.2: Everything 
- Presentation: Passenger
#####Stefan:
- v.1: (Passenger)ArrayList
- v.2: Everything 
- Presentation: Ticket
#####Tim:
- v.1: (Passenger)Vector, ArrayList
- v.2: Everything
- Presentation: ArrayList

##Teamwork
####How did it go working in our group? 
In general, we had a rough start with our communication and team-spirit, but we managed to turn it around after needed
feedback from Sandra. 
However, towards the end of the project we got more efficient, and the tool in Teams where you can demand access and 
code together was very helpful for our group.  
####Was somethings easier being in a group rather than working on your own? 
It was easier to solve issues when we had the possibility to discuss within our group, the shared knowledge and 
experiences from each group member helped us to find solutions on each others problems along the way, related to the 
project. It was also a great feeling to be able to share the joy when our program was complete and working, especially
since everyone has been a part of crafting our code. The members of our group and group as a whole gained from our 
different experiences, something we all feel we learned from in the end. 

####Which difficulties did you bump into during the work in their group?
To get started and get to know each other strengths and weaknesses. The hardest part was to make it work as a team and 
contributing to the code, while we all were on very different levels(regarding coding, experience, interpretation, and 
so on).

The hard thing with working in a group is coordinating the work schedules between four individuals. Since we are all on 
distance from each other it is hard to plan everyone’s presence, divide responsibilities, and communicating with only 
words. In general, it is a lot easier to move a project forward whilst meeting up in person and knowing people’s focus 
and current mood. 

Also, a difficulty was if one person was absent from a full day of coding, it took a lot of time for that member to 
catch up with what has happened in the project since last time. The good thing about this "bump" was that it forced us 
to repeat what we done for the one who was absent, which is just a win-win-situation for everyone involved. 

#References
Elmasri, R. & Navathem, S.B. (2004). Fundamentals of database systems. (4 ed.) Boston: Pearson Education. 
