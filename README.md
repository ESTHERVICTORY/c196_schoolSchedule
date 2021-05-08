# c196_schoolSchedule
COMPETENCIES
4026.01.4 : Saving Data

The graduate explains ways to save data in a mobile application, and creates a data base in a mobile application.

4026.01.5 : Sharing Information

The graduate explains how to share information in mobile applications and creates a user-defined content provider.

4026.01.6 : Supporting Different Devices

The graduate describes how to utilize the available hardware and services available in different devices.

4026.01.7 : Deploying Mobile Application

The graduate describes mobile application deployment and prepares and application for deployment.

INTRODUCTION
As a competent mobile application developer, your understanding of mobile application structure and design will help you to develop applications to meet customer requirements. The following project to develop a student scheduler/student progress tracking application, will help you to apply these skills in a familiar, real-world scenario. This task will allow you to demonstrate your ability to apply the skills learned in the course.

You will develop a multiple-screen mobile application for a student to track terms, courses associated with each term, and assessment(s) associated with each course. The application will allow students to enter, edit, and delete term, course, and assessment data. It should provide summary and detailed views of courses for each term and provide alerts for upcoming performance and objective assessments. This application will use a SQLite database.
REQUIREMENTS
Your submission must be your original work. No more than a combined total of 30% of the submission and no more than a 10% match to any one individual source can be directly quoted or closely paraphrased from sources, even if cited correctly. The similarity report that is provided when you submit your task can be used as a guide.

You must use the rubric to direct the creation of your submission because it provides detailed criteria that will be used to evaluate your work. Each requirement below may be evaluated by more than one rubric aspect. The rubric aspect titles may contain hyperlinks to relevant portions of the course.

Tasks may not be submitted as cloud links, such as links to Google Docs, Google Slides, OneDrive, etc., unless specified in the task requirements. All other submissions must be file types that are uploaded and submitted as attachments (e.g., .docx, .pdf, .ppt).

Note: The assessment must be submitted in an Android Studio project using Java as the programming language. External plugins and libraries are not allowed in the project.

Note: Submit your performance assessment by including all Android project files, APK, and signed apk files in one zipped.zip file.

Note: The zip file submission must also keep the project file and folder structure intact for the Android Studio IDE.


A.  Create an Android mobile application, compatible for Android 8.0 and higher. The application myst include the following functional requirements:

1.  Create a user option to enter term titles (e.g., Term 1, Term 2, Spring Term), start dates, and end dates for each term.

2.  Create features that allow the user to add as many terms as needed.

3.  Implement validation so that a term cannot be deleted if courses are assigned to it.

4.  Create features that allow the user to do the following for each term:

a.  Add as many courses as needed

b.  Display a list of courses associated with each term

c.  Display a detailed view of the term title (e.g., Term 1, Term 2, Spring Term), the start date, and the end date for each term

5.  Include the following details for each course:

•  The course title

•  The start date

•  The end date

•  The status (in progress, completed, dropped, plan to take)

•  The course instructors’ names, phone numbers, and e-mail addresses 

6.  Include features that allow the user to do the following for each course:

a.  Add as many assessments as needed.

b.  Add a minimum of one optional note per course.

c.  Enter, edit, and delete course information.

d.  Display optional notes.

e.  Display a detailed view of the course, including the end date.

f.  Set alerts for the start and end date, that will trigger when the application is not running.

g.  Share notes via a sharing feature (either e-mail or SMS) that automatically populates with the notes.

7.  Include features that allow the user to do the following for each assessment:

a.  Add performance and objective assessments for each course, including the titles and end dates of the assessments.

b.  Enter, edit, and delete assessment information.

c.  Set alerts for start and end dates, that will trigger when the application is not running.
 

B.  Design the following screen layouts, including appropriate GUI (graphical user interface) elements (e.g., navigation, input, and information) for each layout:

•  home screen

•  list of terms

•  list of courses

•  list of assessments

•  detailed course view

•  detailed term view

•  detailed assessment view
 

C.  Implement a scheduler within your application from Part A and include the following elements:

•  an ArrayList

•  an intent

•  navigation capability between multiple screens using activity

•  three activities

•  events (e.g., a click event)

•  the ability to work in portrait and landscape layout

