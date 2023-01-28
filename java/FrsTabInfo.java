package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsTabInfo extends Message {
  public static final String DEFAULT_CLICK_MONITOR_URL = "";
  
  public static final String DEFAULT_DEMOTE_URL = "";
  
  public static final String DEFAULT_EXPOSURE_MONITOR_URL = "";
  
  public static final Integer DEFAULT_IS_DEFAULT;
  
  public static final Integer DEFAULT_IS_GENERAL_TAB;
  
  public static final Integer DEFAULT_IS_NO_SHOW_IN_PUBLISHER;
  
  public static final Integer DEFAULT_IS_NO_SHOW_PUBLISHER;
  
  public static final Integer DEFAULT_NEED_PAGE;
  
  public static final String DEFAULT_TAB_CODE = "";
  
  public static final String DEFAULT_TAB_GID = "";
  
  public static final Integer DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final String DEFAULT_TAB_TITLE = "";
  
  public static final Integer DEFAULT_TAB_TYPE;
  
  public static final String DEFAULT_TAB_URL = "";
  
  public static final Integer DEFAULT_TAB_VERSION;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String click_monitor_url;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String demote_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String exposure_monitor_url;
  
  @ProtoField(tag = 12)
  public final TabPic head_pics;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_default;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_general_tab;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer is_no_show_in_publisher;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_no_show_publisher;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer need_page;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String tab_code;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tab_gid;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tab_title;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer tab_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tab_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer tab_version;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAB_ID = integer;
    DEFAULT_TAB_TYPE = integer;
    DEFAULT_IS_GENERAL_TAB = integer;
    DEFAULT_TAB_VERSION = integer;
    DEFAULT_IS_DEFAULT = integer;
    DEFAULT_NEED_PAGE = integer;
    DEFAULT_IS_NO_SHOW_PUBLISHER = integer;
    DEFAULT_IS_NO_SHOW_IN_PUBLISHER = integer;
  }
  
  public FrsTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.tab_id;
      if (integer4 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer4;
      } 
      integer4 = paramBuilder.tab_type;
      if (integer4 == null) {
        this.tab_type = DEFAULT_TAB_TYPE;
      } else {
        this.tab_type = integer4;
      } 
      String str3 = paramBuilder.tab_name;
      if (str3 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str3;
      } 
      str3 = paramBuilder.tab_url;
      if (str3 == null) {
        this.tab_url = "";
      } else {
        this.tab_url = str3;
      } 
      str3 = paramBuilder.tab_gid;
      if (str3 == null) {
        this.tab_gid = "";
      } else {
        this.tab_gid = str3;
      } 
      str3 = paramBuilder.tab_title;
      if (str3 == null) {
        this.tab_title = "";
      } else {
        this.tab_title = str3;
      } 
      Integer integer3 = paramBuilder.is_general_tab;
      if (integer3 == null) {
        this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
      } else {
        this.is_general_tab = integer3;
      } 
      String str2 = paramBuilder.tab_code;
      if (str2 == null) {
        this.tab_code = "";
      } else {
        this.tab_code = str2;
      } 
      Integer integer2 = paramBuilder.tab_version;
      if (integer2 == null) {
        this.tab_version = DEFAULT_TAB_VERSION;
      } else {
        this.tab_version = integer2;
      } 
      integer2 = paramBuilder.is_default;
      if (integer2 == null) {
        this.is_default = DEFAULT_IS_DEFAULT;
      } else {
        this.is_default = integer2;
      } 
      integer2 = paramBuilder.need_page;
      if (integer2 == null) {
        this.need_page = DEFAULT_NEED_PAGE;
      } else {
        this.need_page = integer2;
      } 
      this.head_pics = paramBuilder.head_pics;
      String str1 = paramBuilder.exposure_monitor_url;
      if (str1 == null) {
        this.exposure_monitor_url = "";
      } else {
        this.exposure_monitor_url = str1;
      } 
      str1 = paramBuilder.click_monitor_url;
      if (str1 == null) {
        this.click_monitor_url = "";
      } else {
        this.click_monitor_url = str1;
      } 
      str1 = paramBuilder.demote_url;
      if (str1 == null) {
        this.demote_url = "";
      } else {
        this.demote_url = str1;
      } 
      Integer integer1 = paramBuilder.is_no_show_publisher;
      if (integer1 == null) {
        this.is_no_show_publisher = DEFAULT_IS_NO_SHOW_PUBLISHER;
      } else {
        this.is_no_show_publisher = integer1;
      } 
      integer = paramBuilder.is_no_show_in_publisher;
      if (integer == null) {
        this.is_no_show_in_publisher = DEFAULT_IS_NO_SHOW_IN_PUBLISHER;
      } else {
        this.is_no_show_in_publisher = integer;
      } 
    } else {
      this.tab_id = ((Builder)integer).tab_id;
      this.tab_type = ((Builder)integer).tab_type;
      this.tab_name = ((Builder)integer).tab_name;
      this.tab_url = ((Builder)integer).tab_url;
      this.tab_gid = ((Builder)integer).tab_gid;
      this.tab_title = ((Builder)integer).tab_title;
      this.is_general_tab = ((Builder)integer).is_general_tab;
      this.tab_code = ((Builder)integer).tab_code;
      this.tab_version = ((Builder)integer).tab_version;
      this.is_default = ((Builder)integer).is_default;
      this.need_page = ((Builder)integer).need_page;
      this.head_pics = ((Builder)integer).head_pics;
      this.exposure_monitor_url = ((Builder)integer).exposure_monitor_url;
      this.click_monitor_url = ((Builder)integer).click_monitor_url;
      this.demote_url = ((Builder)integer).demote_url;
      this.is_no_show_publisher = ((Builder)integer).is_no_show_publisher;
      this.is_no_show_in_publisher = ((Builder)integer).is_no_show_in_publisher;
    } 
  }
  
  public FrsTabInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FrsTabInfo> {
    public String click_monitor_url;
    
    public String demote_url;
    
    public String exposure_monitor_url;
    
    public TabPic head_pics;
    
    public Integer is_default;
    
    public Integer is_general_tab;
    
    public Integer is_no_show_in_publisher;
    
    public Integer is_no_show_publisher;
    
    public Integer need_page;
    
    public String tab_code;
    
    public String tab_gid;
    
    public Integer tab_id;
    
    public String tab_name;
    
    public String tab_title;
    
    public Integer tab_type;
    
    public String tab_url;
    
    public Integer tab_version;
    
    public Builder() {}
    
    public Builder(FrsTabInfo param1FrsTabInfo) {
      super(param1FrsTabInfo);
      if (param1FrsTabInfo == null)
        return; 
      this.tab_id = param1FrsTabInfo.tab_id;
      this.tab_type = param1FrsTabInfo.tab_type;
      this.tab_name = param1FrsTabInfo.tab_name;
      this.tab_url = param1FrsTabInfo.tab_url;
      this.tab_gid = param1FrsTabInfo.tab_gid;
      this.tab_title = param1FrsTabInfo.tab_title;
      this.is_general_tab = param1FrsTabInfo.is_general_tab;
      this.tab_code = param1FrsTabInfo.tab_code;
      this.tab_version = param1FrsTabInfo.tab_version;
      this.is_default = param1FrsTabInfo.is_default;
      this.need_page = param1FrsTabInfo.need_page;
      this.head_pics = param1FrsTabInfo.head_pics;
      this.exposure_monitor_url = param1FrsTabInfo.exposure_monitor_url;
      this.click_monitor_url = param1FrsTabInfo.click_monitor_url;
      this.demote_url = param1FrsTabInfo.demote_url;
      this.is_no_show_publisher = param1FrsTabInfo.is_no_show_publisher;
      this.is_no_show_in_publisher = param1FrsTabInfo.is_no_show_in_publisher;
    }
    
    public FrsTabInfo build(boolean param1Boolean) {
      return new FrsTabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
