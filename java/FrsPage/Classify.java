package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Classify extends Message {
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  static {
    DEFAULT_CLASS_ID = Integer.valueOf(0);
  }
  
  public Classify(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      Integer integer = paramBuilder.class_id;
      if (integer == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer;
      } 
      str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.id = ((Builder)str).id;
      this.class_id = ((Builder)str).class_id;
      this.class_name = ((Builder)str).class_name;
    } 
  }
  
  public Classify(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Classify> {
    public Integer class_id;
    
    public String class_name;
    
    public Long id;
    
    public String name;
    
    public Builder() {}
    
    public Builder(Classify param1Classify) {
      super(param1Classify);
      if (param1Classify == null)
        return; 
      this.name = param1Classify.name;
      this.id = param1Classify.id;
      this.class_id = param1Classify.class_id;
      this.class_name = param1Classify.class_name;
    }
    
    public Classify build(boolean param1Boolean) {
      return new Classify(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
