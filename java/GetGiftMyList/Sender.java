package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Sender extends Message {
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  public Sender(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str1 = paramBuilder.name_show;
      if (str1 == null) {
        this.name_show = "";
      } else {
        this.name_show = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name_show = ((Builder)str).name_show;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public Sender(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Sender> {
    public Long id;
    
    public String name_show;
    
    public String portrait;
    
    public Builder() {}
    
    public Builder(Sender param1Sender) {
      super(param1Sender);
      if (param1Sender == null)
        return; 
      this.id = param1Sender.id;
      this.name_show = param1Sender.name_show;
      this.portrait = param1Sender.portrait;
    }
    
    public Sender build(boolean param1Boolean) {
      return new Sender(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
