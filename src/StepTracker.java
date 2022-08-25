public class StepTracker {

    MonthData[] monthToData;
    int goalStepsPerDay = 10000;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void addNumberStepsPerDay (int mounth, int day, int stepsPerDay) {
        monthToData[mounth].days[day] = stepsPerDay;


    }
    static double convectorKcal (int sum) {
        double stepsKcal = 0;
        stepsKcal = sum * 0.005;
        return stepsKcal;
    }

    static double convectorDistants (int sum) {
        double stepsDistants = 0;
        stepsDistants = sum * 0.00075;
        return stepsDistants;
    }

    public void findBestSerias (int statsMounth) {
        int m = statsMounth;
        int serial = 0;
        int findSerial = 0;
        for ( int i=0 ; i < monthToData[m].days.length; i++) {

            if ( monthToData[m].days[i] >= goalStepsPerDay ) {

                findSerial++ ;

                if (serial < findSerial) {

                    serial = findSerial;

                }
            } else findSerial = 0;

        }
        System.out.println("Лучшая серия в этом месяце: " + serial);
    }


    class MonthData {

        int[] days = new int[30] ;

    }

    public void printStats (int statsMounth) {
        int mon = statsMounth;
        int sum = 0;
        for ( int i = 0; i<monthToData[mon].days.length; i++ ) {
            sum+=monthToData[mon].days[i];
        }
        System.out.println("Сумма пройденых шагов: " + sum);
        System.out.println("Пройдено километров: " + convectorDistants(sum) + "км.");
        System.out.println("Колорий сожжено: " + convectorKcal(sum) + " килоколорий.");
        for (int i = 0; i < monthToData[mon].days.length; i++) {
            System.out.println( "День " + i + ". Шаги: " + monthToData[mon].days[i] );

        }
    }
}
