package io.github.wizwix.letsfutsal.mapper;

import io.github.wizwix.letsfutsal.dto.TeamDTO;
import io.github.wizwix.letsfutsal.dto.UserDTO;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeamMapper {
	
  int addMemberToTeam(@Param("teamId") long teamId, @Param("userId") long userId);

  @Insert("""
	        INSERT INTO team
	        (team_name, gender, min_grade, max_grade, region, introduction)
	        VALUES
	        (#{teamName}, #{gender}, #{minGrade}, #{maxGrade}, #{region}, #{introduction})
	    """)
  int insertTeam(TeamDTO team);

  int removeMemberToTeam(@Param("teamId") long teamId, @Param("userId") long userId);

  List<UserDTO> selectMembersByTeamId(long teamId);

  @Select("SELECT * FROM team WHERE team_id = #{teamId}")
  TeamDTO selectTeamById(long teamId);

  List<TeamDTO> selectTeamsByRegion(String region);
  
  @Select("SELECT * FROM team")
  List<TeamDTO> selectAllTeams();

  int updateTeam(TeamDTO team);
}
