/**
 * @author Tahmidul Islam
 */
public class MixedMessages {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0 ;
        MixedMessages[] mixes = new MixedMessages[20];
        int i = 0;

        while(i<9){
            mixes[i] = new MixedMessages();
            mixes[i].counter = mixes[i].counter + 1;
            count++;
            count = count + mixes[i].mayBeNew(i);
            i = i+1;
        }
        System.out.println(count+" "+mixes[1].counter);
    }

    public int mayBeNew(int index) {
        if(index<5){
            MixedMessages mix = new MixedMessages();
            mix.counter = mix.counter + 1;
            return 1;
        }

        return 0;
    }
}
