public class CodingHours {
    public static void main(String[] args) {
        int atandeeCodingHoursPerday = 6; // An average Green Fox attendee codes 6 hours daily
        int oneWeek = 5; // The number of working days per week
        int semesterLenght = 17;// The semester is 17 weeks long

        System.out.println(atandeeCodingHoursPerday * oneWeek * semesterLenght);// Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        int workingHoursPerWeek = 52;// work hours weekly is 52

        int codingHoursPerSemester = atandeeCodingHoursPerday * oneWeek * semesterLenght;

        int workingHoursPerSemester = workingHoursPerWeek * semesterLenght;

        int percentage = codingHoursPerSemester * 100/ workingHoursPerSemester;

        System.out.println(percentage);


    }
}