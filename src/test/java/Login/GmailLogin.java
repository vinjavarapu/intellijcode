package Login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailLogin extends BaseTest {

    @Test
    public void GmailLogin() {

        driver.get("https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?response_type=code&client_id=381852401994-4mmj8pffah6pgmi5hr47tcuqhb0tgbve.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fartemis-staging-51502.firebaseapp.com%2F__%2Fauth%2Fhandler&state=AMbdmDmN92G87xejJ1jkQqwazi1gaeSxqaxko5MSJ1bT2Eqy3GCQRMRCdS_3nQA9NMb2P_3wJo5nDa9T3dpP-VIG5gZZXd79SrK7_GgYdluQNsX7n0_ybB_eAYXj2ApA5U5SuL8gOyG01thKf8kYVsAaQuZ0U_UfCMs0Mb_jyqpXHmFZPqwaciesHSG4omo32i87cjhStrM18AJ1Vyfl-28eHZFdT5oVc8s5EtxfwyciFfwgvif-QpdNfzYPbDKDGOBvpiDeoqUb8t5QY9Q80s4XLyjSZMmTdciJx0aS3mFsG5Cn4eNMpJjQz324OFM1oaSBmt3q0beV7Hu6pBoxxA&scope=openid%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20profile&hl=en-US&context_uri=https%3A%2F%2Faccounts.staging.artemis.im&flowName=GeneralOAuthFlow");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("vinjavarapu@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();


    }
}
