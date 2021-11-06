package stepdefinitions.homework;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class DataTablesStepDefs {

    DataTablesPage dataTablesPage =new DataTablesPage();

    @Given("user is on the datatables page")
    public void user_is_on_the_datatables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));
    }

    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablesPage.newButton.click();

    }
// COMMENTING OUT CAUSE THIS IS HARD CODED THAT IS NOT RELATED TO SCENARIO OUTLINE, EXCEL, DATATABLES
//    @When("user enters the firstname")
//    public void user_enters_the_firstname() {
//        dataTablesPage.firstName.sendKeys("Jonny");
//    }
//    @When("user enters the lastname")
//    public void user_enters_the_lastname() {
//        dataTablesPage.lastName.sendKeys("Walker");
//    }
//    @When("user enters the position")
//    public void user_enters_the_position() {
//        dataTablesPage.position.sendKeys("Manager");
//    }
//
//    @When("user enters the office")
//    public void user_enters_the_office() {
//        dataTablesPage.office.sendKeys("Toronto");
//
//    }
//
//    @When("user enters the extension")
//    public void user_enters_the_extension() {
//        dataTablesPage.extension.sendKeys("12345");
//
//    }
//
//    @When("user enters the startdate")
//    public void user_enters_the_startdate() {
//        dataTablesPage.startDate.sendKeys("2020-10-04");
//
//    }
//
//    @When("user enters the salary")
//    public void user_enters_the_salary() {
//        dataTablesPage.salary.sendKeys("1000000");
//
//    }
//
//
//    @When("search for the first name")
//    public void search_for_the_first_name() {
//        dataTablesPage.searchBox.sendKeys("Jonny");
//
//    }
//
//    @Then("verify the name fields contains first name")
//    public void verify_the_name_fields_contains_first_name() throws InterruptedException {
//        ReusableMethods.waitFor(3);
//        Assert.assertTrue(dataTablesPage.nameField.getText().contains("Jonny"));
//    }

    //SCENARIO OUTLINE
    @When("user enters the firstname {string}")
    public void user_enters_the_firstname(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);

    }

    @When("user enters the lastname {string}")
    public void user_enters_the_lastname(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);

    }
    @When("user enters the position {string}")
    public void user_enters_the_position(String position) {
        dataTablesPage.position.sendKeys(position);

    }
    @When("user enters the office {string}")
    public void user_enters_the_office(String office) {
        dataTablesPage.office.sendKeys(office);

    }
    @When("user enters the extension {string}")
    public void user_enters_the_extension(String extension) {
        dataTablesPage.extension.sendKeys(extension);

    }
    @When("user enters the startdate {string}")
    public void user_enters_the_startdate(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);

    }
    @When("user enters the salary {string}")
    public void user_enters_the_salary(String salary) {
        dataTablesPage.salary.sendKeys(salary);

    }
    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablesPage.createButton.click();

    }
    @When("search for the first name {string}")
    public void search_for_the_first_name(String searchBox) {
        dataTablesPage.searchBox.sendKeys(searchBox);

    }
    @Then("verify the name fields contains first name {string}")
    public void verify_the_name_fields_contains_first_name(String firstname) throws InterruptedException {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(dataTablesPage.nameField.getText().contains(firstname));
    }

//    DATA TABLES
@When("user enters all table required fields and verifies the data creation")
public void user_enters_all_table_required_fields_and_verifies_the_data_creation(DataTable dataTable) {
    List<Map<String,String>> requiredFields = dataTable.asMaps(String.class,String.class);
    System.out.println(requiredFields );
    for (Map<String,String> eachField:requiredFields ){
        System.out.println(eachField);
        dataTablesPage.newButton.click();
        dataTablesPage.firstName.sendKeys(eachField.get("firstname"));
        dataTablesPage.lastName.sendKeys(eachField.get("lastname"));
        dataTablesPage.position.sendKeys(eachField.get("position"));
        dataTablesPage.office.sendKeys(eachField.get("office"));
        dataTablesPage.extension.sendKeys(eachField.get("extension"));
        dataTablesPage.startDate.sendKeys(eachField.get("start_date"));
        dataTablesPage.salary.sendKeys(eachField.get("salary"));
        dataTablesPage.createButton.click();
//        dataTablesPage.searchBox.sendKeys(eachField.get("firstname"));
        ReusableMethods.waitFor(1);
        dataTablesPage.searchBox.sendKeys(eachField.get("firstname"));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(dataTablesPage.nameField.getText().contains(eachField.get("firstname")));
        ReusableMethods.waitFor(1);
        //I need to refresh the page cause I need to clear the search box field
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(1);
    }
   }

//   EXCEL
    @Given("user enters all table required fields and verifies the data creation with {string}")
    public void user_enters_all_table_required_fields_and_verifies_the_data_creation_with(String sheetName) {
        ExcelUtil excelUtil=new ExcelUtil("./src/test/resources/testdata/data_tables_workbook.xlsx",sheetName);
        List<Map<String, String>>  testData=excelUtil.getDataList();

            for(Map<String,String> appData : testData ){//eachData represent each username-password pairs
                Driver.getDriver().get("https://editor.datatables.net/");
                dataTablesPage.newButton.click();
                dataTablesPage.firstName.sendKeys(appData.get("firstname"));
                dataTablesPage.lastName.sendKeys(appData.get("lastname"));
                dataTablesPage.position.sendKeys(appData.get("position"));
                dataTablesPage.office.sendKeys(appData.get("office"));
                dataTablesPage.extension.sendKeys(appData.get("extension"));
//                dataTablesPage.startDate.sendKeys(appData.get("startdate"));
                dataTablesPage.startDate.click();
                ReusableMethods.waitFor(1);
                dataTablesPage.day.click();
                dataTablesPage.salary.sendKeys(appData.get("salary"));
                dataTablesPage.createButton.click();
                ReusableMethods.waitFor(1);
                dataTablesPage.searchBox.sendKeys(appData.get("firstname"));
                ReusableMethods.waitFor(1);
                Assert.assertTrue(dataTablesPage.nameField.getText().contains(appData.get("firstname")));
                ReusableMethods.waitFor(1);
            }
        }


}

