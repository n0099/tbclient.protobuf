package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaUserInfo extends Message {
  public static final Long DEFAULT_ALA_ID;
  
  public static final Integer DEFAULT_ANCHOR_FANS;
  
  public static final Long DEFAULT_ANCHOR_LIVE;
  
  public static final Long DEFAULT_CHARM_COUNT;
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final Long DEFAULT_ENTER_LIVE;
  
  public static final String DEFAULT_GREAT_ANCHOR_DESC_GRADE = "";
  
  public static final String DEFAULT_GREAT_ANCHOR_DESC_ROLE = "";
  
  public static final String DEFAULT_GREAT_ANCHOR_ICON = "";
  
  public static final Integer DEFAULT_IS_OFFICIAL;
  
  public static final Double DEFAULT_LAT;
  
  public static final Long DEFAULT_LEVEL_EXP;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final Long DEFAULT_LIVE_ID;
  
  public static final Integer DEFAULT_LIVE_STATUS;
  
  public static final Double DEFAULT_LNG;
  
  public static final String DEFAULT_LOCATION = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_SEX = "";
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_VERIFY_STATUS = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long ala_id;
  
  @ProtoField(tag = 24, type = Message.Datatype.INT32)
  public final Integer anchor_fans;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long anchor_live;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long charm_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long enter_live;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String great_anchor_desc_grade;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String great_anchor_desc_role;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String great_anchor_icon;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer is_official;
  
  @ProtoField(tag = 12, type = Message.Datatype.DOUBLE)
  public final Double lat;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT64)
  public final Long level_exp;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer level_id;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long live_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer live_status;
  
  @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
  public final Double lng;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String location;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String sex;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  @ProtoField(tag = 23, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String verify_status;
  
  @ProtoField(tag = 25)
  public final YyExt yy_ext;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ALA_ID = long_;
    DEFAULT_ENTER_LIVE = long_;
    DEFAULT_ANCHOR_LIVE = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_LIVE_STATUS = integer;
    DEFAULT_LIVE_ID = long_;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_LNG = double_;
    DEFAULT_LAT = double_;
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_CHARM_COUNT = long_;
    DEFAULT_LEVEL_EXP = long_;
    DEFAULT_IS_OFFICIAL = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_USER_ID = long_;
    DEFAULT_ANCHOR_FANS = integer;
  }
  
  public AlaUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_5 = paramBuilder.ala_id;
      if (long_5 == null) {
        this.ala_id = DEFAULT_ALA_ID;
      } else {
        this.ala_id = long_5;
      } 
      String str4 = paramBuilder.user_name;
      if (str4 == null) {
        this.user_name = "";
      } else {
        this.user_name = str4;
      } 
      str4 = paramBuilder.portrait;
      if (str4 == null) {
        this.portrait = "";
      } else {
        this.portrait = str4;
      } 
      str4 = paramBuilder.description;
      if (str4 == null) {
        this.description = "";
      } else {
        this.description = str4;
      } 
      str4 = paramBuilder.sex;
      if (str4 == null) {
        this.sex = "";
      } else {
        this.sex = str4;
      } 
      Long long_4 = paramBuilder.enter_live;
      if (long_4 == null) {
        this.enter_live = DEFAULT_ENTER_LIVE;
      } else {
        this.enter_live = long_4;
      } 
      long_4 = paramBuilder.anchor_live;
      if (long_4 == null) {
        this.anchor_live = DEFAULT_ANCHOR_LIVE;
      } else {
        this.anchor_live = long_4;
      } 
      Integer integer5 = paramBuilder.live_status;
      if (integer5 == null) {
        this.live_status = DEFAULT_LIVE_STATUS;
      } else {
        this.live_status = integer5;
      } 
      Long long_3 = paramBuilder.live_id;
      if (long_3 == null) {
        this.live_id = DEFAULT_LIVE_ID;
      } else {
        this.live_id = long_3;
      } 
      String str3 = paramBuilder.location;
      if (str3 == null) {
        this.location = "";
      } else {
        this.location = str3;
      } 
      Double double_ = paramBuilder.lng;
      if (double_ == null) {
        this.lng = DEFAULT_LNG;
      } else {
        this.lng = double_;
      } 
      double_ = paramBuilder.lat;
      if (double_ == null) {
        this.lat = DEFAULT_LAT;
      } else {
        this.lat = double_;
      } 
      Integer integer4 = paramBuilder.update_time;
      if (integer4 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer4;
      } 
      Long long_2 = paramBuilder.charm_count;
      if (long_2 == null) {
        this.charm_count = DEFAULT_CHARM_COUNT;
      } else {
        this.charm_count = long_2;
      } 
      long_2 = paramBuilder.level_exp;
      if (long_2 == null) {
        this.level_exp = DEFAULT_LEVEL_EXP;
      } else {
        this.level_exp = long_2;
      } 
      Integer integer3 = paramBuilder.is_official;
      if (integer3 == null) {
        this.is_official = DEFAULT_IS_OFFICIAL;
      } else {
        this.is_official = integer3;
      } 
      String str2 = paramBuilder.verify_status;
      if (str2 == null) {
        this.verify_status = "";
      } else {
        this.verify_status = str2;
      } 
      Integer integer2 = paramBuilder.level_id;
      if (integer2 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer2;
      } 
      String str1 = paramBuilder.great_anchor_icon;
      if (str1 == null) {
        this.great_anchor_icon = "";
      } else {
        this.great_anchor_icon = str1;
      } 
      str1 = paramBuilder.great_anchor_desc_grade;
      if (str1 == null) {
        this.great_anchor_desc_grade = "";
      } else {
        this.great_anchor_desc_grade = str1;
      } 
      str1 = paramBuilder.great_anchor_desc_role;
      if (str1 == null) {
        this.great_anchor_desc_role = "";
      } else {
        this.great_anchor_desc_role = str1;
      } 
      str1 = paramBuilder.level_name;
      if (str1 == null) {
        this.level_name = "";
      } else {
        this.level_name = str1;
      } 
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      Integer integer1 = paramBuilder.anchor_fans;
      if (integer1 == null) {
        this.anchor_fans = DEFAULT_ANCHOR_FANS;
      } else {
        this.anchor_fans = integer1;
      } 
      this.yy_ext = paramBuilder.yy_ext;
    } else {
      this.ala_id = paramBuilder.ala_id;
      this.user_name = paramBuilder.user_name;
      this.portrait = paramBuilder.portrait;
      this.description = paramBuilder.description;
      this.sex = paramBuilder.sex;
      this.enter_live = paramBuilder.enter_live;
      this.anchor_live = paramBuilder.anchor_live;
      this.live_status = paramBuilder.live_status;
      this.live_id = paramBuilder.live_id;
      this.location = paramBuilder.location;
      this.lng = paramBuilder.lng;
      this.lat = paramBuilder.lat;
      this.update_time = paramBuilder.update_time;
      this.charm_count = paramBuilder.charm_count;
      this.level_exp = paramBuilder.level_exp;
      this.is_official = paramBuilder.is_official;
      this.verify_status = paramBuilder.verify_status;
      this.level_id = paramBuilder.level_id;
      this.great_anchor_icon = paramBuilder.great_anchor_icon;
      this.great_anchor_desc_grade = paramBuilder.great_anchor_desc_grade;
      this.great_anchor_desc_role = paramBuilder.great_anchor_desc_role;
      this.level_name = paramBuilder.level_name;
      this.user_id = paramBuilder.user_id;
      this.anchor_fans = paramBuilder.anchor_fans;
      this.yy_ext = paramBuilder.yy_ext;
    } 
  }
  
  public AlaUserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaUserInfo> {
    public Long ala_id;
    
    public Integer anchor_fans;
    
    public Long anchor_live;
    
    public Long charm_count;
    
    public String description;
    
    public Long enter_live;
    
    public String great_anchor_desc_grade;
    
    public String great_anchor_desc_role;
    
    public String great_anchor_icon;
    
    public Integer is_official;
    
    public Double lat;
    
    public Long level_exp;
    
    public Integer level_id;
    
    public String level_name;
    
    public Long live_id;
    
    public Integer live_status;
    
    public Double lng;
    
    public String location;
    
    public String portrait;
    
    public String sex;
    
    public Integer update_time;
    
    public Long user_id;
    
    public String user_name;
    
    public String verify_status;
    
    public YyExt yy_ext;
    
    public Builder() {}
    
    public Builder(AlaUserInfo param1AlaUserInfo) {
      super(param1AlaUserInfo);
      if (param1AlaUserInfo == null)
        return; 
      this.ala_id = param1AlaUserInfo.ala_id;
      this.user_name = param1AlaUserInfo.user_name;
      this.portrait = param1AlaUserInfo.portrait;
      this.description = param1AlaUserInfo.description;
      this.sex = param1AlaUserInfo.sex;
      this.enter_live = param1AlaUserInfo.enter_live;
      this.anchor_live = param1AlaUserInfo.anchor_live;
      this.live_status = param1AlaUserInfo.live_status;
      this.live_id = param1AlaUserInfo.live_id;
      this.location = param1AlaUserInfo.location;
      this.lng = param1AlaUserInfo.lng;
      this.lat = param1AlaUserInfo.lat;
      this.update_time = param1AlaUserInfo.update_time;
      this.charm_count = param1AlaUserInfo.charm_count;
      this.level_exp = param1AlaUserInfo.level_exp;
      this.is_official = param1AlaUserInfo.is_official;
      this.verify_status = param1AlaUserInfo.verify_status;
      this.level_id = param1AlaUserInfo.level_id;
      this.great_anchor_icon = param1AlaUserInfo.great_anchor_icon;
      this.great_anchor_desc_grade = param1AlaUserInfo.great_anchor_desc_grade;
      this.great_anchor_desc_role = param1AlaUserInfo.great_anchor_desc_role;
      this.level_name = param1AlaUserInfo.level_name;
      this.user_id = param1AlaUserInfo.user_id;
      this.anchor_fans = param1AlaUserInfo.anchor_fans;
      this.yy_ext = param1AlaUserInfo.yy_ext;
    }
    
    public AlaUserInfo build(boolean param1Boolean) {
      return new AlaUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
