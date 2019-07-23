package com.stackroute.muzixapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.muzixapp.model.Track;

@Repository
@Transactional
public class TrackDAOImpl implements TrackDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public TrackDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//implement all the methods
	@Override
	public boolean saveTrack(Track track) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(track);

		return true;
	}

	@Override
	public boolean deleteTrack(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(getTrackById(id));

		return true;
	}

	@Override
	public List<Track> getAllTracks() {
		Session session=sessionFactory.getCurrentSession();
		List<Track>tracks=session.createQuery("from Track",Track.class).getResultList();

		return tracks;
	}

	@Override
	public Track getTrackById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Track track=session.get(Track.class,id);

		return track;
	}

	@Override
	public boolean UpdateTrack(Track track) {
		Session session=sessionFactory.getCurrentSession();
		session.update(track);

		return false;
	}

}