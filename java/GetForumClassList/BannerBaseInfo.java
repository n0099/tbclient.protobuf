package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BannerBaseInfo extends Message {
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_RANK;
  
  public static final String DEFAULT_TAG = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer rank;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tag;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RANK = integer;
    DEFAULT_TYPE = integer;
  }
  
  public BannerBaseInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.tag;
      if (str == null) {
        this.tag = "";
      } else {
        this.tag = str;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
      str = paramBuilder.image_url;
      if (str == null) {
        this.image_url = "";
      } else {
        this.image_url = str;
      } 
      Integer integer1 = paramBuilder.rank;
      if (integer1 == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = integer1;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.tag = ((Builder)integer).tag;
      this.link = ((Builder)integer).link;
      this.image_url = ((Builder)integer).image_url;
      this.rank = ((Builder)integer).rank;
      this.type = ((Builder)integer).type;
    } 
  }
  
  public BannerBaseInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BannerBaseInfo> {
    public String image_url;
    
    public String link;
    
    public Integer rank;
    
    public String tag;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(BannerBaseInfo param1BannerBaseInfo) {
      super(param1BannerBaseInfo);
      if (param1BannerBaseInfo == null)
        return; 
      this.title = param1BannerBaseInfo.title;
      this.tag = param1BannerBaseInfo.tag;
      this.link = param1BannerBaseInfo.link;
      this.image_url = param1BannerBaseInfo.image_url;
      this.rank = param1BannerBaseInfo.rank;
      this.type = param1BannerBaseInfo.type;
    }
    
    public BannerBaseInfo build(boolean param1Boolean) {
      return new BannerBaseInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
