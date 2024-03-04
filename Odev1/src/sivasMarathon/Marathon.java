package sivasMarathon;

public class Marathon {

    private final String[] name;

    private final int[] time;

    public Marathon(int[] time, String[] name) {
        this.time = time;
        this.name = name;
    }

    public void Siralama(){
        System.out.println("Birinci: " + name[getFirst()] + "  " + time[getFirst()]);
        System.out.println("İkinci: " + name[getSecond()] + "  " + time[getSecond()]);
        System.out.println("Üçüncü: " + name[getThird()] + "  " + time[getThird()]);
    }

    public int getFirst(){
        int firstPerson = 0, first = time[0]*10;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < first) {
                first = time[i];
                firstPerson = i;

            }
        }
        return firstPerson;
    }

    public int getSecond() {
        int secondPerson = 0, second = time[0] * 10;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < second) {
                if (i != getFirst()) {
                    second = time[i];
                    secondPerson = i;

                }
            }
        }
        return secondPerson;
    }
    public int getThird() {
        int thirdPerson = 0, third = time[0] * 10;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < third) {
                if (i!=getFirst() && i!=getSecond()) {
                    third = time[i];
                    thirdPerson = i;

                }
            }
        }
        return thirdPerson;
    }
    public void Istatistik(){
        int a = 0,b = 0,c = 0;
        for (int times : time){
            if (times>=200 && times<=299){
                a++;
            }
            else if (times>=300 && times<=399){
                b++;
            }
            else{
                c++;
            }
        }
        System.out.println("A -> " + a);
        System.out.println("B -> " + b);
        System.out.println("C -> " + c);
    }
}





