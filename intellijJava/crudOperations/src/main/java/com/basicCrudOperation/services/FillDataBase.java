package com.basicCrudOperation.services;

import com.basicCrudOperation.dao.models.Url;
import com.basicCrudOperation.dao.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.basicCrudOperation.services.fileInput.FileInput.fileInput;
import static com.basicCrudOperation.services.fileInput.FileInput.scan;

@Service
public class FillDataBase {
    @Autowired
    UrlRepository urlRepository;

    public void fill() {
        fileInput();
        while(scan.hasNextLine()) {
            String urlStr = scan.nextLine();
            try {
                Url url = new Url();
                url.setUrl(urlStr);
                urlRepository.save(url);
            }
            catch (Exception e) {}

        }

    }
}
