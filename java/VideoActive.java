import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.VideoActive;

public final class VideoActive extends Message {
  public static final String DEFAULT_ACTIVE_NAME = "";
  
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NATIVE_URL = "";
  
  public static final String DEFAULT_REMARK = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String active_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String active_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String banner_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String native_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String remark;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<ThreadInfo> thread_list;
  
  public VideoActive(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str = paramBuilder.active_name;
      if (str == null) {
        this.active_name = "";
      } else {
        this.active_name = str;
      } 
      str = paramBuilder.active_url;
      if (str == null) {
        this.active_url = "";
      } else {
        this.active_url = str;
      } 
      str = paramBuilder.native_url;
      if (str == null) {
        this.native_url = "";
      } else {
        this.native_url = str;
      } 
      str = paramBuilder.description;
      if (str == null) {
        this.description = "";
      } else {
        this.description = str;
      } 
      str = paramBuilder.banner_url;
      if (str == null) {
        this.banner_url = "";
      } else {
        this.banner_url = str;
      } 
      str = paramBuilder.remark;
      if (str == null) {
        this.remark = "";
      } else {
        this.remark = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.id = ((Builder)list).id;
      this.active_name = ((Builder)list).active_name;
      this.active_url = ((Builder)list).active_url;
      this.native_url = ((Builder)list).native_url;
      this.description = ((Builder)list).description;
      this.banner_url = ((Builder)list).banner_url;
      this.remark = ((Builder)list).remark;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1446641380, "Ltbclient/VideoActive;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1446641380, "Ltbclient/VideoActive;");
          return;
        } 
      } 
    } 
  }
}
