package com.socialserviceinfo.infoforsocialservice.controller;

import com.socialserviceinfo.infoforsocialservice.entity.*;
import com.socialserviceinfo.infoforsocialservice.service.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class SocialServiceController {

    @Autowired
    public SocialServiceService socialServiceService;

    @Autowired
    public BadlistService badlistService;

    @Autowired
    public BlacklistService blacklistService;

    @Autowired
    public CommunityService communityService;

    @Autowired
    public GoodlistService goodlistService;

    @Autowired
    public IncidentService incidentService;

    // 리스트 ############################

    // 매인
    @GetMapping("/")
    private String mainView(Model model) {
        model.addAttribute("blacklist", blacklistService.blacklistView());
        model.addAttribute("badlist", badlistService.badListView());
        model.addAttribute("incidentlist", incidentService.incidentListView());
        model.addAttribute("goodlist", goodlistService.goodListView());
        model.addAttribute("communitylist", communityService.communityListView());
        return "main";
    }

    // 블랙리스트
    @GetMapping("/black/list")
    private String blacklistView(Model model) {
        model.addAttribute("blacklist", blacklistService.blacklistView());
        return "blacklist";
    }

    // 사건제보
    @GetMapping("/incident/list")
    private String incidentListView(Model model) {
        model.addAttribute("incidentlist", incidentService.incidentListView());
        return "incident";
    }

    // 꿀무지
    @GetMapping("/good/list")
    private String goodlistView(Model model) {
        model.addAttribute("goodlist", goodlistService.goodListView());
        return "goodworkenv";
    }

    // 헬무지
    @GetMapping("/bad/list")
    private String badListView(Model model) {
        model.addAttribute("badlist", badlistService.badListView());
        return "badworkenv";
    }

    // 커뮤니티
    @GetMapping("/community/list")
    private String communityListView(Model model) {
        model.addAttribute("communitylist", communityService.communityListView());
        return "community";
    }

    // 글쓰기 ############################
    @GetMapping("/bad/write")
    private String badWrite() {
        return "badwrite";
    }

    @GetMapping("/blacklist/write")
    private String blacklistWrite() {
        return "blacklistwrite";
    }

    @GetMapping("/good/write")
    private String goodWrite() {
        return "goodwrite";
    }

    @GetMapping("/community/write")
    private String communityWrite() {
        return "communitywrite";
    }

    @GetMapping("/incident/write")
    private String incidentWrite() {
        return "incidentwrite";
    }


    // POST값으로 쿼리전송 등록 ############################

    @PostMapping("/bad/save")
    public String badWriteSave(Badlist badlist) {
        badlistService.badListWrite(badlist);
        return "redirect:/bad/list";
    }

    @PostMapping("/good/save")
    public String goodWriteSave(Goodlist goodlist) {
        goodlistService.goodListWrite(goodlist);
        return "redirect:/good/list";
    }

    @PostMapping("/blacklist/save")
    public String blackWriteSave(Blacklist blacklist) {
        blacklistService.blackListWrite(blacklist);
        return "redirect:/black/list";
    }

    @PostMapping("/community/save")
    public String communityWriteSave(Community community) {
        communityService.communityWrite(community);
        return "redirect:/community/list";
    }

    @PostMapping("/incident/save")
    public String incidentWriteSave(Incident incident) {
        incidentService.incidentWrite(incident);
        return "redirect:/incident/list";
    }


    // 뷰 ############################
    @GetMapping("/black/view")
    private String blackview(Model model, Long id) {
        model.addAttribute("blackview", blacklistService.blackView(id));
        return "blackview";
    }

    @GetMapping("/bad/view")
    private String badView(Model model, Long id) {
        model.addAttribute("badview", badlistService.badView(id));
        return "badview";
    }

    @GetMapping("/incident/view")
    private String eincidentView(Model model, Long id) {
        model.addAttribute("incidentview", incidentService.incidentView(id));
        return "incidentview";
    }

    @GetMapping("/good/view")
    private String goodView(Model model, Long id) {
        model.addAttribute("goodview", goodlistService.goodView(id));
        return "goodview";
    }

    @GetMapping("/community/view")
    private String communityView(Model model, Long id) {
        model.addAttribute("communityview", communityService.communityView(id));
        return "communityview";
    }

    // 삭제기능 ############################

    @GetMapping("/good/delete")
    private String goodDelete(Long id) {
        goodlistService.delete(id);
        return "redirect:/good/list";
    }

    @GetMapping("/bad/delete")
    private String badDelete(Long id) {
        badlistService.delete(id);
        return "redirect:/bad/list";
    }

    @GetMapping("/black/delete")
    private String blackDelete(Long id) {
        blacklistService.delete(id);
        return "redirect:/black/list";
    }

    @GetMapping("/incident/delete")
    private String incidentDelete(Long id) {
        incidentService.delete(id);
        return "redirect:/incident/list";
    }

    @GetMapping("/community/delete")
    private String communityDelete(Long id) {
        communityService.delete(id);
        return "redirect:/community/list";
    }

    // 수정기능 ############################
    @GetMapping("/bad/edit")
    private String badEdit(Model model, Long id) {
        model.addAttribute("badedit", badlistService.badEdit(id));
        return "badedit";
    }

    // 수정값 처리부분 ############################

    @Transactional
    @PutMapping("/bad/update")
    public String badUpdate(Badlist badlist) {
        badlistService.update(badlist);
        return "redirect:/bad/list";
    }


    // 검색기능 ############################

    @GetMapping ("/search/result")
    public String badSearch(Model model, String keyword) {
        model.addAttribute("badsearch", badlistService.search(keyword));
        model.addAttribute("blacksearch", blacklistService.search(keyword));
        model.addAttribute("goodsearch", goodlistService.search(keyword));
        model.addAttribute("incidentsearch", incidentService.search(keyword));
        model.addAttribute("communitysearch", communityService.search(keyword));
        return "searchresult";
    }

}
