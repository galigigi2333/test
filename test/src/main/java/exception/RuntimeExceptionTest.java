package exception;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RuntimeExceptionTest{

    public static void main(String[] args) {
        RuntimeExceptionTest test = new RuntimeExceptionTest();
        try {
            //捕获可能出现的异常
            double result = test.div(1, 0);
            System.out.println(result);
        }catch (RuntimeException e){
            //处理异常 打印在控制台
            log.error(e.getMessage());
        }
    }
    public double div(int a ,int b){
        //在除的计算当中 可能会出现异常
        try {
            return a/b;
        }catch (RuntimeException e){
            //自定义异常处理 抛出异常

            throw new MyException("除数不能为0"+":    "+e);
        }

    }
}
