package GetBaiduAlbumList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlbumList extends Message {
  public static final String DEFAULT_ALBUM_ID = "";
  
  public static final String DEFAULT_ALBUM_NAME = "";
  
  public static final String DEFAULT_APP_ID = "";
  
  public static final String DEFAULT_COVER_PICTURE_URL = "";
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_IS_NETDISK;
  
  public static final Integer DEFAULT_IS_SYSTEM;
  
  public static final Integer DEFAULT_PICTURE_NUM;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String album_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String album_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String app_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String cover_picture_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_netdisk;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_system;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer picture_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-407062561, "Ltbclient/GetBaiduAlbumList/AlbumList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-407062561, "Ltbclient/GetBaiduAlbumList/AlbumList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PICTURE_NUM = integer;
    DEFAULT_IS_SYSTEM = integer;
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_IS_NETDISK = integer;
  }
  
  public AlbumList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.album_id;
      if (str2 == null) {
        this.album_id = "";
      } else {
        this.album_id = str2;
      } 
      str2 = paramBuilder.album_name;
      if (str2 == null) {
        this.album_name = "";
      } else {
        this.album_name = str2;
      } 
      Integer integer2 = paramBuilder.picture_num;
      if (integer2 == null) {
        this.picture_num = DEFAULT_PICTURE_NUM;
      } else {
        this.picture_num = integer2;
      } 
      String str1 = paramBuilder.cover_picture_url;
      if (str1 == null) {
        this.cover_picture_url = "";
      } else {
        this.cover_picture_url = str1;
      } 
      str1 = paramBuilder.app_id;
      if (str1 == null) {
        this.app_id = "";
      } else {
        this.app_id = str1;
      } 
      Integer integer1 = paramBuilder.is_system;
      if (integer1 == null) {
        this.is_system = DEFAULT_IS_SYSTEM;
      } else {
        this.is_system = integer1;
      } 
      integer1 = paramBuilder.create_time;
      if (integer1 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer1;
      } 
      integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      integer = paramBuilder.is_netdisk;
      if (integer == null) {
        this.is_netdisk = DEFAULT_IS_NETDISK;
      } else {
        this.is_netdisk = integer;
      } 
    } else {
      this.album_id = ((Builder)integer).album_id;
      this.album_name = ((Builder)integer).album_name;
      this.picture_num = ((Builder)integer).picture_num;
      this.cover_picture_url = ((Builder)integer).cover_picture_url;
      this.app_id = ((Builder)integer).app_id;
      this.is_system = ((Builder)integer).is_system;
      this.create_time = ((Builder)integer).create_time;
      this.update_time = ((Builder)integer).update_time;
      this.is_netdisk = ((Builder)integer).is_netdisk;
    } 
  }
}
