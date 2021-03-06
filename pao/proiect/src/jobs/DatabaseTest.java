package jobs;

import jobs.db.JobDatabase;
import jobs.model.Category;
import jobs.model.Company;
import jobs.model.JobPosting;

import java.util.Date;

public class DatabaseTest {
    private JobDatabase db;

    public DatabaseTest(JobDatabase db) {
        this.db = db;
        MockUtil.fillDatabaseWithMockData(db, 7);
    }

    public void runAllTests() {
        Company megaImage = db.findCompanyByName("Mega Image");
        if (megaImage == null) {
            throw new RuntimeException("Test failed: cannot find previously inserted company");
        }
    }
}
