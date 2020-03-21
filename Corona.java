public class Corona {

    /*
     * Author 	: A.shokri
     * Email 	: amirsh.nll@gmail.com
     * Date 	: 2020/03/21
     */

    // Impact Factor Number = https://ourworldindata.org/coronavirus
    private static final float ageImpactPercentage = 1;
    private static final float genderImpactPercentage = 4;
    private static final float nationalityImpactPercentage = 20;

    private static final float feverDegreeImpactPercentage = 83;
    private static final float coughImpactPercentage = 76;
    private static final float fetigueImpactPercentage = 38;
    private static final float coughingUpSputumImpactPercentage = 33;
    private static final float shortnessOfBreathImpactPercentage = 19;
    private static final float boneOrJointPainImpactPercentage = 15;
    private static final float headacheImpactPercentage = 14;
    private static final float soreThroatImpactPercentage = 14;
    private static final float chillsImpactPercentage = 11;
    private static final float nauseaOrVomitingImpactPercentage = 5;
    private static final float stuffyNoseImpactPercentage = 5;
    private static final float diarrheaImpactPercentage = 5;
    private static final float specialDiseasesImpactPercentage = 10;

    private static final float sumImpactPercentage = 353;

    private static final Country.countryList[] dangerCountry = {
       Country.countryList.Iran,
       Country.countryList.China,
       Country.countryList.Italy,
       Country.countryList.Germany,
       Country.countryList.United_States,
    };

    public static float getAgeImpactPercentage() {
        return ageImpactPercentage;
    }

    public static float getBoneOrJointPainImpactPercentage() {
        return boneOrJointPainImpactPercentage;
    }

    public static float getChillsImpactPercentage() {
        return chillsImpactPercentage;
    }

    public static float getCoughImpactPercentage() {
        return coughImpactPercentage;
    }

    public static float getCoughingUpSputumImpactPercentage() {
        return coughingUpSputumImpactPercentage;
    }

    public static float getDiarrheaImpactPercentage() {
        return diarrheaImpactPercentage;
    }

    public static float getFetigueImpactPercentage() {
        return fetigueImpactPercentage;
    }

    public static float getFeverDegreeImpactPercentage() {
        return feverDegreeImpactPercentage;
    }

    public static float getGenderImpactPercentage() {
        return genderImpactPercentage;
    }

    public static float getHeadacheImpactPercentage() {
        return headacheImpactPercentage;
    }

    public static float getNationalityImpactPercentage() {
        return nationalityImpactPercentage;
    }

    public static float getNauseaOrVomitingImpactPercentage() {
        return nauseaOrVomitingImpactPercentage;
    }

    public static float getShortnessOfBreathImpactPercentage() {
        return shortnessOfBreathImpactPercentage;
    }

    public static float getSpecialDiseasesImpactPercentage() {
        return specialDiseasesImpactPercentage;
    }

    public static float getSoreThroatImpactPercentage() {
        return soreThroatImpactPercentage;
    }

    public static float getStuffyNoseImpactPercentage() {
        return stuffyNoseImpactPercentage;
    }

    public static Country.countryList[] getDangerCountry() {
        return dangerCountry;
    }

    public static float getSumImpactPercentage() {
        return sumImpactPercentage;
    }
}
