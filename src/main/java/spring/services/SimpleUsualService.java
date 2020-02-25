package spring.services;

public class SimpleUsualService implements UsualService {
    @Override
    public String getUsual() {
        return "I'll have whatever the special is today.";
    }
}
