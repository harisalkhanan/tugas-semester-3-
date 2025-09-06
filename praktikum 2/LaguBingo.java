class LaguBingo {
    private String[] nama = {"B", "I", "N", "G", "O"};

    LaguBingo() {
        tampilkanLagu();
    }

    private void tampilkanLagu() {
        for (int i = 0; i < nama.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < nama.length; k++) {
                    if (k <= i) {
                        System.out.print("(clap)");
                    } else {
                        System.out.print(nama[k]);
                    }
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}

