\# Introduction  
  
Name: Ammar Haziq Bin Mohd Halim  
Student ID: -  
Study course: ESE  
  
Link to Github :
<https://github.com/Lilmarziq/Java-Course/tree/main/Homework_1/problem_1>  
  
\## Environment  
  
Language: Java  
IDE: Eclipse  
  
\### Solution  
  
**public** **class** Problem1 {  
  
//initialize sun and earth diameters called sunDia and earthDia
respectively  
  
**public** **static** **double** *sunDia* = 865000; //miles  
**public** **static** **double** *earthDia* = 7600; //miles  
  
//define method of calculating volume  
  
**public** **static** **double** calVolume(**double** r)  
{  
**return** (4 \* Math.***PI*** \* Math.*pow*( r , 3.0 ) ) / 3;  
}  
  
**public** **static** **void** main(String\[\] args) {  
  
// (a) the volume of the Earth in cubic miles  
**double** earthVol = *calVolume*(*earthDia*/2);  
  
// (b) the volume of the Sun in cubic miles  
**double** sunVol = *calVolume*(*sunDia*/2);  
  
// (c) the ratio of the volume of the Sun to the volume of the Earth  
**double** ratioSunEarth = sunVol/earthVol;  
  
// print  
System.***out***.println(\"\nThe volume of the Earth is \" + earthVol +
\" cubic miles, \" +  
\"the volume of the sun is \" + sunVol + \" cubic miles, \" +  
\"and the ratio of the volume of the Sun to the volume of the Earth is
\" + ratioSunEarth + \".\");  
}  
}  
  
\### Output  
  
The volume of the Earth is 2.2984729611703882E11 cubic miles, the volume
of the sun is 3.388807851993121E17 cubic miles, and the ratio of the
volume of the Sun to the volume of the Earth is 1474373.5990122468.  
  
