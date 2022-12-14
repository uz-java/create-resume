package com.example.resumecreate.service.file;

import com.example.resumecreate.domains.Picture;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:54 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Service
public interface FileService {
    Picture uploadPicture(MultipartFile picture);
}
