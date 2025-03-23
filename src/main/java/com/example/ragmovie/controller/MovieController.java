package com.example.ragmovie.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    private final VectorStore vectorStore;
    private final ChatClient chatClient;

    public MovieController(VectorStore vectorStore, ChatClient.Builder chatClient) {
        this.vectorStore = vectorStore;
        this.chatClient = chatClient.build();
    }

    @GetMapping("/movie")
    public String getRecommendationForm() {
        return "movieRAG";
    }
}
