public class Main {
    public static void main(String[] args) {
        int clientOs = 0;
        if (clientOs == 0){
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке. ");
        }
        int os = 1;
        int clientDeviceYear = 2015;
        if (os == 0) {
            if (clientDeviceYear >=2015){
                System.out.println("Установите версию приложения для IOS по ссылке.");
            }else if (os == 0) {
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }

            }
        } else if (os == 1) {
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке. ");
            }else  {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        }
        int year = 2016;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==100) ){
            System.out.println(year + " год весокосный");
        } else {
            System.out.println(year + " год не весокосный");

        }
        int deliveryDistance = 95;
        int day = 1;
        if(deliveryDistance <=20){
            System.out.println("Потребуется дней: " + day  );
        } else if (deliveryDistance > 20 && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: " + (2 * day)  );
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (3 * day) );
        } else {
            System.out.println("Доставки нет");
        }
    }
}