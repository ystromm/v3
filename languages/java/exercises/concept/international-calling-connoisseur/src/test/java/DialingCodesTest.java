import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.assertj.core.api.Assertions.*;

public class DialingCodesTest {
    @Test
    public void empty_dictionary_is_empty() {
        var emptyDict = DialingCodes.getEmptyMap();
        assertThat(emptyDict).isEmpty();
    }

    @Test
    @Ignore("Remove to run test")
    public void existing_dictionary_count_is_3() {
        var prePopulated = DialingCodes.getExistingMap();
        assertThat(prePopulated).hasSize(3);
    }

    @Test
    @Ignore("Remove to run test")
    public void existing_dictionary_1_is_United_States_of_America() {
        var prePopulated = DialingCodes.getExistingMap();
        assertThat(prePopulated).contains(entry(1, "United States of America"));
    }

    @Test
    @Ignore("Remove to run test")
    public void existing_dictionary_55_is_Brazil() {
        var prePopulated = DialingCodes.getExistingMap();
        assertThat(prePopulated).contains(entry(55, "Brazil"));
    }

    @Test
    @Ignore("Remove to run test")
    public void existing_dictionary_91_is_India() {
        var prePopulated = DialingCodes.getExistingMap();
        assertThat(prePopulated).contains(entry(91, "India"));
    }

    @Test
    @Ignore("Remove to run test")
    public void add_country_to_empty_dictionary_single() {
        var countryCodes = DialingCodes.addCountryToEmptyMap(44, "United Kingdom");
        assertThat(countryCodes).hasSize(1);
    }

    @Test
    @Ignore("Remove to run test")
    public void add_country_to_empty_dictionary_44_is_United_Kingdom() {
        var countryCodes = DialingCodes.addCountryToEmptyMap(44, "United Kingdom");
        assertThat(countryCodes).contains(entry(44, "United Kingdom"));
    }

    @Test
    @Ignore("Remove to run test")
    public void add_country_to_existing_dictionary_count_is_1() {
        var countryCodes = DialingCodes.addCountryToExistingMap(
                DialingCodes.getExistingMap(), 44, "United Kingdom");
        assertThat(countryCodes).hasSize(4);
    }

    @Test
    @Ignore("Remove to run test")
    public void add_country_to_existing_dictionary_1_is_United_States_of_America() {
        var countryCodes = DialingCodes.addCountryToExistingMap(
                DialingCodes.getExistingMap(), 44, "United Kingdom");
        assertThat(countryCodes).contains(entry(1, "United States of America"));
    }

    @Test
    @Ignore("Remove to run test")
    public void add_country_to_existing_dictionary_44_is_United_Kingdom() {
        var countryCodes = DialingCodes.addCountryToExistingMap(
                DialingCodes.getExistingMap(), 44, "United Kingdom");
        assertThat(countryCodes).contains(entry(44, "United Kingdom"));
    }

    @Test
    @Ignore("Remove to run test")
    public void add_country_to_existing_dictionary_55_is_Brazil() {
        var countryCodes = DialingCodes.addCountryToExistingMap(
                DialingCodes.getExistingMap(), 44, "United Kingdom");
        assertThat(countryCodes).contains(entry(55, "Brazil"));
    }

    @Test
    @Ignore("Remove to run test")
    public void add_country_to_existing_dictionary_91_is_India() {
        var countryCodes = DialingCodes.addCountryToExistingMap(
                DialingCodes.getExistingMap(), 44, "United Kingdom");
        assertThat(countryCodes).contains(entry(91, "India"));
    }

    @Test
    @Ignore("Remove to run test")
    public void get_country_name_from_dictionary() {
        var countryName = DialingCodes.getCountryNameFromMap(
                DialingCodes.getExistingMap(), 55);
        assertThat(countryName).isEqualTo("Brazil");
    }

    @Test
    @Ignore("Remove to run test")
    public void get_country_name_for_non_existent_country() {
        var countryName = DialingCodes.getCountryNameFromMap(
                DialingCodes.getExistingMap(), 999);
        assertThat(countryName).isEmpty();
    }

    @Test
    @Ignore("Remove to run test")
    public void Check_country_exists() {
        var exists = DialingCodes.checkCodeExists(
                DialingCodes.getExistingMap(), 55);
        assertThat(exists).isTrue();
    }

