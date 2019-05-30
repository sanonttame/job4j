package ru.job4j.tracker;

import java.util.List;

public class ValidateInput extends ConsoleInput {
	public int ask(String question, List<Integer> range) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
			value = super.ask(question, range);
			invalid = false;
			} catch (MenuOutException moe) {
			System.out.println("неправильный код меню.");
			} catch (NumberFormatException nfe) {
			System.out.println("Пожалуйста, повторно введите данные.");
			}
		} while (invalid);
		return value; }
}
