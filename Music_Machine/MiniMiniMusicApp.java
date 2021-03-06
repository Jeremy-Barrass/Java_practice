import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {

        MiniMiniMusicApp mini = new MiniMiniMusicApp();

        mini.play();

    }

    public void play() {

        try {

            Sequencer player = MidiSystem.getSequencer();

            //System.out.println("We have a Sequencer");

            player.open();

            //System.out.println("The player is open");

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            //System.out.println("We have a Sequence");

            Track track = seq.createTrack();

            //System.out.println("We have a track");

            ShortMessage a = new ShortMessage();

            //System.out.println("We have a Midi Message");

            a.setMessage(144, 1, 44, 100);

            //System.out.println("The message is set");

            MidiEvent noteOn = new MidiEvent(a, 1);

            //System.out.println("We have a Midi Event");

            track.add(noteOn);

            //System.out.println("The Event is on the Track");

            ShortMessage b = new ShortMessage();

            //System.out.println("We have a Midi Message");

            b.setMessage(128, 1, 44, 100);

            //System.out.println("The message is set");

            MidiEvent noteOff = new MidiEvent(b, 16);

            //System.out.println("We have a Midi Event");

            track.add(noteOff);

            //System.out.println("The Event is on the Track");

            player.setSequence(seq);

            //System.out.println("The Sequence is set");

            player.start();

            //System.out.println("The player is started");

            while(player.getTickLength() > player.getTickPosition()) { }

            player.close();

            //System.out.println("The player is closed");

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

}
