package com.designpatterns.structural.bridge;

/**
 * @author Ravi Panchal
 */
public class Netflix extends Video{

    public Netflix(VideoPlayer videoPlayer){
        super(videoPlayer);
    }

    @Override
    public void processVideo(String videoFile) {
        videoPlayer.play(videoFile);
    }
}
