package bankAccountApp;

public interface IRate {
    default double getBaseRate(){
        return 2.5;
    }
}