•  interactive capability (e.g., the ability to accept and act upon user input)

•  a database to store and retrieve application data

•  an application title and an icon

•  notifications or alerts

•  the use of both declarative and programmatic methods to create a user interface
 

1.  Include the following interface requirements in the application from part C:

•  the ability to scroll vertically

•  an action bar

•  two layouts

•  input controls

•  buttons
 

D.  Create a storyboard to demonstrate application flow that includes each of the menus and screens from part B.
 

E.  Provide screen shots of generating the signed APK to demonstrate that you have created a deployment package.
 

Note: Verify that all the required functions of your application are working by executing the apk file.
 

F.  Reflect on the creation of your mobile application by doing the following:

1.  Explain how your application would be different if it were developed for a tablet rather than a phone, including a discussion of fragments and layouts.

2.  Identify the minimum and target operating system your application was developed under and is compatible with.

3.  Describe (suggested length of 1–2 paragraphs) the challenges you faced during the development of the mobile application.

4.  Describe (suggested length of 1–2 paragraphs) how you overcame each challenge discussed in part F3.

5.  Discuss (suggested length of 1–2 paragraphs) what you would do differently if you did the project again.

6.  Describe how emulators are used and the pros and cons of using an emulator versus using a development device.
 

G.  Acknowledge sources, using APA-formatted in-text citations and references, for content that is quoted, paraphrased, or summarized.
 

H.  Demonstrate professional communication in the content and presentation of your submission.
 

File Restrictions
File name may contain only letters, numbers, spaces, and these symbols: ! - _ . * ' ( )
File size limit: 200 MB
File types allowed: doc, docx, rtf, xls, xlsx, ppt, pptx, odt, pdf, txt, qt, mov, mpg, avi, mp3, wav, mp4, wma, flv, asf, mpeg, wmv, m4v, svg, tif, tiff, jpeg, jpg, gif, png, zip, rar, tar, 7z
RUBRIC
A:MOBILE APPLICATION VERSION
NOT EVIDENT

An Android mobile application is not provided.

APPROACHING COMPETENCE

The Android mobile application is not version 8.0 or higher, or does not load properly, or the Android project files, APK, and signed apk files are not in one zipped.zip file.

COMPETENT

The Android mobile application is a version 8.0 or higher, loads properly, and all Android project files, APK, and signed apk files are in one zipped.zip file.

A1:TERM FUNCTIONAL REQUIREMENTS
NOT EVIDENT

The mobile application does not allow the user to enter any information for any term.

APPROACHING COMPETENCE

The mobile application does not allow the user to enter term titles, or all the start and end dates for each term.

COMPETENT

The mobile application allows the user to enter all term titles and all start and end dates for each term.

A2:TERM ADDITION FEATURE
NOT EVIDENT

The features included in the mobile application do not allow the user to add terms.

APPROACHING COMPETENCE

The features included in the mobile application are coded to allow the user to add a limited number of terms.

COMPETENT

The features included in the mobile application are coded to allow the user to add an unlimited number of terms.

A3:VALIDATION IMPLEMENTATION
NOT EVIDENT

The mobile application does not allow the user to delete any terms.

APPROACHING COMPETENCE

The mobile application includes validation that allows the user to delete a term, regardless of whether that term has courses assigned to it.

COMPETENT

The mobile application includes validation to prevent the user from deleting a term when courses have been assigned to that term.

A4A:COURSE ADDITION
NOT EVIDENT

The mobile application does not allow the user to add courses to any term.

APPROACHING COMPETENCE

The mobile application is coded so that the user can only add a limited number of courses to each term.

COMPETENT

The mobile application is coded so that the user can add an unlimited number of courses to each term.

A4B:LIST OF COURSES
NOT EVIDENT

The mobile application does not allow the user to display a list of courses.

APPROACHING COMPETENCE

The mobile application allows the user to display a list of courses, but the courses are not associated with any terms.

COMPETENT

The mobile application allows the user to display a list of courses associated with each term.

A4C:TERM DETAILS
NOT EVIDENT

The mobile application does not allow the user to display a detailed view of any terms.

APPROACHING COMPETENCE

The mobile application allows the user to display a view of each term, but the view does not include the term title, the start date, and the end date for each term.

