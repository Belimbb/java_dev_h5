package org.example;

public class Main {
    public static void main(String[] args) {
        // UML diagram link: https://lucid.app/lucidchart/500a5e0f-137f-42bd-9118-6d5e60456ea2/edit?viewport_loc=-687%2C-1587%2C8536%2C3768%2C0_0&invitationId=inv_08c6b658-136a-4e7f-86f9-f5cb1389f050
        IterationSolution iterationSolution = new IterationSolution();
        System.out.println("Iteration Solution = " + iterationSolution.getFibonacci(6));

        RecursionSolution recursionSolution = new RecursionSolution();
        System.out.println("Recursion Solution = " + recursionSolution.getFibonacci(6));

        DynamicProgrammingSolution dps = new DynamicProgrammingSolution();
        System.out.println("Dynamic Programming Solution = " + dps.getFibonacci(6));
    }
}