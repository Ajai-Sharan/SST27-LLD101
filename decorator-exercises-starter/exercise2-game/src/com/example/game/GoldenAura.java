package com.example.game;

public class GoldenAura extends CharacterDecorator {

    public GoldenAura(Character inner) {
        super(inner);
    }

    @Override
    public int getSpeed() {
        return inner.getSpeed() + 2; // small buff
    }

    @Override
    public int getDamage() {
        return inner.getDamage() + 5; // small buff
    }

    @Override
    public String getSprite() {
        return "golden_" + inner.getSprite();
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura Active ✨]");
        System.out.println("Moving at aura speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura Active ✨]");
        System.out.println("Attacking with aura damage " + getDamage() + " using sprite " + getSprite());
    }
}
