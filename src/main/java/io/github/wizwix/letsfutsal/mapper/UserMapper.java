package io.github.wizwix.letsfutsal.mapper;

import io.github.wizwix.letsfutsal.dto.TeamDTO;
import io.github.wizwix.letsfutsal.dto.UserDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
  int deleteUser(@Param("userId") long userId);

  int insertUser(@Param("user") UserDTO user);

  List<TeamDTO> selectTeamsByUserId(@Param("userId") long userId);

  /**
   * 등급별 포인트 상위 10명 조회
   *
   * @param grade 등급 필터 (-1: 전체, 0~3: 특정 등급)
   * @return 포인트 기준 상위 10명
   */
  List<UserDTO> selectTopUsersByGrade(@Param("grade") int grade);

  /**
   * 등급별, 포지션별 포인트 상위 10명 조회
   *
   * @param grade 등급 필터 (-1: 전체, 0~3: 특정 등급)
   * @param position 포지션 필터 ("": 전체, 특정 포지션)
   * @return 포인트 기준 상위 10명
   */
  List<UserDTO> selectTopUsersByGradeAndPosition(@Param("grade") int grade, @Param("position") String position);

  UserDTO selectUserByEmail(@Param("email") String email);

  UserDTO selectUserById(@Param("userId") long userId);

  int updateGrade(@Param("userId") long userId, @Param("grade") long grade);

  int updatePoints(@Param("userId") long userId, @Param("point") long point);

  int updateUser(@Param("user") UserDTO user);
}