    @Test
    @Ignore("Remove to run test")
    public void Check_country_exists_for_non_existent_country() {
        var exists = DialingCodes.checkCodeExists(
                DialingCodes.getExistingMap(), 999);
        assertThat(exists).isFalse();
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_count_is_3() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 1, "les États-Unis");
        assertThat(countryCodes).hasSize(3);
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_1_is_les_Etats_Unis() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 1, "les États-Unis");
        assertThat(countryCodes).contains(entry(1, "les États-Unis"));
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_55_is_Brazil() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 1, "les États-Unis");
        assertThat(countryCodes).contains(entry(55, "Brazil"));
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_91_is_India() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 1, "les États-Unis");
        assertThat(countryCodes).contains(entry(91, "India"));
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_for_non_existent_country_count_is_3() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 999, "Newlands");
        assertThat(countryCodes).hasSize(3);
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_for_non_existent_country_1_is_United_States_of_America() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 999, "Newlands");
        assertThat(countryCodes).contains(entry(1, "United States of America"));
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_for_non_existent_country_55_is_Brazil() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 999, "Newlands");
        assertThat(countryCodes).contains(entry(55, "Brazil"));
    }

    @Test
    @Ignore("Remove to run test")
    public void update_country_name_in_dictionary_for_non_existent_country_91_is_India() {
        var countryCodes = DialingCodes.updateMap(
                DialingCodes.getExistingMap(), 999, "Newlands");
        assertThat(countryCodes).contains(entry(91, "India"));
    }

    @Test
    @Ignore("Remove to run test")
    public void remove_country_from_dictionary_count_is_2() {
        var countryCodes = DialingCodes.removeCountryFromMap(
                DialingCodes.getExistingMap(), 91);
        assertThat(countryCodes).hasSize(2);
    }

    @Test
    @Ignore("Remove to run test")
    public void remove_country_from_dictionary_1_is_United_States_of_America() {
        var countryCodes = DialingCodes.removeCountryFromMap(
                DialingCodes.getExistingMap(), 91);
        assertThat(countryCodes).contains(entry(1, "United States of America"));
    }

    @Test
    @Ignore("Remove to run test")
    public void remove_country_from_dictionary_55_is_Brazil() {
        var countryCodes = DialingCodes.removeCountryFromMap(
                DialingCodes.getExistingMap(), 91);
        assertThat(countryCodes).contains(entry(55, "Brazil"));
    }

    @Test
    @Ignore("Remove to run test")
    public void remove_country_from_dictionary_for_non_existent_country_count_is_3() {
        var countryCodes = DialingCodes.removeCountryFromMap(
                DialingCodes.getExistingMap(), 999);
        assertThat(countryCodes).hasSize(3);
    }

    @Test
    @Ignore("Remove to run test")
    public void remove_country_from_dictionary_for_non_existent_country_1_is_United_States_of_America() {
        var countryCodes = DialingCodes.removeCountryFromMap(
                DialingCodes.getExistingMap(), 999);
        assertThat(countryCodes).contains(entry(1, "United States of America"));
    }

    @Test
    @Ignore("Remove to run test")
    public void remove_country_from_dictionary_for_non_existent_country_55_is_Brazil() {
        var countryCodes = DialingCodes.removeCountryFromMap(
                DialingCodes.getExistingMap(), 999);
        assertThat(countryCodes).contains(entry(55, "Brazil"));
    }

    @Test
    @Ignore("Remove to run test")
    public void remove_country_from_dictionary_for_non_existent_country_91_is_India() {
        var countryCodes = DialingCodes.removeCountryFromMap(
                DialingCodes.getExistingMap(), 999);
        assertThat(countryCodes).contains(entry(91, "India"));
    }

    @Test
    @Ignore("Remove to run test")
    public void Longest_country_name() {
        var longestCountryName = DialingCodes.findLongestCountryName(
                DialingCodes.getExistingMap());
        assertThat(longestCountryName).isEqualTo("United States of America");
    }

    @Test
    @Ignore("Remove to run test")
    public void longest_country_name_for_empty_dictionary() {
        var longestCountryName = DialingCodes.findLongestCountryName(
                DialingCodes.getEmptyMap());
        assertThat(longestCountryName).isEmpty();
    }
}
