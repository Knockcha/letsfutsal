<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>랭킹 - Let's Futsal</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style/rank/rank.css">
  <script>
    function changeFilter(type, grade, position) {
      window.location.href = '${pageContext.request.contextPath}/rank?type=' + type + '&grade=' + grade + '&position=' + position;
    }
  </script>
</head>
<body>
  <h1>랭킹</h1>

  <div class="filter-section">
    <div>
      <strong>타입:</strong>
      <button class="${type == 'individual' ? 'active' : ''}" onclick="changeFilter('individual', ${selectedGrade}, '${selectedPosition}')">개인</button>
      <button class="${type == 'team' ? 'active' : ''}" onclick="changeFilter('team', ${selectedGrade}, '')">팀</button>
    </div>
    <div style="margin-top: 10px;">
      <strong>등급:</strong>
      <button class="${selectedGrade == -1 ? 'active' : ''}" onclick="changeFilter('${type}', -1, '${selectedPosition}')">전체</button>
      <button class="${selectedGrade == 0 ? 'active' : ''}" onclick="changeFilter('${type}', 0, '${selectedPosition}')">입문</button>
      <button class="${selectedGrade == 1 ? 'active' : ''}" onclick="changeFilter('${type}', 1, '${selectedPosition}')">초보</button>
      <button class="${selectedGrade == 2 ? 'active' : ''}" onclick="changeFilter('${type}', 2, '${selectedPosition}')">중수</button>
      <button class="${selectedGrade == 3 ? 'active' : ''}" onclick="changeFilter('${type}', 3, '${selectedPosition}')">고수</button>
    </div>
    <c:if test="${type == 'individual'}">
      <div style="margin-top: 10px;">
        <strong>포지션:</strong>
        <button class="${empty selectedPosition ? 'active' : ''}" onclick="changeFilter('${type}', ${selectedGrade}, '')">전체</button>
        <button class="${selectedPosition == 'Goalkeeper' ? 'active' : ''}" onclick="changeFilter('${type}', ${selectedGrade}, 'Goalkeeper')">골키퍼</button>
        <button class="${selectedPosition == 'Defender' ? 'active' : ''}" onclick="changeFilter('${type}', ${selectedGrade}, 'Defender')">수비수</button>
        <button class="${selectedPosition == 'Midfielder' ? 'active' : ''}" onclick="changeFilter('${type}', ${selectedGrade}, 'Midfielder')">미드필더</button>
        <button class="${selectedPosition == 'Forward' ? 'active' : ''}" onclick="changeFilter('${type}', ${selectedGrade}, 'Forward')">공격수</button>
      </div>
    </c:if>
  </div>

  <c:choose>
    <c:when test="${type == 'individual'}">
      <h2>개인 랭킹 TOP 10</h2>
      <table>
        <thead>
          <tr>
            <th>순위</th>
            <th>닉네임</th>
            <th>포인트</th>
            <th>등급</th>
            <th>선호 포지션</th>
          </tr>
        </thead>
        <tbody>
          <c:choose>
            <c:when test="${empty rankings}">
              <tr>
                <td colspan="5" style="text-align: center;">랭킹 데이터가 없습니다.</td>
              </tr>
            </c:when>
            <c:otherwise>
              <c:forEach var="user" items="${rankings}" varStatus="status">
                <tr>
                  <td class="rank-number ${status.index == 0 ? 'gold' : (status.index == 1 ? 'silver' : (status.index == 2 ? 'bronze' : ''))}">
                    ${status.index + 1}위
                  </td>
                  <td>
                    <a href="${pageContext.request.contextPath}/user/profile/${user.userId}">${user.nickname}</a>
                  </td>
                  <td>${user.point}</td>
                  <td>
                    <c:choose>
                      <c:when test="${user.grade == 0}">입문</c:when>
                      <c:when test="${user.grade == 1}">초보</c:when>
                      <c:when test="${user.grade == 2}">중수</c:when>
                      <c:when test="${user.grade == 3}">고수</c:when>
                      <c:otherwise>-</c:otherwise>
                    </c:choose>
                  </td>
                  <td>
                    <c:choose>
                      <c:when test="${user.preferredPosition == 'Goalkeeper'}">골키퍼</c:when>
                      <c:when test="${user.preferredPosition == 'Defender'}">수비수</c:when>
                      <c:when test="${user.preferredPosition == 'Midfielder'}">미드필더</c:when>
                      <c:when test="${user.preferredPosition == 'Forward'}">공격수</c:when>
                      <c:otherwise>-</c:otherwise>
                    </c:choose>
                  </td>
                </tr>
              </c:forEach>
            </c:otherwise>
          </c:choose>
        </tbody>
      </table>
    </c:when>
    <c:otherwise>
      <h2>팀 랭킹 TOP 10</h2>
      <table>
        <thead>
          <tr>
            <th>순위</th>
            <th>팀명</th>
            <th>평균 포인트</th>
            <th>총 포인트</th>
            <th>멤버 수</th>
            <th>지역</th>
          </tr>
        </thead>
        <tbody>
          <c:choose>
            <c:when test="${empty rankings}">
              <tr>
                <td colspan="6" style="text-align: center;">랭킹 데이터가 없습니다.</td>
              </tr>
            </c:when>
            <c:otherwise>
              <c:forEach var="team" items="${rankings}" varStatus="status">
                <tr>
                  <td class="rank-number ${status.index == 0 ? 'gold' : (status.index == 1 ? 'silver' : (status.index == 2 ? 'bronze' : ''))}">
                    ${status.index + 1}위
                  </td>
                  <td>${team.teamName}</td>
                  <td>${team.averagePoints}</td>
                  <td>${team.totalPoints}</td>
                  <td>${team.memberCount}명</td>
                  <td>${team.region != null ? team.region : '-'}</td>
                </tr>
              </c:forEach>
            </c:otherwise>
          </c:choose>
        </tbody>
      </table>
    </c:otherwise>
  </c:choose>

  <br><br>
  <a href="${pageContext.request.contextPath}/">홈으로 돌아가기</a>
</body>
</html>
