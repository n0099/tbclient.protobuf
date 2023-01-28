package tbclient.GetCartoonCategoryList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CartoonInfo extends Message {
  public static final Long DEFAULT_CARTOON_ID;
  
  public static final String DEFAULT_CARTOON_NAME = "";
  
  public static final String DEFAULT_COVER_IMG = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_INTRODUCTION = "";
  
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_TOTAL_CHAPTER;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long cartoon_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String cartoon_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String cover_img;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String introduction;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer total_chapter;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_CARTOON_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_FINISH = integer;
    DEFAULT_TOTAL_CHAPTER = integer;
  }
  
  public CartoonInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      long_ = paramBuilder.cartoon_id;
      if (long_ == null) {
        this.cartoon_id = DEFAULT_CARTOON_ID;
      } else {
        this.cartoon_id = long_;
      } 
      String str2 = paramBuilder.cartoon_name;
      if (str2 == null) {
        this.cartoon_name = "";
      } else {
        this.cartoon_name = str2;
      } 
      str2 = paramBuilder.introduction;
      if (str2 == null) {
        this.introduction = "";
      } else {
        this.introduction = str2;
      } 
      Integer integer1 = paramBuilder.is_finish;
      if (integer1 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer1;
      } 
      String str1 = paramBuilder.cover_img;
      if (str1 == null) {
        this.cover_img = "";
      } else {
        this.cover_img = str1;
      } 
      integer = paramBuilder.total_chapter;
      if (integer == null) {
        this.total_chapter = DEFAULT_TOTAL_CHAPTER;
      } else {
        this.total_chapter = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.cartoon_id = ((Builder)integer).cartoon_id;
      this.cartoon_name = ((Builder)integer).cartoon_name;
      this.introduction = ((Builder)integer).introduction;
      this.is_finish = ((Builder)integer).is_finish;
      this.cover_img = ((Builder)integer).cover_img;
      this.total_chapter = ((Builder)integer).total_chapter;
    } 
  }
  
  public CartoonInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CartoonInfo> {
    public Long cartoon_id;
    
    public String cartoon_name;
    
    public String cover_img;
    
    public Long forum_id;
    
    public String introduction;
    
    public Integer is_finish;
    
    public Integer total_chapter;
    
    public Builder() {}
    
    public Builder(CartoonInfo param1CartoonInfo) {
      super(param1CartoonInfo);
      if (param1CartoonInfo == null)
        return; 
      this.forum_id = param1CartoonInfo.forum_id;
      this.cartoon_id = param1CartoonInfo.cartoon_id;
      this.cartoon_name = param1CartoonInfo.cartoon_name;
      this.introduction = param1CartoonInfo.introduction;
      this.is_finish = param1CartoonInfo.is_finish;
      this.cover_img = param1CartoonInfo.cover_img;
      this.total_chapter = param1CartoonInfo.total_chapter;
    }
    
    public CartoonInfo build(boolean param1Boolean) {
      return new CartoonInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
