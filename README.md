# Coronavirus-simple-detection
Coronavirus simple detection with Java

## Author Detail
* Author 	: A.shokri
* Email 	: amirsh.nll@gmail.com
* Website : www.amirshnll.ir
* Date 	: 2020/03/21

** **

### Detail :
**Impact Factor Number** : https://ourworldindata.org/coronavirus

** **

**5 file :**
* Corona.java
* Country.java
* Detect.java
* Main.java
* Person.java

** **

#### Impact Percentage For Symptoms
* age Impact Percentage : 1 ( Higher Than 50 )
* gender Impact Percentage : 4 ( male double Impact vs female )
* nationality Impact Percentage : 20 ( dangerous country : Iran, China, Italy, Germany, United_States )

* fever Degree Impact Percentage : 83 ( < 37.5 )
* cough Impact Percentage : 76
* fetigue Impact Percentage : 38
* coughing Up Sputum Impact Percentage : 33
* shortness Of Breath Impact Percentage : 19
* bone Or Joint Pain Impact Percentage : 15
* headache Impact Percentage : 14
* sore Throat Impact Percentage : 14
* chills Impact Percentage : 11
* nausea Or Vomiting Impact Percentage : 5
* stuffy Nose Impact Percentage : 5
* diarrhea Impact Percentage : 5
* special Diseases Impact Percentage : 10 ( For example : cradiovascular disease, diabetes, chronc respiratory disease, hypertension, cancer, HIV )

** **

##### Sample 1
```
Person person = new Person();

person.setFirstName("Amir");
person.setLastName("Shokri");
person.setAge(24);
person.setGender(1);
person.setNationality(Country.countryList.Iran);

person.setFeverDegree(37);
person.setCough(false);
person.setFetigue(false);
person.setCoughingUpSputum(false);
person.setShortnessOfBreath(false);
person.setBoneOrJointPain(false);
person.setHeadache(false);
person.setSoreThroat(false);
person.setChills(false);
person.setNauseaOrVomiting(false);
person.setStuffyNose(false);
person.setSpecialDiseases(false);
person.setDiarrhea(false);

Detect detect = new Detect();
String result = detect.detectCorona(person);

System.out.println("Coronavirus Test For " + person.getFirstName() + " " + person.getLastName() + " : ");
System.out.println(result);
```

**output :** Coronavirus Test For Amir Shokri : 24.0 of 353.0 : (7% probability positive)

** **

##### Sample 2
```
Person person = new Person();

person.setFirstName("John");
person.setLastName("Due");
person.setAge(24);
person.setGender(1);
person.setNationality(Country.countryList.United_States);

person.setFeverDegree(39);
person.setCough(true);
person.setFetigue(true);
person.setCoughingUpSputum(true);
person.setShortnessOfBreath(true);
person.setBoneOrJointPain(true);
person.setHeadache(true);
person.setSoreThroat(true);
person.setChills(true);
person.setNauseaOrVomiting(true);
person.setStuffyNose(true);
person.setSpecialDiseases(true);
person.setDiarrhea(true);

Detect detect = new Detect();
String result = detect.detectCorona(person);

System.out.println("Coronavirus Test For " + person.getFirstName() + " " + person.getLastName() + " : ");
System.out.println(result);

```
**output :** Coronavirus Test For John Due : 352.0 of 353.0 : (100% probability positive)
