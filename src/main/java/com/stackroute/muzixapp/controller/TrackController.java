package com.stackroute.muzixapp.controller;

import com.stackroute.muzixapp.dao.TrackDAO;
import com.stackroute.muzixapp.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TrackController {

	@Autowired
	TrackDAO trackDAO;
	//update all the methods with code

	@RequestMapping("/")
	public String indexPage(Model model) {
		List<Track> list = trackDAO.getAllTracks();
		model.addAttribute("tracks", list);
		return "index";
	}

	@RequestMapping("/addTrack")
	public String addTrack(Model model) {
		Track track = new Track();
		model.addAttribute("track", track);
		return "addTrack";
	}

	@RequestMapping("/saveTrack")
	public String saveTrack(@ModelAttribute("track") Track track) {
		trackDAO.saveTrack(track);
		return "redirect:/";
	}

	@RequestMapping("/updateTrack")
	public String updateTrack(@RequestParam("Id")int id,Model model) {
		Track track = trackDAO.getTrackById(id);
		model.addAttribute("track", track);
		return "addTrack";
	}

	@RequestMapping("/deleteTrack")
	public String deleteTrack(@RequestParam("Id")int id) {
		trackDAO.deleteTrack(id);
		return "redirect:/";
	}
}