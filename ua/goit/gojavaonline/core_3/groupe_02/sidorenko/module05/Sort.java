package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module05;

public class Sort {
    public static void main(String[] args) {

     int [] name = {12, 33, 6, 9, 11, 41, 66};

            for (int i = 0; i < name.length; i++) {

                int min = name[i];
                int min_i = i;
                for (int j = i+1; j < name.length; j++) {

                    if (name[j] < min) {
                        min = name[j];
                        min_i = j;
                    }
                }

                if (i != min_i) {
                    int tmp = name[i];
                    name[i] = name[min_i];
                    name[min_i] = tmp;
                }

                System.out.println(min);
            }
        }
    }

