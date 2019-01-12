package com.blogspot.huyhungdinh.builder;

public class Run {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Vegan meal");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\nNon-vegan meal");
		nonVegMeal.showItems();
		System.out.println("Total cost: " + nonVegMeal.getCost());
	}
}
