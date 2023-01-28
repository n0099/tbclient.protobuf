package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadAblum extends Message {
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final Long DEFAULT_TAB_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tab_id;
  
  public ThreadAblum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      long_ = paramBuilder.tab_id;
      if (long_ == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_;
      } 
    } else {
      this.id = ((Builder)long_).id;
      this.tab_id = ((Builder)long_).tab_id;
    } 
  }
  
  public ThreadAblum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadAblum> {
    public Integer id;
    
    public Long tab_id;
    
    public Builder() {}
    
    public Builder(ThreadAblum param1ThreadAblum) {
      super(param1ThreadAblum);
      if (param1ThreadAblum == null)
        return; 
      this.id = param1ThreadAblum.id;
      this.tab_id = param1ThreadAblum.tab_id;
    }
    
    public ThreadAblum build(boolean param1Boolean) {
      return new ThreadAblum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
