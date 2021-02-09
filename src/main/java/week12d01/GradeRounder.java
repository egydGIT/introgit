/*
Mai junior feladat:
Készíts egy GradeRounder osztályt, amiben van egy int[] grades roundGrades(int[] grades) metódus.
A grades tömb pontszámokat tartalmaz 0 és 100 között. A feladat az, hogy kerekítsük a benne lévő számokat a
következő szabály szerint: Ha a pontszám és az 5 következő többszöröse közötti különbség kisebb, mint 3,
akkor kerekítsük fel a számot az 5 következő többszörösére. Fontos: a 40 pont alatti pontszámok elégtelenek,
ezeket egyáltalán nem kell kerekíteni. Példa: a pontszám 84. 85 - 84 kevesebb mint 3, így felfelé kerekítünk.
 */

package week12d01;

import java.util.Arrays;

public class GradeRounder {

    // konzultáció solution
    int[] roundGrades(int[] grades) {
        // ha a következő 5-tel osztható szám és a vizsgált szám különbsége kisebb, mint 3 -> akkor felfele kerekít
        for ( int i = 0; i < grades.length; i++ ) {  // végigiterál a grade tömbön
            if ( grades[i] > 40 ) {                  // ha grade[i] nagyobb, mint 40, csak akkor kerekít
                // melyik a következő 5-tel osztható szám az adott számhoz képest
                int floor = grades[i] / 5;           // adott számot osztjuk 5-tel -> eredmény egész része kell
                int next = (floor + 1) * 5;          // (egész rész + 1) * 5 = következő 5-tel osztható szám
                if (next - grades[i] < 3 ) {         // (ha a köv 5-tel oszt.szám) - (adott szám) < 3
                    grades[i] = next;                // akkor az adott számot  a köv.5-tel osztható számra cseréljük
                }
            }
        }
        return grades;
    }



    public int[] fillGrades() {
        int[] grades = new int[100];
        for (int i = 0; i < grades.length; i++){
            grades[i] = i + 1;
        }
        return grades;
    }

    public int gradesRoundGrades(int[] grades, int actualGrade) {
        int roundedGrade = actualGrade;
        if (actualGrade < 40) {
            // System.out.println("Failed");
            return roundedGrade = 0;
        }
        if (actualGrade % 5 == 4 ) {
            roundedGrade += 1;
        }
        if (actualGrade % 5 == 3 ) {
            roundedGrade += 2;
        }
        if (actualGrade % 5 == 2 ) {
            roundedGrade -= 2;
        }
        if (actualGrade % 5 == 1 ) {
            roundedGrade -= 1;
        }
        return roundedGrade;
    }

    public int[] gradesRoundGradesArray(int[] grades) {
        int[] roundedGrade = grades;
        for (int i = 0; i <= roundedGrade.length-1; i++) {
            if ((roundedGrade[i]+1) <= 40) {
                roundedGrade[i] = 0;
            }
            if ((roundedGrade[i]+1) % 5 == 4 ) {
                roundedGrade[i] = roundedGrade[i]+1 + 1;
            }
            if ((roundedGrade[i]+1) % 5 == 3 ) {
                roundedGrade[i] = roundedGrade[i]+1 + 2;
            }
            if ((roundedGrade[i]+1) % 5 == 2 ) {
                roundedGrade[i] = roundedGrade[i]+1 - 2;
            }
            if ((roundedGrade[i]+1) % 5 == 1 ) {
                roundedGrade[i] = roundedGrade[i]+1 - 1;
            }
            if ((roundedGrade[i]+1) % 5 == 0 ) {
                roundedGrade[i] = roundedGrade[i]+1;
            }
        }
        return roundedGrade;
    }

    public int[] gradesRoundGradesMath(int[] grades) {
        int[] roundedGrade = grades;
        for (int i = 0; i <= roundedGrade.length-1; i++) {
            if ((roundedGrade[i]) <= 40) {
                roundedGrade[i] = 0;
            }
            else Math.round(roundedGrade[i]);
        }
        return roundedGrade;
    }


    public static void main(String[] args) {
        GradeRounder gradeRounder = new GradeRounder();

//        int [] grades = gradeRounder.fillGrades();
//        System.out.println(Arrays.toString(grades));
//
//        System.out.println(gradeRounder.gradesRoundGrades(grades, 85));
//        System.out.println(gradeRounder.gradesRoundGrades(grades, 84));
//        System.out.println(gradeRounder.gradesRoundGrades(grades, 82));
//        System.out.println(gradeRounder.gradesRoundGrades(grades, 22));
//
//        System.out.println(Arrays.toString(gradeRounder.gradesRoundGradesArray(grades)));
//
//        System.out.println(Arrays.toString(gradeRounder.gradesRoundGradesMath(grades)));

        System.out.println(Arrays.toString(gradeRounder.roundGrades(new int[] {84})));  // [85]
        System.out.println(Arrays.toString(gradeRounder.roundGrades(new int[] {83})));  // [85]
        System.out.println(Arrays.toString(gradeRounder.roundGrades(new int[] {82})));  // [82]
        System.out.println(Arrays.toString(gradeRounder.roundGrades(new int[] {81})));  // [81]
        System.out.println(Arrays.toString(gradeRounder.roundGrades(new int[] {39})));  // [39]

    }
}
