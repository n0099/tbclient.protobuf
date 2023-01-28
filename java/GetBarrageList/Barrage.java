package tbclient.GetBarrageList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Barrage extends Message {
  public static final String DEFAULT_COLOR = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  public Barrage(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      str = paramBuilder.color;
      if (str == null) {
        this.color = "";
      } else {
        this.color = str;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
    } else {
      this.content = ((Builder)long_).content;
      this.color = ((Builder)long_).color;
      this.user_id = ((Builder)long_).user_id;
    } 
  }
  
  public Barrage(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Barrage> {
    public String color;
    
    public String content;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(Barrage param1Barrage) {
      super(param1Barrage);
      if (param1Barrage == null)
        return; 
      this.content = param1Barrage.content;
      this.color = param1Barrage.color;
      this.user_id = param1Barrage.user_id;
    }
    
    public Barrage build(boolean param1Boolean) {
      return new Barrage(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
