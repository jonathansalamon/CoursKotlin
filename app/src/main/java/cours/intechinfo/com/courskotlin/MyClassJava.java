package cours.intechinfo.com.courskotlin;

import org.jetbrains.annotations.NotNull;

public class MyClassJava implements IPerson {
    @NotNull
    @Override
    public Status getStatus() {
        return Status.PREMIUM;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }
}
