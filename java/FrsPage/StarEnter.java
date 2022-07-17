package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarEnter extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_BAZHU_MARK;
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final Integer DEFAULT_RANK_NUM;
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TIME;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  public static final Integer DEFAULT_WEIGHT;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer bazhu_mark;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer rank_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer weight;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(115636024, "Ltbclient/FrsPage/StarEnter;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(115636024, "Ltbclient/FrsPage/StarEnter;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_WEIGHT = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_TIME = integer;
    DEFAULT_RANK_NUM = integer;
    DEFAULT_BAZHU_MARK = integer;
  }
  
  public StarEnter(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.icon;
      if (str3 == null) {
        this.icon = "";
      } else {
        this.icon = str3;
      } 
      str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      Integer integer3 = paramBuilder.weight;
      if (integer3 == null) {
        this.weight = DEFAULT_WEIGHT;
      } else {
        this.weight = integer3;
      } 
      integer3 = paramBuilder.type;
      if (integer3 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer3;
      } 
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      Integer integer2 = paramBuilder.time;
      if (integer2 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer2;
      } 
      String str1 = paramBuilder.obj_id;
      if (str1 == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str1;
      } 
      str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      Integer integer1 = paramBuilder.rank_num;
      if (integer1 == null) {
        this.rank_num = DEFAULT_RANK_NUM;
      } else {
        this.rank_num = integer1;
      } 
      integer = paramBuilder.bazhu_mark;
      if (integer == null) {
        this.bazhu_mark = DEFAULT_BAZHU_MARK;
      } else {
        this.bazhu_mark = integer;
      } 
    } else {
      this.icon = ((Builder)integer).icon;
      this.title = ((Builder)integer).title;
      this.weight = ((Builder)integer).weight;
      this.type = ((Builder)integer).type;
      this.url = ((Builder)integer).url;
      this.time = ((Builder)integer).time;
      this.obj_id = ((Builder)integer).obj_id;
      this.text = ((Builder)integer).text;
      this.rank_num = ((Builder)integer).rank_num;
      this.bazhu_mark = ((Builder)integer).bazhu_mark;
    } 
  }
  
  public StarEnter(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarEnter> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer bazhu_mark;
    
    public String icon;
    
    public String obj_id;
    
    public Integer rank_num;
    
    public String text;
    
    public Integer time;
    
    public String title;
    
    public Integer type;
    
    public String url;
    
    public Integer weight;
    
    public Builder() {}
    
    public Builder(StarEnter param1StarEnter) {
      super(param1StarEnter);
      if (param1StarEnter == null)
        return; 
      this.icon = param1StarEnter.icon;
      this.title = param1StarEnter.title;
      this.weight = param1StarEnter.weight;
      this.type = param1StarEnter.type;
      this.url = param1StarEnter.url;
      this.time = param1StarEnter.time;
      this.obj_id = param1StarEnter.obj_id;
      this.text = param1StarEnter.text;
      this.rank_num = param1StarEnter.rank_num;
      this.bazhu_mark = param1StarEnter.bazhu_mark;
    }
    
    public StarEnter build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (StarEnter)interceptResult.objValue; 
      } 
      return new StarEnter(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
