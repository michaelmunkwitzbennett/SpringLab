package spring.beans;

import spring.services.UsualService;

public class Customer implements UsualService {
    private UsualService usualService;

    private String emailAddress;
    private String name;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer() {
        System.out.println("In Customer Constructor");
    }

    public Customer(UsualService usualService) {
        this.usualService = usualService;
    }

    public void setUsualService(UsualService usualService) {
        System.out.println("In Customer setServiceSetter");
        this.usualService = usualService;
    }

    @Override
    public String getUsual() {
        return usualService.getUsual();
    }
}