COMPETENT

The mobile application allows the user to display a detailed view of each term and the view includes the term title, the start date, and the end date for each term.

A5:COURSE DETAILS
NOT EVIDENT

The mobile application does not allow the user to enter any course details.

APPROACHING COMPETENCE

The mobile application does not allow the user to enter 1 or more of the given details for each course.

COMPETENT

The mobile application allows the user to enter all the given details for each course.

A6A:ASSESSMENT ADDITION
NOT EVIDENT

The mobile application does not allow the user to add any assessments to any course.

APPROACHING COMPETENCE

The mobile application is coded so that the user can add between 1 and 4 assessments to each course.

COMPETENT

The mobile application is coded so that the user can add as many as 5 assessments to each course.

A6B:OPTIONAL NOTES ADDITION
NOT EVIDENT

The mobile application does not allow the user to add optional notes.

APPROACHING COMPETENCE

The mobile application allows the user to add optional notes, but the notes are not within any course, or the optional notes can only be added to some of the courses.

COMPETENT

The mobile application allows the user to add optional notes within each course.

A6C:COURSE INFORMATION
NOT EVIDENT

The mobile application does not allow the user to enter, edit, or delete course information for any course.

APPROACHING COMPETENCE

The mobile application only allows the user to enter, or edit, or delete parts of each course’s information.

COMPETENT

The mobile application allows the user to enter, edit, and delete any information for each course.

A6D:OPTIONAL NOTES DISPLAY
NOT EVIDENT

The mobile application does not allow the user to display optional notes.

APPROACHING COMPETENCE

The mobile application allows the user to display optional notes, but the notes are not within any course.

COMPETENT

The mobile application allows the user to display optional notes within each course.

A6E:DETAILED VIEW
NOT EVIDENT

The mobile application does not allow the user to display a view of the course information.

APPROACHING COMPETENCE

The mobile application allows the user to display a view of the course information, but not for each course, or the view for a course does not include the end date.

COMPETENT

The mobile application allows the user to display a detailed view of the course information for each course, including the end date for each.

A6F:ALERTS FOR COURSES
NOT EVIDENT

The mobile application does not allow the user to set any alerts.

APPROACHING COMPETENCE

The mobile application allows the user to set alerts for either the start or the end date of each course, or the alerts do not trigger when the application is not running.

COMPETENT

The mobile application allows the user to set alerts for both the start and end date of each course and the alerts can trigger when the application is not running.

A6G:SHARING FEATURES
NOT EVIDENT

The mobile application does not allow the user to share notes.

APPROACHING COMPETENCE

The mobile application allows the user to share messages or emails, but the information does not automatically populate from the notes.

COMPETENT

The mobile application allows the user to share messages or email that automatically populates with the notes.

A7A:ASSESSMENTS FOR EACH COURSE
NOT EVIDENT

The mobile application does not allow the user to add any assessments.

APPROACHING COMPETENCE

The mobile application allows the user to add performance and objective assessments for each course, but cannot include the title of the assessment and the end date for each assessment.

COMPETENT

The mobile application allows the user to add performance and objective assessments for each course, including the title of the assessment and the end date for each assessment.

A7B:ASSESSMENT INFORMATION
NOT EVIDENT

The mobile application does not allow the user to modify in any way, information for any assessments.

APPROACHING COMPETENCE

The mobile application allows the user to either enter, edit, or delete information for each assessment, but not all three.

COMPETENT

The mobile application allows the user to enter, edit, and delete all assessment information.

A7C:ALERTS FOR GOAL DATES
NOT EVIDENT

The mobile application does not allow the user to set any alerts.

APPROACHING COMPETENCE

The mobile application allows the user to set alerts for either the start or the end dates for each assessment.

COMPETENT

The mobile application allows the user to set alerts for all start and end dates for each assessment.

B:SCREEN LAYOUTS
NOT EVIDENT

A design of any screen layouts is not provided.

APPROACHING COMPETENCE

The screen designs include the layout for each given screen, but not as described, or does not include appropriate GUI elements for each layout.

COMPETENT

The screen designs include the layout for each given screen, as described, and includes appropriate GUI elements for each layout.

C:STUDENT SCHEDULER AND PROGRESS TRACKING APPLICATION
NOT EVIDENT

