import java.util.*;

public class Solution {

    // 트리를 구성하는 노드 클래스입니다.
    public static class Node {
        private int data;
        private Node left;
        private Node right;

        /* 생성자 */
        public Node(int data) {
            this.setData(data);
            setLeft(null);
            setRight(null);
        }

        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    //이진 탐색 트리의 클래스입니다.
    public static class binarySearchTree {
        public Node root;

        public binarySearchTree(){
            root = null;
        }

        // tree에 value를 추가합니다.
        public void insert(int data) {
            Node newNode = new Node(data); // 왼쪽, 오른쪽 자식 노드가 null 이며 data 의 값이 저장된 새 노드 생성
            if (root == null) {// 루트 노드가 없을때, 즉 트리가 비어있는 상태일 때,
                root = newNode;
                return;
            }
            if(root.data == newNode.data) return;   //중복일때 정지

            Node currentNode = root;
            Node parentNode = null;

            while (true) {
                parentNode = currentNode;

                if (data < currentNode.getData()) { // 해당 노드보다 작을 경우
                    currentNode = currentNode.getLeft();
                    if (currentNode == null) {
                        parentNode.setLeft(newNode);
                        return;
                    }else if(currentNode.data == newNode.data) return;
                } else { // 해당 노드보다 클 경우
                    currentNode = currentNode.getRight();
                    if (currentNode == null) {
                        parentNode.setRight(newNode);
                        return;
                    }else if(currentNode.data == newNode.data) return;
                }
            }
        }

        // tree의 value값을 탐색합니다.
        public boolean contains(int data) {
            Node currentNode = root;
            while (currentNode != null) {
                // 찾는 value값이 노드의 value와 일치한다면, true를 리턴합니다.
                if (currentNode.data == data) {
                    return true;
                }

                if (currentNode.data > data) {
                    // 찾는 value값이 노드의 value 보다 작다면, 현재 노드를 left로 변경후 다시 반복합니다.
                    currentNode = currentNode.left;
                }else {
                    // 찾는 value값이 노드의 value 보다 크다면, 현재 노드를 right로 변경후 다시 반복합니다.
                    currentNode = currentNode.right;
                }
            }
            return false;
        }

  /*
	트리의 순회에 대해 구현을 합니다.
  지금 만드려고 하는 이 순회 메서드는 단지 순회만 하는 것이 아닌, 함수를 매개변수로 받아 콜백 함수에 값을 적용시킨 것을 순회해야 합니다.
  전위 순회를 통해 어떻게 탐색하는지 이해를 한다면 중위와 후위 순회는 쉽게 다가올 것입니다.
	*/

        // 이진 탐색 트리를 전위 순회하는 메서드를 만듭니다.
        public ArrayList<Integer> preorderTree(Node root, int depth, ArrayList<Integer> list) {    //전위 순회
            if (root != null) {
                list.add(root.getData());
                preorderTree(root.getLeft(), depth + 1, list);
                preorderTree(root.getRight(), depth + 1, list);
            }
            return list;
        }

        public ArrayList<Integer> inorderTree(Node root, int depth, ArrayList<Integer> list) { //중위 순회
            //TODO: 전위 순회를 바탕으로 중위 순회를 구현하세요.
            if (root != null) {
                list.add(root.getData());
            }
            return list;
        }

