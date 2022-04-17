public class Application {
    private Developers developers = new Developers();
    private Testers testers = new Testers();

    public void implement(){
        developers.writeCode();;
       // testers.writeTestCases();
        testers.findbugs();
    }
}
