package DesignPattern.StructuralDesignPattern.CompositPattern;

import java.util.ArrayList;
import java.util.List;

class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("File : " + name);
    }
}
      class Folder {
          private String name;

          private List<File> fileList = new ArrayList<>();

          public Folder(String name) {
              this.name = name;
          }

          public void addFile(File file) {
              fileList.add(file);
          }

          public void showDetails() {
              System.out.println("Folder : " + name);

              for (File f : fileList) {
                  f.showDetails();
              }
          }
      }


public class WithoutCompositePattern {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        File file1 = new File("file12.txt");
        Folder folder= new Folder("Documents");
        folder.addFile(file);
        folder.addFile(file1);
        folder.showDetails();


    }
}
