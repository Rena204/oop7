import java.util.Random;

public abstract class Worker implements Observer{
    protected static Random random = new Random();

    protected String name;

    protected String nameVacancy;

    protected double minSalary;

    protected boolean hasJob;


    public void receiveOffer(String companyName, double salary, String vacancy) {
        if (minSalary <= salary){
            System.out.printf("%s %s (%.2f) >>> Мне нужна эта работа (%s)! [%s - %.2f]\n",
                    this, name, minSalary, vacancy, companyName, salary);
            hasJob = true;
        }
        else {
            System.out.printf("%s %s >>> Я найду работу (%s) получше (%.2f)! [%s - %.2f]\n",
                    this, name, vacancy, minSalary, companyName, salary);
        }
    }

    public boolean takeJob(String vacancy) {
        return hasJob;
    }

    public String getVacancyName() {
        return nameVacancy;
    }
}