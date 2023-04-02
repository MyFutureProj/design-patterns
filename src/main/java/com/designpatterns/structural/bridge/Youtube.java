package com.designpatterns.structural.bridge;

/**
 * @author Ravi Panchal
 */
public class Youtube extends Video{

    public Youtube(VideoPlayer videoPlayer){
        super(videoPlayer);
    }

    @Override
    public void processVideo(String videoFile) {
        videoPlayer.play(videoFile);
    }
}
