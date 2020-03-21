public class Main {

    /*
     * Author 	: A.shokri
     * Email 	: amirsh.nll@gmail.com
     * Date 	: 2020/03/21
     */

    public static void main(String[] args) {

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

    }
}
