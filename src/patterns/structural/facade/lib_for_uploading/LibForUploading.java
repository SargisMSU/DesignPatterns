package patterns.structural.facade.lib_for_uploading;

public class LibForUploading {
    private VideoType videoType;

    public LibForUploading(VideoType videoType) {
        this.videoType = videoType;
        System.out.println("new LibForUploading()");
    }

    public void upload(){
        System.out.println("uploading!");
    }
}
