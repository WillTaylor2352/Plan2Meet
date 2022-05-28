# Plan2Meet
---

Design Document  

Isabella Peters, William Taylor, Ben Kieffer, Marco Bahns, Jared Belmont

## Introduction 

Do you struggle with coordinating group meetings? Plan2Meet can help you:  

-	Feature a calendar interface.
-	Team users can block off times where they are unavailable. 
-	Users can check group availability.  
-	Display a list of contacts to check their availability. 

Use your Android device to check group availability for collaboration.  Block off times when you are unavailable.  Compare calendars with contact list.  


## Storyboard


## Functional Requirements

### Requirement 100.0: Search for Plants

#### Scenario



#### Dependencies



#### Assumptions



#### Examples


**Given** 

**When** 

**Then** 


1.2  
**Given** 

**When**  

**Then** 


1.3  
**Given**  
**When** 
**Then** 


### Requirement 101: 

#### Scenario



#### Dependencies


#### Assumptions  


#### Examples  

1.1  
**Given** 
**Given** 
**When**  


**Then**   

2.1  
**Given** 
**Given** 
**When**   


**Then** 

## Class Diagram 
<img width="899" alt="Plan2Meet UML" src="https://user-images.githubusercontent.com/75335175/170771795-79826cec-5df5-48ac-8948-d8dffe7167a8.png">

### Class Diagram Description

MainActivity: The first screen the user sees.  This will have your own personal calendar and a list of contacts to look at. 

CalendarActivity: Screen that shows the user's calendar and be able to see their contacts' calendars.  

RetrofitInstance: Bootstrap class required for Retrofit. 

Contacts: Noun class that represents contacts. 

Calendar: Noun class that represents calendar. 

IContactsDAO: Interface for Retrofit to find Contacts JSON.

ICalendarDAO: Interface for Room to persist Calendar data. 


## Scrum Roles

William Taylor - Devops / Product owner / Scrummaster

Ben Kieffer - UI specialist

Marco Bahns - Integration specialist

Isabella Peters - Database specialist

Jared Belmont - ETL specialist

## Weekly Meeting

Weekly stand-ups (open mic) will take place on our Discord server on Wednesdays at 6:30pm
