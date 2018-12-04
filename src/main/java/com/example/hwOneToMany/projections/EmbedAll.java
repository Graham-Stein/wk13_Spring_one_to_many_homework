package com.example.hwOneToMany.projections;


import com.example.hwOneToMany.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedAll", types = File.class)
public interface EmbedAll {
    String getName();
    String getExtension();
    int getSize();
}
