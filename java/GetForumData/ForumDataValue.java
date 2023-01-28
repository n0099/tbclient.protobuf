package tbclient.GetForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumDataValue extends Message {
  public static final String DEFAULT_DATE = "";
  
  public static final Double DEFAULT_VALUE = Double.valueOf(0.0D);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String date;
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double value;
  
  public ForumDataValue(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      String str = paramBuilder.date;
      if (str == null) {
        this.date = "";
      } else {
        this.date = str;
      } 
      double_ = paramBuilder.value;
      if (double_ == null) {
        this.value = DEFAULT_VALUE;
      } else {
        this.value = double_;
      } 
    } else {
      this.date = ((Builder)double_).date;
      this.value = ((Builder)double_).value;
    } 
  }
  
  public ForumDataValue(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumDataValue> {
    public String date;
    
    public Double value;
    
    public Builder() {}
    
    public Builder(ForumDataValue param1ForumDataValue) {
      super(param1ForumDataValue);
      if (param1ForumDataValue == null)
        return; 
      this.date = param1ForumDataValue.date;
      this.value = param1ForumDataValue.value;
    }
    
    public ForumDataValue build(boolean param1Boolean) {
      return new ForumDataValue(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
