public class DepartmentHead extends Worker{

    public DepartmentHead(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(100000, 120000);
        hasJob = false;
    }

    @Override
    public String toString() {
        return "Руководитель";
    }
}