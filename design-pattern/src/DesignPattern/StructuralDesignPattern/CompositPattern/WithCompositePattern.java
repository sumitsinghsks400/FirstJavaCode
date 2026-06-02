package DesignPattern.StructuralDesignPattern.CompositPattern;

import java.util.ArrayList;
import java.util.List;

class File1  implements FileSystemComponent {
    String name;

    public File1(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("File : " + name);
    }


}
class Folder1 implements  FileSystemComponent {
    private String name;

    private List<FileSystemComponent> fileList = new ArrayList<>();

    public Folder1(String name) {
        this.name = name;
    }

    public void addFile(FileSystemComponent file) {
        fileList.add(file);

    }

        public void showDetails () {
            System.out.println("Folder : " + name);

            for (FileSystemComponent f : fileList) {
                f.showDetails();
            }
        }



}
 interface  FileSystemComponent {
    void showDetails();
 }
public class WithCompositePattern {
    public static void main(String[] args) {
  FileSystemComponent fileSystemComponent = new File1("File1.txt");
  FileSystemComponent fileSystemComponent1 = new File1("File2.txt");
  Folder1 folder1= new Folder1("Documn");

        folder1.addFile(fileSystemComponent);
        folder1.addFile(fileSystemComponent1);

 Folder1 folder2 = new Folder1("Sub Folder");
 FileSystemComponent fileSystemComponent2 = new File1("file2s.txt");
        folder2.addFile(fileSystemComponent2);
        folder1.showDetails();


    }
}
