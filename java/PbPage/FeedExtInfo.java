package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedExtInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<String> DEFAULT_FEED_BAR;
  
  public static final List<String> DEFAULT_FEED_TAB = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> feed_bar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> feed_tab;
  
  static {
    DEFAULT_FEED_BAR = Collections.emptyList();
  }
  
  public FeedExtInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      List<String> list1 = paramBuilder.feed_tab;
      if (list1 == null) {
        this.feed_tab = DEFAULT_FEED_TAB;
      } else {
        this.feed_tab = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.feed_bar;
      if (list == null) {
        this.feed_bar = DEFAULT_FEED_BAR;
      } else {
        this.feed_bar = Message.immutableCopyOf(list);
      } 
    } else {
      this.feed_tab = Message.immutableCopyOf(((Builder)list).feed_tab);
      this.feed_bar = Message.immutableCopyOf(((Builder)list).feed_bar);
    } 
  }
  
  public FeedExtInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1965433358, "Ltbclient/PbPage/FeedExtInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1965433358, "Ltbclient/PbPage/FeedExtInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedExtInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<String> feed_bar;
    
    public List<String> feed_tab;
    
    public Builder() {}
    
    public Builder(FeedExtInfo param1FeedExtInfo) {
      super(param1FeedExtInfo);
      if (param1FeedExtInfo == null)
        return; 
      this.feed_tab = Message.copyOf(param1FeedExtInfo.feed_tab);
      this.feed_bar = Message.copyOf(param1FeedExtInfo.feed_bar);
    }
    
    public FeedExtInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FeedExtInfo)interceptResult.objValue; 
      } 
      return new FeedExtInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
