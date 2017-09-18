package com.iqmsoft.payara.struts.dao;

import java.util.List;

import com.iqmsoft.payara.struts.model.Participant;

public interface ParticipantDAO {

	void createParticipant(Participant participant);
	void deleteParticipant(int id);
	Participant updateParticipant(Participant participant);
	Participant getParticipant(int id);
	List<Participant> getAllParticipants();

}
