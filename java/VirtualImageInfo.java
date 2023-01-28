package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VirtualImageInfo extends Message {
  public static final Integer DEFAULT_ALLOW_CUSTOMIZE;
  
  public static final String DEFAULT_DYNAMIC_VIRTUAL_IMAGE_URL = "";
  
  public static final Integer DEFAULT_IMAGE_AGREE_COUNT;
  
  public static final Integer DEFAULT_ISSET_VIRTUAL_IMAGE;
  
  public static final Integer DEFAULT_IS_ALLOW_AGREE;
  
  public static final Integer DEFAULT_IS_BACKGROUND_FIRSTLY;
  
  public static final Integer DEFAULT_IS_DISPLAY;
  
  public static final Integer DEFAULT_RECENT_INCR_AGREE;
  
  public static final Integer DEFAULT_SNAPSHOOT_ID;
  
  public static final List<StateInfo> DEFAULT_STATE_LIST;
  
  public static final String DEFAULT_VIRTUAL_BACKGROUND = "";
  
  public static final Integer DEFAULT_VIRTUAL_BACKGROUND_TYPE;
  
  public static final String DEFAULT_VIRTUAL_IMAGE_URL = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer allow_customize;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String dynamic_virtual_image_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer image_agree_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_allow_agree;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer is_background_firstly;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_display;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer isset_virtual_image;
  
  @ProtoField(tag = 9)
  public final StateInfo personal_state;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer recent_incr_agree;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer snapshoot_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<StateInfo> state_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String virtual_background;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer virtual_background_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String virtual_image_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ISSET_VIRTUAL_IMAGE = integer;
    DEFAULT_IMAGE_AGREE_COUNT = integer;
    DEFAULT_IS_ALLOW_AGREE = integer;
    DEFAULT_VIRTUAL_BACKGROUND_TYPE = integer;
    DEFAULT_RECENT_INCR_AGREE = integer;
    DEFAULT_SNAPSHOOT_ID = integer;
    DEFAULT_STATE_LIST = Collections.emptyList();
    DEFAULT_ALLOW_CUSTOMIZE = integer;
    DEFAULT_IS_DISPLAY = integer;
    DEFAULT_IS_BACKGROUND_FIRSTLY = integer;
  }
  
  public VirtualImageInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.isset_virtual_image;
      if (integer4 == null) {
        this.isset_virtual_image = DEFAULT_ISSET_VIRTUAL_IMAGE;
      } else {
        this.isset_virtual_image = integer4;
      } 
      String str2 = paramBuilder.virtual_image_url;
      if (str2 == null) {
        this.virtual_image_url = "";
      } else {
        this.virtual_image_url = str2;
      } 
      Integer integer3 = paramBuilder.image_agree_count;
      if (integer3 == null) {
        this.image_agree_count = DEFAULT_IMAGE_AGREE_COUNT;
      } else {
        this.image_agree_count = integer3;
      } 
      integer3 = paramBuilder.is_allow_agree;
      if (integer3 == null) {
        this.is_allow_agree = DEFAULT_IS_ALLOW_AGREE;
      } else {
        this.is_allow_agree = integer3;
      } 
      integer3 = paramBuilder.virtual_background_type;
      if (integer3 == null) {
        this.virtual_background_type = DEFAULT_VIRTUAL_BACKGROUND_TYPE;
      } else {
        this.virtual_background_type = integer3;
      } 
      String str1 = paramBuilder.virtual_background;
      if (str1 == null) {
        this.virtual_background = "";
      } else {
        this.virtual_background = str1;
      } 
      Integer integer2 = paramBuilder.recent_incr_agree;
      if (integer2 == null) {
        this.recent_incr_agree = DEFAULT_RECENT_INCR_AGREE;
      } else {
        this.recent_incr_agree = integer2;
      } 
      integer2 = paramBuilder.snapshoot_id;
      if (integer2 == null) {
        this.snapshoot_id = DEFAULT_SNAPSHOOT_ID;
      } else {
        this.snapshoot_id = integer2;
      } 
      this.personal_state = paramBuilder.personal_state;
      List<StateInfo> list = paramBuilder.state_list;
      if (list == null) {
        this.state_list = DEFAULT_STATE_LIST;
      } else {
        this.state_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.allow_customize;
      if (integer1 == null) {
        this.allow_customize = DEFAULT_ALLOW_CUSTOMIZE;
      } else {
        this.allow_customize = integer1;
      } 
      integer1 = paramBuilder.is_display;
      if (integer1 == null) {
        this.is_display = DEFAULT_IS_DISPLAY;
      } else {
        this.is_display = integer1;
      } 
      integer1 = paramBuilder.is_background_firstly;
      if (integer1 == null) {
        this.is_background_firstly = DEFAULT_IS_BACKGROUND_FIRSTLY;
      } else {
        this.is_background_firstly = integer1;
      } 
      str = paramBuilder.dynamic_virtual_image_url;
      if (str == null) {
        this.dynamic_virtual_image_url = "";
      } else {
        this.dynamic_virtual_image_url = str;
      } 
    } else {
      this.isset_virtual_image = ((Builder)str).isset_virtual_image;
      this.virtual_image_url = ((Builder)str).virtual_image_url;
      this.image_agree_count = ((Builder)str).image_agree_count;
      this.is_allow_agree = ((Builder)str).is_allow_agree;
      this.virtual_background_type = ((Builder)str).virtual_background_type;
      this.virtual_background = ((Builder)str).virtual_background;
      this.recent_incr_agree = ((Builder)str).recent_incr_agree;
      this.snapshoot_id = ((Builder)str).snapshoot_id;
      this.personal_state = ((Builder)str).personal_state;
      this.state_list = Message.immutableCopyOf(((Builder)str).state_list);
      this.allow_customize = ((Builder)str).allow_customize;
      this.is_display = ((Builder)str).is_display;
      this.is_background_firstly = ((Builder)str).is_background_firstly;
      this.dynamic_virtual_image_url = ((Builder)str).dynamic_virtual_image_url;
    } 
  }
  
  public VirtualImageInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VirtualImageInfo> {
    public Integer allow_customize;
    
    public String dynamic_virtual_image_url;
    
    public Integer image_agree_count;
    
    public Integer is_allow_agree;
    
    public Integer is_background_firstly;
    
    public Integer is_display;
    
    public Integer isset_virtual_image;
    
    public StateInfo personal_state;
    
    public Integer recent_incr_agree;
    
    public Integer snapshoot_id;
    
    public List<StateInfo> state_list;
    
    public String virtual_background;
    
    public Integer virtual_background_type;
    
    public String virtual_image_url;
    
    public Builder() {}
    
    public Builder(VirtualImageInfo param1VirtualImageInfo) {
      super(param1VirtualImageInfo);
      if (param1VirtualImageInfo == null)
        return; 
      this.isset_virtual_image = param1VirtualImageInfo.isset_virtual_image;
      this.virtual_image_url = param1VirtualImageInfo.virtual_image_url;
      this.image_agree_count = param1VirtualImageInfo.image_agree_count;
      this.is_allow_agree = param1VirtualImageInfo.is_allow_agree;
      this.virtual_background_type = param1VirtualImageInfo.virtual_background_type;
      this.virtual_background = param1VirtualImageInfo.virtual_background;
      this.recent_incr_agree = param1VirtualImageInfo.recent_incr_agree;
      this.snapshoot_id = param1VirtualImageInfo.snapshoot_id;
      this.personal_state = param1VirtualImageInfo.personal_state;
      this.state_list = Message.copyOf(param1VirtualImageInfo.state_list);
      this.allow_customize = param1VirtualImageInfo.allow_customize;
      this.is_display = param1VirtualImageInfo.is_display;
      this.is_background_firstly = param1VirtualImageInfo.is_background_firstly;
      this.dynamic_virtual_image_url = param1VirtualImageInfo.dynamic_virtual_image_url;
    }
    
    public VirtualImageInfo build(boolean param1Boolean) {
      return new VirtualImageInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
