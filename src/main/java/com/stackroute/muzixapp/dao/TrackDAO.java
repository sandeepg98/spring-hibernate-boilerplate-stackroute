package com.stackroute.muzixapp.dao;


import java.util.List;

import com.stackroute.muzixapp.model.Track;

public interface TrackDAO {

	public boolean saveTrack(Track track);

	public boolean deleteTrack(int id);

	public List<Track> getAllTracks();

	public Track getTrackById(int id);

	public boolean UpdateTrack(Track track);


   
}