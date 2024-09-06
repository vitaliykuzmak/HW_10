public class Main {

    public static void main(String[] args) {
        PhoneValidator phoneValidator = new PhoneValidator();
        TxtToJsonConverter txtToJsonConverter = new TxtToJsonConverter();
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();



        //Валідація телефонних номерів
        System.out.println("Valid phone numbers:");
        phoneValidator.validatePhoneNumbers("file.txt");

        //Перетворення з TXT в JSON
        System.out.println("\nConverting TXT to JSON...");
        txtToJsonConverter.convertTxtToJson("file.txt", "user.json");

        //Підрахунок частоти слів
        System.out.println("\nWord frequency count:");
        wordFrequencyCounter.countWordFrequency("words.txt");
    }
}
