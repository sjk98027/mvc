package impl;

import java.util.List;

import common.DAO;
import model.Borad;

public class BoradServiceimpl implements BoradService {
	BoradDAO dao = new BoradDAO();

	@Override
	public Borad getBorad(int boradId) {
		return dao.getBorad(boradId);
	}

	@Override
	public List<Borad> getBoradList(int boradId) {
		return dao.getBoradList(boradId);
	}

	@Override
	public List<Borad> getBoradList(String keyword) {
		return dao.getBoradList(keyword);
	}

	@Override
	public List<Borad> getBoradList() {
		return dao.getBoradList();
	}

	@Override
	public void insertBorad(Borad borad) {
		dao.insertBorad(borad);
	}

	@Override
	public void updateBorad(Borad borad) {
		dao.updateBorad(borad);
	}

	@Override
	public void deleteBorad(Borad borad) {
		dao.deleteBorad(borad);
	}

}
