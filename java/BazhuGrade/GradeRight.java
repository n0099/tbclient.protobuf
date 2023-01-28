package tbclient.BazhuGrade;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GradeRight extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  public GradeRight(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
    } else {
      this.image = ((Builder)str).image;
      this.name = ((Builder)str).name;
      this.desc = ((Builder)str).desc;
    } 
  }
  
  public GradeRight(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GradeRight> {
    public String desc;
    
    public String image;
    
    public String name;
    
    public Builder() {}
    
    public Builder(GradeRight param1GradeRight) {
      super(param1GradeRight);
      if (param1GradeRight == null)
        return; 
      this.image = param1GradeRight.image;
      this.name = param1GradeRight.name;
      this.desc = param1GradeRight.desc;
    }
    
    public GradeRight build(boolean param1Boolean) {
      return new GradeRight(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
