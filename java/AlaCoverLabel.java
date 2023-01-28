package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaCoverLabel extends Message {
  public static final Integer DEFAULT_LABEL_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_LABEL_NAME = "";
  
  public static final String DEFAULT_LABEL_RGB = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer label_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String label_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String label_rgb;
  
  public AlaCoverLabel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.label_id;
      if (integer == null) {
        this.label_id = DEFAULT_LABEL_ID;
      } else {
        this.label_id = integer;
      } 
      String str1 = paramBuilder.label_name;
      if (str1 == null) {
        this.label_name = "";
      } else {
        this.label_name = str1;
      } 
      str = paramBuilder.label_rgb;
      if (str == null) {
        this.label_rgb = "";
      } else {
        this.label_rgb = str;
      } 
    } else {
      this.label_id = ((Builder)str).label_id;
      this.label_name = ((Builder)str).label_name;
      this.label_rgb = ((Builder)str).label_rgb;
    } 
  }
  
  public AlaCoverLabel(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaCoverLabel> {
    public Integer label_id;
    
    public String label_name;
    
    public String label_rgb;
    
    public Builder() {}
    
    public Builder(AlaCoverLabel param1AlaCoverLabel) {
      super(param1AlaCoverLabel);
      if (param1AlaCoverLabel == null)
        return; 
      this.label_id = param1AlaCoverLabel.label_id;
      this.label_name = param1AlaCoverLabel.label_name;
      this.label_rgb = param1AlaCoverLabel.label_rgb;
    }
    
    public AlaCoverLabel build(boolean param1Boolean) {
      return new AlaCoverLabel(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
