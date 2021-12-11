package exercise;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 26.11.2021.
 */
public final class CustomString {

    private final char[] value;
    private int size;

    public CustomString() {
        size = 0;
        value = new char[size];
    }

    public CustomString(CustomString customString) {

        size = 0;
        this.value = customString.value.clone();
    }

    public CustomString(char[] value) {
        if (value == null) {
            this.value = null;
        } else {
            this.size = value.length;
            this.value = new char[size];
            System.arraycopy(value, 0, value, 0, value.length);
        }
    }

    public void printCustomString() {

        for (char ch : value) {
            System.out.print(ch);
        }
        System.out.println();
    }

    /**
     * The method converts different types of values into string
     *
     * @param obj input parameter
     * @return string representation of given obj
     */
    public static CustomString valueOf(Object obj) {

        return (obj == null) ? new CustomString("null".toCharArray()) : new CustomString(obj.toString().toCharArray());
    }

    /**
     * The method returns a characters at a specific index position
     *
     * @param index as a parameter
     * @return a char value at the given index number
     */
    public char charAt(int index) {

        if (index < 0 || index > size) {
            throw new StringIndexOutOfBoundsException(index);
        }

        return value[index];
    }

    /**
     * The method searches the sequence of characters int this string
     *
     * @param ch specific of the characters to be searched
     * @return true if the sequence of char value exits, otherwise false
     */
    public boolean contains(char ch) {

        for (int i = 0; i < size; i++) {
            if (value[i] == ch)
                return true;
        }

        return false;
    }

    /**
     * The method returns the position of the string character
     *
     * @param ch character value
     * @return index of the searched string or character
     */
    public int indexOf(char ch) {
        int index = 0;

        if (index >= size)
            return -1;

        for (int i = index; i < value.length; i++)
            if (value[i] == ch)
                return i;
        return -1;
    }

    /**
     * The method check string is empty or not
     *
     * @return true if the string is empty false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * The method return string length
     *
     * @return the number of characters in the string
     */
    public int length() {
        return value.length;
    }

    /**
     * The method returns a part of the string
     *
     * @param index number start position
     * @return specified string from index to string length
     */
    public CustomString substring(int index) {
        if (index < 0) {
            throw new StringIndexOutOfBoundsException(index);
        }

        int subLength = value.length - index;

        if (subLength < 0) {
            throw new StringIndexOutOfBoundsException(subLength);
        }

        char[] chars = new char[subLength];
        int j = 0;
        for (int i = index; i < value.length; i++)
            chars[j++] = value[i];

        return new CustomString(chars);
    }

    /**
     * The overloaded method substring(int index) returns a part of the string
     *
     * @param beginIndex number start position is inclusive
     * @param endIndex   number end position is exclusive
     * @return specified string from beginIndex to endIndex
     */
    public CustomString substring(int beginIndex, int endIndex) {

        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }

        if (endIndex < 0) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }

        int subLength = endIndex - beginIndex;

        if (subLength < 0) {
            throw new StringIndexOutOfBoundsException(subLength);
        }

        char[] chars = new char[subLength];
        int j = 0;
        for (int i = beginIndex; i < endIndex; i++)
            chars[j++] = value[i];

        return new CustomString(chars);
    }
}