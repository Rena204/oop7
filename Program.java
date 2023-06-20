import java.util.Random;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        jobAgency.registerObserver(new Master("Леонов", "курьер"));
        jobAgency.registerObserver(new Master("Смирнова", "Frontend-программист"));
        jobAgency.registerObserver(new Student("Комаров", "дизайнер"));
        jobAgency.registerObserver(new DepartmentHead("Кузнецова", "Java-программист"));
        jobAgency.registerObserver(new Student("Некрасов", "учитель"));
        jobAgency.registerObserver(new DepartmentHead("Носов", "продавец"));

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee(VacancyType.Teacher, randomSalary(70000, 100000));
            google.needEmployee(VacancyType.JavaProgrammer, randomSalary(160000, 200000));
            google.needEmployee(VacancyType.Frontend, randomSalary(100000, 104000));
            yandex.needEmployee(VacancyType.Courier, randomSalary(30000, 50000));
            yandex.needEmployee(VacancyType.Seller, randomSalary(100000, 130000));

        }
    }

    static double randomSalary(double min, double max){
        Random random = new Random();
        return random.nextDouble(min, max);
    }

}
