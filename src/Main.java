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
        int year = 2018;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0) ){
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
        int  monthNumber = 12;
        switch (monthNumber){
            case 1 :
                System.out.println("Январь, принаддежит сезону зима");
                break;
            case 2 :
                System.out.println("Февраль, принадлежит сезону зима");
                break;
            case 3 :
                System.out.println("Март, приинадлежит сезону весна");
                break;
            case 4 :
                System.out.println("Апрель, принадлежит сезону весна");
                break;
            case 5:
                System.out.println("Май, принадлежит сезону весна");
                break;
            case 6:
                System.out.println("Июнь, принадлежит сезону лето");
                break;
            case 7:
                System.out.println("Июль, принадлежит сезону лето");
               break;
            case 8:
                System.out.println("Август, принадлежит сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь, принадлежит сезону осень");
                break;
            case 10:
                System.out.println("Октябрь, принадлежит сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь, принадлежит сезону осень");
                break;
            case 12:
                System.out.println("Декабрь, принадлежит сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}