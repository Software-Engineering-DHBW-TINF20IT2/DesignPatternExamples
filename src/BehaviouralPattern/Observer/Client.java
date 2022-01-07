package BehaviouralPattern.Observer;

public class Client {



    public static void main(String[] args) {
        // create services list of allowed services
        Service service1 = new EmailService();
        Service service2 = new SmsService();
        Service service3 =  new PhoneService();

        // attach services to notifier using decision engine
        DecisionEngine decisionEngine = new DecisionEngine();
        decisionEngine.registerService(service1);
        decisionEngine.registerService(service2);
        decisionEngine.registerService(service3);

        // create and register some students
        Student student1 = new Student(1, "Max", "Mustermann", "0159 131 76 51", "max.mustermann@gmx.de", "phone");
        Student student2 = new Student(2, "Frieda", "Friedlich", "0162 943 12 12", "f.friedlich@gmail.com", "email");
        Student student3 = new Student(3, "Gustav", "Gans", "0178 745 444 1", "gans@gust.av", "sms");
        Student student4 = new Student(4, "Fridolin", "Fröhlich", "0921 67 60 60", "fridolin@web.de", "sms");
        decisionEngine.registerUser(student1);
        decisionEngine.registerUser(student2);
        decisionEngine.registerUser(student3);
        decisionEngine.registerUser(student4);

        // send message to all students in their preferred way of communication
        decisionEngine.sendMessage("This is a message");

    }

}
