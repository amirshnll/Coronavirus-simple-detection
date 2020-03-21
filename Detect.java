public class Detect {

    /*
     * Author 	: A.shokri
     * Email 	: amirsh.nll@gmail.com
     * Date 	: 2020/03/21
     */

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String detectCorona(Person person) {

        float sum = 0;

        if(person.getAge() > 50)
            sum += Corona.getAgeImpactPercentage() * person.getAge() - (person.getAge() - 1);

        if(person.getGender() == 1) // male
            sum += Corona.getGenderImpactPercentage();
        else if(person.getGender() == 2) //female
            sum += Corona.getGenderImpactPercentage() / 2;

        for (Country.countryList dng : Corona.getDangerCountry()) {
            if(person.getNationality().equals(dng))
            {
                sum += Corona.getNationalityImpactPercentage();
                break;
            }
        }

        if(person.getFeverDegree() > 37.5)
            sum += Corona.getFeverDegreeImpactPercentage();

        if(person.isCough() == true)
            sum += Corona.getCoughImpactPercentage();

        if(person.isFetigue() == true)
            sum += Corona.getFetigueImpactPercentage();

        if(person.isCoughingUpSputum() == true)
            sum += Corona.getCoughingUpSputumImpactPercentage();

        if(person.isShortnessOfBreath() == true)
            sum += Corona.getShortnessOfBreathImpactPercentage();

        if(person.isBoneOrJointPain() == true)
            sum += Corona.getBoneOrJointPainImpactPercentage();

        if(person.isHeadache() == true)
            sum += Corona.getHeadacheImpactPercentage();

        if(person.isSoreThroat() == true)
            sum += Corona.getSoreThroatImpactPercentage();

        if(person.isChills() == true)
            sum += Corona.getChillsImpactPercentage();

        if(person.isNauseaOrVomiting() == true)
            sum += Corona.getNauseaOrVomitingImpactPercentage();

        if(person.isStuffyNose() == true)
            sum += Corona.getStuffyNoseImpactPercentage();

        if(person.isSpecialDiseases() == true)
            sum += Corona.getDiarrheaImpactPercentage();

        if(person.isDiarrhea() == true)
            sum += Corona.getSpecialDiseasesImpactPercentage();

        String result = "";
        result += String.valueOf(sum);
        result += " of ";
        result += String.valueOf(Corona.getSumImpactPercentage());
        result += " : (";
        result += Math.round(sum / Corona.getSumImpactPercentage() * 100);
        result += "% probability positive)";

        return result;
    }


}
