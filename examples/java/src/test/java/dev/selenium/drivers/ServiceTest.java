package dev.selenium.drivers;

import dev.selenium.BaseTest;
import java.io.File;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.service.DriverFinder;

public class ServiceTest extends BaseTest {
  
  @Test
  public void defaultService() {
    ChromeDriverService service = new ChromeDriverService.Builder().build();
    driver = new ChromeDriver(service);
  }

  @Test
  public void setDriverLocation() {
    setBinaryPaths();
    ChromeOptions options = getDefaultChromeOptions();
    options.setBinary(browserPath);

    ChromeDriverService service =
        new ChromeDriverService.Builder().usingDriverExecutable(driverPath).build();

    driver = new ChromeDriver(service, options);
  }

  @Test
  public void setPort() {
    ChromeDriverService service = new ChromeDriverService.Builder().usingPort(1234).build();

    driver = new ChromeDriver(service);
  }

  private void setBinaryPaths() {
    ChromeOptions options = getDefaultChromeOptions();
    options.setBrowserVersion("stable");
    DriverFinder finder = new DriverFinder(ChromeDriverService.createDefaultService(), options);
    driverPath = new File(finder.getDriverPath());
    browserPath = new File(finder.getBrowserPath());
  }
}
