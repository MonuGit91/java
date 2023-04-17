package com.basicCrudOperation.services;

import com.basicCrudOperation.dao.models.Url;
import com.basicCrudOperation.dao.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.basicCrudOperation.services.fileInput.FileInput.fileInput;
import static com.basicCrudOperation.services.fileInput.FileInput.scan;

@Service
public class CrudService {
    @Autowired
    UrlRepository urlRepository;

    public List<Url> getUrls() {
        List<Url> urls =  urlRepository.findAll();
        System.out.println(urls.toString());
        return urls;
    }
    public List<Url> deleteUrls() {
        urlRepository.deleteAll();
        return null;
    }

    public void fill() {
        fileInput();
        while(scan.hasNextLine()) {
            String urlStr = scan.nextLine();
            try {
                Url url = new Url();
                url.setUrl(urlStr);
                System.out.println(url.toString());
                urlRepository.save(url);
            }
            catch (Exception e) {}
        }

    }

    public List<Url> setUrls() {
        fill();
        return getUrls();
    }
}