        public ArrayList<Integer> postorderTree(Node root, int depth, ArrayList<Integer> list) {   //후위 순회
            //TODO: 전위 순회를 바탕으로 후위 순회를 구현하세요.
            if (root != null) {
                list.add(root.getData());
                postorderTree(root.getRight(), depth + 1, list);
                postorderTree(root.getLeft(), depth + 1, list);
            }
            return list;
        }
    }
//    public static void main(String[] args) {
//        Solution rootNode = new Solution(null);
//        for (int i = 0; i <= 4; i++) {
//            rootNode.addChildNode(new Solution(Integer.toString(i)));
//        }
//        System.out.println(rootNode);
//        System.out.println(rootNode.contains("5"));
//        System.out.println(rootNode.contains("1"));
//    }
//    private String value;
//    private ArrayList<Solution> children;
//
//    public Solution() {	//전달인자가 없을 경우의 생성자
//        this.value = null;
//        this.children = null;
//    }
//    public Solution(String data) {	//전달인자가 존재할 경우의 생성자
//        this.value = data;
//        this.children = null;
//    }
//
//    public void setValue(String data) {
//        this.value = data;
//    }
//
//    public String getValue() {      //현재 노드의 데이터를 반환
//        return value;
//    }
//    public void addChildNode(Solution node) {
//        if (node.getValue() != null) children = new ArrayList<>();
//        children.add(node);
//    }
//    public void removeChildNode(Solution node) {
//        String data = node.getValue();
//
//        if(children != null) {
//            for(int i = 0; i < children.size(); i++) {
//                if(children.get(i).getValue().equals(data)) {
//                    children.remove(i);
//                    return;
//                }
//                if(children.get(i).children != null) children.get(i).removeChildNode(node);
//            }
//        }
//    }
//
//    public ArrayList<Solution> getChildrenNode() {
//        return children;
//    }
//
//    public boolean contains(String data) {      //재귀를 사용하여 값을 검색합니다.
//        if(value.equals(data)) return true;
//
//        if(children != null) {
//            for(int i = 0; i < children.size(); i++) {
//                return children.get(i).contains(String.valueOf(data));
//            }
//        }
//        return false;
//    }
}

//class Solution {
//    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
//        // TODO:
//        // // 큐? 리스트? 배열?
//        // Queue<Integer> documentsQueue = new LinkedList<>();
//        // // 프린터 버퍼 큐
//        // Queue<Integer> bufferQueue = new LinkedList<>();
//
//        // // 버퍼 사이즈만큼 0으로 초기화
//        // for (int i = 0; i < bufferSize; i++) {
//        //   bufferQueue.add(0);
//        // }
//
//        // // documents 저장
//        // for (int i = 0; i < documents.length; i++) {
//        //   documentsQueue.add(documents[i]);
//        // }
//
//        // // 측정할 시간
//        // int result = 0;
//        // // 버퍼에 들어간 문서의 용량
//        // int capacity = 0;
//
//        // while (!bufferQueue.isEmpty() || !documentsQueue.isEmpty()) {
//        //   result += 1;
//        //   // 버퍼에서 빠져나간 만큼 capaciy 빼기
//        //   capacity -= bufferQueue.poll();
//
//        //   // 문서 큐가 비어있으면 continue (시간 증가)
//        //   if (documentsQueue.isEmpty()) {
//        //     continue;
//        //   }
//        //   if (capacity + documentsQueue.peek() <= capacities) {
//        //     capacity += documentsQueue.peek();
//        //     bufferQueue.add(documentsQueue.poll());
//        //   } else {
//        //     bufferQueue.add(0);
//        //   }
//        // }
//        // return result;
//        // bufferSize = 2 capacities = 10 documents = [7, 4, 5, 6]
//        // 1초 : 작업 목록 [7]
//        // 2초 : 현재 작업[7]
//        // 3초 : 인쇄[7], 작업 목록[4]
//        // 4초 : 인쇄[7], 현재 작업[4] 작업 목록[5]
//        // 5초 : 인쇄[7, 4], 현재 작업[5]
//        // 6초 : 인쇄[7, 4, 5] 작업 목록[6]
//        // 7초 : 인쇄[7, 4, 5] 현재 작업[6]
//        // 8초 : 인쇄[7, 4, 5, 6]
////        List<Integer> buffer = new ArrayList<>();
////        int current = 0;
////        int result = 0;
////        int idx = 0;
////
////        while (true) {
////            result += 1;
////
////            if (current != 0) {
////                current = 0;
////                buffer.remove(0);
////            }
////
////            if (current == 0 && !buffer.isEmpty()) {
////                current = buffer.get(0);
////            }
////
////            int sum = 0;
////            if (buffer.size() >= 1) {
////                for (int i = 0; i < buffer.size(); i++) {
////                    sum += buffer.get(i);
////                }
////            }
////            if (idx < documents.length && buffer.size() < bufferSize && capacities - sum > documents[idx]) {
////                buffer.add(documents[idx]);
////                idx += 1;
////            }
////
////            System.out.println("buffer = " + buffer);
////            System.out.println("current = " + current);
////            System.out.println("result = " + result);
////        }
////        return result;
//
////        1. 리스트
////        List<Integer> buffer = new ArrayList<>();
////        // List<String> documentsList = Arrays.asList(documents);
////
////        int current = 0;
////        int result = 0;
////        int idx = 0;
////
////        while (true) {
////            result += 1;
////            if (current != 0) {
////                current = 0;
////                buffer.remove(0);
////            }
////            if (current == 0 && !buffer.isEmpty()) {
////                current = buffer.get(0);
////            }
////
////            int sum = 0;
////            if (buffer.size() >= 1) {
////                for (int i = 0; i < buffer.size(); i++) {
////                    sum += buffer.get(i);
////                }
////            }
////
////            if (idx < documents.length && buffer.size() < bufferSize && capacities - sum > documents[idx]) {
////                buffer.add(documents[idx]);
////                idx += 1;
////            }
////
////            if (idx >= documents.length && current == 0 && buffer.isEmpty()) {
////                break;
////            }
////        }
////        return result;
//
////        2. 큐
//        Queue<Integer> buffer = new LinkedList<>(); // 대기중인 애들
//        Queue<Integer> current = new LinkedList<>(); // 현재작업?
//        int result = 0;
//        int idx = 0;
//
//        while (true) {
//            result += 1;
//            // 현재 작업이 있을 때 빼내기
//            if (!current.isEmpty()) {
//                current.poll();
//            }
//            // 현재 작업이 비어 있고, 버퍼에 문서가 올라와 있다면
//            // 현재 작업에 한 칸 이동
//            if (current.isEmpty() && !buffer.isEmpty()) {
//                current.add(buffer.poll());
//            }
//            // 현재 버퍼 문서 용량의 합
//            int sumBuffer = buffer.stream()
//                    .mapToInt(i -> i)
//                    .sum();
//            int sumCurrent = current.stream()
//                    .mapToInt(i -> i)
//                    .sum();
//            int sum = sumBuffer + sumCurrent;
//            if (idx < documents.length && buffer.size() + current.size() < bufferSize && (capacities - sum) > documents[idx]) {
//                buffer.add(documents[idx]);
//                idx += 1;
//            }
//            if (idx >= documents.length && current.isEmpty() && buffer.isEmpty()) {
//                break;
//            }
//        }
//
//        return result;
//    }
//    public static void main(String[] args) {
//        int bufferSize = 2;
//        int capacities = 10;
//        int[] documents = new int[]{7, 4, 5, 6};
//        System.out.println(queuePrinter(bufferSize, capacities, documents));
//
//
////        double a = 5;
////        System.out.println(Integer.parseInt());
////        int[] arr = {1, 2, 3, 4};
////
////        Solution solution = new Solution();
////        System.out.println(Arrays.toString(solution.reverseArr(arr)));
////
////    }
////    public int[] reverseArr(int[] arr){
////        // TODO:
////        if (arr.length == 0) {
////            return new int[]{};
////        }
////        // [3]
////        // [3, 2]
////        // [3, 2, 1]
////
////        // 3 + [1, 2]
////        // 2 + [1]
////        // 1 + []
////        // -> [3, 2, 1];
////        int[] tail = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
////        int[] head = Arrays.copyOfRange(arr, 0, arr.length - 1);
////
////        System.out.println(head);
////        return reverseArr(head);
////    }
//
////    public static int paveBox(Integer[] boxes) {
////        // TODO:
////        int result = 1;
////        int check = boxes[0];
////        for (int i = 1; i < boxes.length; i++) {
////            if (check - boxes[i] >= 0) {
////                result += 1;
////                check -= boxes[i];
////            } else {
////                break;
////            }
////        }
////        return result;
//    }
//}