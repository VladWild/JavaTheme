package runner;

import loggers.Logger;
import other.Client;

//Container - в Spring создает объекты (Beans) классов, которые мы описываем
//Beans - объекты в Spring

//Spring проинджектит нужные зависимости
//Он поймет, что Client и Logger нужно засунуть в App

//Обращаться к контейнеру в основном нужно только в исходной точке программы
//Остальные объекты получат Beans через внедрение зависимостей - xml файл - как вариант



public class App {
    private Client client;
    private Logger logger;

    public App(Client client, Logger logger) {

    }

    private void run(){

    }

    public static void main(String[] args) {
        //App app = new App();
        //app.run();
    }
}

