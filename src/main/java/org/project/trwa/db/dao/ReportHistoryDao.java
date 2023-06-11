package org.project.trwa.db.dao;

import org.project.trwa.db.entity.ReportHistory;

import java.util.List;
import java.util.Optional;

public interface ReportHistoryDao extends DAO<ReportHistory> {

	List<ReportHistory> getAll();

	List<ReportHistory> findByCode(String code);

	Optional<ReportHistory> findLastByCode(String code);

	List<ReportHistory> findClosedForAuthor(Long id);

	List<ReportHistory> findClosedForInspector(Long id);
}