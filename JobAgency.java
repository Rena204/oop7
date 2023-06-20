import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, Vacancy vacancy) {
        String companyVacancy = vacancy.getVacancyName().getVacancy();
        System.out.println("Вакансия " + companyVacancy);
            for (Observer observer: observers) {
                if (vacancy.isRelevance()
                        && companyVacancy.equalsIgnoreCase(observer.getVacancyName())
                    ) {
                    observer.receiveOffer(companyName, vacancy.getMaxSalary(), companyVacancy);
                    if (observer.takeJob(companyVacancy)){
                        removeObserver(observer);
                        break;
                    }
                }
            }
    }

}