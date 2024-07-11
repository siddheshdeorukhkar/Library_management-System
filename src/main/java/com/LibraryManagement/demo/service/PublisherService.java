package com.LibraryManagement.demo.service;

import com.LibraryManagement.demo.entity.Author;
import com.LibraryManagement.demo.entity.Category;
import com.LibraryManagement.demo.entity.Publisher;
import com.LibraryManagement.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> findAllPublisher(){
        return publisherRepository.findAll();
    }

    public Publisher findPublisherById(Long id){
        Publisher publisher= publisherRepository.findById(id).orElseThrow(()-> new RuntimeException("Publisher Not Found!!!"));
        return publisher;
    }

    public void deletePublisherById(Long id){
        Publisher publisher = publisherRepository.findById(id).orElseThrow(()-> new RuntimeException("Publisher Not found to delete!!"));
        publisherRepository.deleteById(publisher.getId());
    }

    public void createPublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }

    public Publisher updatePublisherById(Long Id, Publisher newPublisher){
        Publisher publisher = publisherRepository.findById(Id).orElseThrow(()-> new RuntimeException("Publisher not found to update"));
        publisher.setName(newPublisher.getName());
        return publisher;
    }

    public void updatePublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }

}
