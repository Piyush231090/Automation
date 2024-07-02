from selenium import webdriver
from selenium.webdriver.chrome.service import Service as ChromeService
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

options = webdriver.ChromeOptions()
options.add_experimental_option("detach", True)


driver = webdriver.Chrome(options=options)
driver.maximize_window()


#driver = webdriver.Chrome("C:\\drivers_automation\\Drivers\\chromedriver-win64\\chromedriver.exe")

driver.get("https://www.saucedemo.com/")

driver.find_element(By.NAME,'user-name').send_keys("standard_user")
driver.find_element(By.NAME,'password').send_keys("secret_sauce")


driver.find_element(By.NAME,"login-button").click()
act_title=driver.title
expected_title = "Swag Labs"

if act_title == expected_title:
    print("Login test passed")
else:
    print("Login test failed")



#driver.find_element("password").send_keys("admin123")
#driver.find_element("submit").click()