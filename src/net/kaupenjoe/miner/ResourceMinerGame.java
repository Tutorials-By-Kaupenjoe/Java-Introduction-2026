package net.kaupenjoe.miner;

import java.util.Scanner;

public class ResourceMinerGame {
    private static int score = 0;

    public static void startGame() {
        Block blockToMine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Resource Miner!");

        while(true) {
            blockToMine = Blocks.getRandomBlock();
            System.out.println("In front of you, you find a " + blockToMine.getName() + " Block.");
            System.out.println("Chose your Tool: Pickaxe ("
                    + Tools.PICKAXE.getDurability() + "), " + "Axe ("
                    + Tools.AXE.getDurability() + "), " + "Shovel ("
                    + Tools.SHOVEL.getDurability() + "), " + "Sword ("
                    + Tools.SWORD.getDurability() + ")");

            Tool tool = getTool(scanner.next());

            if(blockToMine.isCorrectTool(tool)) {
                tool.damageTool();
                System.out.println("Block was mined correctly, and a " + blockToMine.getDrop().getName() + " dropped.");
                score++;
            } else {
                tool.damageTool(10);
            }

            if(tool.getDurability() <= 0) {
                break;
            }
        }

        System.out.println("You correctly mined " + score + " blocks.");
    }

    private static Tool getTool(String input) {
        return switch (input) {
            case "Pickaxe" -> Tools.PICKAXE;
            case "Axe" -> Tools.AXE;
            case "Shovel" -> Tools.SHOVEL;
            case "Sword" -> Tools.SWORD;
            default -> throw new IllegalStateException("Unexpected Value: " + input);
        };
    }
}
