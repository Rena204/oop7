public class Vacancy {

    private VacancyType vacancyName;

    private double maxSalary;

    private boolean relevance = true;

    public VacancyType getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(VacancyType vacancyName) {
        this.vacancyName = vacancyName;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public boolean isRelevance() {
        return relevance;
    }

    public void setRelevance(boolean relevance) {
        this.relevance = relevance;
    }

    public Vacancy(VacancyType vacancyName, double maxSalary) {
        this.vacancyName = vacancyName;
        this.maxSalary = maxSalary;
    }

    public Vacancy(VacancyType vacancyName) {
        this.vacancyName = vacancyName;
    }
}