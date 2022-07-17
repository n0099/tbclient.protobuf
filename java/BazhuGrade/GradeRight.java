package tbclient.BazhuGrade;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GradeRight extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_NAME = "";
  
  public transient FieldHolder $fh;
  
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
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
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
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GradeRight)interceptResult.objValue; 
      } 
      return new GradeRight(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
