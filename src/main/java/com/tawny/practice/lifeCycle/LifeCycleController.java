package com.tawny.practice.lifeCycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tawny.practice.lifeCycle.domain.Lifecycle;

@RestController
@RequestMapping("/lifecycle/test")
public class LifeCycleController {
	
	@RequestMapping("/01/1")
	@ResponseBody
	public String test01() {
		return "<h1>테스트 프로젝트 완성</h1><b>해당 프로젝트를 통해서 문제 풀이를 진행합니다.</b>";
	}
	
	@RequestMapping("/01/2")
	@ResponseBody
	public Map<String, Integer> scores() {
	
		Map<String, Integer> score = new HashMap<>();
		score.put("국어", 80);
		score.put("수학", 90);
		score.put("영어", 84);
		return score;
	}
	
	@GetMapping("02/1")
	@ResponseBody
	public List<Map<String, Object>> movieList(){
		
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		movie.put("title", "기생충");
		movie.put("directory", "봉준호");
		movie.put("time", 131);
		movie.put("rete", 15);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "기생충");
		movie.put("directory", "봉준호");
		movie.put("time", 131);
		movie.put("rete", 15);
		movieList.add(movie);
	
		movie = new HashMap<>();
		movie.put("title", "기생충");
		movie.put("directory", "봉준호");
		movie.put("time", 131);
		movie.put("rete", 15);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "기생충");
		movie.put("directory", "봉준호");
		movie.put("time", 131);
		movie.put("rete", 15);
		movieList.add(movie);

		return movieList;
	}
	
	@RequestMapping("/02/2")
	public List<Lifecycle> getContent(){
		
		List<Lifecycle> contentList = new ArrayList<>();
		
		Lifecycle content = new Lifecycle();
		content.setTitle("안녕하세요");
		content.setUser("dnjsdudeh");
		content.setContent("가입인사드립니다.");
		contentList.add(content);
		
		content = new Lifecycle();
		content.setTitle("안녕");
		content.setUser("dnjs");
		content.setContent("가입");
		contentList.add(content);
		
		content = new Lifecycle();
		content.setTitle("ㅇㅇ");
		content.setUser("ㅇㅇ");
		content.setContent("ㅇㅇ");
		contentList.add(content);
		
		return contentList;
	}
	
	@RequestMapping("/02/3")
	public ResponseEntity<Lifecycle> entity(){
		
		Lifecycle content = new Lifecycle();
		content.setTitle("안녕하세요");
		content.setUser("dnjsdudeh");
		content.setContent("가입인사드립니다.");
		
		return new ResponseEntity<>(content, HttpStatus.INTERNAL_SERVER_ERROR);
					
	}
	
	
	
	
	
	
	
}