A scheduler is not included.

APPROACHING COMPETENCE

The mobile application includes a scheduler but does not include the 11 given implementation requirements.

COMPETENT

The mobile application includes a scheduler that incorporates all of the 11 given implementation requirements.

C1:INTERFACE REQUIREMENTS
NOT EVIDENT

The mobile application does not include any of the given interface requirements.

APPROACHING COMPETENCE

The mobile application includes up to 4 of the given interface requirements.

COMPETENT

The mobile application includes all 5 of the given interface requirements.

D:STORYBOARD
NOT EVIDENT

A storyboard is not provided.

APPROACHING COMPETENCE

The storyboard demonstrates the flow of the mobile application but includes only some of the menus and screens from part B.

COMPETENT

The storyboard demonstrates the flow of the mobile application and includes all of the menus and screens from part B.

E:SCREENSHOTS
NOT EVIDENT

Screenshots are not provided.

APPROACHING COMPETENCE

The screenshots provided do not demonstrate the creation of a deployment package.

COMPETENT

The screenshots provided demonstrate the creation of a deployment package.

F1:MOBILE APPLICATION DEVELOPMENT
NOT EVIDENT

An explanation of how the application would be different is not provided.

APPROACHING COMPETENCE

The explanation of how the application would be different if developed for a tablet includes a discussion of either fragments or layouts, not both. Or there are errors in the explanation.

COMPETENT

The explanation of how the application would be different if developed for a tablet includes both an accurate discussion of both fragments and layouts.

F2:OPERATING SYSTEM
NOT EVIDENT

The identification of the minimum and target operating system is not provided.

APPROACHING COMPETENCE

The response identifies either the minimum SDK or the target SDK, but not both.

COMPETENT

The response identifies both the minimum and the target SDK.

F3:DESCRIPTION OF CHALLENGES
NOT EVIDENT

A description of challenges faced is not provided.

APPROACHING COMPETENCE

The response includes challenges but not specifically related to the development of the application.

COMPETENT

The response describes challenges faced, specifically during the development of the application.

F4:SOLUTIONS TO CHALLENGES
NOT EVIDENT

A description of how challenges were overcome is not provided.

APPROACHING COMPETENCE

The description of how challenges were overcome is not related to the challenges listed in F2.

COMPETENT

The description of how each challenge was overcome is related to the challenges listed in F2.

F5:DIFFERENCES
NOT EVIDENT

A discussion of what would be done differently is not provided.

APPROACHING COMPETENCE

The response discusses at least one aspect of the project that would be done differently, but does not specifically identify the changes that would be made.

COMPETENT

The response discusses the changes that would be made to at least one aspect of the project, were it to be done again, and specifically identifies the changes that would be made.

F6:EMULATORS
NOT EVIDENT

A description of how emulators are used, and the pros and cons of their use, is not provided.

APPROACHING COMPETENCE

The description of the use of emulators but does not include the pros and cons of using an emulator versus using a development device, or describes the pros and cons without describing the use of emulators.

COMPETENT

The description of the use of emulators includes the pros and cons of using an emulator versus using a development device.

G:APA SOURCES
NOT EVIDENT

The submission does not include in-text citations and references according to APA style for content that is quoted, paraphrased, or summarized.

APPROACHING COMPETENCE

The submission includes in-text citations and references for content that is quoted, paraphrased, or summarized but does not demonstrate a consistent application of APA style.

COMPETENT

The submission includes in-text citations and references for content that is quoted, paraphrased, or summarized and demonstrates a consistent application of APA style.

H:PROFESSIONAL COMMUNICATION
NOT EVIDENT

Content is unstructured, is disjointed, or contains pervasive errors in mechanics, usage, or grammar. Vocabulary or tone is unprofessional or distracts from the topic.

APPROACHING COMPETENCE

Content is poorly organized, is difficult to follow, or contains errors in mechanics, usage, or grammar that cause confusion. Terminology is misused or ineffective.

COMPETENT

Content reflects attention to detail, is organized, and focuses on the main ideas as prescribed in the task or chosen by the candidate. Terminology is pertinent, is used correctly, and effectively conveys the intended meaning. Mechanics, usage, and grammar promote accurate interpretation and understanding.
