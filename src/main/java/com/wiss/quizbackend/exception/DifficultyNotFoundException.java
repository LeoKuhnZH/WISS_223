package com.wiss.quizbackend.exception;

public class DifficultyNotFoundException extends RuntimeException {

    private final String diffculty;

    public DifficultyNotFoundException(String diffculty) {
        super("Diffculty '" + diffculty + "' not found");
        this.diffculty = diffculty;
    }

    public String getDifficulty() {
        return diffculty;
    }
}
