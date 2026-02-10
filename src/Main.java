
String name;
int age;
String email;
String address;
String phoneNumber;
double height;
int weight;
LocalDate birthDay;

void main(String[] args) {
    printMenu();
    setName();
    setAge();
    setEmail();
    setAddress();
    setPhoneNumber();
    setHeight();
    setWeight();
    setBirthDay();
    printProfile();
    IO.println("Afsluiten. Tot ziens!");
}

void printMenu() {
    IO.println("======================================");
    IO.println("Welkom bij de profiel app");
    IO.println("Deze app zal het volgende uitvoeren:");
    IO.println(" 1  - Vul naam in");
    IO.println(" 2  - Vul leeftijd in");
    IO.println(" 3  - Vul e-mail in");
    IO.println(" 4  - vul adres in");
    IO.println(" 5  - Vul telefoonnummer in");
    IO.println(" 6  - Vul lengte in (cm)");
    IO.println(" 7  - Vul gewicht in (kg)");
    IO.println(" 8  - Vul verjaardag in");
    IO.println(" 9  - Toon profiel");

}

void printProfile() {
    IO.println();
    IO.println("----- PROFIEL -----");
    IO.println("Naam: " + name);
    IO.println("Leeftijd " + age);
    IO.println("Email: " + email);
    IO.println("Adres: " + address);
    IO.println("Telefoonnummer: " + phoneNumber);
    IO.println("lengte: " + height);
    IO.println("gewicht: " + weight);
    IO.println("birthday: " + birthDay);





//        Roep de calculateBMI() methode aan.
    IO.println("-------------------");
}

void setName() {
    IO.print("Voer je volledige naam in: ");
    String input = IO.readln().trim();
    name = input;
    IO.println("Naam opgeslagen: " + name);
}

void setAge(){
    IO.println("Vul hier je leeftijd in: ");
    age = Integer.parseInt(IO.readln());
    IO.println("Leeftijd opgeslagen: " + age);
}

void setEmail(){
    IO.println("Vul hier je e-mail in: ");
    email = IO.readln();
    IO.println("Email opgeslagen: " + email);
}

void setAddress(){
    IO.println("Vul hier je adres in: ");
    address = IO.readln();
    IO.println("Adres opgeslagen: " + address);
}

void setPhoneNumber(){
    IO.println("Vul hier je telefoonnummer in: ");
    phoneNumber = IO.readln();
    IO.println("Telefoonnummer opgeslagen: " + phoneNumber);
}

void setHeight(){
    IO.println("Vul hier je lengte in (cm): ");
    height = Double.parseDouble(IO.readln());
    IO.println("Lengte opgeslagen: " + height);
}

void setWeight(){
    IO.println("Vul hier je gewicht in (kg): ");
    weight = Integer.parseInt(IO.readln());
    IO.println("Gewicht opgeslagen: " + weight);
}

void setBirthDay(){
    IO.println("Voer het jaar van je geboortedag in: ");
    int day = Integer.parseInt(IO.readln());
    IO.println("Voer de maand van je geboortedag in: ");
    int month = Integer.parseInt(IO.readln());
    IO.println("Voer het dag van je geboortedag in: ");
    int year = Integer.parseInt(IO.readln());
    birthDay = LocalDate.of(day, month, year);
    IO.println("Verjaardag opgeslagen: " + birthDay);
}














