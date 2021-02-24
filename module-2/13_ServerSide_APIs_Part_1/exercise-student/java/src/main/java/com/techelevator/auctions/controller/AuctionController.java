package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false) String title_like,@RequestParam(value = "currentBid_lte",defaultValue = "0")double currentBid_lte){
        if (title_like != null && currentBid_lte > 0){
            return dao.searchByTitleAndPrice(title_like, currentBid_lte);
        }
        if (title_like != null){
            return dao.searchByTitle(title_like);
        }
        if (currentBid_lte > 0){
            return dao.searchByPrice(currentBid_lte);
        }
            title_like = "";
            return dao.list();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction auction(@PathVariable int id){
        return dao.get(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Auction addAuction (@RequestBody Auction input){
        return dao.create(input);
    }
    }
