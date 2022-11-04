# ALC Mentors Management System (MMS) Admin

This is the app for the Mentors Management system admin. MMS is a people management app that enables proper 
coordination of mentors needed to execute projects, ranging from recruitment to off-boarding.
The project will be built using 100% Kotlin and using the Model-View-ViewModel (MVVM) architecture.
You can read more about the guidelines of the recommended architecture [here](https://developer.android.com/topic/architecture)

# Prerequisites

The app has the following minimum requirements:
1. `minSdk` 21
2. `targetSdk` and `compileSdk` 32
3. Android studio Chipmunk | 2021.2.1 | Patch 1 or higher is recommended

# App Features

The main app features and functionalities are as follows:
1. Authentication/Authorization 
2. Recruitment
3. Communication and Engagement
4. Program Scheduling
5. Activities Tracking and Reporting
6. Discussion Forum

There are three groups of user categories namely `Admin`, `Mentor Manager(MM)`, and `Mentor`. The expected access levels for this group
users is listed as follows:

## Admin Category:
- Login/Logout
- Create program
- Add MM
- Add mentor
- Label/unlabel MM
- Label/unlabel mentors
- See the list of all MM
- See the list of all mentors
- Browse MM details
- Browse mentor’s details
- Search by name, category, region, program, engagement status
- Assign/unassign MM to program
- Assign/unassign mentor to program
- Archive a program
- Delete a program
- Generate program report at interval
- Download program report
- Share program report via email
- Generate MM report
- Delete MM
- Delete mentor
- Receive notification from MM activities
- Generate MM certificate
- Generate mentor certificate
- Approve mentor certificate generated and shared by MM
- Send broadcast message to all MM
- Send broadcast message to all mentors
- Chat 1:1 with any user
- See the list of mentors’ applicants
- Set up criteria for selection
- Generate the list of selected mentors
- Message the list of selected mentors
- Generate the list of unselected mentors
- Message the list of unselected mentors
- Engage on the discussion forum etc.

# Development tools of choice

For this project, stick to the recommended Jetpack Components as much as possible. The idea is to give knowledge of these tools
and your certification will be on them. You can read about them [here](https://developer.android.com/jetpack/getting-started)
#### Libraries:
- Dagger Hilt
- Retrofit
- ViewModel
- LiveData
- Coroutines
- Navigation Components
- etc.
##### MVVM Architecture is highly recommended

# How to use this repo

To use and contribute to the project, do the following:
1. Fork it to your GitHub account.
2. Clone the repo with the command git clone to your local mechine.
3. Open a feature branch from the 'develop' branch. 
4. Make sure the name is descriptive for your branch but not too long. Lead with what the the branch is doing
eg new feature or bug but follow this pattern `type/branch-description` eg `feature/add-login-functionality`.
5. Ensure your branch is up to date with latest changes before pushing.
6. Reference the issue you worked on in your PRReference the issue you worked on in your PR.
7. Open a pull request against the develop branch and request a review from your Team Lead.

#### Design
- The design can be find [here](https://www.figma.com/file/JNZKj3lachPypSOMBOhC1e/MMS-ALC-Mobile-Project?node-id=0%3A1) 
- Work on your Team assigned task eg. Team 1, Team 2 etc. 
