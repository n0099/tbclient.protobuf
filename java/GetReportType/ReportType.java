package tbclient.GetReportType;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReportType extends Message {
  public static final Integer DEFAULT_TYPE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TYPE_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String type_text;
  
  public ReportType(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type_id;
      if (integer == null) {
        this.type_id = DEFAULT_TYPE_ID;
      } else {
        this.type_id = integer;
      } 
      str = paramBuilder.type_text;
      if (str == null) {
        this.type_text = "";
      } else {
        this.type_text = str;
      } 
    } else {
      this.type_id = ((Builder)str).type_id;
      this.type_text = ((Builder)str).type_text;
    } 
  }
  
  public ReportType(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReportType> {
    public Integer type_id;
    
    public String type_text;
    
    public Builder() {}
    
    public Builder(ReportType param1ReportType) {
      super(param1ReportType);
      if (param1ReportType == null)
        return; 
      this.type_id = param1ReportType.type_id;
      this.type_text = param1ReportType.type_text;
    }
    
    public ReportType build(boolean param1Boolean) {
      return new ReportType(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
