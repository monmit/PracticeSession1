public class CalculateSalary {
    private int BaseSalary;
    private int ExtraHours;

    public CalculateSalary(int BaseSalary, int ExtraHours) {
        setBaseSalary(BaseSalary);
        setExtraHours(ExtraHours);
    }

    public int calculateSalary(int HourlyRate){
        int totalSalary = getBaseSalary() + (getExtraHours() *HourlyRate);
        return totalSalary;
    }

    private int getExtraHours() {
        return ExtraHours;
    }

    public void setExtraHours(int X) {
        if (ExtraHours <= 0)
            throw new IllegalArgumentException("enter positive values");
            ExtraHours = X;
    }

    private int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int y) {
        BaseSalary = y;
    }
}

//public int CalculateMethod2(int BaseSalary, int ExtraHours, int HourlyRate){
//int result2 = BaseSalary+(ExtraHours*HourlyRate);
//return result2;
//}
// The variable in this have scope only within this method ! So either we provide their values by creating object in Main method (No conditions can be applied though).
// OR we can get their values from another method. For this, We need to make methods eg. here Getter/Setter!
//Eg public void setMethod(int a);
//Value = a; Now in this also, 'a' has scope only in setMethod. It is being used to give out a value ! Basically this is the value that we will provide to our variable!
// So this variable just need to be defined in the class. That's it!
//
//Now one more twist is : When we create object of this class, we will pass values (arguments) in the object itself! These values will be taken by our parameters in CalculateMethod2.
//the values will further be passed on to the methods (using these variables).
//Methods carrying these values will have (type same as we want these values to be stored in).
// then this method will pass these values out to a variable !that just needs to be defined in the class. Or we can say this is how we give value to a variable.
// if this variable be used anywhere it will have that value we just defined above.
// and we all this value defining by Main method !
