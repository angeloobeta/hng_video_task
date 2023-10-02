package com.example.hng_video_task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/video")
public class VideoController {
   @GetMapping("/")
    public String homePage(){
       return "Welcome to video transcription services";
   }
}
