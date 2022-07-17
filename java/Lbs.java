package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Lbs extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DISTANCE = "";
  
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LNG = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_SN = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String distance;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String lng;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String sn;
  
  public Lbs(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.lat;
      if (str1 == null) {
        this.lat = "";
      } else {
        this.lat = str1;
      } 
      str1 = paramBuilder.lng;
      if (str1 == null) {
        this.lng = "";
      } else {
        this.lng = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.sn;
      if (str1 == null) {
        this.sn = "";
      } else {
        this.sn = str1;
      } 
      str = paramBuilder.distance;
      if (str == null) {
        this.distance = "";
      } else {
        this.distance = str;
      } 
    } else {
      this.lat = ((Builder)str).lat;
      this.lng = ((Builder)str).lng;
      this.name = ((Builder)str).name;
      this.sn = ((Builder)str).sn;
      this.distance = ((Builder)str).distance;
    } 
  }
  
  public Lbs(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Lbs> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String distance;
    
    public String lat;
    
    public String lng;
    
    public String name;
    
    public String sn;
    
    public Builder() {}
    
    public Builder(Lbs param1Lbs) {
      super(param1Lbs);
      if (param1Lbs == null)
        return; 
      this.lat = param1Lbs.lat;
      this.lng = param1Lbs.lng;
      this.name = param1Lbs.name;
      this.sn = param1Lbs.sn;
      this.distance = param1Lbs.distance;
    }
    
    public Lbs build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Lbs)interceptResult.objValue; 
      } 
      return new Lbs(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
