package cn.lbc.error;

/**
 * 时间
 *
 * @date 2020/9/23 21:29
 */
public class Exceptions extends Exception {
    public String ex;

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public Exceptions(String ex){
        super();
        this.ex=ex;
    }
    public Exceptions(){
        super();
    }
}
