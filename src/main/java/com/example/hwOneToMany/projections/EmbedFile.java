package com.example.hwOneToMany.projections;


import com.example.hwOneToMany.models.File;
import com.example.hwOneToMany.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedFile", types = File.class)
public interface EmbedFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getTitle();

}
