# Android MVP
#  What
#Model, View and Presenter
#Responsible for presentation layer
#Separate the presentation layer from the logic

# Why
# It makes view independent from data source(eg. data from database, data from network etc.) Data source is changed wihtout any change in view logic.

# Components
#Model - Is is the data to be shown by view
#View - Invoke method from presenter
#Presenter - It controls the view and model, it says what set of action to do when user interact with UI.

In Example interceptor has been used to write the business logic, It can get data from web service, database etc. locations.
However the business logic can be written in presenter as well.

# generic on action completed interface is created, it can be customize as per need.


#UI
#

![device-2018-01-28-162654](https://user-images.githubusercontent.com/28217318/35481377-6f5cc704-0448-11e8-8694-e36fcf3eb8c0.png)

![device-2018-01-28-162717](https://user-images.githubusercontent.com/28217318/35481378-6f860e5c-0448-11e8-9b80-787b7093e2fa.png)
