package com.java.collections;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
        Collections.hello();

        List<Object> list = new ArrayList<Object>();

        Set<A> hashSet = new HashSet<A>();
        hashSet.add(new A(1));
        hashSet.add(new A(1));
        hashSet.add(new A(1));

        Map<A, String> map = new HashMap<A, String>();

        A a1 = new A(1);
        A a2 = new A(1);

        map.put(a1, "5");
        map.put(a2, "6");

        System.out.println(map.get(a1));
        System.out.println(map.get(a2));


        //----------------------------------------------------------

        System.out.println();

        A a3 = new A(3);
        A a4 = new A(4);

        Double d1 = new Double(1);

        Integer i1 = new Integer(2);

        Map map2 = new HashMap();
        map2.put("1", a3);
        map2.put(d1, i1);

        System.out.println(((A) map2.get("1")).l);
        System.out.println(map2.get(d1));

        //LinkedHashMap
        //TreeMap
        //HashSet
        //LinkedHashMap
        //TreeSet


    }
}

class A implements B, B.K{
    int l;

    A(){}

    A(int l){
        this.l = l;
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    A a = (A) o;
    //    return l == a.l;
    //}

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public void b() {

    }

    @Override
    public void k() {

    }
}

interface B {
    void b();

    interface K{
        void k();
    }
}

class Collections{
    static void hello(){
        Map set = new Hashtable();
        A a = null;

        set.put(1, null);
    }
}