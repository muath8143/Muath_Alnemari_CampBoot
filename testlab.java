import java.util.ArrayList;

public class testlab {
    public static ArrayList<Integer> revers(ArrayList<Integer> search){
        int counter=0;
        int counteroutloop=search.size()-1;

        for (int i=search.size()-1;counteroutloop>=0;){
            System.out.println(i);
            search.add(counter,search.get(i));
            search.remove(i+1);
            System.out.println(counter);
            counter++;
            counteroutloop--;
        }
        return search;
    }
    public static void main(String[] args) {
        ArrayList<Integer>neww=new ArrayList<>();
        //sort normal array--------------------------------------------------
        int wait=0;
        int menu[]={-500, 0, 9999, -1, 450, -3000, 10, 5};
        System.out.println("This is oringal normal array: ");
        for (int m:menu){
            System.out.print(m);
            System.out.print(" ");
        }
        for (int i=0;i<menu.length-1;i++){
            for(int j=0;j<menu.length-1-i;j++){
                if (menu[j]> menu[j+1]){
                    wait=menu[j+1];
                    menu[j+1]=menu[j];
                    menu[j]=wait;

                }
            }
        }

        //sort array list------------------------
        int waitt=0;
        neww.add(-500);
        neww.add(0);
        neww.add(9999);
        neww.add(-1);
        neww.add(450);
        neww.add(-3000);
        neww.add(10);
        neww.add(5);
        System.out.println("");
        System.out.println("==========================================================================================");
        System.out.println("this is orignal array list ");
        System.out.println(neww);
        for(int i=0;i<neww.size()-1;i++){
            for (int j=0;j<neww.size()-1-i;j++){
                if (neww.get(j)> neww.get(j+1)){
                    waitt=neww.get(j+1);
                    neww.set(j+1,neww.get(j));
                    neww.set(j,waitt);
                }
            }
        }
        System.out.println("This is new array list: ");
        System.out.println(neww);
        System.out.println("=========================================================================");
        System.out.println("this is normal array: ");
        for(int m:menu){
            System.out.print(m);
            System.out.print(" ");
        }

    }
}
