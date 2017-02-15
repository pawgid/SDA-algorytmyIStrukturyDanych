package algorytmy;


import algorytmy.structures.MyList;

public class Application {
    public static void main(String[] args) {
        MyList myList = initMyList();
        MyList clonedList = myList.clone();
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.add(5);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.delete(3);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.put(0, 4);
        System.out.println(clonedList);
        clonedList.add(0, 1);
        System.out.println(clonedList);


    }

    private static MyList initMyList() {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
        myList.add(-3);
        myList.add(-1);
        myList.add(0);
        myList.add(2);
        myList.add(-1);
        myList.add(-7);
        myList.add(-4);
        myList.add(-2);
        myList.add(-1);
        myList.add(-9);
        myList.add(9);
        return myList;
    }
}
