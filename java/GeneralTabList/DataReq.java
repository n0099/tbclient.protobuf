package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_BEAR_CONTEXT = "";
  
  public static final String DEFAULT_AD_BEAR_SID = "";
  
  public static final Double DEFAULT_AD_BEAR_SID_PRICE;
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_HAS_AD_BEAR;
  
  public static final Integer DEFAULT_IS_DEFAULT_NAVTAB;
  
  public static final Integer DEFAULT_IS_GENERAL_TAB;
  
  public static final Long DEFAULT_LAST_THREAD_ID;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Integer DEFAULT_RN;
  
  public static final Integer DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final Integer DEFAULT_TAB_TYPE;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String ad_bear_context;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ad_bear_sid;
  
  @ProtoField(tag = 19, type = Message.Datatype.DOUBLE)
  public final Double ad_bear_sid_price;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer has_ad_bear;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_default_navtab;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_general_tab;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long last_thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer scr_dip;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer tab_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAB_ID = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = integer;
    DEFAULT_LAST_THREAD_ID = long_;
    DEFAULT_IS_DEFAULT_NAVTAB = integer;
    DEFAULT_IS_GENERAL_TAB = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_TAB_TYPE = integer;
    DEFAULT_HAS_AD_BEAR = integer;
    DEFAULT_AD_BEAR_SID_PRICE = Double.valueOf(0.0D);
    DEFAULT_REQUEST_TIMES = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer5 = paramBuilder.tab_id;
      if (integer5 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer5;
      } 
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      Integer integer4 = paramBuilder.pn;
      if (integer4 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer4;
      } 
      integer4 = paramBuilder.rn;
      if (integer4 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer4;
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
      integer4 = paramBuilder.scr_dip;
      if (integer4 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = integer4;
      } 
      Long long_1 = paramBuilder.last_thread_id;
      if (long_1 == null) {
        this.last_thread_id = DEFAULT_LAST_THREAD_ID;
      } else {
        this.last_thread_id = long_1;
      } 
      Integer integer3 = paramBuilder.is_default_navtab;
      if (integer3 == null) {
        this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
      } else {
        this.is_default_navtab = integer3;
      } 
      String str3 = paramBuilder.tab_name;
      if (str3 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str3;
      } 
      Integer integer2 = paramBuilder.is_general_tab;
      if (integer2 == null) {
        this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
      } else {
        this.is_general_tab = integer2;
      } 
      integer2 = paramBuilder.sort_type;
      if (integer2 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer2;
      } 
      integer2 = paramBuilder.tab_type;
      if (integer2 == null) {
        this.tab_type = DEFAULT_TAB_TYPE;
      } else {
        this.tab_type = integer2;
      } 
      String str2 = paramBuilder.ad_ext_params;
      if (str2 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str2;
      } 
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
      Double double_ = paramBuilder.ad_bear_sid_price;
      if (double_ == null) {
        this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
      } else {
        this.ad_bear_sid_price = double_;
      } 
      integer = paramBuilder.request_times;
      if (integer == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.tab_id = ((Builder)integer).tab_id;
      this.forum_id = ((Builder)integer).forum_id;
      this.pn = ((Builder)integer).pn;
      this.rn = ((Builder)integer).rn;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.last_thread_id = ((Builder)integer).last_thread_id;
      this.is_default_navtab = ((Builder)integer).is_default_navtab;
      this.tab_name = ((Builder)integer).tab_name;
      this.is_general_tab = ((Builder)integer).is_general_tab;
      this.sort_type = ((Builder)integer).sort_type;
      this.tab_type = ((Builder)integer).tab_type;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
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
    
    public String ad_ext_params;
    
    public CommonReq common;
    
    public Long forum_id;
    
    public Integer has_ad_bear;
    
    public Integer is_default_navtab;
    
    public Integer is_general_tab;
    
    public Long last_thread_id;
    
    public Integer pn;
    
    public Integer request_times;
    
    public Integer rn;
    
    public Integer scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Integer sort_type;
    
    public Integer tab_id;
    
    public String tab_name;
    
    public Integer tab_type;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tab_id = param1DataReq.tab_id;
      this.forum_id = param1DataReq.forum_id;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.last_thread_id = param1DataReq.last_thread_id;
      this.is_default_navtab = param1DataReq.is_default_navtab;
      this.tab_name = param1DataReq.tab_name;
      this.is_general_tab = param1DataReq.is_general_tab;
      this.sort_type = param1DataReq.sort_type;
      this.tab_type = param1DataReq.tab_type;
      this.ad_ext_params = param1DataReq.ad_ext_params;
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
