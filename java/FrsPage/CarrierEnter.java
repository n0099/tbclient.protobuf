package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CarrierEnter extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_HEADLINE_COVER = "";
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String headline_cover;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public CarrierEnter(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str1 = paramBuilder.headline_cover;
      if (str1 == null) {
        this.headline_cover = "";
      } else {
        this.headline_cover = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.obj_id;
      if (str == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.text = ((Builder)str).text;
      this.headline_cover = ((Builder)str).headline_cover;
      this.url = ((Builder)str).url;
      this.obj_id = ((Builder)str).obj_id;
    } 
  }
  
  public CarrierEnter(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CarrierEnter> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String headline_cover;
    
    public String obj_id;
    
    public String text;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(CarrierEnter param1CarrierEnter) {
      super(param1CarrierEnter);
      if (param1CarrierEnter == null)
        return; 
      this.title = param1CarrierEnter.title;
      this.text = param1CarrierEnter.text;
      this.headline_cover = param1CarrierEnter.headline_cover;
      this.url = param1CarrierEnter.url;
      this.obj_id = param1CarrierEnter.obj_id;
    }
    
    public CarrierEnter build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CarrierEnter)interceptResult.objValue; 
      } 
      return new CarrierEnter(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
