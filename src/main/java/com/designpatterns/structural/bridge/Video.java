package com.designpatterns.structural.bridge;

/**
 * @author Ravi Panchal
 */
public abstract class Video {

    protected VideoPlayer videoPlayer;

    public Video(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }

    public abstract void processVideo(String videoFile);
}

