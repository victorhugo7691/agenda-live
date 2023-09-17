package com.spring.agendalive.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.agendalive.document.LiveDocument;

@Service
public class LiveResultService {

    public List<LiveDocument> findAll() {

        return this.criarDocumentos(10);
    }

    public LiveDocument findByID(String id) {
        LiveDocument live = new LiveDocument();

        if (!id.equals("1")) {
            return null;
        }

        if (id == "previous") {
            live.setId("1");
            live.setChannelName("Canalzinho");
            live.setLiveDate(LocalDateTime.now());
            live.setLiveLink("www.youtube.com");
            live.setLiveName("Youtube");
            live.setRegistrationDate(LocalDateTime.now());
        }

        return live;
    }

    List<LiveDocument> criarDocumentos(int quantidade) {
        int i = 0;

        List<LiveDocument> documentos = new ArrayList<>();

        while (i < quantidade) {
            LiveDocument live = new LiveDocument();
            live.setId("1");
            live.setChannelName("Canalzinho");
            live.setLiveDate(LocalDateTime.now());
            live.setLiveLink("www.youtube.com");
            live.setLiveName("Youtube");
            live.setRegistrationDate(LocalDateTime.now());

            documentos.add(live);
            i++;
        }

        return documentos;
    }

}
