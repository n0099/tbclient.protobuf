package tbclient.GetOfflineResource;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Chapters extends Message {
  public static final Integer DEFAULT_CHAPTER_ID;
  
  public static final Integer DEFAULT_CHAPTER_VIP;
  
  public static final Integer DEFAULT_RESOURCE_SIZE;
  
  public static final String DEFAULT_RESOURCE_URL = "";
  
  public static final Integer DEFAULT_TOTAL_IMG_NUM;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer chapter_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer chapter_vip;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer resource_size;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String resource_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer total_img_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CHAPTER_ID = integer;
    DEFAULT_RESOURCE_SIZE = integer;
    DEFAULT_TOTAL_IMG_NUM = integer;
    DEFAULT_CHAPTER_VIP = integer;
  }
  
  public Chapters(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.chapter_id;
      if (integer2 == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = integer2;
      } 
      String str = paramBuilder.resource_url;
      if (str == null) {
        this.resource_url = "";
      } else {
        this.resource_url = str;
      } 
      Integer integer1 = paramBuilder.resource_size;
      if (integer1 == null) {
        this.resource_size = DEFAULT_RESOURCE_SIZE;
      } else {
        this.resource_size = integer1;
      } 
      integer1 = paramBuilder.total_img_num;
      if (integer1 == null) {
        this.total_img_num = DEFAULT_TOTAL_IMG_NUM;
      } else {
        this.total_img_num = integer1;
      } 
      integer = paramBuilder.chapter_vip;
      if (integer == null) {
        this.chapter_vip = DEFAULT_CHAPTER_VIP;
      } else {
        this.chapter_vip = integer;
      } 
    } else {
      this.chapter_id = ((Builder)integer).chapter_id;
      this.resource_url = ((Builder)integer).resource_url;
      this.resource_size = ((Builder)integer).resource_size;
      this.total_img_num = ((Builder)integer).total_img_num;
      this.chapter_vip = ((Builder)integer).chapter_vip;
    } 
  }
  
  public Chapters(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Chapters> {
    public Integer chapter_id;
    
    public Integer chapter_vip;
    
    public Integer resource_size;
    
    public String resource_url;
    
    public Integer total_img_num;
    
    public Builder() {}
    
    public Builder(Chapters param1Chapters) {
      super(param1Chapters);
      if (param1Chapters == null)
        return; 
      this.chapter_id = param1Chapters.chapter_id;
      this.resource_url = param1Chapters.resource_url;
      this.resource_size = param1Chapters.resource_size;
      this.total_img_num = param1Chapters.total_img_num;
      this.chapter_vip = param1Chapters.chapter_vip;
    }
    
    public Chapters build(boolean param1Boolean) {
      return new Chapters(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
