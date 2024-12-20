# EasyShop Application
![Screenshot 2024-12-19 234311](https://github.com/user-attachments/assets/f6373510-806e-44fb-8bd1-fd3ee2ada3a4)


## Brief Overview of EasyShop

The EasyShop Application project allows for several bug fixes to be changed then run test in Postman. The test consist of the debugging in the controllers, the multiple DAOs, and in the MySQL workbench that contains our database. With these changes, we can make the connection of seeing how both the front and backend of coding can end up
collaborating with each other to create a result that a user can notice the outcome from those results. While the frontend provides the visuals of how everything can look
through the UI, backend provides the functionality of the project and tie everything in with the logic behind it all.

## Project Requirements for Operation

Version of Java 17

Maven

You will need to download MySQL WorkBench and MySql Configurations for the connection to your database
Link to download the Community Server - https://dev.mysql.com/downloads/mysql/
![Screenshot 2024-12-20 075021](https://github.com/user-attachments/assets/a07feae8-ffde-4fae-bdec-13dd44a11417)

Link to download the WorkBench - https://dev.mysql.com/downloads/workbench/
![Screenshot 2024-12-20 074850](https://github.com/user-attachments/assets/027f7605-db3e-4a74-acc4-30b58d1c6e51)

Link to download MySQL Installer - https://dev.mysql.com/downloads/installer/
![Screenshot 2024-12-20 074924](https://github.com/user-attachments/assets/8418e1ab-ff1d-4dde-9696-de19030dfc77)


You will need to have Intellij IDEA Community Edition or Intellij Ultimate with the latest installments attached
Link for Intellij - https://www.jetbrains.com/idea/download/?section=windows

You will need to install the Springboot with Spring Initialzr with the following:
Link to get Spring Initialzr - https://start.spring.io/
![Screenshot 2024-12-19 235323](https://github.com/user-attachments/assets/1e1e8248-7c94-4bc6-a8ee-ab6eca0d8603)

After confirming the settings for your SpringBoot Application, complete the following steps:
1. Generate the folder that will now become a zip folder.
2. Unzip the folder by extracting all contents inside of the folder with the EXTRACT ALL command in the file explorer.
![Screenshot 2024-12-19 235621](https://github.com/user-attachments/assets/f053bddf-2c50-4ffb-a552-d38d6312643a)

3. Go inside of Intellij tp open the file that was made from the unzipped folder.
![Screenshot 2024-12-20 000200](https://github.com/user-attachments/assets/3c1709ea-b795-4c44-b29a-fb5734dfbd68)

You will also need PostMan to be able to test the functionality of the backend portion of the code.
Link for PostMan- https://www.postman.com/downloads/
![Screenshot 2024-12-20 074057](https://github.com/user-attachments/assets/a543b45e-90dd-43ce-a6a5-5c26b2f02c3d)

## Preplan of EasyShop

While being provided the workshop that was written by someone else, there were several areas where we need to debug the code to make it functional. We were already
notified in different sections of where the bugs were and needed to promptly change them. Based on that, I have linked a project board to this repo to help assist me in making sure that I continue on the plans being made to complete the required section(s).
![Screenshot 2024-12-20 000902](https://github.com/user-attachments/assets/ef0513cd-2df0-4444-883f-063ad638d265)

## Database for MySql Workbench
*Make sure you have all the needed essentials so you can have your tests and information for the future database*
![Screenshot 2024-12-20 083715](https://github.com/user-attachments/assets/1c76a992-f923-422e-ac76-fcbc17fbda9e)


## Debugging of EasyShop
The bugs that were notified for the required pieces invloved the CategoriesController, MySqlCategoryDao, and MySqlProductDao. Witht this in mind, I began to overview the code and go through to see what can be fixed and what should remain the same.

### Bugs Fixed From the MySqlCategoryDao Class
![Screenshot 2024-12-20 001327](https://github.com/user-attachments/assets/7146515b-542c-48e4-b78c-afaac5f6cd6b)
![Screenshot 2024-12-20 001401](https://github.com/user-attachments/assets/a492b915-f505-4f12-afcb-6898c734d630)

### Bugs Fixed From the CategoriesController Class
![Screenshot 2024-12-20 001445](https://github.com/user-attachments/assets/bdd084d2-1775-4391-a709-9311c2770829)

### Bugs Fixed From the MySqlProductDao Class
![Screenshot 2024-12-20 001417](https://github.com/user-attachments/assets/1517e48d-5166-4acf-a147-12a9499185a0)

## Testing With Postman
We are going to be using the PostMan software to test the functionality of the backend poortion provided in this project after we were done fixing certain sections in our code. Below are the collection tests for the required sections of the test.
![Screenshot 2024-12-20 073900](https://github.com/user-attachments/assets/7cce09fc-109c-4bbe-9f16-fe7dd7724ccf)

### Passing All PostMan Tests
*When testing PostMan to make sure every test passes, make sure to reuse the EasyShop database in MySql WorkBench Version 8.0 CE and have a connection to your database*
![Screenshot 2024-12-20 074622](https://github.com/user-attachments/assets/4a27a9ac-e483-48dd-9625-67f23d88fee1)
![Screenshot 2024-12-20 074637](https://github.com/user-attachments/assets/b2cec1be-d14e-479e-b02c-8787e710a28c)
![Screenshot 2024-12-20 074647](https://github.com/user-attachments/assets/2393521c-004a-4b6e-9c93-e0838a2c9b22)

## FrontEnd Changes to Website
We can be provided a website to test the cohesiveness of the front and backend operating together. It lets me see if anything when it comes the the UI if there needs to be any fixes and physically lets me test different areas that could be improved and fixed.

### Front HomePage of EasyShop Website
![Screenshot 2024-12-20 075943](https://github.com/user-attachments/assets/6907f19f-1f69-481b-935e-553ec7dce2b6)

### Searching by Different Categories
![Screenshot 2024-12-20 080048](https://github.com/user-attachments/assets/6bbca859-980f-4ad4-b0c5-336809beb434)
![Screenshot 2024-12-20 080106](https://github.com/user-attachments/assets/6abb6d6b-0ef7-48b2-b288-aaedd8a40030)

### Searching by Color
![Screenshot 2024-12-20 080325](https://github.com/user-attachments/assets/e775de05-eea8-4db5-9300-df8bac23b6fe)

### Searching All by Price
![Screenshot 2024-12-20 080407](https://github.com/user-attachments/assets/907a606f-ea07-4b11-94d5-24b92be1071f)
![Screenshot 2024-12-20 080425](https://github.com/user-attachments/assets/1478fabf-c329-4efb-b224-1befccefc4c7)

## Conclusion of EasyShop Application
This project was to display the various areas of the following understanding of skills and tool usage:

- Java Fundamentals
- Spring Framework
- SpringBoot Application
- HTML & CSS
- Database Management
- RESTful API Design
- Debugging
- PostMan Tests

With the understanding of these skills and tools, we are able to apply it to a real life situation where front and backend come together to collaborate on a project.
