package com.example.hwOneToMany;

import com.example.hwOneToMany.models.File;
import com.example.hwOneToMany.models.Folder;
import com.example.hwOneToMany.models.User;
import com.example.hwOneToMany.repositories.FileRepository;
import com.example.hwOneToMany.repositories.FolderRepository;
import com.example.hwOneToMany.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HwOneToManyApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
    public void canAddUserToFileToFolder(){
        User user = new User("Fred");
        userRepository.save(user);

        Folder folder = new Folder("Homework", user);
        folderRepository.save(folder);

        File file = new File("Day 2", ".rb", 50, folder);
        fileRepository.save(file);
    }

}
