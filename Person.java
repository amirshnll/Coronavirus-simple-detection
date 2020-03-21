public class Person {

    /*
     * Author 	: A.shokri
     * Email 	: amirsh.nll@gmail.com
     * Date 	: 2020/03/21
     */

    private String firstName;
    private String lastName;
    private int age;
    private int gender;
    private Country.countryList nationality;

    private float feverDegree;
    private boolean cough;
    private boolean fetigue;
    private boolean coughingUpSputum;
    private boolean shortnessOfBreath;
    private boolean boneOrJointPain;
    private boolean headache;
    private boolean soreThroat;
    private boolean chills;
    private boolean nauseaOrVomiting;
    private boolean stuffyNose;
    private boolean specialDiseases;
    private boolean diarrhea;

    public Person() {
        setFirstName("");
        setLastName("");
        setAge(0);
        setGender(0);
        setNationality(Country.countryList.Iran);

        setFeverDegree(37);
        setCough(false);
        setFetigue(false);
        setCoughingUpSputum(false);
        setShortnessOfBreath(false);
        setBoneOrJointPain(false);
        setHeadache(false);
        setSoreThroat(false);
        setChills(false);
        setNauseaOrVomiting(false);
        setStuffyNose(false);
        setSpecialDiseases(false);
        setDiarrhea(false);
    }

    public Person(String firstName, String lastName, int age, int gender, Country.countryList nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
        setNationality(nationality);
    }

    public Person(String firstName, String lastName, int age, int gender, Country.countryList nationality, float feverDegree, boolean cough, boolean fetigue, boolean coughingUpSputum, boolean shortnessOfBreath, boolean boneOrJointPain, boolean headache, boolean soreThroat, boolean chills, boolean nauseaOrVomiting, boolean stuffyNose, boolean specialDiseases, boolean diarrhea) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
        setNationality(nationality);

        setFeverDegree(feverDegree);
        setCough(cough);
        setFetigue(fetigue);
        setCoughingUpSputum(coughingUpSputum);
        setShortnessOfBreath(shortnessOfBreath);
        setBoneOrJointPain(boneOrJointPain);
        setHeadache(headache);
        setSoreThroat(soreThroat);
        setChills(chills);
        setNauseaOrVomiting(nauseaOrVomiting);
        setStuffyNose(stuffyNose);
        setSpecialDiseases(specialDiseases);
        setDiarrhea(diarrhea);
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        age = Age;
    }

    public float getFeverDegree() {
        return feverDegree;
    }

    public void setFeverDegree(float feverDegree) {
        this.feverDegree = feverDegree;
    }

    public void setGender(int Gender) {
        gender = Gender;
    }

    public int getGender() {
        return gender;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCoughingUpSputum(boolean coughingUpSputum) {
        this.coughingUpSputum = coughingUpSputum;
    }

    public boolean isCoughingUpSputum() {
        return coughingUpSputum;
    }

    public boolean isFetigue() {
        return fetigue;
    }

    public void setFetigue(boolean fetigue) {
        this.fetigue = fetigue;
    }

    public boolean isShortnessOfBreath() {
        return shortnessOfBreath;
    }

    public void setShortnessOfBreath(boolean shortnessOfBreath) {
        this.shortnessOfBreath = shortnessOfBreath;
    }

    public boolean isBoneOrJointPain() {
        return boneOrJointPain;
    }

    public void setBoneOrJointPain(boolean boneOrJointPain) {
        this.boneOrJointPain = boneOrJointPain;
    }

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public boolean isChills() {
        return chills;
    }

    public void setChills(boolean chills) {
        this.chills = chills;
    }

    public boolean isNauseaOrVomiting() {
        return nauseaOrVomiting;
    }

    public void setNauseaOrVomiting(boolean nauseaOrVomiting) {
        this.nauseaOrVomiting = nauseaOrVomiting;
    }

    public boolean isStuffyNose() {
        return stuffyNose;
    }

    public void setStuffyNose(boolean stuffyNose) {
        this.stuffyNose = stuffyNose;
    }

    public boolean isSpecialDiseases() {
        return specialDiseases;
    }

    public void setSpecialDiseases(boolean specialDiseases) {
        this.specialDiseases = specialDiseases;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public void setNationality(Country.countryList nationality) {
        this.nationality = nationality;
    }

    public Country.countryList getNationality() {
        return nationality;
    }
}
