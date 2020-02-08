package week5.exercise93personageNeterminat;

import java.util.Calendar;

public class Person {
        private String name;
        private MyDate birthday;

        public Person(String name, int pp, int kk, int vv) {
            this.name = name;
            this.birthday = new MyDate(pp, kk, vv);
        }

        public int age() {
            int age=
            // calculate the age based on the birthday and the current day
            // you get the current day as follows:
            Calendar.getInstance().get(Calendar.DATE);
            Calendar.getInstance().get(Calendar.MONTH);
                    //+ 1;
            // January is 0 so we add one
            Calendar.getInstance().get(Calendar.YEAR);
        return 111111;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name +", born "+ this.birthday;
        }

    }

