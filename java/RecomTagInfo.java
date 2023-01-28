package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecomTagInfo extends Message {
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PIC = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic;
  
  public RecomTagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.pic;
      if (str1 == null) {
        this.pic = "";
      } else {
        this.pic = str1;
      } 
      str = paramBuilder.first_class;
      if (str == null) {
        this.first_class = "";
      } else {
        this.first_class = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.pic = ((Builder)str).pic;
      this.first_class = ((Builder)str).first_class;
    } 
  }
  
  public RecomTagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomTagInfo> {
    public String first_class;
    
    public Integer id;
    
    public String name;
    
    public String pic;
    
    public Builder() {}
    
    public Builder(RecomTagInfo param1RecomTagInfo) {
      super(param1RecomTagInfo);
      if (param1RecomTagInfo == null)
        return; 
      this.id = param1RecomTagInfo.id;
      this.name = param1RecomTagInfo.name;
      this.pic = param1RecomTagInfo.pic;
      this.first_class = param1RecomTagInfo.first_class;
    }
    
    public RecomTagInfo build(boolean param1Boolean) {
      return new RecomTagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
