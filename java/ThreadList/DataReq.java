package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_BEAR_CONTEXT = "";
  
  public static final String DEFAULT_AD_BEAR_SID = "";
  
  public static final Double DEFAULT_AD_BEAR_SID_PRICE;
  
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_HAS_AD_BEAR;
  
  public static final Long DEFAULT_LAST_CLICK_TID;
  
  public static final Integer DEFAULT_NEED_ABSTRACT;
  
  public static final String DEFAULT_PLATFORM = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_ST_TYPE;
  
  public static final String DEFAULT_THREAD_IDS = "";
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String ad_bear_context;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String ad_bear_sid;
  
  @ProtoField(tag = 25, type = Message.Datatype.DOUBLE)
  public final Double ad_bear_sid_price;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 18)
  public final AdParam ad_param;
  
  @ProtoField(tag = 17)
  public final AppPosInfo app_pos;
  
  @ProtoField(tag = 21)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 8)
  public final CommonReq common;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String da_idfa;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer has_ad_bear;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT64)
  public final Long last_click_tid;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer need_abstract;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String platform;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer q_type;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 12, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer st_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String thread_ids;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_NEED_ABSTRACT = integer;
    DEFAULT_ST_TYPE = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_Q_TYPE = integer;
    DEFAULT_USER_ID = long_;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_SCR_DIP = double_;
    DEFAULT_PN = integer;
    DEFAULT_LAST_CLICK_TID = long_;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_HAS_AD_BEAR = integer;
    DEFAULT_AD_BEAR_SID_PRICE = double_;
    DEFAULT_REQUEST_TIMES = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str5 = paramBuilder.thread_ids;
      if (str5 == null) {
        this.thread_ids = "";
      } else {
        this.thread_ids = str5;
      } 
      Long long_3 = paramBuilder.forum_id;
      if (long_3 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_3;
      } 
      Integer integer4 = paramBuilder.need_abstract;
      if (integer4 == null) {
        this.need_abstract = DEFAULT_NEED_ABSTRACT;
      } else {
        this.need_abstract = integer4;
      } 
      integer4 = paramBuilder.st_type;
      if (integer4 == null) {
        this.st_type = DEFAULT_ST_TYPE;
      } else {
        this.st_type = integer4;
      } 
      integer4 = paramBuilder.scr_w;
      if (integer4 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer4;
      } 
      integer4 = paramBuilder.scr_h;
      if (integer4 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer4;
      } 
      integer4 = paramBuilder.q_type;
      if (integer4 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer4;
      } 
      this.common = paramBuilder.common;
      Long long_2 = paramBuilder.user_id;
      if (long_2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_2;
      } 
      String str4 = paramBuilder.da_idfa;
      if (str4 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str4;
      } 
      str4 = paramBuilder.platform;
      if (str4 == null) {
        this.platform = "";
      } else {
        this.platform = str4;
      } 
      Double double_2 = paramBuilder.scr_dip;
      if (double_2 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_2;
      } 
      Integer integer3 = paramBuilder.pn;
      if (integer3 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer3;
      } 
      String str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      Long long_1 = paramBuilder.last_click_tid;
      if (long_1 == null) {
        this.last_click_tid = DEFAULT_LAST_CLICK_TID;
      } else {
        this.last_click_tid = long_1;
      } 
      Integer integer2 = paramBuilder.sort_type;
      if (integer2 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer2;
      } 
      this.app_pos = paramBuilder.app_pos;
      this.ad_param = paramBuilder.ad_param;
      String str2 = paramBuilder.ad_context_list;
      if (str2 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str2;
      } 
      str2 = paramBuilder.ad_ext_params;
      if (str2 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str2;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      str2 = paramBuilder.ad_bear_context;
      if (str2 == null) {
        this.ad_bear_context = "";
      } else {
        this.ad_bear_context = str2;
      } 
      Integer integer1 = paramBuilder.has_ad_bear;
      if (integer1 == null) {
        this.has_ad_bear = DEFAULT_HAS_AD_BEAR;
      } else {
        this.has_ad_bear = integer1;
      } 
      String str1 = paramBuilder.ad_bear_sid;
      if (str1 == null) {
        this.ad_bear_sid = "";
      } else {
        this.ad_bear_sid = str1;
      } 
      Double double_1 = paramBuilder.ad_bear_sid_price;
      if (double_1 == null) {
        this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
      } else {
        this.ad_bear_sid_price = double_1;
      } 
      integer = paramBuilder.request_times;
      if (integer == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer;
      } 
    } else {
      this.thread_ids = ((Builder)integer).thread_ids;
      this.forum_id = ((Builder)integer).forum_id;
      this.need_abstract = ((Builder)integer).need_abstract;
      this.st_type = ((Builder)integer).st_type;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.q_type = ((Builder)integer).q_type;
      this.common = ((Builder)integer).common;
      this.user_id = ((Builder)integer).user_id;
      this.da_idfa = ((Builder)integer).da_idfa;
      this.platform = ((Builder)integer).platform;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.pn = ((Builder)integer).pn;
      this.forum_name = ((Builder)integer).forum_name;
      this.last_click_tid = ((Builder)integer).last_click_tid;
      this.sort_type = ((Builder)integer).sort_type;
      this.app_pos = ((Builder)integer).app_pos;
      this.ad_param = ((Builder)integer).ad_param;
      this.ad_context_list = ((Builder)integer).ad_context_list;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.app_transmit_data = ((Builder)integer).app_transmit_data;
      this.ad_bear_context = ((Builder)integer).ad_bear_context;
      this.has_ad_bear = ((Builder)integer).has_ad_bear;
      this.ad_bear_sid = ((Builder)integer).ad_bear_sid;
      this.ad_bear_sid_price = ((Builder)integer).ad_bear_sid_price;
      this.request_times = ((Builder)integer).request_times;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_bear_context;
    
    public String ad_bear_sid;
    
    public Double ad_bear_sid_price;
    
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public AdParam ad_param;
    
    public AppPosInfo app_pos;
    
    public AppTransmitData app_transmit_data;
    
    public CommonReq common;
    
    public String da_idfa;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer has_ad_bear;
    
    public Long last_click_tid;
    
    public Integer need_abstract;
    
    public String platform;
    
    public Integer pn;
    
    public Integer q_type;
    
    public Integer request_times;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Integer sort_type;
    
    public Integer st_type;
    
    public String thread_ids;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.thread_ids = param1DataReq.thread_ids;
      this.forum_id = param1DataReq.forum_id;
      this.need_abstract = param1DataReq.need_abstract;
      this.st_type = param1DataReq.st_type;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.q_type = param1DataReq.q_type;
      this.common = param1DataReq.common;
      this.user_id = param1DataReq.user_id;
      this.da_idfa = param1DataReq.da_idfa;
      this.platform = param1DataReq.platform;
      this.scr_dip = param1DataReq.scr_dip;
      this.pn = param1DataReq.pn;
      this.forum_name = param1DataReq.forum_name;
      this.last_click_tid = param1DataReq.last_click_tid;
      this.sort_type = param1DataReq.sort_type;
      this.app_pos = param1DataReq.app_pos;
      this.ad_param = param1DataReq.ad_param;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.ad_bear_context = param1DataReq.ad_bear_context;
      this.has_ad_bear = param1DataReq.has_ad_bear;
      this.ad_bear_sid = param1DataReq.ad_bear_sid;
      this.ad_bear_sid_price = param1DataReq.ad_bear_sid_price;
      this.request_times = param1DataReq.request_times;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
