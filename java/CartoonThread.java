package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CartoonThread extends Message {
  public static final Long DEFAULT_CARTOON_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_CHAPTER_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long cartoon_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer chapter_id;
  
  public CartoonThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.cartoon_id;
      if (long_ == null) {
        this.cartoon_id = DEFAULT_CARTOON_ID;
      } else {
        this.cartoon_id = long_;
      } 
      integer = paramBuilder.chapter_id;
      if (integer == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = integer;
      } 
    } else {
      this.cartoon_id = ((Builder)integer).cartoon_id;
      this.chapter_id = ((Builder)integer).chapter_id;
    } 
  }
  
  public CartoonThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CartoonThread> {
    public Long cartoon_id;
    
    public Integer chapter_id;
    
    public Builder() {}
    
    public Builder(CartoonThread param1CartoonThread) {
      super(param1CartoonThread);
      if (param1CartoonThread == null)
        return; 
      this.cartoon_id = param1CartoonThread.cartoon_id;
      this.chapter_id = param1CartoonThread.chapter_id;
    }
    
    public CartoonThread build(boolean param1Boolean) {
      return new CartoonThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
