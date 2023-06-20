public enum VacancyType {
    JavaProgrammer("Java-программист"),
    Teacher("Учитель"),
    Courier("Курьер"),
    Frontend("Frontend-программист"),
    Seller("Продавец");
   
    private String vacancy;
    VacancyType(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getVacancy() {
        return vacancy;
    }
}