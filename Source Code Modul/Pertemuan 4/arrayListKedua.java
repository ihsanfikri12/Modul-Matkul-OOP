class arrayListKedua {

    public static void main(String args[]) {
        
        String[][] hero = {
            {"deku", "bakugo", "todoroki"},
            {"naruto","sasuke","sakura"},
            {"itadori","fushiguro","kugisaki"}
        };

        for (int i=0; i<3; i++) {
            for (int j=0; j<hero[i].length; j++) {
                System.out.print(hero[i][j]+"-");
            }

            System.out.println("");
        }
    }
}