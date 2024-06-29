package week01.test;

public class Main {
    public static void main(String[] args) {
        // 입력 예시
        int[] arr = {6, 3, 7, 2, 9, 1};

        // 정렬 수행
        quickSort(arr, 0, arr.length - 1);

        // 결과 출력
        System.out.println("정렬된 배열:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // 분할 후 좌우 부분 배열을 재귀적으로 정렬
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같은 경우
            if (arr[j] <= pivot) {
                i++;

                // arr[i]와 arr[j]를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // arr[i+1]와 arr[high] (또는 피벗)을 교환
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
