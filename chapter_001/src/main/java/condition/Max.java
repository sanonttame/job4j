package condition;
/**
 * Максимальное значение 2х чисел..
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class Max {
    public int max(int first, int second) {

        return first > second ? first : second;
    }
    public int max(int first, int second, int third) {

    return ((first > second) && (first > third)) ? first : (((second > first) && (second > third)) ? second : third);
    }
}

