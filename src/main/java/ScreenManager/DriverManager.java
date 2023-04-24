package ScreenManager;


import org.openqa.selenium.WebDriver;


public abstract class DriverManager {


    protected static WebDriver driver;
    // before start play screens setup
    protected String PATH = "C:\\ChromeDriver\\chromedriver.exe";
    protected String FIREFOX_PATH = "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe";

    protected GameEndingScreen gameEndingScreen = new GameEndingScreen(driver);
    protected IntroScreen      introScreen      = new IntroScreen(null);
    protected FinalScreen      finalScreen      = new FinalScreen(driver);
    protected QuizFailScreen   quizFailScreen = new QuizFailScreen(driver);

    protected QuestionScreen      [ ]  questionScreen       = new QuestionScreen[3];
    protected AnswerScreen        [ ]  answerScreen         = new AnswerScreen[3];
    protected GamePlayAnswerScreen[ ]  gamePlayAnswerScreen = new GamePlayAnswerScreen[3];

}
