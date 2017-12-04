import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
    }

    public void addAnswer(String word) {
        this.answers.add(word);
    }

    public int getWordCount() {
        return this.answers.size();
    }

    public String getAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public void removeAnswer(String answer) {
        this.answers.remove(answer);
    }

}
