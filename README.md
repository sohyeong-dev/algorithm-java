# algorithm-java
알고리즘 연습 with 자바

### 시간 복잡도

1초 = 1억 번의 연산
> - 10!
> - 2^20
> - 1만^2

> logN은 상수 급

---

### 자료구조

```java
import java.util.*;
```

#### 배열

```java
Arrays.toString(배열);  // 1차원 배열의 값들을 출력
Arrays.deepToString(배열);  // 2차원 이상의 배열의 값들을 출력
Arrays.fill(배열, 값);  // 배열의 모든 값을 특정 값으로 변경 (초기화)
Arrays.sort(배열);  // 배열을 오름차순으로 정렬
```

#### 리스트

- ArrayList: 배열
- LinkedList: 이중 연결 리스트(Deque)
```java
// Head
deque.add_front();  // 큐의 앞부분에 삽입
deque.get_front();
deque.delete_front();  // 큐의 앞부분에서 삭제

// Tail
deque.add_rear();  // 큐의 뒷부분에 삽입
deque.get_rear();
deque.delete_rear();  // 큐의 뒷부분에서 삭제
```

#### 스택
Vector

```java
Stack<Integer> stack = new Stack<>();

stack.push();  // 스택에 데이터 삽입
stack.pop();  // 스택의 맨 위 데이터를 제거하고 그 값을 반환
stack.peek();  // 스택의 맨 위에 있는 요소의 값을 반환
stack.isEmpty();  // 스택이 비어 있으면 true, 그렇지 않으면 false
stack.toString();  // 스택에 저장된 값을 문자열로 변환
```
백준) 17608 막대기, 1874 스택 수열, 2493 탑, 17298 오큰수

#### 큐
LinkedList

```java
Queue<Integer> queue = new LinkedList<>();

queue.offer();  // 큐에 데이터를 추가
queue.poll();  // 큐에서 데이터를 삭제
queue.peek();  // 맨 앞의 데이터를 반환
queue.isEmpty();  // 큐가 비어 있으면 true, 그렇지 않으면 false
queue.toString();  // 큐에 저장된 값을 문자열로 변환
```
백준) 2164 카드2, 1158 요세푸스 문제

---

### 알고리즘

#### 구간 합
합 배열을 이용 `S[i] = S[i - 1] + A[i]`

백준) 11659 구간 합 구하기4 (1차원 배열의 구간 합), 11660 구간 합 구하기5 (2차원 배열의 구간 합)

#### 투 포인터
두 개의 포인터를 활용하여 시작 인덱스와 끝 인덱스를 지정

백준) 2018 수들의 합, 12891 DNA 비밀번호

#### 완전 탐색
모든 경우의 수를 탐색하여 정답을 찾는 방법

##### 순열

백준) 9742 순열

##### 조합

백준) 15650 N과M1, 1759 암호 만들기

##### 부분집합

백준) 1182 부분수열의 합, 2961 도영이가 만든 맛있는 음식

##### 이진 트리
1) 배열 `Stack<Integer>` - 1: 루트 노드
2) 배열 - parent[i] = 부모 노드 idx
3) 배열 {left, right}
4) 인접 리스트: 2차원 리스트 `ArrayList<Integer[]>`

##### 그래프
1) 에지 리스트 {출발 노드, 도착 노드, 가중치}
2) 인접 행렬: 2차원 배열
3) 인접 리스트: ArrayList<Integer[]>[]

##### DFS
1) 재귀
2) 스택
  1. 인접 리스트로 연결 표현, 방문 마킹 배열로 중복 방지, 스택으로 다음 탐색 노드 저장
     ```java
     stack.push(start);
     ```
  3. 스택에서 노드를 꺼냄 -> 탐색 순서에 꺼낸 노드를 기록 -> 인접 노드를 스택에 삽입하며 방문 배열 체크
     ```java
     node = stack.pop();
     for (next: list[node]) {
       // 중복 체크
       stack.push(next);
       // 마킹 배열 변경
     }
     ```
  5. 스택 자료구조에 값이 없을 때까지 반복 - 이미 다녀간 노드는 삽입하지 않음

##### BFS
> 가까운 노드를 우선하여 탐색하므로 목표 노드에 도착하는 경로가 여러 개일 때 최단 경로를 보장한다.
1) 큐
