package base_module.HOME_WORK_3_PART_1.Task6;

public class AmazingString {
    private char[] arr;

    AmazingString(String str) {
        this.arr = str.toCharArray();
    }

    AmazingString(char[] arr) {
        this.arr = arr;
    }

    public char[] getArr() {
        return arr;
    }

    public char findSymbol(int index) {
        if (lengthAmazingString() == 0) {
            return '/';
        } else {
            return arr[index];
        }
    }

    public int lengthAmazingString() {
        int count = 0;
        for (int e : arr) {
            count++;
        }
        return count;
    }

    public int lengthAmazingString(char[] mas) {
        int count = 0;
        for (int e : mas) {
            count++;
        }
        return count;
    }

    public void printAmazingString() {
        System.out.println(arr);
    }

    public boolean isFindSubstring(char[] mas) {
        int count = 0;
        for (int i = 0; i < lengthAmazingString(); i++) {
            if (count < lengthAmazingString(mas) && arr[i] == mas[count]) {
                count++;
            } else {
                if (count == lengthAmazingString(mas)) {
                    return true;
                }
                i = i - count;
                count = 0;
            }
        }
        return count == lengthAmazingString(mas);
    }

    public boolean isFindSubstring(String str) {
        char[] mas = str.toCharArray();
        return isFindSubstring(mas);
    }

    public void deleteSpace() {

        int count = 0;
        for (int i = 0; i < lengthAmazingString(); i++) {
            if (arr[i] == ' ') {
                count++;
            }
        }
        char[] newArr = new char[lengthAmazingString() - count];
        int j = 0;
        for (int i = 0; i < lengthAmazingString(); i++) {
            if (arr[i] != ' ') {
                newArr[j] = arr[i];
                j++;
            }
        }
        arr = newArr;
    }

    public void reversStr() {
        char[] temp = new char[lengthAmazingString()];
        int count = 1;
        for (int i = 0; i < lengthAmazingString(); i++) {
            temp[i] = arr[lengthAmazingString() - count];
            count++;
        }
        arr = temp;
    }
}
