
import java.nio.file.Path;

public class VideoPipelineFacade {

    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        SharpenAdapter sharp = new SharpenAdapter();

        // decode
        Frame[] frames = dec.decode(src);

        // optional grayscale
        if (gray) {
            frames = fe.grayscale(frames);
        }

        // optional scale
        if (scale != null) {
            frames = fe.scale(frames, scale);
        }

        // optional sharpen
        if (sharpenStrength != null) {
            frames = sharp.sharpen(frames, sharpenStrength);
        }

        // encode
        return enc.encode(frames, out);
    }
}
