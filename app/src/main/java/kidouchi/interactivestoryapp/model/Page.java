package kidouchi.interactivestoryapp.model;

/**
 * Created by iuy407 on 8/3/15.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int id, String text, Choice c1, Choice c2) {
        this.mImageId = id;
        this.mText = text;
        this.mChoice1 = c1;
        this.mChoice2 = c2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageId, String text) {
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;

    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int id) {
        mImageId = id;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
