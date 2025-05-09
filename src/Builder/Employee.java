package Builder;

public class Employee
{
    private String _name;
    private String _company;
    private boolean _hasCar;
    private boolean _hasBike;

    public Employee(EmployeeBuilder employeeBuilder)
    {
        _name = employeeBuilder._name;
        _company = employeeBuilder._company;
        _hasCar = employeeBuilder._hasCar;
        _hasBike = employeeBuilder._hasBike;
    }

    public String getName()
    {
        return _name;
    }

    public String getCompany()
    {
        return _company;
    }

    public boolean isHasCar()
    {
        return _hasCar;
    }

    public boolean isHasBike()
    {
        return _hasBike;
    }

    public static class EmployeeBuilder
    {
        private String _name;
        private String _company;
        private boolean _hasCar;
        private boolean _hasBike;

        public EmployeeBuilder(String name, String company)
        {
            this._name = name;
            this._company = company;
        }

        public EmployeeBuilder setHasCar(boolean hasCar)
        {
            this._hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike)
        {
            this._hasBike = hasBike;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }
}
