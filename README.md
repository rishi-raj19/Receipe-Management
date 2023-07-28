# Receipe-Management

1. Language and Framwork - Java , SpringBoot , JPA , MYSQL database
   
2. Data Flow
   - Controller (API)
                                                                                                                        
     a. ChefController - createChef(), getChefBydishId(), getAllChefs(), deleteChef()
                                                                                                                    
     b. LearnerController - createLearner()

    - Service

      a. ChefService - saveChef(), getChefBydishId(), getAllchefs(), deleteChef()

      b. LearnerService - saveLearner()

   - Repository
  
      a. IChefRepo

      b. ILearnerRepo

   - DataBase Design

     MySQL as database was used for the project.

3. Model - Chef, Learner

4. Project Summary

   The Recipe Management System API is a web-based application developed using Java and the Spring Boot framework. It allows users to 
   store, manage, and share their favorite recipes with the community. The API supports CRUD operations on recipes, enabling users to 
   create, read, update, and delete recipes. Additionally, other users can comment on the recipes, fostering an interactive and engaging 
   platform for culinary enthusiasts.
   The Recipe Management System API offers a user-friendly and efficient platform for users to share their culinary expertise, discover 
   new recipes, and engage with the cooking community. Whether users are looking to save their family's secret recipe or try out a new 
   dish, the API provides a seamless and organized way to store and manage their culinary creations. With its annotation-based validation 
   and robust data storage capabilities, the API ensures the reliability and accuracy of recipe data, making it a valuable tool for 
   cooking enthusiasts worldwide.
