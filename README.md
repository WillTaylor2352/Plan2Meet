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

