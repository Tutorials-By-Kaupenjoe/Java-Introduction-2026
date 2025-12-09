import net.kaupenjoe.Difficulty;
import net.kaupenjoe.ToolMaterial;

public class Main {
    public static void main(String[] args) {
        /* Enums & Advanced Enums */

        Difficulty gameDifficulty = Difficulty.MEDIUM;
        System.out.println("Difficulty is " + gameDifficulty);


        ToolMaterial toolMaterial1 = ToolMaterial.STONE;
        ToolMaterial toolMaterial2 = ToolMaterial.DIAMOND;

        toolMaterial1.useTool();
        toolMaterial1.mine();

        toolMaterial2.useTool();
        toolMaterial2.mine();
    }
}