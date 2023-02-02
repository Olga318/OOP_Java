package com.seminar_4;


class Main4 {

    public static <U> void addHome(U u, java.util.List<Home<U>> homes) {
        Home<U> home = new Home<>();
        home.setInhabitant(u);
        homes.add(home);
    }

    public static <U> void outputHomes(java.util.List<Home<U>> homes) {
        int counter = 1;
        for (Home<U> home : homes) {
            U homeInhabitant = home.getInhabitant();
            System.out.println("Дом №" + counter + " проживает "
                    + homeInhabitant.toString());
            counter++;
        }
    }

    public static void main(String[] args) {

        java.util.ArrayList<Home<FamilyPetr>> listOfFamilyPetrHomes
                = new java.util.ArrayList<>();
        Main4.<FamilyPetr>addHome(new FamilyPetr("Иван"), listOfFamilyPetrHomes);
        Main4.addHome(new FamilyPetr("Свекровь"), listOfFamilyPetrHomes);
        Main4.addHome(new FamilyPetr("Племянник"), listOfFamilyPetrHomes);
        Main4.outputHomes(listOfFamilyPetrHomes);
    }

}










