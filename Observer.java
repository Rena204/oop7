public interface Observer {

    void receiveOffer(String companyName, double salary, String vacancy);

    boolean takeJob (String vacancy);

    String getVacancyName();

}