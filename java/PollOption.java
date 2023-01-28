package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PollOption extends Message {
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final Long DEFAULT_NUM = Long.valueOf(0L);
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text;
  
  public PollOption(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      Long long_ = paramBuilder.num;
      if (long_ == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = long_;
      } 
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str = paramBuilder.image;
      if (str == null) {
        this.image = "";
      } else {
        this.image = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.num = ((Builder)str).num;
      this.text = ((Builder)str).text;
      this.image = ((Builder)str).image;
    } 
  }
  
  public PollOption(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PollOption> {
    public Integer id;
    
    public String image;
    
    public Long num;
    
    public String text;
    
    public Builder() {}
    
    public Builder(PollOption param1PollOption) {
      super(param1PollOption);
      if (param1PollOption == null)
        return; 
      this.id = param1PollOption.id;
      this.num = param1PollOption.num;
      this.text = param1PollOption.text;
      this.image = param1PollOption.image;
    }
    
    public PollOption build(boolean param1Boolean) {
      return new PollOption(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
