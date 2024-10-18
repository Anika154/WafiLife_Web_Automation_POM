package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidCredentials")
    public static Object invalidCredentialsDataset(){
        Object [][] dataset = {
                {"orin@gmail.com","","Error: The password field is empty."},
                {"","123456","Error: ইউজার নাম প্রয়োজন"},
                {"","","Error: ইউজার নাম প্রয়োজন"},
                {"email","password","Error: The password you entered for the username email is incorrect. Lost your password?"},
                {"orin@gmail.com","password","Error: The password you entered for the email address orin@gmail.com is incorrect. Lost your password?"}
        };
        return dataset;

    }
}
