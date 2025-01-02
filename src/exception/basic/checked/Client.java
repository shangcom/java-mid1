package exception.basic.checked;

/*
throw : 새로운 예외를 발생시킬 때 사용하는 키워드.
throrws : 발생한 예외를 메서드 밖으로 던질 때 사용하는 키워드.
 */
public class Client {

    public void call() throws MyCheckedException {

        // 문제 상황
        throw new MyCheckedException("ex");
    }
}
