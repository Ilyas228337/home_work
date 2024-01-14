public class Main {
public static void main(String[] args){
 Main_Boss boss = new Main_Boss();
 boss.setHealth(1000);
 boss.setDamage((int) (boss.getHealth() * 0.15));
 boss.setTypeOfProtection("Физическая защита");

    System.out.println("информация о боссе:");
    System.out.println("Здоровье: " + boss.getHealth());
    System.out.println("Урон: "+ boss.getDamage());
    System.out.println("Тип защиты: "+ boss.getTypeOfProtection());
}
}