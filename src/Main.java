interface Marvel {
    default void ironman() {

    }

    class Fight implements Marvel {
        void fight() {
            System.out.print("FIGHT IRONMAN");

        }
    }

    class War {
        public static void main(String arg[]) {
            Fight t = new Fight();
            t.fight();
        }
    }
}

