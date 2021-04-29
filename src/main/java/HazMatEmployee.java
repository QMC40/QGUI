public class HazMatEmployee {

    private String supervisor;
    private String name;
    private String hired;
    private String userCertification;
    private String shift;
    private String shop;

    public HazMatEmployee(String supervisor, String name, String hired,
                       String userCertification, String shift, String shop) {
        this.supervisor = supervisor;
        this.name = name;
        this.hired = hired;
        this.userCertification = userCertification;
        this.shift = shift;
        this.shop = shop;
    }

    public void createRequest() {}

    public void createTurnIn() {}

    public void createAccRpt() {}

    @Override
    public String toString() {
        return String.format("Supervisor: %s%nName: %s%nHired: %s%nCert expiration: %s%n" +
                        "Shift: %s%nShop: %s",getSupervisor(),getName(),getHired(),
                getUserCertification(),getShift(),getShop());
    }

    //getters and setters
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHired() {
        return hired;
    }

    public void setHired(String hired) {
        this.hired = hired;
    }

    public String getUserCertification() {
        return userCertification;
    }

    public void setUserCertification(String userCertification) {
        this.userCertification = userCertification;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}

class HazMatIssuer extends HazMatEmployee{
    public HazMatIssuer(String supervisor, String name, String hired, String certificationLevel,
                     String userCertification, String shift, String shop) {
        super(supervisor, name, hired, userCertification, shift, shop);
    }

    public void acceptInventory() {}

    public void issueInventory() {}

    public void getAccidentReport() {}
}

class HazMatManager extends HazMatEmployee{

    public HazMatManager(String supervisor, String name, String hired, String certificationLevel,
                      String userCertification, String shift, String shop) {
        super(supervisor, name, hired, userCertification, shift, shop);
    }

    private void createHMEmployee() {}

    private void deleteHMEmployee() {}

    private void updateCertificationDate() {}

    private void closeAccidentReport() {}

    private void grantOverride() {}
}

class HazMatCleaner extends HazMatEmployee{
    public HazMatCleaner(String supervisor, String name, String hired, String certificationLevel,
                      String userCertification, String shift, String shop) {
        super(supervisor, name, hired, userCertification, shift, shop);
    }

    private void requestAccidentReportClose() {}
}
