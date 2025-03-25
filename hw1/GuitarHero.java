import synthesizer.GuitarString;

public class GuitarHero {
    private static final double CONCERT_A = 440.0;
    private static final String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";

    public static void main(String[] args) {
        /* create two guitar strings, for concert A and C */
        synthesizer.GuitarString[] Strings=new synthesizer.GuitarString[37];
        for(int i=0;i<37;i++){
            Strings[i]=new synthesizer.GuitarString(CONCERT_A * Math.pow(2, i/ 12.0));
        }

        while (true) {

            /* check if the user has typed a key; if so, process it */
            if (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();
                int index=keyboard.indexOf(key);
                if(index!=-1) Strings[index].pluck();
            }

            /* compute the superposition of samples */
            double sample=0;
            for(int i=0;i<37;i++){
                sample+=Strings[i].sample();
            }

            /* play the sample on standard audio */
            StdAudio.play(sample);

            /* advance the simulation of each guitar string by one step */
            for(int i=0;i<37;i++){
                Strings[i].tic();
            }
        }
    }
}
