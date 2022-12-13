// Программа для рассчета количества пробелов в введенной строке
class SymbolSize {
	public static void main(String args[]) throws java.io.IOException {
		int symbolCount = 0;
		char text;
		do {
			System.out.print("Введите текст (завершение ввода - '.'): ");
			text = (char) System.in.read();
			System.out.println();
			// System.out.println("--" + text + "--");
			if(text >= 'a' & text <= 'z' ) {
				text -= 32;
				System.out.print(text);
				symbolCount++;
			}
			else if(text >= 'A'& text <= 'Z' ) {
				text += 32;
				System.out.print(text);
				symbolCount++;
			}
			else if(text == '.') break;
			else
				System.out.print(text);
			// if(text == ' ') symbolCount++;
			do {
				text = (char) System.in.read();
				// System.out.println("**" + text + "**");
				if(text >= 'a' & text <= 'z' ) {
					text -= 32;
					System.out.print(text);
					symbolCount++;
				}
				else if(text >= 'A'& text <= 'Z' ) {
					text += 32;
					System.out.print(text);
					symbolCount++;
				}
				else if(text == '.') break;
				else
					System.out.print(text);
			// if(text == ' ') symbolCount++;			
			} while(text != '\n');
		} while(text != '.');
		System.out.print("\nКоличество измененных букв в введенном тексте составляет: " + symbolCount + ".");
	}
}