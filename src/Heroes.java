public class Heroes {

        public class Hero {
            private int health;
            private int damage;
            private String superpower;
            public Hero(int health, int damage, String superpower){
                this.damage = damage;
                this.health = health;
                this.superpower = superpower;
            }
            // Конструктор с созданием только здоровья и урона
            public Hero(int health, int damage){
                this.damage = damage;
                this.health = health;
                this.superpower = "нет суперспособностей";
            }

            public int getHealth(){
                return health;
            }
            public int getDamage(){
                return damage;
            }
            public String getSuperpower(){
                return superpower;
            }



        }
}
