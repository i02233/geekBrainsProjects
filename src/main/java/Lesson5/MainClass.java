package Lesson5;

public class MainClass {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Бил Гейтс", "Генеральный директор", "killBill@microsoft.com", "+77771235468", 650000, 45);
        employeeArray[1] = new Employee("Джон Сноу", "Охранник", "johnSnow@winterfall.com", "+77015533164", 200000, 28);
        employeeArray[2] = new Employee("Вин Дизель", "Водитель-механик", "theFast@theFurious.com", "+77771111111", 500000, 34);
        employeeArray[3] = new Employee("Киану Ривз", "Оператор ЭВМ", "neo@matrix.com", "+77773332211", 800000, 41);
        employeeArray[4] = new Employee("Джеймс Бонд", "Уборщик", "bond@kamesBond.com", "+77770000007", 1000000, 43);

        for  (Employee employee : employeeArray) {
            if(employee.getAge() > 40)
                employee.info();
        }
    }
}
