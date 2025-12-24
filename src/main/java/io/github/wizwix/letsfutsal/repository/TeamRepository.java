package io.github.wizwix.letsfutsal.repository;

import java.util.ArrayList;
import java.util.List;

import io.github.wizwix.letsfutsal.dto.TeamDTO;

public class TeamRepository {

	private static final List<TeamDTO> teams = new ArrayList<>();

	public void save(TeamDTO team) {
		teams.add(team);
	}

	public List<TeamDTO> findAll() {
		return teams;
	}

	public TeamDTO findById(String team_id) {
		for (TeamDTO t : teams) {
			if (t.getTeamId() == t.getTeamId()) {
				return t;
			}
		}
		return null;
	}
}