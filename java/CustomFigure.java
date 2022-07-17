package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CustomFigure extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BACKGROUND_TYPE = "";
  
  public static final String DEFAULT_BACKGROUND_VALUE = "";
  
  public static final String DEFAULT_FIGURE_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String background_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String background_value;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String figure_url;
  
  public CustomFigure(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.figure_url;
      if (str1 == null) {
        this.figure_url = "";
      } else {
        this.figure_url = str1;
      } 
      str1 = paramBuilder.background_type;
      if (str1 == null) {
        this.background_type = "";
      } else {
        this.background_type = str1;
      } 
      str = paramBuilder.background_value;
      if (str == null) {
        this.background_value = "";
      } else {
        this.background_value = str;
      } 
    } else {
      this.figure_url = ((Builder)str).figure_url;
      this.background_type = ((Builder)str).background_type;
      this.background_value = ((Builder)str).background_value;
    } 
  }
  
  public CustomFigure(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CustomFigure> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String background_type;
    
    public String background_value;
    
    public String figure_url;
    
    public Builder() {}
    
    public Builder(CustomFigure param1CustomFigure) {
      super(param1CustomFigure);
      if (param1CustomFigure == null)
        return; 
      this.figure_url = param1CustomFigure.figure_url;
      this.background_type = param1CustomFigure.background_type;
      this.background_value = param1CustomFigure.background_value;
    }
    
    public CustomFigure build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CustomFigure)interceptResult.objValue; 
      } 
      return new CustomFigure(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
