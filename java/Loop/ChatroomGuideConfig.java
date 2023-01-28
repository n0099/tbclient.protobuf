package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomGuideConfig extends Message {
  public static final String DEFAULT_BKGRD_DAY = "";
  
  public static final String DEFAULT_BKGRD_NIGHT = "";
  
  public static final String DEFAULT_BTNON_DAY = "";
  
  public static final String DEFAULT_BTNON_NIGHT = "";
  
  public static final String DEFAULT_ICON_DAY = "";
  
  public static final String DEFAULT_ICON_NIGHT = "";
  
  public static final String DEFAULT_SMALL_BKGRD_DAY = "";
  
  public static final String DEFAULT_SMALL_BKGRD_NIGHT = "";
  
  public static final String DEFAULT_SMALL_ICON_DAY = "";
  
  public static final String DEFAULT_SMALL_ICON_NIGHT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bkgrd_day;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bkgrd_night;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btnon_day;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String btnon_night;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_day;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_night;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String small_bkgrd_day;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String small_bkgrd_night;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String small_icon_day;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String small_icon_night;
  
  public ChatroomGuideConfig(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon_day;
      if (str1 == null) {
        this.icon_day = "";
      } else {
        this.icon_day = str1;
      } 
      str1 = paramBuilder.icon_night;
      if (str1 == null) {
        this.icon_night = "";
      } else {
        this.icon_night = str1;
      } 
      str1 = paramBuilder.bkgrd_day;
      if (str1 == null) {
        this.bkgrd_day = "";
      } else {
        this.bkgrd_day = str1;
      } 
      str1 = paramBuilder.bkgrd_night;
      if (str1 == null) {
        this.bkgrd_night = "";
      } else {
        this.bkgrd_night = str1;
      } 
      str1 = paramBuilder.btnon_day;
      if (str1 == null) {
        this.btnon_day = "";
      } else {
        this.btnon_day = str1;
      } 
      str1 = paramBuilder.btnon_night;
      if (str1 == null) {
        this.btnon_night = "";
      } else {
        this.btnon_night = str1;
      } 
      str1 = paramBuilder.small_icon_day;
      if (str1 == null) {
        this.small_icon_day = "";
      } else {
        this.small_icon_day = str1;
      } 
      str1 = paramBuilder.small_icon_night;
      if (str1 == null) {
        this.small_icon_night = "";
      } else {
        this.small_icon_night = str1;
      } 
      str1 = paramBuilder.small_bkgrd_day;
      if (str1 == null) {
        this.small_bkgrd_day = "";
      } else {
        this.small_bkgrd_day = str1;
      } 
      str = paramBuilder.small_bkgrd_night;
      if (str == null) {
        this.small_bkgrd_night = "";
      } else {
        this.small_bkgrd_night = str;
      } 
    } else {
      this.icon_day = ((Builder)str).icon_day;
      this.icon_night = ((Builder)str).icon_night;
      this.bkgrd_day = ((Builder)str).bkgrd_day;
      this.bkgrd_night = ((Builder)str).bkgrd_night;
      this.btnon_day = ((Builder)str).btnon_day;
      this.btnon_night = ((Builder)str).btnon_night;
      this.small_icon_day = ((Builder)str).small_icon_day;
      this.small_icon_night = ((Builder)str).small_icon_night;
      this.small_bkgrd_day = ((Builder)str).small_bkgrd_day;
      this.small_bkgrd_night = ((Builder)str).small_bkgrd_night;
    } 
  }
  
  public ChatroomGuideConfig(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChatroomGuideConfig> {
    public String bkgrd_day;
    
    public String bkgrd_night;
    
    public String btnon_day;
    
    public String btnon_night;
    
    public String icon_day;
    
    public String icon_night;
    
    public String small_bkgrd_day;
    
    public String small_bkgrd_night;
    
    public String small_icon_day;
    
    public String small_icon_night;
    
    public Builder() {}
    
    public Builder(ChatroomGuideConfig param1ChatroomGuideConfig) {
      super(param1ChatroomGuideConfig);
      if (param1ChatroomGuideConfig == null)
        return; 
      this.icon_day = param1ChatroomGuideConfig.icon_day;
      this.icon_night = param1ChatroomGuideConfig.icon_night;
      this.bkgrd_day = param1ChatroomGuideConfig.bkgrd_day;
      this.bkgrd_night = param1ChatroomGuideConfig.bkgrd_night;
      this.btnon_day = param1ChatroomGuideConfig.btnon_day;
      this.btnon_night = param1ChatroomGuideConfig.btnon_night;
      this.small_icon_day = param1ChatroomGuideConfig.small_icon_day;
      this.small_icon_night = param1ChatroomGuideConfig.small_icon_night;
      this.small_bkgrd_day = param1ChatroomGuideConfig.small_bkgrd_day;
      this.small_bkgrd_night = param1ChatroomGuideConfig.small_bkgrd_night;
    }
    
    public ChatroomGuideConfig build(boolean param1Boolean) {
      return new ChatroomGuideConfig(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
