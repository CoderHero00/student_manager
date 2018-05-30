package com.example.studentmanager;
import com.example.studentmanager.Entity.AttendanceSlot;
import com.example.studentmanager.Entity.DetailAttendance;
import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.channels.MulticastChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private UserModelSlot proModel;
    private UserModelDetail Model;
//Vailible
    @RequestMapping(path = "/attend/classes", method = RequestMethod.GET)
    public String Showclass(Model model) {
        model.addAttribute("attend", proModel.findAll());
        return "Attendance";
    }
    ///Unavailible
    @RequestMapping(path = "/time/take/{id}", method = RequestMethod.GET)
    public String ShowStudent(@PathVariable long id, Model model){
        List<DetailAttendance> DA =  Model.findByDetailSlotId(id).getContent();;
        model.addAttribute("attend", DA);
        return "Attend";
    }
}

