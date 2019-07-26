package patterns.structural.facade;

import patterns.structural.facade.lib_for_converting.Converter;
import patterns.structural.facade.lib_for_converting.ConvertingAlgorithm;
import patterns.structural.facade.lib_for_uploading.LibForUploading;
import patterns.structural.facade.lib_for_uploading.VideoType;

public class UploadFacade {

    public static void upload(String fileName){
        ConvertingAlgorithm convertingAlgorithm = new ConvertingAlgorithm();
        Converter converter = new Converter(fileName, convertingAlgorithm);
        converter.convert();

        VideoType videoType = new VideoType(fileName.substring(fileName.indexOf(".") + 1));
        LibForUploading libForUploading = new LibForUploading(videoType);
        libForUploading.upload();
    }

    public static void main(String[] args) {
        upload("video.wav");
    }

}
