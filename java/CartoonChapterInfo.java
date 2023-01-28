package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CartoonChapterInfo extends Message {
  public static final Integer DEFAULT_CHAPTER_ID;
  
  public static final Integer DEFAULT_CHAPTER_VIP;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer chapter_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer chapter_vip;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CHAPTER_ID = integer;
    DEFAULT_CHAPTER_VIP = integer;
  }
  
  public CartoonChapterInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.chapter_id;
      if (integer1 == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = integer1;
      } 
      integer = paramBuilder.chapter_vip;
      if (integer == null) {
        this.chapter_vip = DEFAULT_CHAPTER_VIP;
      } else {
        this.chapter_vip = integer;
      } 
    } else {
      this.chapter_id = ((Builder)integer).chapter_id;
      this.chapter_vip = ((Builder)integer).chapter_vip;
    } 
  }
  
  public CartoonChapterInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CartoonChapterInfo> {
    public Integer chapter_id;
    
    public Integer chapter_vip;
    
    public Builder() {}
    
    public Builder(CartoonChapterInfo param1CartoonChapterInfo) {
      super(param1CartoonChapterInfo);
      if (param1CartoonChapterInfo == null)
        return; 
      this.chapter_id = param1CartoonChapterInfo.chapter_id;
      this.chapter_vip = param1CartoonChapterInfo.chapter_vip;
    }
    
    public CartoonChapterInfo build(boolean param1Boolean) {
      return new CartoonChapterInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
