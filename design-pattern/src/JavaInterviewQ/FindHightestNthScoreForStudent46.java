package JavaInterviewQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHightestNthScoreForStudent46 {
    public static void main(String[] args) {
//33.	Find Top N Highest Scoring Students
//Question: From a list of students, find the top 3 by score.
   Student list= Arrays.asList(new Student("sumit",6),new Student("namit",9),new Student("raj",4),new Student("mohan",9))
        .stream().sorted(Comparator.comparing(Student::getScore).reversed()).skip(1).findFirst().orElseThrow();

       System.out.println(list.toString());

       Arrays.asList(new Student("sumit",6),new Student("namit",9),new Student("raj",4),new Student("mohan",9))
                .stream().sorted(Comparator.comparing(Student::getScore).reversed()).limit(3).map(a->a.getName()).forEach(System.out::println);
    }
}
  class Student {
    private String name;
    private int score;

      public Student(String name, int score) {
          this.name = name;
          this.score = score;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getScore() {
          return score;
      }

      public void setScore(int score) {
          this.score = score;
      }

      @Override
      public String toString() {
          return "Student{" +
                  "name='" + name + '\'' +
                  ", score=" + score +
                  '}';
      }
  }