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

![storyboard](https://user-images.githubusercontent.com/26129706/170889214-7aadf1a0-872a-489e-bed5-3c8253ff1261.PNG)

## Functional Requirements
### Requirement 1: View calendar
##### Dependencies
The app is online and fully functional.
##### Scenario
As a user, I want to compare my availability against that of my team members.
#### Example 1
**Given** that a team member has indicated that they will be available to meet at a given date and time

**When** I open the calendar

**Then** I should see the specified date and time colored green.

#### Example 2
**Given** that a team member has indicated that they will be NOT available to meet at a given date and time

**When** I open the calendar

**Then** I should see the specified date and time colored red.

### Requirement 2: Automatic notifications
##### Dependencies
The app is online and fully functional.
##### Scenario
As a user, I want to be automatically notified of any changes in a team member's availability.
#### Example 1
**Given** that I am available to meet at a given date and time for which a team member has previously indicated that they will not be available

**When** the team member changes their status for the specified date and time to 'available'

**Then** I should receive a push notification to inform me of the change. If I click on it, the calendar should open and display the specified date and time colored green.

#### Example 2
**Given** that I am available to meet at a given date and time for which a team member has previously indicated that they will also be available

**When** the team member changes their status for the specified date and time to 'not available'

**Then** I should receive a push notification to inform me of the change. If I click on it, the calendar should open and display the specified date and time colored red.

### Requirement 3: Contact list
##### Dependencies
The app is online and fully functional.
##### Scenario
As a user, I want to be able to quickly cross-reference my schedule with that of a given team member.
#### Example 1
**Given** that I have approved another user as a collaborator

**When** I open the list of my contacts

**Then** their name should appear, along with an indicator of availibility changes, if there are any.

#### Example 2
**Given** that another user is in my contact list

**When** I click on their name

**Then** the calendar should appear, displaying both of our schedules. Dates and times at which we are both available to meet should be highlighted.



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
