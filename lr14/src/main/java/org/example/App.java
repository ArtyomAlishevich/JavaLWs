package org.example;

import java.io.*;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        int p = -1;
        while (true) {
            switch (p) {
                case -1: {
                    System.out.println("-1 - Вывод меню\n" +
                            "0 - Выйти из программы\n" +
                            "1 - Задание 1. Создать файл с информацией о своей группе. Вывести данные об этом " +
                            "файле. Вывести информацию из файла.\n" +
                            "2 - Задание 2. Ввести с клавиатуры в файл ‘f’ 10 целых чисел. Затем считать числа, " +
                            "вывести их на экран и определить минимальное значение.\n" +
                            "3 - Задание 3. Создать текстовый файл ‘f’ с целыми случайными числами. Записать " +
                            "в файл ‘g’ все числа, кратные 3, а в файл ‘h’ – все остальные.\n" +
                            "4 - Задание 4. Ввести с клавиатуры в файл 12 вещественных значений влажности " +
                            "воздуха. Считать из файла значения и вывести среднюю влажность.\n" +
                            "5 - Задание 5. Создать текстовый файл ‘f’ с 10 целыми числами. Считать числа и" +
                            "вывести количество отрицательных значений.\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    try (PrintWriter pw = new PrintWriter(new File("T-392.txt"))) {
                        pw.print("Список учебной группы Т-392\n" +
                                "Куратор: Кудласевич Василий Степанович\n" +
                                "№	ФИО\n" +
                                "1	Алишевич Артём Александрович\n" +
                                "2	Азаркевич Никита Сергеевич\n" +
                                "3	Бовбель Владислав Денисович\n" +
                                "4	Богданов Глеб Александрович\n" +
                                "5	Вайтехович Мирослав Викторович\n" +
                                "6	Василенка Алексей Иванович\n" +
                                "7	Грудино Алексей Владимирович\n" +
                                "8	Дащенко Даниил Игоревич\n" +
                                "9	Дедюля Егор Дмитриевич\n" +
                                "10	Жилинский Иван Михайлович\n" +
                                "11	Заяц Елизавета Дмитриевна\n" +
                                "12	Ковальчук Вадим Андреевич\n" +
                                "13	Кожан Елизавета Евгеньевна\n" +
                                "14	Коробейко Макар Сергеевич\n" +
                                "15	Королёв Кирилл Станиславович\n" +
                                "16	Малащенко Антон Максимович\n" +
                                "17	Малькевич Арсений Андреевич\n" +
                                "18	Михалевич Арина Александровна\n" +
                                "19	Попов Артём Сергеевич\n" +
                                "20	Рябов Максим Васильевич\n" +
                                "21	Свиридо Михаил Владимирович\n" +
                                "22	Сериков Егор Александрович\n" +
                                "23	Тимовец Никита Андреевич\n" +
                                "24	Ярошевич Константин Андреевич\n" +
                                "25	Ярошевич Полина Ивановна\n");
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }

                    File file = new File("T-392.txt");

                    if (file.exists()) {
                        System.out.println("Имя файла: " + file.getName());
                        System.out.println("Путь: " + file.getAbsolutePath());
                        System.out.println("Размер (в байтах): " + file.length());
                        System.out.println("Доступен для чтения: " + file.canRead());
                    } else {
                        System.out.println("Файл не существует.");
                    }

                    try (Scanner scanner = new Scanner(new File("T-392.txt"))) {
                        while (scanner.hasNextLine()) {
                            System.out.println(scanner.nextLine());
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 2: {
                    Random r = new Random();
                    try (PrintWriter pw = new PrintWriter(new File("f.txt"))) {
                        for(int i = 0; i < 10; i++)
                            pw.println(r.nextInt(-10, 11));
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    List<Integer> li = new ArrayList<Integer>(10);
                    try (Scanner scanner = new Scanner(new File("f.txt"))) {
                        while (scanner.hasNextInt()) {
                            int currentNumber = scanner.nextInt();
                            li.add(currentNumber);
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    System.out.println("Все числа: " + li);
                    System.out.println("Минимальное значение: " + Collections.min(li));
                    break;
                }
                case 3: {
                    Random r = new Random();
                    try (PrintWriter pw = new PrintWriter(new File("f.txt"))) {
                        for(int i = 0; i < r.nextInt(10, 20); i++)
                            pw.println(r.nextInt(-10, 11));
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    try (Scanner scanner = new Scanner(new File("f.txt"));
                         PrintWriter g = new PrintWriter(new File("g.txt"));
                         PrintWriter h = new PrintWriter(new File("h.txt"))) {
                        while (scanner.hasNextInt()) {
                            int currentNumber = scanner.nextInt();
                            if (currentNumber % 3 == 0) {
                                g.println(currentNumber);
                            }
                            else {
                                h.println(currentNumber);
                            }
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 4: {
                    Random r = new Random();
                    try (PrintWriter pw = new PrintWriter(new File("4.txt"))) {
                        for(int i = 0; i < 12; i++)
                            pw.println(r.nextInt(0, 101) / 100.0);
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    int count = 0;
                    double sum = 0;
                    try (Scanner scanner = new Scanner(new File("4.txt")).useLocale(Locale.US)) {
                        while (scanner.hasNextDouble()) {
                            sum += scanner.nextDouble();
                            count++;
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    System.out.println("Средняя влажность = " + Math.round((sum / count) * 100) / 100.0);
                    break;
                }
                case 5: {
                    Random r = new Random();
                    try (PrintWriter pw = new PrintWriter(new File("f.txt"))) {
                        for(int i = 0; i < 10; i++)
                            pw.println(r.nextInt(-10, 11));
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    int negativeCount = 0;
                    try (Scanner scanner = new Scanner(new File("f.txt"))) {
                        while (scanner.hasNextInt()) {
                            int currentNumber = scanner.nextInt();
                            if (currentNumber < 0) {
                                negativeCount++;
                            }
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    System.out.println("Количество отрицательных чисел: " + negativeCount);
                    break;
                }
                default: {
                    System.out.println("Неизвестный пункт меню. Повторите попытку.");
                    break;
                }
            }
            System.out.print("Введите пункт меню: ");
            p = s.nextInt();
        }
    }
}
