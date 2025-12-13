package onlineMeeting.abstractExamples;

public abstract class Engine {

   protected String name;
   protected String description;

    public Engine(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void startEngine();

    void stopEngine(String name) {
        System.out.println("Engine stopped " +  name);
    }



}
