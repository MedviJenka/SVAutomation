package FunctionalityTests;

import ScreenManager. * ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WrongAnswers extends DriverManager {


    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", PATH);
        driver = new ChromeDriver();
        driver.get("https://shemsvcollege.github.io/Trivia/");
        driver.manage().window().maximize();

    }


    @Test(priority=1)
    public void introScreen() {

        introScreen = new IntroScreen(driver);
        introScreen.assertIntroPage();
        // assert you're on the right page
        // check that you're actually on the intro page
        introScreen.clickOnStartButton();

    }


    @Test(priority=2)
    public void firstQuestion() {

        questionScreen[0] = new QuestionScreen(driver);

        // assert you're on the correct page
        questionScreen[0].assertPage("question number: 1");

        // type a question
        questionScreen[0].typeQuestion("Capital of Israel");
        questionScreen[0].clickNextButton();


    }


    @Test(priority=3)
    public void firstAnswer() {

        answerScreen[0] = new AnswerScreen(driver);

        // assert you're on the right screen
        answerScreen[0].assertPage("question number: 1");

        // fill questions

        // parameter 1: field number
        // parameter 2: free text
        answerScreen[0].typeAnswer("1","Haifa");
        answerScreen[0].typeAnswer("2","Jerusalem");
        answerScreen[0].typeAnswer("3","Tel-Aviv");
        answerScreen[0].typeAnswer("4","Eilat");

        answerScreen[0].clickOnRadioButton("2");

        // check radio button
        //answerScreen[0].pressRadioButton1();
        answerScreen[0].clickNextButton();

    }

    @Test(priority=4)
    public void secondQuestion() {

        questionScreen[1] = new QuestionScreen(driver);
        // assert you're on the correct page
        questionScreen[1].assertPage("question number: 2");
        // type a question
        questionScreen[1].typeQuestion("Capital of Russia");
        questionScreen[1].clickNextButton();

    }


    @Test(priority=5)
    public void secondAnswer() {


        answerScreen[1] = new AnswerScreen(driver);

        // assert you're on the correct screen
        answerScreen[1].assertPage("question number: 2");

        answerScreen[1].typeAnswer("1","Moscow");
        answerScreen[1].typeAnswer("2","Valdivostok");
        answerScreen[1].typeAnswer("3","Leningrad");
        answerScreen[1].typeAnswer("4","Sibir");

        // check radio button
        answerScreen[1].clickOnRadioButton("1");
        answerScreen[1].clickNextButton();


    }

    @Test(priority=6)
    public void thirdQuestion() {


        questionScreen[2] = new QuestionScreen(driver);

        // assert you're on the correct page
        questionScreen[2].assertPage("question number: 3");

        // type a question
        questionScreen[2].typeQuestion("Capital of France");
        questionScreen[2].clickNextButton();

    }


    @Test(priority=7)
    public void thirdAnswer() {


        answerScreen[2] = new AnswerScreen(driver);

        // assert you're on the correct screen
        answerScreen[2].assertPage("question number: 3");

        // parameter 1: field number
        // parameter 2: free text
        answerScreen[2].typeAnswer("1","Bonchleur");
        answerScreen[2].typeAnswer("2","Viva");
        answerScreen[2].typeAnswer("3","La Passion");
        answerScreen[2].typeAnswer("4","Paris");


        // check radio button
        answerScreen[2].clickOnRadioButton("4");
        answerScreen[2].clickNextButton();

    }



    @Test(priority=8)
    public void finalScreen() {

        finalScreen = new FinalScreen(driver);

        // assert you're on the right page
        finalScreen.assertPage();
        finalScreen.clickOnPlayButton();

    }



    @Test(priority=9)
    public void gamePlayScreen1()  {

        gamePlayAnswerScreen[0] = new GamePlayAnswerScreen(driver);
        gamePlayAnswerScreen[0].assertPage();
        gamePlayAnswerScreen[0].clickOnRadioButton("3","2");
        gamePlayAnswerScreen[0].clickOnNextButton();

    }

    @Test(priority=9)
    public void gamePlayScreen2()  {

        gamePlayAnswerScreen[1] = new GamePlayAnswerScreen(driver);
        gamePlayAnswerScreen[1].assertPage();
        gamePlayAnswerScreen[1].clickOnRadioButton("2","1");
        gamePlayAnswerScreen[1].clickOnNextButton();

    }

    @Test(priority=9)
    public void gamePlayScreen3()  {

        gamePlayAnswerScreen[2] = new GamePlayAnswerScreen(driver);
        gamePlayAnswerScreen[2].assertPage();
        gamePlayAnswerScreen[2].clickOnRadioButton("1","4");
        gamePlayAnswerScreen[2].clickOnNextButton();

    }

    @Test(priority=10)
    public void gameEndingScreen() {

        QuizFailScreen quizFailScreen = new QuizFailScreen(driver);
        quizFailScreen.assertPage();

    }



    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();
        System.out.println("sanity done");

    }

}
