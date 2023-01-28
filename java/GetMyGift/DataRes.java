package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FansRankUserInfo;
import tbclient.PresentMyList;
import tbclient.PresetMyGiftPage;

public final class DataRes extends Message {
  public static final Integer DEFAULT_BLUE_DIAMOND;
  
  public static final Integer DEFAULT_CURRENCY;
  
  public static final List<PresentMyList> DEFAULT_GIFT_LIST;
  
  public static final Integer DEFAULT_MONEY;
  
  public static final List<FansRankUserInfo> DEFAULT_RANK_LIST;
  
  public static final Integer DEFAULT_SCENE_ID;
  
  public static final Integer DEFAULT_TOTAL_NUM;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer blue_diamond;
  
  @ProtoField(tag = 8)
  public final presentMoneyTxt blue_diamond_txt;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer currency;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<PresentMyList> gift_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer money;
  
  @ProtoField(tag = 3)
  public final presentMoneyTxt money_txt;
  
  @ProtoField(tag = 5)
  public final PresetMyGiftPage page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<FansRankUserInfo> rank_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer scene_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer total_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_NUM = integer;
    DEFAULT_MONEY = integer;
    DEFAULT_GIFT_LIST = Collections.emptyList();
    DEFAULT_SCENE_ID = integer;
    DEFAULT_BLUE_DIAMOND = integer;
    DEFAULT_RANK_LIST = Collections.emptyList();
    DEFAULT_CURRENCY = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.total_num;
      if (integer2 == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = integer2;
      } 
      integer2 = paramBuilder.money;
      if (integer2 == null) {
        this.money = DEFAULT_MONEY;
      } else {
        this.money = integer2;
      } 
      this.money_txt = paramBuilder.money_txt;
      List<PresentMyList> list1 = paramBuilder.gift_list;
      if (list1 == null) {
        this.gift_list = DEFAULT_GIFT_LIST;
      } else {
        this.gift_list = Message.immutableCopyOf(list1);
      } 
      this.page = paramBuilder.page;
      Integer integer1 = paramBuilder.scene_id;
      if (integer1 == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer1;
      } 
      integer1 = paramBuilder.blue_diamond;
      if (integer1 == null) {
        this.blue_diamond = DEFAULT_BLUE_DIAMOND;
      } else {
        this.blue_diamond = integer1;
      } 
      this.blue_diamond_txt = paramBuilder.blue_diamond_txt;
      List<FansRankUserInfo> list = paramBuilder.rank_list;
      if (list == null) {
        this.rank_list = DEFAULT_RANK_LIST;
      } else {
        this.rank_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.currency;
      if (integer == null) {
        this.currency = DEFAULT_CURRENCY;
      } else {
        this.currency = integer;
      } 
    } else {
      this.total_num = ((Builder)integer).total_num;
      this.money = ((Builder)integer).money;
      this.money_txt = ((Builder)integer).money_txt;
      this.gift_list = Message.immutableCopyOf(((Builder)integer).gift_list);
      this.page = ((Builder)integer).page;
      this.scene_id = ((Builder)integer).scene_id;
      this.blue_diamond = ((Builder)integer).blue_diamond;
      this.blue_diamond_txt = ((Builder)integer).blue_diamond_txt;
      this.rank_list = Message.immutableCopyOf(((Builder)integer).rank_list);
      this.currency = ((Builder)integer).currency;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer blue_diamond;
    
    public presentMoneyTxt blue_diamond_txt;
    
    public Integer currency;
    
    public List<PresentMyList> gift_list;
    
    public Integer money;
    
    public presentMoneyTxt money_txt;
    
    public PresetMyGiftPage page;
    
    public List<FansRankUserInfo> rank_list;
    
    public Integer scene_id;
    
    public Integer total_num;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.total_num = param1DataRes.total_num;
      this.money = param1DataRes.money;
      this.money_txt = param1DataRes.money_txt;
      this.gift_list = Message.copyOf(param1DataRes.gift_list);
      this.page = param1DataRes.page;
      this.scene_id = param1DataRes.scene_id;
      this.blue_diamond = param1DataRes.blue_diamond;
      this.blue_diamond_txt = param1DataRes.blue_diamond_txt;
      this.rank_list = Message.copyOf(param1DataRes.rank_list);
      this.currency = param1DataRes.currency;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
