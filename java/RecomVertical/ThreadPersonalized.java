package RecomVertical;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomVertical.DislikeReason;

public final class ThreadPersonalized extends Message {
  public static final String DEFAULT_ABTEST_TAG = "";
  
  public static final List<DislikeReason> DEFAULT_DISLIKE_RESOURCE;
  
  public static final String DEFAULT_EXTRA = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_WEIGHT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String abtest_tag;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<DislikeReason> dislike_resource;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String source;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String weight;
  
  static {
    DEFAULT_DISLIKE_RESOURCE = Collections.emptyList();
  }
  
  public ThreadPersonalized(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      String str1 = paramBuilder.weight;
      if (str1 == null) {
        this.weight = "";
      } else {
        this.weight = str1;
      } 
      str1 = paramBuilder.source;
      if (str1 == null) {
        this.source = "";
      } else {
        this.source = str1;
      } 
      str1 = paramBuilder.abtest_tag;
      if (str1 == null) {
        this.abtest_tag = "";
      } else {
        this.abtest_tag = str1;
      } 
      List list = paramBuilder.dislike_resource;
      if (list == null) {
        this.dislike_resource = DEFAULT_DISLIKE_RESOURCE;
      } else {
        this.dislike_resource = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.extra;
      if (str == null) {
        this.extra = "";
      } else {
        this.extra = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.weight = ((Builder)str).weight;
      this.source = ((Builder)str).source;
      this.abtest_tag = ((Builder)str).abtest_tag;
      this.dislike_resource = Message.immutableCopyOf(((Builder)str).dislike_resource);
      this.extra = ((Builder)str).extra;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(612411948, "Ltbclient/RecomVertical/ThreadPersonalized;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(612411948, "Ltbclient/RecomVertical/ThreadPersonalized;");
          return;
        } 
      } 
    } 
  }
}
