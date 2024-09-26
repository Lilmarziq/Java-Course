\# Introduction  
  
Name: Ammar Haziq Bin Mohd Halim  
Student ID: -  
Study course: ESE  
  
Link to Github :  
<https://github.com/Lilmarziq/Java-Course/tree/main/Homework_2>  
  
\## Environment  
  
Language: Java  
IDE: Eclipse  
  
\## Solution  
  
**import** java.io.BufferedWriter;  
**import** java.io.FileWriter;  
**import** java.io.IOException;  
**import** java.time.Year;  
**import** java.util.ArrayList;  
**import** java.util.List;  
  
**class** Car {  
**private** **int** id;  
**private** String make;  
**private** String model;  
**private** **int** yearOfManufacture;  
**private** String color;  
**private** **double** price;  
**private** String registrationNumber;  
  
**public** Car(**int** id, String make, String model, **int**
yearOfManufacture, String color, **double** price, String
registrationNumber) {  
**this**.id = id;  
**this**.make = make;  
**this**.model = model;  
**this**.yearOfManufacture = yearOfManufacture;  
**this**.color = color;  
**this**.price = price;  
**this**.registrationNumber = registrationNumber;  
}  
  
**public** String getMake() {  
**return** make;  
}  
  
**public** String getModel() {  
**return** model;  
}  
  
**public** **int** getYearOfManufacture() {  
**return** yearOfManufacture;  
}  
  
**public** **double** getPrice() {  
**return** price;  
}  
  
@Override  
**public** String toString() {  
**return** id + \",\" + make + \",\" + model + \",\" +
yearOfManufacture + \",\" + color + \",\" + price + \",\" +
registrationNumber;  
}  
}  
  
**public** **class** Problem_1 {  
  
**private** **static** Car\[\] *cars* = **new** Car\[\]{  
**new** Car(1, \"Toyota\", \"Camry\", 2018, \"Red\", 24000,
\"ABC123\"),  
**new** Car(2, \"Honda\", \"Civic\", 2016, \"Blue\", 22000,
\"DEF456\"),  
**new** Car(3, \"Toyota\", \"Corolla\", 2020, \"White\", 20000,
\"GHI789\"),  
**new** Car(4, \"Ford\", \"Mustang\", 2015, \"Black\", 30000,
\"JKL012\"),  
**new** Car(5, \"Honda\", \"Accord\", 2017, \"Green\", 26000,
\"MNO345\"),  
**new** Car(6, \"Toyota\", \"Camry\", 2020, \"Gray\", 27000,
\"PQR678\"),  
**new** Car(7, \"Ford\", \"Fiesta\", 2014, \"Yellow\", 15000,
\"STU901\")  
};  
  
**public** **static** **void** main(String\[\] args) {  
**try** {  
*saveCarsByMake*(\"Toyota\");  
*saveCarsByModelAndYears*(\"Civic\", 5);  
*saveCarsByYearAndPrice*(2015, 20000);  
} **catch** (IOException e) {  
e.printStackTrace();  
}  
}  
  
**public** **static** **void** saveCarsByMake(String make) **throws**
IOException {  
List\<Car\> filteredCars = **new** ArrayList\<\>();  
**for** (Car car : *cars*) {  
**if** (car.getMake().equalsIgnoreCase(make)) {  
filteredCars.add(car);  
}  
}  
*writeCarsToFile*(filteredCars, \"cars_by_make.txt\");  
}  
  
**public** **static** **void** saveCarsByModelAndYears(String model,
**int** years) **throws** IOException {  
List\<Car\> filteredCars = **new** ArrayList\<\>();  
**int** currentYear = Year.*now*().getValue();  
**for** (Car car : *cars*) {  
**if** (car.getModel().equalsIgnoreCase(model) && (currentYear -
car.getYearOfManufacture() \> years)) {  
filteredCars.add(car);  
}  
}  
*writeCarsToFile*(filteredCars, \"cars_by_model_and_years.txt\");  
}  
  
**public** **static** **void** saveCarsByYearAndPrice(**int** year,
**double** price) **throws** IOException {  
List\<Car\> filteredCars = **new** ArrayList\<\>();  
**for** (Car car : *cars*) {  
**if** (car.getYearOfManufacture() == year && car.getPrice() \> price)
{  
filteredCars.add(car);  
}  
}  
*writeCarsToFile*(filteredCars, \"cars_by_year_and_price.txt\");  
}  
  
**private** **static** **void** writeCarsToFile(List\<Car\> cars, String
fileName) **throws** IOException {  
**try** (BufferedWriter writer = **new** BufferedWriter(**new**
FileWriter(fileName))) {  
**for** (Car car : cars) {  
writer.write(car.toString());  
writer.newLine();  
}  
}  
}  
}  
  
\### Output  
  
3 files which consists of:  
  
cars_by_make.txt  
cars_by_model_and_years.txt  
cars_by_year_and_price.txt
