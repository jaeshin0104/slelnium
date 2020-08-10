/*
 * (C) Copyright 2017 Boni Garcia (http://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.chicor;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--headless");
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
public class LocalWebDriverTest {

    @Test
    public void GNBTest(ChromeDriver driver) {
        driver.get("https://chicor.com/main");
        driver.manage().window().setSize(new Dimension(1516, 737));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("BEST")).click();
        driver.findElement(By.linkText("BRANDS")).click();
        driver.findElement(By.linkText("STORY")).click();
        driver.findElement(By.linkText("DEAL")).click();
        //driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/nav/div/ul/li[5]/a")).click();
        driver.close();
    }


    @Test
    public void GNBEvent(ChromeDriver driver) {
        driver.get("https://chicor.com/main");
        driver.manage().window().setSize(new Dimension(1516, 737));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("EVENT")).click();
        //driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/nav/div/ul/li[5]/a")).click();
        driver.close();
    }


    @Test
    public void Login(ChromeDriver driver) {
        driver.get("https://chicor.com/main");
        driver.manage().window().setSize(new Dimension(1516, 737));
        {
            WebElement element = driver.findElement(By.cssSelector(".menu-item:nth-child(4) .gra-text"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("로그인")).click();
        {
            WebElement element = driver.findElement(By.linkText("로그인"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("lginId")).click();
        driver.findElement(By.id("lginId")).sendKeys("820104");
        driver.findElement(By.id("lginPw")).click();
        driver.findElement(By.id("lginPw")).sendKeys("2359145js>");
        driver.findElement(By.cssSelector(".btn-login > .btn")).click();
        driver.close();
    }


	  @Test
	  public void goodslist2(ChromeDriver driver) {
	    driver.get("https://chicor.com/main");
	    driver.manage().window().setSize(new Dimension(1934, 909));
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
        driver.findElement(By.linkText("닫기")).click();
	    driver.findElement(By.cssSelector(".menu-item:nth-child(1) .gra-text")).click();
	    driver.findElement(By.linkText("페이셜케어")).click();
	    //js.executeScript("window.scrollTo(0,102)");
	    driver.findElement(By.linkText("스킨/토너")).click();
	    {
	      WebElement element = driver.findElement(By.linkText("스킨/토너"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("로션")).click();
	    {
	      WebElement element = driver.findElement(By.linkText("에센스/세럼"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.linkText("에센스/세럼")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("크림/젤/밤")).click();
	    driver.findElement(By.linkText("아이케어")).click();
	    driver.findElement(By.linkText("오일")).click();
	    driver.findElement(By.linkText("미스트")).click();
	    driver.findElement(By.linkText("세트")).click();
	    driver.close();
	  }
	
}
