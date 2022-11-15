package Java;

public class Count {
    private long line=0;
    private long character=0;


    public long getLine() {
        return line;
    }

    public long getCharacter() {
        return character;
    }

    public boolean count(String str) {

        if(str.contains("stop")||str.equals("stop")){
            return false;
        } else if (str.equals("stop")) {
            return  false;
        }
        this.line++;
        this.character+=str.length();

        return true;
    }
}
